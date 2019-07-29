package com.example.android.baseballmetrics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeam1 = 0;
    int scoreTeam2 = 0;
    int innings1 = 0;
    int innings2 = 0;
    int outs1 = 0;
    int outs2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Adds +1 to the Team 1 Score
     */
    public void addOneForTeam1(View v) {
        scoreTeam1 = scoreTeam1 + 1;
        displayScoreTeam1(scoreTeam1);
    }

    /**
     * Displays the given score for Team 1.
     */
    public void displayScoreTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds +1 to the Team 1 Innings
     */
    public void addInningForTeam1(View v) {
        innings1 = innings1 + 1;
        displayInningTeam1(innings1);
    }

    /**
     * Displays the given Innings for Team 1.
     */
    public void displayInningTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_innings);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds +1 to the Team 1 Outs
     */
    public void addOutsForTeam1(View v) {
        outs1 = outs1 + 1;
        displayOutsTeam1(outs1);
    }

    /**
     * Displays the given Outs for Team 1.
     */
    public void displayOutsTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_outs);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds +1 to the Team 2 Score
     */
    public void addOneForTeam2(View v) {
        scoreTeam2 = scoreTeam2 + 1;
        displayScoreTeam2(scoreTeam2);
    }

    /**
     * Displays the given score for Team 2.
     */
    public void displayScoreTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds +1 to the Team 2 Innings
     */
    public void addInningForTeam2(View v) {
        innings2 = innings2 + 1;
        displayInningTeam2(innings2);
    }

    /**
     * Displays the given Innings for Team 2.
     */
    public void displayInningTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_innings);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds +1 to the Team 2 Outs
     */
    public void addOutsForTeam2(View v) {
        outs2 = outs2 + 1;
        displayOutsTeam2(outs2);
    }

    /**
     * Displays the given Outs for Team 2.
     */
    public void displayOutsTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_outs);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Clears all values stored and resets 0's
     */
    public void clearAll(View v) {
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        innings1 = 0;
        innings2 = 0;
        outs1 = 0;
        outs2 = 0;

        displayScoreTeam1(scoreTeam1);
        displayScoreTeam2(scoreTeam2);
        displayInningTeam1(innings1);
        displayInningTeam2(innings2);
        displayOutsTeam1(outs1);
        displayOutsTeam2(outs2);
    }
}
