package com.dev.sigma77.mathematicexams;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by user on 21.4.2017 г..
 */

public class ShowResults implements Runnable {
    Activity activityObj;
    int points;
    int correctAnswers;
    boolean isActivityEnds;


    public ShowResults(Activity pActivity, int parCorrectAnswers, int parPoints, boolean parIsActivityEnds) {

        points = parPoints;
        correctAnswers = parCorrectAnswers;
        activityObj = pActivity;
        isActivityEnds = parIsActivityEnds;
    }
//public  void startResultActivity(){
//        Intent result = new Intent(activityObj, ResultActivity.class);
//        result.putExtra("GamePoints", points);
//        result.putExtra("CorrectAnswers", corectAnswrs);
//        activityObj.startActivity(result);

    //   }

    @Override
    public void run() {
        Intent result = new Intent(activityObj, ResultActivity.class);
        result.putExtra("GamePoints", points);
        result.putExtra("CorrectAnswers", correctAnswers);

        activityObj.startActivity(result);
        if (isActivityEnds) {
            activityObj.finish();
        }
    }
}
