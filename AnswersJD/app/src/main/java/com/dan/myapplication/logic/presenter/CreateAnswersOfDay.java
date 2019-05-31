package com.dan.myapplication.logic.presenter;

public class CreateAnswersOfDay {

    private ViewAnswers viewAnswers;

    public CreateAnswersOfDay(ViewAnswers viewAnswers) {
        this.viewAnswers = viewAnswers;
    }

    public interface ViewAnswers {
        void createAnswersOnDay(int number);
    }
}
