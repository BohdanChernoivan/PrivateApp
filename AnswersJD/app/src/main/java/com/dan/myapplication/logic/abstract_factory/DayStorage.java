package com.dan.myapplication.logic.abstract_factory;

import com.dan.myapplication.logic.FactoryQuiz;

import java.util.ArrayList;
import java.util.List;

import static com.dan.myapplication.logic.abstract_factory.enumDays.DayInTheMonth.*;


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
