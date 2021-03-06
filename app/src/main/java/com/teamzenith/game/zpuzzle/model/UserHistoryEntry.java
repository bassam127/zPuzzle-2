package com.teamzenith.game.zpuzzle.model;

/**
 * Created by alaaalkassar on 3/31/17.
 */

public class UserHistoryEntry {
    private String userID;
    private Level level;
    private String countMovementString;
    private String timerCounterString;

    public UserHistoryEntry(){

    }
    public UserHistoryEntry(String userID, Level level, String countMovementString,String timerCounterString){
        this.userID = userID;
        this.level = level;
        this.countMovementString = countMovementString;
        this.timerCounterString = timerCounterString;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getCountMovementString() {
        return countMovementString;
    }

    public void setCountMovementString(String countMovementString) {
        this.countMovementString = countMovementString;
    }

    public String getTimerCounterString() {
        return timerCounterString;
    }

    public void setTimerCounterString(String timerCounterString) {
        this.timerCounterString = timerCounterString;
    }
}
