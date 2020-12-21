package com.codewitkanwal.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Score extends AppCompatActivity {
TextView resultView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        resultView=findViewById(R.id.resultView);

        String s=getIntent().getStringExtra("Result");
        resultView.setText(s);
    }
}