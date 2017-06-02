package com.dev.sigma77.mathematicexams;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Exam_1Activity extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2,btn3,btn4,btn11,btn12,btn13,btn14,selectedBtn;
    TextView problemText,answerText;
    ImageView pic;
    FloatingActionButton fab;
    LinearLayout layoutButtons;
    SoundPool sp;
    boolean isEnd;
    public static boolean exam2ActivityOn;
    private int correctSound ,wrongSound ,correctAnswers, currentGamePoints,problemCorrectAnswers,problemPoints;
    private int numOftasks;


   public static int taskNum=0,correctAnswer,answer;

    
    Button[]answerSignal=new Button[4];

    static int[]currentCorrectAnswers,currentProblemText,currentExamAnswers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

         fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setVisibility(View.INVISIBLE);
       fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(ResultActivity.isFromResultActivity){

                   finish();

                }
                else {

                    taskNum++;

                    setNewTask(taskNum);
                }

//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();

            }
       });
        sp = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        correctSound = sp.load(this, R.raw.zvukpravilno, 1);
        wrongSound = sp.load(this, R.raw.zvukgreshka, 1);

        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        btn1= (Button) findViewById(R.id.button1);
        btn2= (Button) findViewById(R.id.button2);
        btn3= (Button) findViewById(R.id.button3);
        btn4= (Button) findViewById(R.id.button4);
        btn11= (Button) findViewById(R.id.button11);
        btn12= (Button) findViewById(R.id.button12);
        btn13= (Button) findViewById(R.id.button13);
        btn14= (Button) findViewById(R.id.button14);
        pic= (ImageView) findViewById(R.id.imagePic);
        layoutButtons= (LinearLayout) findViewById(R.id.layoutBttons);

        answerSignal[0]=btn11;
        answerSignal[1]=btn12;
        answerSignal[2]=btn13;
        answerSignal[3]=btn14;

        problemText= (TextView) findViewById(R.id.problemText);
        answerText= (TextView) findViewById(R.id.answerText);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

//
        setNewTask(taskNum);

//         for test only
//        if(!ResultActivity.isFromResultActivity){
//            Intent in = new Intent(this, ResultActivity.class);
//
//            in.putStringArrayListExtra("GamesCorrectAnswers",(ArrayList<String>)MainActivity.correctAnswersList);
//            in.putStringArrayListExtra("GamesPoints", (ArrayList<String>) MainActivity.gamePointsList);
//            // in.putExtra("AllPoints",result);
//            startActivity(in);
//            finish();
//
//
//        }

    }



    @Override
    public void onClick(View v) {

        int selectedButtonId = v.getId();
        switch (selectedButtonId){

            case R.id.button1:{
                answer=1;
                selectedBtn=btn1;
             break;
            }
            case R.id.button2:{
                answer=2;
                selectedBtn=btn2;
                break;
            }
            case R.id.button3:{
                answer=3;
                selectedBtn=btn3;
                break;
            }
            case R.id.button4:{
                answer=4;
                selectedBtn=btn4;
                break;
            }
        }
        checkAnswer(selectedBtn);
        btn1.setClickable(false);
        btn2.setClickable(false);
        btn3.setClickable(false);
        btn4.setClickable(false);
        fab.setVisibility(View.VISIBLE);
    }

    public void setNewTask(int task){

        fab.setVisibility(View.INVISIBLE);
        if(taskNum < 15) {
            currentCorrectAnswers=SetProblemValues.setCorrectAnswers(Competitions_name.examNum);
             currentProblemText=SetProblemValues.setTaskCondition(Competitions_name.examNum);
             currentExamAnswers=SetProblemValues.setExamAnswer(Competitions_name.examNum);

            btn11.setBackgroundColor((Color.GRAY));
            btn12.setBackgroundColor((Color.GRAY));
            btn13.setBackgroundColor((Color.GRAY));
            btn14.setBackgroundColor((Color.GRAY));

            if(Competitions_name.examNum==5&&taskNum==6) {
                Handler h = new Handler();
                h.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        correctAnswer = currentCorrectAnswers[taskNum];
                        problemText.setText(currentProblemText[taskNum]);
                        answerText.setText(currentExamAnswers[taskNum]);
                        pic.setImageResource(0);
                    }
                }, 1000);
            }
            else {
                correctAnswer = currentCorrectAnswers[taskNum];
                problemText.setText(currentProblemText[taskNum]);
                answerText.setText(currentExamAnswers[taskNum]);
                pic.setImageResource(0);
            }


            switch (Competitions_name.examNum){
                case 1:{
                    setTitle(getString(R.string.y2013));
//                    correctAnswer = correctAnswersList_1[taskNum];
//                    problemText.setText(taskConditions_1[taskNum]);
//                    answerText.setText(examAnswers_1[taskNum]);

                    if(taskNum==2){
                        pic.setImageResource(R.drawable.exam1_eggs);
                    }
                    if(taskNum==8){
                        pic.setImageResource(R.drawable.exam1problem9);
                    }
                    if(taskNum==9){
                        pic.setImageResource(R.drawable.exam1problem10);
                    }
                    if(taskNum==12){
                        pic.setImageResource(R.drawable.exam1problem13);
                    }
                    break;
                       }

                case 2:{
                    setTitle(getString(R.string.y2012));
//                    correctAnswer = correctAnswersList_2[taskNum];
//                    problemText.setText(taskConditions_2[taskNum]);
//                    answerText.setText(examAnswers_2[taskNum]);
                    if(taskNum==3) {
                        pic.setImageResource(R.drawable.exam2problem4);
                    }
                    else if(taskNum==4) {
                        pic.setImageResource(R.drawable.clock5);
                    }
                        else if(taskNum==6){
                            pic.setImageResource(R.drawable.exam2problem6pic);
                        }
                        else if(taskNum==8){
                            pic.setImageResource(R.drawable.exam2problem8pic);
                        }
                    else if(taskNum==10){
                        pic.setImageResource(R.drawable.exam2problem10);
                    }
                    else if(taskNum==11){
                        pic.setImageResource(R.drawable.exam2problem12);
                    }
                    else if(taskNum==14){
                        pic.setImageResource(R.drawable.exam2problem15);
                    }

                    break;
                }
                case 3:{
                    setTitle(getString(R.string.y2011));
//                    correctAnswer = correctAnswersList_3[taskNum];
//                    problemText.setText(taskConditions_3[taskNum]);
//                    answerText.setText(examAnswers_3[taskNum]);
//
                if(taskNum==6){
                    pic.setImageResource(R.drawable.exam3problem7);
                }
                else if(taskNum==9){
                    pic.setImageResource(R.drawable.exam3problem10);
                }
                else if(taskNum==10){
                    pic.setImageResource(R.drawable.exam3problem11);
                }
                     else if(taskNum==11){
                         pic.setImageResource(R.drawable.exam3problem12);
                     }
                     else if(taskNum==14){
                         pic.setImageResource(R.drawable.exam3problem15);
                     }
                    break;
                }

                case 4:{
                    setTitle(getString(R.string.y2014));
//                    correctAnswer = correctAnswersList_4[taskNum];
//                    problemText.setText(taskConditions_4[taskNum]);
//                    answerText.setText(examAnswers_4[taskNum]);
//
                    if(taskNum==2){
                        pic.setImageResource(R.drawable.exam4problem2);
                    }
                    else if(taskNum==6){
                        pic.setImageResource(R.drawable.exam4problem7);
                    }
                    else if(taskNum==9){
                        pic.setImageResource(R.drawable.exam4aproblem10);
                    }
                    else if(taskNum==12){
                        pic.setImageResource(R.drawable.exam4aproblem13);
                    }
                    else if(taskNum==13){
                        pic.setImageResource(R.drawable.exam4problem14);
                    }

                    break;
                }
                case 5:{
                    setTitle(getString(R.string.y2015));
//                    correctAnswer = correctAnswersList_4[taskNum];
//                    problemText.setText(taskConditions_4[taskNum]);
//                    answerText.setText(examAnswers_4[taskNum]);
//
                    if(taskNum==2){
                        pic.setImageResource(R.drawable.exam5problem3);
                    }
                    else if(taskNum==3){
                        pic.setImageResource(R.drawable.exam5problem4);
                    }
                    else if(taskNum==5){
                        pic.setImageResource(R.drawable.exam5problem6);
                    }
                    else if(taskNum==6){

                        startActivity(new Intent(Exam_1Activity.this, Exam2Activity.class));
                        exam2ActivityOn=true;
                        Exam2Activity.currentCorrectAnswer1 =20;
                        Exam2Activity.currentCorrectAnswer2 =18;
                        Exam2Activity.currentCorrectAnswer3 =17;
                        Exam2Activity.imgPic=R.drawable.exam5problem7;
                        Exam2Activity.problemText=currentProblemText[taskNum];
                        Exam2Activity.currentTask=6;
                        Exam2Activity.textToLoad1="Зайче 1";
                        Exam2Activity.textToLoad2="Зайче 2";
                        Exam2Activity.textToLoad3="Зайче 3";

                        Handler handler=new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                taskNum++;
                                setNewTask(taskNum);
                            }
                        },1500);


                    }
                    else if(taskNum==8){

                        startActivity(new Intent(Exam_1Activity.this, Exam2Activity.class));
                        exam2ActivityOn=true;
                        Exam2Activity.currentCorrectAnswer1 =1;
                        Exam2Activity.currentCorrectAnswer2 =2;
                        Exam2Activity.currentCorrectAnswer3 =3;
                        Exam2Activity.imgPic=0;
                        Exam2Activity.currentTask=8;
                        Exam2Activity.problemText=currentProblemText[taskNum];
                        Exam2Activity.textToLoad1="Ваня";
                        Exam2Activity.textToLoad2="Таня";
                        Exam2Activity.textToLoad3="Мира";

                        Handler handler=new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                taskNum++;
                                setNewTask(taskNum);
                            }
                        },1500);


                    }

                    else if(taskNum==7){
                        pic.setImageResource(R.drawable.exam5problem8);
                    }

                    else if(taskNum==13){
                        pic.setImageResource(R.drawable.exam5problem14);
                        layoutButtons.setVisibility(View.INVISIBLE);
                        fab.setVisibility(View.VISIBLE);

                       // MainActivity.correctAnswersList.add(String.valueOf(problemCorrectAnswers));
                        if(!ResultActivity.isFromResultActivity) {
                            MainActivity.gamePointsList.add("3");
                            MainActivity.playerAnswerList.add(2);
                        }
                        else{
                            pic.setImageResource(R.drawable.exam5problem14_2);
                        }
                    }
                    else if(taskNum==14){
                        layoutButtons.setVisibility(View.VISIBLE);
                        startActivity(new Intent(Exam_1Activity.this, Exam2Activity.class));
                        exam2ActivityOn=true;
                        Exam2Activity.currentCorrectAnswer1 =5;
                        Exam2Activity.currentCorrectAnswer2 =7;
                        Exam2Activity.currentCorrectAnswer3 =8;
                        Exam2Activity.imgPic=0;
                        Exam2Activity.currentTask=14;
                        Exam2Activity.problemText=currentProblemText[taskNum];
                        Exam2Activity.textToLoad1="Асен";
                        Exam2Activity.textToLoad2="Боян";
                        Exam2Activity.textToLoad3="Васил";

                        Handler handler=new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                taskNum++;
                                setNewTask(taskNum);
                            }
                        },1500);


                    }

                    break;
                }
                case 6: {
                    setTitle(getString(R.string.y2016));
//                    correctAnswer = correctAnswersList_4[taskNum];
//                    problemText.setText(taskConditions_4[taskNum]);
//                    answerText.setText(examAnswers_4[taskNum]);
//
                    if (taskNum == 3) {
                        pic.setImageResource(R.drawable.exam6problem4);
                    } else if (taskNum == 8) {
                        pic.setImageResource(R.drawable.exam6problem8);
                    } else if (taskNum == 10) {
                        pic.setImageResource(R.drawable.exam6problem11);
                    } else if (taskNum == 11) {
                        pic.setImageResource(R.drawable.exam6problem12);
                    } else if (taskNum == 12) {
                        pic.setImageResource(R.drawable.exam6problem13);
                    } else if (taskNum == 13) {
                        pic.setImageResource(R.drawable.exam6problem14);
                    } else if (taskNum == 14) {
                        pic.setImageResource(R.drawable.exam6problem15);
                    }

                    break;
                }
                    case 7:{
                        setTitle(getString(R.string.y2010));
//                    correctAnswer = correctAnswersList_4[taskNum];
//                    problemText.setText(taskConditions_4[taskNum]);
//                    answerText.setText(examAnswers_4[taskNum]);
//
                        if(taskNum==0){
                            pic.setImageResource(R.drawable.exam7problem1_1);
                        }
                        else if(taskNum==2){
                            pic.setImageResource(R.drawable.exam7problem3);
                        }
                        else if(taskNum==3){
                            pic.setImageResource(R.drawable.exam7problem4);
                        }
                        else if(taskNum==4){
                            pic.setImageResource(R.drawable.exam7problem5);
                        }

                        else if(taskNum==5){
                            pic.setImageResource(R.drawable.exam7problem6);
                        }

                        else if(taskNum==8){
                            pic.setImageResource(R.drawable.exam7problem9);
                        }
                        else if(taskNum==12){
                            pic.setImageResource(R.drawable.exam7problem13);
                        }
                        else if(taskNum==14){
                            pic.setImageResource(R.drawable.exam7problem15);
                        }

                        break;
                }
                case 8: {
                    setTitle(getString(R.string.y2008));
//                    correctAnswer = correctAnswersList_4[taskNum];
//                    problemText.setText(taskConditions_4[taskNum]);
//                    answerText.setText(examAnswers_4[taskNum]);
//
                    if (taskNum == 0) {
                        pic.setImageResource(R.drawable.exam8problem1);
                    }
                    if (taskNum == 1) {
                        pic.setImageResource(R.drawable.exam8problem2);
                    }else if (taskNum == 5) {
                        pic.setImageResource(R.drawable.exam8problem6);
                    } else if (taskNum == 6) {
                        pic.setImageResource(R.drawable.exam8problem7);
                    } else if (taskNum == 10) {
                        pic.setImageResource(R.drawable.exam8problem11);
                    } else if (taskNum == 11) {
                        pic.setImageResource(R.drawable.exam8problem12);
                    } else if (taskNum == 13) {
                        pic.setImageResource(R.drawable.exam8problem14);
                    } else if (taskNum == 14) {
                        pic.setImageResource(R.drawable.exam8problem15);
                    }

                    break;
                }

            }
if(ResultActivity.isFromResultActivity){
    answerSignal[correctAnswer-1].setBackgroundColor(Color.GREEN);
   int playerAnswer=MainActivity.playerAnswerList.get(taskNum);
    if(correctAnswer!=playerAnswer) {
        answerSignal[playerAnswer - 1].setBackgroundColor(Color.RED);
    }
    fab.setVisibility(View.VISIBLE);
    btn1.setClickable(false);
    btn2.setClickable(false);
    btn3.setClickable(false);
    btn4.setClickable(false);
}

else {
    btn1.setClickable(true);
    btn2.setClickable(true);
    btn3.setClickable(true);
    btn4.setClickable(true);
}

        }
        else if (taskNum>=14&&!exam2ActivityOn) {
            isEnd=true;
            Intent in = new Intent(this, ResultActivity.class);

          //  in.putStringArrayListExtra("GamesCorrectAnswers",(ArrayList<String>)MainActivity.correctAnswersList);
            in.putStringArrayListExtra("GamesPoints", (ArrayList<String>) MainActivity.gamePointsList);
          //  in.putExtra("AllPoints",result);
            startActivity(in);
          //  new Handler().postDelayed(new ShowResults(this, correctAnswers, currentGamePoints, isEnd), 1500);
           // startActivity(new Intent(Exam_1Activity.this, ResultActivity.class));

            finish();
            fab.setClickable(false);
        }
        else{
            finish();

        }

    }
    public void checkAnswer(Button btn){

    answerSignal[correctAnswer-1].setBackgroundColor(Color.GREEN);

        if(answer==correctAnswer){
            sp.play(correctSound, 1, 1, 0, 0, 1);
            problemCorrectAnswers=1;
            problemPoints=1;
//  btn.setBackgroundColor((Color.GREEN));
        }
        else {
 //           btn.setBackgroundColor((Color.RED));
          answerSignal[answer-1].setBackgroundColor(Color.RED);
            sp.play(wrongSound, 1, 1, 0, 0, 1);
            problemCorrectAnswers=0;
            problemPoints=0;
        }
        MainActivity.playerAnswerList.add(answer);
        MainActivity.correctAnswersList.add(String.valueOf(problemCorrectAnswers));
        MainActivity.gamePointsList.add(String.valueOf(problemPoints));

//        new android.os.Handler().postDelayed(new Runnable() {
//
//            @Override
//            public void run() {
//                setNewTask(taskNum);
//
//
//            }
//        },600);
        problemCorrectAnswers=0;
        problemPoints=0;

    }
}
