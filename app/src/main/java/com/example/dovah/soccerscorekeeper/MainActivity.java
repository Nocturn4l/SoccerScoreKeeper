package com.example.dovah.soccerscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int cornerTeamA = 0;
    int cornerTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for both Teams.
     */
    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display the current number of Corner
     */
    public void displayCornerForTeamA(int corner) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_corner);
        scoreView.setText(String.valueOf(corner));
    }

    public void displayCornerForTeamB(int corner) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_corner);
        scoreView.setText(String.valueOf(corner));
    }

    /**
     * Add 1 goal to team A
     */
    public void addGoalA(View v) {
        scoreTeamA++;
        displayGoalForTeamA(scoreTeamA);
    }

    /**
     * Add 1 goal to team B
     */
    public void addGoalB(View v) {
        scoreTeamB++;
        displayGoalForTeamB(scoreTeamB);
    }

    /**
     * Add 1 corner to team A
     */
    public void addCornerA(View v) {
        cornerTeamA++;
        displayCornerForTeamA(cornerTeamA);
    }

    /**
     * Add 1 corner to team B
     */
    public void addCornerB(View v) {
        cornerTeamB++;
        displayCornerForTeamB(cornerTeamB);
    }

    /**
     * Reset  Team scores
     */
    public void resetScores(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        cornerTeamA = 0;
        cornerTeamB = 0;
        displayGoalForTeamA(scoreTeamA);
        displayGoalForTeamB(scoreTeamB);
        displayCornerForTeamA(cornerTeamA);
        displayCornerForTeamB(cornerTeamB);
    }
}
