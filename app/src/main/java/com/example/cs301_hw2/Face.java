package com.example.cs301_hw2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

import java.util.Random;

public class Face extends SurfaceView {

    Paint skin_Color = new Paint();
    Paint hair_Color = new Paint();
    Paint eye_Color  = new Paint();
    int hair_style;

    Face_Model face = new Face_Model();

    public static final float facex = 200.0f;
    public static final float facey = 200.0f;
    public static final float facediemeter = 200.0f;


    public Face(Context context, AttributeSet attrs){

        super(context, attrs);

        setWillNotDraw(false);
    }

    public Face_Model getFace(){

        return face;
    }

    public void Randomize(){

        Random r = new Random();



    }

    public void drawEyes(Canvas canvas, float left, float bottom){

        if(face.eyes_c == true){
            int selectedColor_eye= Color.rgb(face.eye_red, face.eye_green,face.eye_blue);
            eye_Color.setColor(selectedColor_eye);
        }
        eye_Color.setStyle(Paint.Style.FILL);
        canvas.drawCircle(150,150,10,eye_Color);
        canvas.drawCircle(250,150,10,eye_Color);
    }

    public void drawHair(Canvas canvas, float left, float bottom){

        if(face.hair_c == true){
            int selectedColor_hair= Color.rgb(face.hair_red, face.hair_green,face.hair_blue);
            hair_Color.setColor(selectedColor_hair);
        }
        hair_Color.setStyle(Paint.Style.FILL);

        if(face.hair_style ==1) {// curly
            canvas.drawCircle(105, 140, 10, eye_Color);
            canvas.drawCircle(120, 150, 10, eye_Color);
            canvas.drawCircle(135, 165, 3, eye_Color);

            canvas.drawCircle(295, 140, 3, eye_Color);
            canvas.drawCircle(280, 150, 3, eye_Color);
            canvas.drawCircle(265, 165, 3, eye_Color);

        }
        if(face.hair_style ==2){

            canvas.drawLine(95,190,150,100, hair_Color);
            canvas.drawLine(150,100,250,100, hair_Color);
            canvas.drawLine(305,190,250,100, hair_Color);

        }

        if (face.hair_style == 3) {//bold

        }

    }

    public void drawMouth(Canvas canvas, float left, float bottom){


    }

    public void onDraw(Canvas canvas){

        if(face.skin_c == true){
            int selectedColor= Color.rgb(face.skin_red, face.skin_green,face.skin_blue);
           skin_Color.setColor(selectedColor);
            skin_Color.setStyle(Paint.Style.FILL);
        }

        canvas.drawCircle(200,200,200, skin_Color);
        drawEyes(canvas, 10, 10);
        drawHair(canvas, 5,5);
        drawMouth(canvas, 20,20);

    }


}
