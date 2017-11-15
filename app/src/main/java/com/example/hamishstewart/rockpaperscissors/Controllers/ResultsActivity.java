package com.example.hamishstewart.rockpaperscissors.Controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.hamishstewart.rockpaperscissors.R;

public class ResultsActivity extends AppCompatActivity {
    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        resultView = findViewById(R.id.resultView);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String gameResult = extras.getString("result");

        TextView answerTextView = findViewById(R.id.resultView);
        answerTextView.setText(gameResult);

    }

    }

