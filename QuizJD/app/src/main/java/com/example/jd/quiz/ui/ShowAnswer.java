package com.example.jd.quiz.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.jd.quiz.R;
import com.example.jd.quiz.logic.abstract_factory.DayStorage;
import com.example.jd.quiz.logic.abstract_factory.NumberOfTheDay;
import com.example.jd.quiz.logic.presenter.CreateAnswersOfDay;

public class ShowAnswer extends AppCompatActivity implements CreateAnswersOfDay.ViewAnswers {

    Intent intent;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        control();

        final int intExtra = intent.getIntExtra("Number", 0);

        createAnswersOnDay(intExtra);
    }

    private void control() {
        Intent intent = getIntent();
    }

    @Override
    public void createAnswersOnDay(int number) {

        NumberOfTheDay numberOfTheDay = DayStorage.getNumberDayList().get(number);
        for (int i = 0; i < 30; i++) {
            View view = getLayoutInflater().inflate(R.layout.scroll_answer, null);

            textView = view.findViewById(R.id.view_ask_answer);
        }
    }
}
