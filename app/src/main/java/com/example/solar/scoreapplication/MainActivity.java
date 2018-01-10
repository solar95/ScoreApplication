package com.example.solar.scoreapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    int yellowA = 0, yellowB = 0, redA = 0, redB = 0;
    int cornerA = 0, cornerB = 0, offSideA = 0, offSideB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addA(View view) { //Add a point to the counter of the team A goals
        int points = Integer.parseInt(view.getTag().toString());
        scoreA += points;
        TextView sa = (TextView) findViewById(R.id.scoreA);
        sa.setText(String.valueOf(scoreA));

    }

    public void addB(View view) { //Add a point to the counter of the team B goals
        int points = Integer.parseInt(view.getTag().toString());
        scoreB += points;
        TextView sa = (TextView) findViewById(R.id.scoreB);
        sa.setText(String.valueOf(scoreB));

    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        yellowA = 0;
        yellowB = 0;
        redA = 0;
        redB = 0;
        offSideA = 0;
        offSideB = 0;
        cornerA = 0;
        cornerB = 0;


        TextView aPoints = (TextView) findViewById(R.id.scoreA);
        TextView bPoints = (TextView) findViewById(R.id.scoreB);
        Button aR = findViewById(R.id.red_teamA);
        Button aY = findViewById(R.id.yellow_teamA);
        Button bR = findViewById(R.id.red_teamB);
        Button bY = findViewById(R.id.yellow_teamB);
        aPoints.setText(String.valueOf(scoreA));
        bPoints.setText(String.valueOf(scoreB));
        aR.setText(String.valueOf(redA));
        bR.setText(String.valueOf(redB));
        aY.setText(String.valueOf(yellowA));
        bY.setText(String.valueOf(yellowB));


        Button offA = findViewById(R.id.offSideA);
        Button offB = findViewById(R.id.offSideB);
        Button corA = findViewById(R.id.cornerA);
        Button corB = findViewById(R.id.cornerB);

        offA.setText("0        Off-side");
        offB.setText("0        Off-side");
        corA.setText("0       Corner");
        corB.setText("0       Corner");



    }

    public void addRed(View view) {
        int option = Integer.parseInt(view.getTag().toString());

        if (option == 1) {
            redA++;
            Button button = findViewById(R.id.red_teamA);
            button.setText(String.valueOf(redA));

        }

        if (option == 2) {
            redB++;
            Button button = findViewById(R.id.red_teamB);
            button.setText(String.valueOf(redB));

        }
    }

    public void addYellow(View view) {

        int option = Integer.parseInt(view.getTag().toString());

        if (option == 1) {
            yellowA++;
            Button button = findViewById(R.id.yellow_teamA);
            button.setText(String.valueOf(yellowA));

        }

        if (option == 2) {
            yellowB++;
            Button button = findViewById(R.id.yellow_teamB);
            button.setText(String.valueOf(yellowB));

        }
    }


    public void corner(View view) {
        int option = Integer.parseInt(view.getTag().toString());

        if (option == 1) {
            cornerA++;
            Button button = findViewById(R.id.cornerA);
            String content = String.valueOf(cornerA) + "       Corner";
            button.setText(content);
        }

        if (option == 2) {
            cornerB++;
            Button button = findViewById(R.id.cornerB);
            String content = String.valueOf(cornerB) + "       Corner";
            button.setText(content);
        }
    }

    public void offSide(View view) {
        int option = Integer.parseInt(view.getTag().toString());

        if (option == 1) {
            offSideA++;
            Button button = findViewById(R.id.offSideA);
            String content = String.valueOf(offSideA) + "        Off-side";
            button.setText(content);
        }

        if (option == 2) {
            offSideB++;
            Button button;
            button = findViewById(R.id.offSideB);
            String content = String.valueOf(offSideB) + "        Off-side";
            button.setText(content);
        }


    }
}
