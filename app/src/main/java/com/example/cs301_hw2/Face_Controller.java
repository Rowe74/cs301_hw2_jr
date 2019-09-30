package com.example.cs301_hw2;

import android.graphics.Paint;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

public class Face_Controller  implements  SeekBar.OnSeekBarChangeListener,  AdapterView.OnItemSelectedListener, RadioGroup.OnCheckedChangeListener {


    private Face face_v;
    private Face_Model face_m;
    private  String[] list = {"curly", "straight", "bold"};

    public Face_Controller(Face fv){

        face_v= fv;
        face_m= fv.getFace();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //Toast.makeText(,list[position],Toast.LENGTH_LONG).show();

        if(list[position] == "curly"){

            face_m.hair_style=1;
        }
        else if(list[position] == "straight"){

            face_m.hair_style=2;
        }

        else if(list[position] == "bold"){

            face_m.hair_style=3;
        }
        face_v.invalidate();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        if (checkedId == R.id.radioButton_eyes){

            face_m.eyes_c = true;
            face_m.hair_c = false;
            face_m.skin_c = false;
        }

        if( checkedId == R.id.radioButton_hair){

            face_m.eyes_c = false;
            face_m.hair_c = true;
            face_m.skin_c = false;
        }

        if(checkedId == R.id.radioButton_skin){

            face_m.eyes_c = false;
            face_m.hair_c = false;
            face_m.skin_c = true;
        }

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        if(seekBar.getId() == R.id.seekBar_red){
            if(face_m.eyes_c == true){
                face_m.eye_red= progress;
            }
            else if(face_m.hair_c == true){
                face_m.hair_red=progress;
            }
            else if(face_m.skin_c == true){
                face_m.skin_red=progress;
            }
            face_v.invalidate();
        }

        else if(seekBar.getId() == R.id.seekBar_green){

            if(face_m.eyes_c == true){
                face_m.eye_green= progress;
            }
            else if(face_m.hair_c == true){
                face_m.hair_green=progress;
            }
            else if(face_m.skin_c == true){
                face_m.skin_green=progress;
            }


            face_v.invalidate();

        }

        else if(seekBar.getId() == R.id.seekBar_blue){

            if(face_m.eyes_c == true){
                face_m.eye_blue= progress;
            }
            else if(face_m.hair_c == true){
                face_m.hair_blue=progress;
            }
            else if(face_m.skin_c == true){
                face_m.skin_blue=progress;
            }


            face_v.invalidate();

        }

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }




}
