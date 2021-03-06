package com.example.rocca.quizisboring;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HighestScoreActivity extends AppCompatActivity {

    TextView txtScore, txtHighScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highest_score);

        txtHighScore= (TextView)findViewById(R.id.textScore);
        txtHighScore = (TextView)findViewById(R.id.textHighScore);
        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);

        txtScore.setText("Your socre: " + score);
        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        
        int highscore = mypref.getInt("highscore", 0);
        if (highscore>= score)
            txtHighScore.setText("High score: " + highscore);
        else {
            txtHighScore.setText("New highscore: " + score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();
        }


    }

    public void onClick(View view) {
        Intent intent = new Intent(HighestScoreActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
