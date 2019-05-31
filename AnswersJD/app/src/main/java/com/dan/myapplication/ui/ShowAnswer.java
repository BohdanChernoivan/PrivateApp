package com.dan.myapplication.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dan.myapplication.R;
import com.dan.myapplication.data.VPagerAdapter;
import com.dan.myapplication.data.VerticalViewPager;
import com.dan.myapplication.logic.fragments.PageFragment1;
import com.dan.myapplication.logic.fragments.PageFragment2;
import com.dan.myapplication.logic.fragments.PageFragment3;
import com.dan.myapplication.logic.presenter.CreateAnswersOfDay;

import java.util.ArrayList;
import java.util.List;


public class ShowAnswer extends AppCompatActivity implements CreateAnswersOfDay.ViewAnswers {

    Intent intent;
//    TextView textView;
//    LinearLayout layout;
//    CreateAnswersOfDay createDay;

    private VerticalViewPager viewPager;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        List<Fragment> list = new ArrayList<>();
        list.add(new PageFragment1());
        list.add(new PageFragment2());
        list.add(new PageFragment3());

        viewPager = findViewById(R.id.pager);
        pagerAdapter = new VPagerAdapter(getSupportFragmentManager(), list);

        viewPager.setAdapter(pagerAdapter);
//
//        control();
//
//        final int intExtra = intent.getIntExtra("Number", 0);
//
//        setTitle("Day " + (intExtra + 1));
//
//        createAnswersOnDay(intExtra);
    }

    private void control() {
        intent = getIntent();
//        layout = findViewById(R.id.ScrLayout);
//        getSupportActionBar();
//        createDay = new CreateAnswersOfDay(this);
    }

    @Override
    public void createAnswersOnDay(int number) {
//
//        NumberOfTheDay numberOfTheDay = DayStorage.getNumberDayList().get(number);
//
//        for (int i = 0; i < numberOfTheDay.getArrayAnswer().length; i++) {
//
//            View view = getLayoutInflater().inflate(R.layout.sketch_answers, null);
//
//            textView = view.findViewById(R.id.view_ask_answer);
//
//            textView.setText(String.valueOf((i+1) + " ask  =  " + numberOfTheDay.getArrayAnswer()[i] + " answer"));
//
//            if(i == 27 || i == 28 || i == 29) {
//                textView.setTextColor(Color.MAGENTA);
//            }
//
//            layout.addView(view);
//
//        }
    }
}
