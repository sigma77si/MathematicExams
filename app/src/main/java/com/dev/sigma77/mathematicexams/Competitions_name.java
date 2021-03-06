package com.dev.sigma77.mathematicexams;

import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Competitions_name extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    public  static  int points;
    public  static  int examNum;
     AlertDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competitions_name);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   showAlertDialog();
                finish();
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });


        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button1);
        btn3 = (Button) findViewById(R.id.button2);
        btn4 = (Button) findViewById(R.id.button3);
        btn5 = (Button) findViewById(R.id.button4);
        btn6 = (Button) findViewById(R.id.button5);
        btn7 = (Button) findViewById(R.id.button6);
        btn8 = (Button) findViewById(R.id.button7);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_competitions_name, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            startActivity(new Intent(this, AboutActivity.class));
            return true;
        }
        else if(id == R.id.action_help) {
            startActivity(new Intent(this, HelpActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
//    public void showAlertDialog(){
//
//        final AlertDialog.Builder alertDialog=new AlertDialog.Builder(Competitions_name.this);
//        View myview = getLayoutInflater().inflate(R.layout.exit_dialog,null);
//        Button no = (Button) myview.findViewById(R.id.btn_no);
//        Button yes = (Button) myview.findViewById(R.id.btn_yes);
//        no.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
////                    final Toast toast = Toast.makeText(Competitions_name.this, "Yes", Toast.LENGTH_SHORT);
////                    toast.show();
//                dialog.dismiss();
//            }
//
//
//        });
//        yes.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                finish();
//                final Toast toast = Toast.makeText(Competitions_name.this, "Изход от \"Математически състезания \"", Toast.LENGTH_SHORT);
//                toast.show();}
//
//
//        });
//        alertDialog.setView(myview);
//        alertDialog.setTitle(R.string.exit);
//           dialog= alertDialog.create();
//           dialog.show();
//
//
//    }

    @Override
    public void onBackPressed() {
//       // super.onBackPressed();
//        showAlertDialog();
finish();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {


//
            case R.id.button: {

                examNum=1;

                break;
            }
            case R.id.button1: {

                examNum=2;

                break;
            }
            case R.id.button2: {
               examNum=3;

                break;
            }
            case R.id.button3: {

               examNum=4;

                break;
            }
            case R.id.button4: {

                examNum=5;

                break;
            }
            case R.id.button5: {

          examNum=6;

                break;
            }
            case R.id.button6: {

                examNum=7;

                break;
            }
            case R.id.button7: {

                examNum=8;

                break;
            }


        }
        points=0;
       Exam_1Activity.taskNum=0;
        MainActivity.correctAnswersList.clear();
        MainActivity.gamePointsList.clear();
        MainActivity.playerAnswerList.clear();
        Intent in = new Intent(this, Exam_1Activity.class);
        startActivity(in);

    }
}