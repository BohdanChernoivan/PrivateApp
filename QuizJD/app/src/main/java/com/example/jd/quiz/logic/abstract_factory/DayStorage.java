package com.example.jd.quiz.logic.abstract_factory;

import com.example.jd.quiz.logic.FactoryQuiz;
import com.example.jd.quiz.logic.NumberDay;

import java.util.ArrayList;
import java.util.List;

import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_1;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_10;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_11;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_12;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_13;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_14;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_15;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_16;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_17;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_18;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_19;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_2;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_20;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_21;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_22;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_23;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_24;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_25;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_26;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_27;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_28;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_29;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_3;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_30;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_31;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_4;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_5;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_6;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_7;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_8;
import static com.example.jd.quiz.logic.abstract_factory.enumDays.DayInTheMonth.DAY_9;


public class DayStorage {

    private static List<NumberOfTheDay> numberDayList = new ArrayList<>();

    static {
        numberDayList.add(new FactoryQuiz().findDay(DAY_1));
        numberDayList.add(new FactoryQuiz().findDay(DAY_2));
        numberDayList.add(new FactoryQuiz().findDay(DAY_3));
        numberDayList.add(new FactoryQuiz().findDay(DAY_4));
        numberDayList.add(new FactoryQuiz().findDay(DAY_5));
        numberDayList.add(new FactoryQuiz().findDay(DAY_6));
        numberDayList.add(new FactoryQuiz().findDay(DAY_7));
        numberDayList.add(new FactoryQuiz().findDay(DAY_8));
        numberDayList.add(new FactoryQuiz().findDay(DAY_9));
        numberDayList.add(new FactoryQuiz().findDay(DAY_10));
        numberDayList.add(new FactoryQuiz().findDay(DAY_11));
        numberDayList.add(new FactoryQuiz().findDay(DAY_12));
        numberDayList.add(new FactoryQuiz().findDay(DAY_13));
        numberDayList.add(new FactoryQuiz().findDay(DAY_14));
        numberDayList.add(new FactoryQuiz().findDay(DAY_15));
        numberDayList.add(new FactoryQuiz().findDay(DAY_16));
        numberDayList.add(new FactoryQuiz().findDay(DAY_17));
        numberDayList.add(new FactoryQuiz().findDay(DAY_18));
        numberDayList.add(new FactoryQuiz().findDay(DAY_19));
        numberDayList.add(new FactoryQuiz().findDay(DAY_20));
        numberDayList.add(new FactoryQuiz().findDay(DAY_21));
        numberDayList.add(new FactoryQuiz().findDay(DAY_22));
        numberDayList.add(new FactoryQuiz().findDay(DAY_23));
        numberDayList.add(new FactoryQuiz().findDay(DAY_24));
        numberDayList.add(new FactoryQuiz().findDay(DAY_25));
        numberDayList.add(new FactoryQuiz().findDay(DAY_26));
        numberDayList.add(new FactoryQuiz().findDay(DAY_27));
        numberDayList.add(new FactoryQuiz().findDay(DAY_28));
        numberDayList.add(new FactoryQuiz().findDay(DAY_29));
        numberDayList.add(new FactoryQuiz().findDay(DAY_30));
        numberDayList.add(new FactoryQuiz().findDay(DAY_31));
    }

    public static List<NumberOfTheDay> getNumberDayList() {
        return numberDayList;
    }
}
