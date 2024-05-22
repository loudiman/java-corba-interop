package org.amalgam.lexilogicserver.model.microservices.Matchmaking;

import org.amalgam.lexilogicserver.model.microservices.NTimer;
import org.amalgam.lexilogicserver.model.microservices.NTimerCallback;
import org.amalgam.lexilogicserver.model.microservices.gamesettings.SettingsHandler;
import org.amalgam.lexilogicserver.model.utilities.referenceobjects.PlayerGameDetail;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class MatchmakingService implements NTimerCallback{
    private final ConcurrentLinkedQueue<PlayerGameDetail> queue = new ConcurrentLinkedQueue<>();
    private final Semaphore queueLock = new Semaphore(1);
    private Thread timerThread;
    private final AtomicBoolean timerDone = new AtomicBoolean(false);
    private ExecutorService executorService = Executors.newSingleThreadExecutor();

    public boolean isQueueEmpty(){
        return queue.isEmpty();
    }

    public void addToQueue(PlayerGameDetail playerGameDetail) {
        queue.add(playerGameDetail);
        if (queue.size() == 1) {
            startTimer();
        }
    }

    public LinkedList<PlayerGameDetail> getQueue() {
        LinkedList<PlayerGameDetail> players = new LinkedList<>(queue);
        return players;
    }

    public void startTimer() {
        timerDone.set(false);
        executorService.submit(new NTimer(SettingsHandler.getQueueTime(), this));
    }

    @Override
    public void timerDone() {
        timerDone.set(true);
        try {
            queueLock.acquire();
            if (queue.size() == 1) {
                queue.clear();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            queueLock.release();
        }
    }

    @Override
    public void timeIs() {
    }

    public LinkedList<PlayerGameDetail> checkAndMatchPlayers() throws InterruptedException {
        queueLock.acquire();
        try {
            if (queue.size() >= 2) {
                return getQueue();
            }
        } finally {
            queueLock.release();
        }
        return null;
    }

    public boolean isTimerDone() {
        if (timerDone.get()){
            queue.clear();
        }
        return timerDone.get();
    }
}