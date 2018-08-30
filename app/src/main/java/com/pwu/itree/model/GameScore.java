package com.pwu.itree.model;

public class GameScore {

    String name;
    int score;

    public GameScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
