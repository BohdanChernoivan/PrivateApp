package com.example.jd.quiz.logic.presenter;

import com.example.jd.quiz.logic.abstract_factory.NumberOfTheDay;

public class CreateAnswersOfDay {

    private ViewAnswers viewAnswers;

    public CreateAnswersOfDay(ViewAnswers viewAnswers) {
        this.viewAnswers = viewAnswers;
    }

    public interface ViewAnswers {
        void createAnswersOnDay(int number);
    }
}
