package com.example.hamishstewart.rockpaperscissors.Controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.hamishstewart.rockpaperscissors.Models.Game;
import com.example.hamishstewart.rockpaperscissors.R;

public class MainActivity extends AppCompatActivity {
    ImageButton rockButton;
    ImageButton paperButton;
    ImageButton scissorsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rockButton = findViewById(R.id.rockButton);
        paperButton = findViewById(R.id.paperButton);
        scissorsButton = findViewById(R.id.scissorsButton);

//        game = new Game();

    }

    public void onRockButtonClick(View view) {
        Intent intent = new Intent(this, ResultsActivity.class );
        Game game = new Game("rock" );
        game.setHand2();
        String gameResult = game.gameResult();
        intent.putExtra("result", gameResult);
        startActivity(intent);
    }

    public void onPaperButtonClick(View view) {
        Intent intent = new Intent(this, ResultsActivity.class);
        Game game = new Game("paper");
        game.setHand2();
        String gameResult = game.gameResult();
        intent.putExtra("result", gameResult);
        startActivity(intent);

    }

    public void onScissorsButtonClick(View view) {
        Intent intent = new Intent(this, ResultsActivity.class);
        Game game = new Game("scissors");
        game.setHand2();
        String gameResult = game.gameResult();
        intent.putExtra("result", gameResult);
        startActivity(intent);

    }


}
