package org.amalgam.lexilogicserver.model.serviceimpl;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.amalgam.Service.GameServiceModule.GameServicePOA;
import org.amalgam.UIControllers.PlayerCallback;
import org.amalgam.Utils.Exceptions.*;
import org.amalgam.Utils.Exceptions.DuplicateWordException;
import org.amalgam.lexilogicserver.model.DAL.LeaderBoardDAL;
import org.amalgam.lexilogicserver.model.utilities.referenceobjects.LeaderBoard;

import java.util.LinkedList;
import java.util.List;
import org.amalgam.lexilogicserver.model.handler.GameHandler.GameRoom;

public class GameServiceImpl extends GameServicePOA {
    LinkedList<GameRoom> rooms = new LinkedList<>();

    @Override
    public String matchMake(PlayerCallback player_callback) throws MatchCreationFailedException {
        return "";
    }

    @Override
    public char[][] fetchWordBox(int roomID) throws WordFetchFailedException, InvalidRoomIDException {
        return new char[0][];
    }

    // TODO: why there is JSON
    @Override
    public String getLeaderboards() throws EmptyLeaderBoardException {
        List<LeaderBoard> leaderboards = LeaderBoardDAL.fetchLeaderBoards();

        if (leaderboards.isEmpty()) {
            throw new EmptyLeaderBoardException("Leaderboard is empty");
        }

//        JsonObject rootObject = new JsonObject();

        JsonArray leaderboardArray = new JsonArray();
        for (LeaderBoard leaderboard : leaderboards) {
            leaderboardArray.add(leaderboard.getUsername());
            leaderboardArray.add(leaderboard.getPoints());
            leaderboardArray.add(leaderboard.getRank());
//            JsonObject leaderboardObj = new JsonObject();
//            leaderboardObj.addProperty("username", leaderboard.getUsername());
//            leaderboardObj.addProperty("pts", leaderboard.getPoints());
//            leaderboardObj.addProperty("rank", leaderboard.getRank());
//            leaderboardArray.add(leaderboardObj);
        }

//        rootObject.add("leaderboard", leaderboardArray);

//        return rootObject.toString();
        return leaderboardArray.toString();
    }


    @Override
    public void verifyWord(String word) throws InvalidWordFormatException, DuplicateWordException {

    }

    @Override
    public int validateTotalPoints() throws InsufficientWordPointsException, InvalidTotalPointsException {
        return 0;
    }

    @Override
    public String fetchWinner(int lobbyId) throws LobbyDoesNotExistException, WinnerDoesNotExistException {
        return "";
    }
}
