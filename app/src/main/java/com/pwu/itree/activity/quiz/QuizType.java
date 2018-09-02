package com.pwu.itree.activity.quiz;

public enum QuizType {
    GUESS_COMMON_NAME(0,"CAN YOU GUESS THE TREE NAME"),
    GUESS_SCIENTIFIC_NAME(1,"CAN YOU GUESS THE SCIENTIFIC NAME");

    private int type;
    private String title;

    QuizType(int type, String title) {
        this.type = type;
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }
}
