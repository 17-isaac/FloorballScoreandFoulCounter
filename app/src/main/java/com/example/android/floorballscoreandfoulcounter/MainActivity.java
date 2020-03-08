package com.example.android.floorballscoreandfoulcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA= 0;
    int foulTeamB= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }


    /**
     * Increase the score by 1 for Team A
     */
    public void addOneForTeamA(View view) {
        scoreTeamA= scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Increase the score by 1 for Team B
     */
    public void addOneForTeamB(View view) {
        scoreTeamB= scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the foul by 1 for Team A
     */
    public void addOneForTeamAFoul(View view) {
        foulTeamA= foulTeamA+1;
        displayForTeamAFoul(foulTeamA);
    }


    /**
     * Increase the foul by 1 for Team B
     */
    public void addOneForTeamBFoul(View view) {
        foulTeamB= foulTeamB+1;
        displayForTeamBFoul(foulTeamB);
    }

    /**
     * Reset score for Team A/B
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB= 0;
        foulTeamA= 0;
        foulTeamB= 0;
        displayForTeamA(0);
        displayForTeamB(0);
        displayForTeamAFoul(0);
        displayForTeamBFoul(0);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Team A.
     */
    public void displayForTeamAFoul(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given foul for Team B.
     */
    public void displayForTeamBFoul(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(foul));
    }

}