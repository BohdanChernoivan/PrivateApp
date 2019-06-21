package com.dan.numberrnd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.dan.numberrnd.presenter.PresenterShowMain;

public class MainActivity extends AppCompatActivity implements PresenterShowMain.RandomizerNum{

    TextView showNum;
    EditText edit_start_num;
    EditText edit_end_num;
    Button startApp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        control();

        startApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit_start_num.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "You did't specify a minimum", Toast.LENGTH_LONG).show();
                } else if (edit_end_num.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "You did't specify a maximum", Toast.LENGTH_LONG).show();
                } else {
                    getRndNum(Integer.parseInt(edit_start_num.getText().toString()), Integer.parseInt(edit_end_num.getText().toString()));
                }
            }
        });
    }

    private void control() {
        showNum = findViewById(R.id.main_num);
        edit_start_num = findViewById(R.id.start_num);
        edit_end_num = findViewById(R.id.end_num);
        startApp = findViewById(R.id.startApp);
    }


    @Override
    public void getRndNum(int min, int max) {
        max -= min;
        double v = (Math.random() * ++max) + min;
        showNum.setText(String.valueOf((int)v));
    }
}
