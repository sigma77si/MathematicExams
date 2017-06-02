package com.dev.sigma77.mathematicexams;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {
    public static TextView correct1,
            correct2,
            correct3,
            correct4,
            correct5,

            correct6,
            correct7,
            correct8,
            correct9,
            correct10,
            correct11,
            correct12,
            correct13,
            correct14,
            correct15,
            allPoints;
    Button ok, points1, points6,
            points7,
            points8,
            points9,
            points10,
            points11,
            points12,
            points13,
            points14,
            points15,
            points2,
            points3,
            points4,
           points5;
    ImageView imgStar1, imgStar2, imgStar3, imgStar4, imgStar5;
    MediaPlayer mp;
    public static boolean isFromResultActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                isFromResultActivity=false;
              finish();
            }
        });
        correct1= (TextView) findViewById(R.id.correct1);
        correct2= (TextView) findViewById(R.id.correct2);
        correct3= (TextView) findViewById(R.id.correct3);
        correct4= (TextView) findViewById(R.id.correct4);
        correct5= (TextView) findViewById(R.id.correct5);
        correct6= (TextView) findViewById(R.id.correct6);
        correct7= (TextView) findViewById(R.id.correct7);
        correct8= (TextView) findViewById(R.id.correct8);
        correct9= (TextView) findViewById(R.id.correct9);
        correct10= (TextView) findViewById(R.id.correct10);
        correct11= (TextView) findViewById(R.id.correct11);
        correct12= (TextView) findViewById(R.id.correct12);
        correct13= (TextView) findViewById(R.id.correct13);
        correct14= (TextView) findViewById(R.id.correct14);
        correct15= (TextView) findViewById(R.id.correct15);
        points1= (Button) findViewById(R.id.points1);

        points2= (Button) findViewById(R.id.points2);
        points3= (Button) findViewById(R.id.points3);
        points4= (Button) findViewById(R.id.points4);
        points5= (Button) findViewById(R.id.points5);
        points6= (Button) findViewById(R.id.points6);
        points7= (Button) findViewById(R.id.points7);
        points8= (Button) findViewById(R.id.points8);
        points9= (Button) findViewById(R.id.points9);
        points10= (Button) findViewById(R.id.points10);
        points11= (Button) findViewById(R.id.points11);
        points12= (Button) findViewById(R.id.points12);
        points13= (Button) findViewById(R.id.points13);
        points14= (Button) findViewById(R.id.points14);
        points15= (Button) findViewById(R.id.points15);
        allPoints= (TextView) findViewById(R.id.allPoints);
//        imgStar1= (ImageView) findViewById(R.id.imgStar1);
//        imgStar2= (ImageView) findViewById(R.id.imgStar2);
//        imgStar3= (ImageView) findViewById(R.id.imgStar3);
//        imgStar4= (ImageView) findViewById(R.id.imgStar4);
//        imgStar5= (ImageView) findViewById(R.id.imgStar5);
        points1.setOnClickListener(this);
        points2.setOnClickListener(this);
        points3.setOnClickListener(this);
        points4.setOnClickListener(this);
        points5.setOnClickListener(this);
        points6.setOnClickListener(this);
        points7.setOnClickListener(this);
        points8.setOnClickListener(this);
        points9.setOnClickListener(this);
        points10.setOnClickListener(this);
        points11.setOnClickListener(this);
        points12.setOnClickListener(this);
        points13.setOnClickListener(this);
        points14.setOnClickListener(this);
        points15.setOnClickListener(this);

        ImageView[]stars={imgStar1,imgStar2,imgStar3,imgStar4,imgStar5};
       // ok= (Button) findViewById(R.id.btnOk);
       // ok.setOnClickListener(this);
        TextView[]answers={correct1,correct2,correct3,correct4,correct5,correct6,correct7,correct8,correct9,correct10,correct11,correct12,correct13,correct14,correct15};
        TextView[]points={points1,points2,points3,points4,points5,points6,points7,points8,points9,points10,points11,points12,points13,points14,points15};

        mp = MediaPlayer.create(ResultActivity.this, R.raw.intro_one);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);

        Intent mIntent = getIntent();
      //  ArrayList<String> gamesCorrectAnswers = mIntent.getStringArrayListExtra("GamesCorrectAnswers");
        ArrayList<String> gamesPoints = mIntent.getStringArrayListExtra("GamesPoints");
      //  int allGamesPoints=mIntent.getIntExtra("AllPoints", 0);


        populateResults(answers, points, gamesPoints);
//        for(int i=0; i < allGamesPoints;i++){
//            stars[i].setImageResource(R.drawable.gold_star);
//        }

//        if(allGamesPoints==5){
//            mp = MediaPlayer.create(ResultActivity.this, R.raw.end_test_win);
//            mp.start();
//
//        }
//        else {
//            mp = MediaPlayer.create(ResultActivity.this, R.raw.end_test_loose);
//            mp.start();
//
//        }
        isFromResultActivity=true;
    }

    private void populateResults(TextView[] answers, TextView[] points, ArrayList<String> gamesPoints) {
        int allGamesPoints=0;
        for(int i=0; i<gamesPoints.size(); i++){
if(gamesPoints.get(i).equals("1")){
    answers[i].setText("V");
    answers[i].setTextColor(Color.GREEN);
    points[i].setTextColor(Color.GREEN);
    allGamesPoints++;
    }
            else if(gamesPoints.get(i).equals("0")){
    answers[i].setText("X");
    answers[i].setTextColor(Color.RED);
   // points[i].setVisibility(View.VISIBLE);
    points[i].setTextColor(Color.RED);

}else{answers[i].setText("-");

    points[i].setVisibility(View.VISIBLE);


}
//            answers[i].setText(gamesCorrectAnswers.get(i));
//            points[i].setText(gamesPoints.get(i));

        }
        String stringAllGamePoints= String.valueOf(allGamesPoints);
        allPoints.setText( stringAllGamePoints);
    }


    @Override
    protected void onStop()
    {
     //   ResultActivity.isLastTest=false;
        super.onStop();
        if (mp != null) {

            mp.release();
            mp = null;
            // check this
            if(!isFromResultActivity) {
                finish();
            }

        }

    }


    @Override
    protected void onPause() {


        super.onPause();
      //  ResultActivity.isLastTest=false;
//

        if (mp != null) {

            mp.release();
            mp = null;
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.points1: {
                Exam_1Activity.taskNum = 0;
                break;
            }
            case R.id.points2: {
                Exam_1Activity.taskNum = 1;
                break;
            }
            case R.id.points3: {
                Exam_1Activity.taskNum = 2;
                break;
            }
            case R.id.points4: {
                Exam_1Activity.taskNum = 3;
                break;
            }
            case R.id.points5: {
                Exam_1Activity.taskNum = 4;
                break;
            }
            case R.id.points6: {
                Exam_1Activity.taskNum = 5;
                break;
            }
            case R.id.points7: {
                Exam_1Activity.taskNum = 6;
                break;
            }
            case R.id.points8: {
                Exam_1Activity.taskNum = 7;
                break;
            }
            case R.id.points9: {
                Exam_1Activity.taskNum = 8;
                break;
            }
            case R.id.points10: {
                Exam_1Activity.taskNum = 9;
                break;
            }
            case R.id.points11: {
                Exam_1Activity.taskNum = 10;
                break;
            }
            case R.id.points12: {
                Exam_1Activity.taskNum = 11;
                break;
            }
            case R.id.points13: {
                Exam_1Activity.taskNum = 12;
                break;
            }
            case R.id.points14: {
                Exam_1Activity.taskNum = 13;
                break;
            }
            case R.id.points15: {
                Exam_1Activity.taskNum = 14;
                break;
            }

        }
        startActivity(new Intent(ResultActivity.this, Exam_1Activity.class));

    }
//    @Override
//    public void onClick(View v) {
//        if (v.getId() == R.id.btnOk) {
//            finish();
//
//
//            return;
//        }
//
//
//    }
}
