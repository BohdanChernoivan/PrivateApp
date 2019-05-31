package com.dan.myapplication.logic;

import com.dan.myapplication.logic.abstract_factory.NumberOfTheDay;
import com.dan.myapplication.logic.abstract_factory.enumDays.DayInTheMonth;

public class FactoryQuiz {


    public NumberOfTheDay findDay(DayInTheMonth day) {
        switch (day) {

            case DAY_1:
                return new NumberOfTheDay(4, 2, 2, 3, 1, 3, 1, 3, 2, 4, 3, 3, 3, 1, 1, 1, 1, 1, 3, 3, 1, 1, 1, 3, 3, 3, 4, 1, 2, 4);
            case DAY_2:
                return new NumberOfTheDay(1, 3, 2, 1, 1, 1, 4, 1, 1, 3, 4, 3, 3, 2, 2, 3, 4, 4, 1, 2, 3, 3, 4, 3, 2, 4, 3, 1, 1, 2);
            case DAY_3:
                return new NumberOfTheDay(4, 2, 3, 1, 2, 4, 4, 1, 2, 3, 3, 2, 1, 2, 1, 3, 1, 3, 2, 4, 3, 3, 1, 1, 3, 4, 3, 1, 4, 3);
            case DAY_4:
                return new NumberOfTheDay(3, 1, 2, 1, 4, 1, 1, 1, 2, 2, 4, 4, 4, 3, 2, 2, 4, 4, 1, 1, 2, 1, 4, 2, 1, 2, 3, 3, 3, 3);
            case DAY_5:
                return new NumberOfTheDay(3, 4, 1, 2, 2, 1, 3, 1, 3, 2, 2, 2, 3, 4, 4, 3, 4, 2, 4, 2, 3, 2, 2, 2, 3, 3, 1, 1, 1, 3);
            case DAY_6:
                return new NumberOfTheDay(4, 4, 2, 2, 2, 2, 2, 1, 2, 1, 3, 2, 1, 2, 3, 2, 3, 1, 2, 1, 3, 3, 3, 3, 4, 3, 4, 4, 4, 4);
            case DAY_7:
                return new NumberOfTheDay(1, 4, 4, 1, 3, 1, 4, 2, 2, 4, 2, 3, 4, 1, 4, 3, 3, 3, 4, 3, 4, 4, 2, 1, 1, 4, 1, 4, 1, 2);
            case DAY_8:
                return new NumberOfTheDay(2, 1, 4, 2, 4, 1, 3, 3, 4, 4, 4, 1, 3, 2, 3, 1, 2, 1, 3, 3, 3, 4, 3, 1, 3, 2, 1, 4, 4, 4);
            case DAY_9:
                return new NumberOfTheDay(1, 2, 3, 1, 4, 1, 4, 1, 1, 4, 1, 3, 4, 3, 4, 4, 1, 1, 1, 1, 3, 3, 4, 1, 3, 3, 4, 4, 3, 1);
            case DAY_10:
                return new NumberOfTheDay(1, 1, 4, 4, 2, 2, 3, 2, 4, 2, 4, 4, 2, 1, 4, 4, 1, 4, 4, 3, 3, 4, 1, 1, 2, 4, 2, 3, 1, 2);
            case DAY_11:
                return new NumberOfTheDay(4, 2, 1, 2, 4, 4, 2, 2, 3, 2, 2, 2, 4, 4, 3, 3, 1, 4, 1, 4, 2, 3, 3, 2, 1, 2, 3, 4, 1, 4);
            case DAY_12:
                return new NumberOfTheDay(1, 1, 2, 3, 4, 3, 1, 4, 1, 4, 3, 2, 4, 3, 3, 2, 4, 4, 4, 1, 1, 1, 1, 2, 1, 4, 2, 2, 1, 1);
            case DAY_13:
                return new NumberOfTheDay(1, 4, 2, 2, 3, 2, 4, 2, 3, 2, 3, 3, 3, 2, 4, 3, 1, 4, 3, 2, 3, 1, 1, 3, 2, 2, 2, 3, 3, 4);
            case DAY_14:
                return new NumberOfTheDay(4, 2, 1, 2, 1, 3, 4, 4, 4, 1, 1, 1, 2, 2, 3, 2, 2, 3, 2, 3, 2, 4, 2, 4, 3, 1, 3, 3, 4, 3);
            case DAY_15:
                return new NumberOfTheDay(1, 2, 3, 2, 3, 4, 1, 4, 1, 3, 3, 3, 1, 3, 1, 1, 3, 3, 1, 1, 3, 4, 4, 2, 1, 1, 4, 2, 3, 1);
            case DAY_16:
                return new NumberOfTheDay(2, 1, 1, 2, 4, 4, 3, 4, 1, 3, 1, 4, 4, 3, 2, 1, 2, 4, 1, 2, 1, 1, 2, 2, 1, 3, 4, 2, 1, 1);
            case DAY_17:
                return new NumberOfTheDay(3, 2, 2, 2, 3, 2, 3, 4, 4, 1, 1, 3, 4, 3, 3, 4, 3, 1, 1, 3, 1, 1, 4, 1, 4, 4, 3, 3, 4, 2);
            case DAY_18:
                return new NumberOfTheDay(4, 2, 3, 4, 3, 3, 3, 2, 2, 2, 4, 3, 3, 4, 2, 1, 2, 3, 3, 2, 4, 3, 3, 2, 1, 3, 3, 4, 1, 2);
            case DAY_19:
                return new NumberOfTheDay(4, 1, 4, 2, 1, 1, 4, 2, 2, 3, 2, 1, 2, 2, 2, 1, 1, 1, 2, 3, 3, 1, 1, 4, 3, 1, 2, 1, 1, 3);
            case DAY_20:
                return new NumberOfTheDay(1, 3, 1, 3, 3, 2, 4, 1, 3, 2, 4, 1, 3, 1, 3, 1, 3, 4, 1, 3, 4, 4, 3, 3, 3, 1, 1, 2, 4, 2);
            case DAY_21:
                return new NumberOfTheDay(4, 3, 1, 2, 4, 2, 4, 2, 4, 1, 1, 2, 3, 3, 2, 4, 2, 2, 2, 2, 4, 4, 1, 2, 4, 1, 2, 1, 2, 3);
            case DAY_22:
                return new NumberOfTheDay(3, 2, 1, 2, 4, 3, 3, 3, 2, 1, 2, 3, 3, 1, 4, 4, 4, 3, 2, 3, 4, 4, 2, 3, 3, 4, 3, 3, 2, 3);
            case DAY_23:
                return new NumberOfTheDay(2, 1, 4, 1, 1, 1, 1, 3, 4, 2, 4, 2, 3, 3, 2, 3, 3, 2, 1, 1, 2, 3, 4, 4, 4, 3, 4, 3, 1, 1);
            case DAY_24:
                return new NumberOfTheDay(2, 4, 2, 1, 1, 1, 4, 2, 3, 4, 4, 3, 2, 4, 2, 2, 3, 1, 2, 3, 2, 4, 3, 1, 2, 4, 2, 2, 1, 3);
            case DAY_25:
                return new NumberOfTheDay(3, 3, 3, 4, 4, 4, 4, 3, 1, 1, 3, 3, 2, 1, 2, 4, 3, 4, 3, 2, 2, 3, 4, 1, 2, 1, 2, 4, 4, 4);
            case DAY_26:
                return new NumberOfTheDay(3, 1, 3, 1, 1, 2, 4, 3, 1, 4, 1, 2, 2, 2, 4, 2, 4, 3, 3, 3, 1, 1, 1, 4, 1, 4, 3, 3, 4, 3);
            case DAY_27:
                return new NumberOfTheDay(2, 1, 1, 1, 1, 1, 4, 1, 1, 3, 1, 2, 4, 2, 1, 3, 3, 3, 4, 1, 2, 3, 2, 1, 1, 3, 3, 4, 1, 4);
            case DAY_28:
                return new NumberOfTheDay(2, 2, 3, 4, 2, 4, 3, 2, 3, 2, 4, 4, 2, 1, 2, 1, 2, 4, 1, 1, 3, 1, 2, 4, 3, 4, 2, 4, 2, 2);
            case DAY_29:
                return new NumberOfTheDay(3, 2, 4, 4, 1, 1, 1, 3, 3, 4, 4, 1, 4, 2, 3, 4, 3, 4, 1, 4, 3, 1, 1, 1, 3, 4, 2, 4, 2, 4);
            case DAY_30:
                return new NumberOfTheDay(1, 4, 3, 3, 3, 3, 3, 4, 2, 2, 4, 1, 2, 3, 2, 2, 2, 4, 3, 4, 3, 1, 3, 1, 1, 4, 1, 4, 4, 4);
            case DAY_31:
                return new NumberOfTheDay(4, 3, 2, 1, 3, 1, 3, 3, 2, 3, 2, 3, 4, 4, 2, 4, 3, 4, 3, 1, 4, 3, 3, 4, 1, 3, 1, 1, 1, 1);
        }
        return null;
    }
}
