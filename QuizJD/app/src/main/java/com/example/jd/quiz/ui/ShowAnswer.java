package com.example.jd.quiz.ui;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jd.quiz.R;
import com.example.jd.quiz.logic.abstract_factory.DayStorage;
import com.example.jd.quiz.logic.abstract_factory.NumberOfTheDay;
import com.example.jd.quiz.logic.presenter.CreateAnswersOfDay;

public class ShowAnswer extends AppCompatActivity implements CreateAnswersOfDay.ViewAnswers {

    Intent intent;
    TextView textView;
    LinearLayout layout;
    CreateAnswersOfDay createDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        control();

        final int intExtra = intent.getIntExtra("Number", 0);

        setTitle("Day " + (intExtra + 1));

        createAnswersOnDay(intExtra);
    }

    private void control() {
        intent = getIntent();
        layout = findViewById(R.id.ScrLayout);
        getSupportActionBar();
        createDay = new CreateAnswersOfDay(this);
    }

    @Override
    public void createAnswersOnDay(int number) {

        NumberOfTheDay numberOfTheDay = DayStorage.getNumberDayList().get(number);

        for (int i = 0; i < numberOfTheDay.getArrayAnswer().length; i++) {

            View view = getLayoutInflater().inflate(R.layout.sketch_answers, null);

            textView = view.findViewById(R.id.view_ask_answer);

            textView.setText(String.valueOf((i+1) + " ask  =  " + numberOfTheDay.getArrayAnswer()[i] + " answer"));

            if(i == 27 || i == 28 || i == 29) {
                textView.setTextColor(Color.MAGENTA);
            }

            layout.addView(view);

        }
    }
}
