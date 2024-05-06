package org.amalgam.lexilogicserver.model.utilities.corbautils;

import org.amalgam.Utils.ObjectExceptions.InvalidPointsException;
import org.amalgam.Utils.ObjectExceptions.LeaderboardIDRetrievalException;
import org.amalgam.Utils.ObjectExceptions.PlayerDoesNotExistException;
import org.amalgam.Utils.ObjectExceptions.SQLError;
import org.amalgam.Utils.Objects.LeaderboardPOA;

public class LeaderBoardImpl extends LeaderboardPOA  {
    public LeaderBoardImpl(int leaderBoardID, int userID, int totalPoints) {
        super();
    }

    @Override
    public int leaderboardID() {
        return 0;
    }

    @Override
    public void leaderboardID(int newLeaderboardID) {

    }

    @Override
    public int playerID() {
        return 0;
    }

    @Override
    public void playerID(int newPlayerID) {

    }

    @Override
    public int totalPoints() {
        return 0;
    }

    @Override
    public void totalPoints(int newTotalPoints) {

    }

    @Override
    public void updateTotalPoints(int newPoints) throws InvalidPointsException, SQLError {

    }

    @Override
    public int getPlayerID() throws PlayerDoesNotExistException {
        return 0;
    }

    @Override
    public int getLeaderboardID() throws LeaderboardIDRetrievalException {
        return 0;
    }
}
