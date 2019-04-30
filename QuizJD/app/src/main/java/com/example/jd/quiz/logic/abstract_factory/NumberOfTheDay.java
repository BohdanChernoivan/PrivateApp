package com.example.jd.quiz.logic.abstract_factory;

public class NumberOfTheDay {

    private int arrayAnswer[];

    public NumberOfTheDay(int ... arrayAnswer) {
        this.arrayAnswer = arrayAnswer;
    }

    public int[] getArrayAnswer() {
        return arrayAnswer;
    }
}
