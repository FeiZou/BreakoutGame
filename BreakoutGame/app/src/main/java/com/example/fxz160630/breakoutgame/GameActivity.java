package com.example.fxz160630.breakoutgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GameActivity extends AppCompatActivity {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Initializing game view object
        gameView = new GameView(this);

        //adding it to contentview
        setContentView(gameView);

    }

    //pausing the game when activity is paused
    @Override
    protected void onPause(){
        super.onPause();
        gameView.pause();
    }

    //running the game when activity is resumed
    @Override
    protected void onResume(){
        super.onResume();
        gameView.resume();
    }
}
