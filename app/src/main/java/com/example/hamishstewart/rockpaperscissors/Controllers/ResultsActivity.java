package com.example.hamishstewart.rockpaperscissors.Controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import com.example.hamishstewart.rockpaperscissors.Models.Game;
import com.example.hamishstewart.rockpaperscissors.R;

public class ResultsActivity extends AppCompatActivity {
    TextView resultView;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        resultView = findViewById(R.id.resultView);
        backButton = findViewById(R.id.backButton);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String gameResult = extras.getString("result");

        TextView answerTextView = findViewById(R.id.resultView);
        answerTextView.setText(gameResult);

    }

    public void onBackButtonClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    }

