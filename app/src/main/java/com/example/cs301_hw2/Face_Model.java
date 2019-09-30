package com.example.cs301_hw2;

import java.util.Random;

public class Face_Model {

    public int hair_red;
    public int hair_green;
    public int hair_blue;
    public int eye_red;
    public int eye_green;
    public int eye_blue;
    public int skin_red;
    public int skin_green;
    public int skin_blue;

    public int hair_style;

    public boolean hair_c;
    public boolean skin_c;
    public boolean eyes_c;



    public Face_Model() {



        skin_c= true;
        hair_c=false;
        eyes_c=false;

        Random r = new Random();

        hair_red = r.nextInt(255);
        hair_green= r.nextInt(255);
        hair_blue= r.nextInt(255);
        eye_red= r.nextInt(255);
        eye_green= r.nextInt(255);
        eye_blue= r.nextInt(255);
        skin_red= r.nextInt(255);
        skin_green= r.nextInt(255);
        skin_blue= r.nextInt(255);

        hair_style= r.nextInt(3);

    }
}
