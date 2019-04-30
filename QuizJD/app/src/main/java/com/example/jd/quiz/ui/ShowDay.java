package com.example.jd.quiz.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.jd.quiz.R;
import com.example.jd.quiz.logic.abstract_factory.DayStorage;
import com.example.jd.quiz.logic.abstract_factory.NumberOfTheDay;

import java.util.List;

public class ShowDay extends AppCompatActivity {

    Button button;
    LinearLayout linearLayout;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        control();

        createDaysList(DayStorage.getNumberDayList());
    }

    private void control() {
        linearLayout = findViewById(R.id.ScLayout);
    }

    private void createDaysList(List<NumberOfTheDay> numberDays) {

        for (int i = 0; i < numberDays.size(); i++) {

            View view = getLayoutInflater().inflate(R.layout.sketch_days, null);

            button = view.findViewById(R.id.select_data);

            final int finalI = i;

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = createIntent(finalI);

                    startActivity(intent);
                }
            });

            button.setText("Number of day = " + (i + 1));

            linearLayout.addView(view);
        }
    }

    private Intent createIntent(int i) {
        Intent intent = new Intent(this, ShowAnswer.class);
        intent.putExtra("Number", i);
        return intent;
    }
}
