package com.dev.sigma77.mathematicexams;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Exam2Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener  {
     FloatingActionButton fab;
       public static ImageView img;
    public  static TextView problemTextMain,text1,text2,text3;
Spinner mySpinner1,mySpinner2,mySpinner3;
    Button btn1, btn2,btn3;
    int color1, color2, color3;
    boolean isPressed;
    public static String textToLoad1,textToLoad2,textToLoad3;
   public static int currentCorrectAnswer1, currentCorrectAnswer2, currentCorrectAnswer3, imgPic,problemText,currentTask
           ,probpemCorrectAnswers,problemPoints;
  // public static String problemText;
    public int arrayToload;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
         fab = (FloatingActionButton) findViewById(R.id.fab);
        if(ResultActivity.isFromResultActivity){
            fab.setImageDrawable(ContextCompat.getDrawable(Exam2Activity.this, R.drawable.next_icon));
        }
        else {
        fab.setImageDrawable(ContextCompat.getDrawable(Exam2Activity.this, R.drawable.check_icon));
        }
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ResultActivity.isFromResultActivity){
                    Exam_1Activity.exam2ActivityOn=false;
                    finish();
                }
                else {
                    if (isPressed) {
                        if (Exam_1Activity.taskNum >= 14) {
                            Intent in = new Intent(Exam2Activity.this, ResultActivity.class);

                           // in.putStringArrayListExtra("GamesCorrectAnswers",(ArrayList<String>)MainActivity.correctAnswersList);
                            in.putStringArrayListExtra("GamesPoints", (ArrayList<String>) MainActivity.gamePointsList);
                            // in.putExtra("AllPoints",result);
                            startActivity(in);
                            Exam_1Activity.exam2ActivityOn=false;
                            finish();
                            fab.setClickable(false);
                        } else {
                            Exam_1Activity.exam2ActivityOn=false;
                            finish();
                        }
                    } else {
                        isPressed = true;
                        checkAnswer();
                        fab.setImageDrawable(ContextCompat.getDrawable(Exam2Activity.this, R.drawable.next_icon));
                    }
                }
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });
        img= (ImageView) findViewById(R.id.imagePic2);
        img.setBackgroundResource(imgPic);
        problemTextMain = (TextView) findViewById(R.id.problemText2);
        problemTextMain.setText(problemText);
        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        text3 = (TextView) findViewById(R.id.text3);
        btn1= (Button) findViewById(R.id.button1);
        btn2= (Button) findViewById(R.id.button2);
        btn3= (Button) findViewById(R.id.button3);
        if(currentTask==6||currentTask==14){
            arrayToload=R.array.spinner_item;

        }
        else if(currentTask==8)
        {arrayToload=R.array.spinner_item1;
        }
        text1.setText(textToLoad1);
        text2.setText(textToLoad2);
        text3.setText(textToLoad3);


        mySpinner1 =(Spinner)findViewById(R.id.spinner1);
        mySpinner1.setOnItemSelectedListener(this);
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, arrayToload, android.R.layout.select_dialog_item);
        mySpinner1.setAdapter(adapter1);

//        mySpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                  if(position==currentCorrectAnswer1){
//                      color1=Color.GREEN;
//                }
//                else {
//                color1=Color.RED;
//                  }
//            }
//
//            @Override
//            public  void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
        mySpinner2 =(Spinner)findViewById(R.id.spinner2);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this,arrayToload, android.R.layout.select_dialog_item);
        mySpinner2.setAdapter(adapter2);
        mySpinner2.setOnItemSelectedListener(this);
//        mySpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                if(position==currentCorrectAnswer2){
//                    color2=Color.GREEN;
//                }
//                else {
//
//                    color2 = Color.RED;
//                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        }
//        );
        mySpinner3 =(Spinner)findViewById(R.id.spinner3);
        ArrayAdapter adapter3 = ArrayAdapter.createFromResource(this,arrayToload, android.R.layout.select_dialog_item);
        mySpinner3.setAdapter(adapter3);
        mySpinner3.setOnItemSelectedListener(this);
//        mySpinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//                if(position==currentCorrectAnswer3){
//                    color3=Color.GREEN;
// Toast.makeText(getApplicationContext(), "Вярно if statemant", Toast.LENGTH_LONG).show();
//                }
//                else {
//                    color3 = Color.RED;
//                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
      if(ResultActivity.isFromResultActivity) {
         mySpinner1.setSelection(currentCorrectAnswer1);
         mySpinner2.setSelection(currentCorrectAnswer2);
         mySpinner3.setSelection(currentCorrectAnswer3);
          mySpinner1.setClickable(false);
          mySpinner1.setEnabled(false);
          mySpinner2.setEnabled(false);
          mySpinner3.setEnabled(false);


          mySpinner2.setClickable(false);
          mySpinner3.setClickable(false);
          btn1.setBackgroundColor(Color.GREEN);
          btn2.setBackgroundColor(Color.GREEN);
          btn3.setBackgroundColor(Color.GREEN);
}
   //      for test only
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

    private void checkAnswer() {
        btn1.setBackgroundColor(color1);
        btn2.setBackgroundColor(color2);
        btn3.setBackgroundColor(color3);
        mySpinner1.setClickable(false);
        mySpinner2.setClickable(false);
        mySpinner3.setClickable(false);
        mySpinner1.setEnabled(false);
        mySpinner2.setEnabled(false);
        mySpinner3.setEnabled(false);
        if(probpemCorrectAnswers==3){
            problemPoints=1;

        }
        MainActivity.correctAnswersList.add(String.valueOf(probpemCorrectAnswers));
        MainActivity.gamePointsList.add(String.valueOf(problemPoints));
        MainActivity.playerAnswerList.add(5);
        problemPoints=0;
        probpemCorrectAnswers=0;
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        int spinnerNum = parent.getId();
        switch (spinnerNum){
        case R.id.spinner1:{
          if(position== currentCorrectAnswer1) {
                      color1 =Color.GREEN;
              probpemCorrectAnswers+=1;
                }
                else {
                color1 =Color.RED;
                  }
            }
        break;
            case R.id.spinner2:{
                if(position== currentCorrectAnswer2) {
                    color2 =Color.GREEN;
                    probpemCorrectAnswers+=1;
                }
                else {
                    color2=Color.RED;
                }

            }break;
            case R.id.spinner3:{
                if(position== currentCorrectAnswer3) {
                    color3 =Color.GREEN;
                    probpemCorrectAnswers+=1;
                }
                else {
                    color3 =Color.RED;
                }

            }break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
