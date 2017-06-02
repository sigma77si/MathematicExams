package com.dev.sigma77.mathematicexams;

import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static List<String> correctAnswersList = new ArrayList<>();
    public static List<String> gamePointsList = new ArrayList<>();
    public static List<Integer>playerAnswerList=new ArrayList<>();
    Button btn1,btn2;
    public  static  int examNum;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//
////                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
////                        .setAction("Action", null).show();
//            }
//        });
        img= (ImageView) findViewById(R.id.imageView);
        btn1= (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(this);
       img.setOnClickListener(this);


        fab.setOnClickListener(this);


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fab:{

                finish();
                     break;
            }
            case R.id.button1:
            case R.id.imageView:{
                startActivity(new Intent(this, Competitions_name.class));
                    break;
            }
//            case R.id.button1:{
//                startActivity(new Intent(this, ResultActivity.class));
//                break;
//            }



        }


    }
}
