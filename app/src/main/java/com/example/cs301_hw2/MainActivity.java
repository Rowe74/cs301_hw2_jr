package com.example.cs301_hw2;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        Face face_id = (Face) findViewById(R.id.face_view);
        Face_Controller face_con =  new Face_Controller(face_id);

        SeekBar red = (SeekBar) findViewById(R.id.seekBar_red);
        SeekBar green = (SeekBar) findViewById(R.id.seekBar_green);
        SeekBar blue = (SeekBar) findViewById(R.id.seekBar_blue);

        red.setOnSeekBarChangeListener(face_con);
        blue.setOnSeekBarChangeListener(face_con);
        green.setOnSeekBarChangeListener(face_con);

        RadioGroup h_e_s = (RadioGroup) findViewById(R.id.hair_eye_skin);
        h_e_s.setOnCheckedChangeListener(face_con);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(face_con);

        List<String> categories =new ArrayList<String>();
        categories.add("curly");
        categories.add("straight");
        categories.add("bold");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);







    }
}
