package com.example.dan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    int active = 1;

    TextView c;

    int k=0;
    int k1=0;
    int i;
    ImageView d;
    ImageView d1;
    ImageView d2;
    ImageView d3;
    ImageView d4;
    ImageView d5;
    ImageView d6;
    ImageView d7;
    ImageView d8;
    ImageView d9;
    ImageView e,e1,e2,e3,e4,e5,e6,e7,e8,e9;




    public void roll(View view) {

       if (active == 1) {


           Random rand = new Random();

           int n = rand.nextInt(4) + 1;


           c = (TextView) findViewById(R.id.textView);
           c.setText(n + "");
           int sum = Integer.parseInt(c.getText().toString());

           k = k + n;
              if(k>10) {
              k = k - n;
                  }


               System.out.println(k);


               if (k == 1) {
                    d = findViewById(R.id.imageView19);
                   d.setImageResource(R.drawable.blue1);

               }

               if (k == 2) {
                    d1 = (ImageView) findViewById(R.id.imageView17);
                   d1.setImageResource(R.drawable.blue1);

               }

               if (k == 3) {
                    d2 = (ImageView) findViewById(R.id.imageView15);
                   d2.setImageResource(R.drawable.blue1);
               }
               if (k == 4) {
                  d3 = (ImageView) findViewById(R.id.imageView13);
                   d3.setImageResource(R.drawable.blue1);
               }
               if (k == 5) {
                  d4 = (ImageView) findViewById(R.id.imageView11);
                   d4.setImageResource(R.drawable.blue1);
               }
               if (k == 6) {
                   d5 = (ImageView) findViewById(R.id.imageView9);
                   d5.setImageResource(R.drawable.blue1);
               }
           if (k == 7) {
               d6 = findViewById(R.id.imageView7);
               d6.setImageResource(R.drawable.blue1);

           }

           if (k == 8) {
                d7 = (ImageView) findViewById(R.id.imageView5);
               d7.setImageResource(R.drawable.blue1);

           }

           if (k == 9) {
               d8 = (ImageView) findViewById(R.id.imageView3);
               d8.setImageResource(R.drawable.blue1);
           }
           if (k == 10) {
                d9 = (ImageView) findViewById(R.id.imageView);
               d9.setImageResource(R.drawable.blue1);
           }



           active = 0;
               if(k==10)
               {
                   c.setText("PLAYER1 WON!");
                   active =2;

               }
           }
        else if(active==0){
           Random rand = new Random();

           int n = rand.nextInt(4) + 1;


           c = (TextView) findViewById(R.id.textView);
           c.setText(n + "");
           int sum = Integer.parseInt(c.getText().toString());

           k1 = k1 + n;

           if(k1>10)
           {
               k1=k1-n;
           }
           System.out.println(k1);



               if (k1 == 1) {
                    e = findViewById(R.id.imageView20);
                   e.setImageResource(R.drawable.red1);

               }

               if (k1 == 2) {
                    e1 = (ImageView) findViewById(R.id.imageView18);
                   e1.setImageResource(R.drawable.red1);


               }

               if (k1 == 3) {
                  e2 = (ImageView) findViewById(R.id.imageView16);
                   e2.setImageResource(R.drawable.red1);

               }
               if (k1 == 4) {
                    e3 = (ImageView) findViewById(R.id.imageView14);
                   e3.setImageResource(R.drawable.red1);


               }
               if (k1 == 5) {
                    e4 = (ImageView) findViewById(R.id.imageView12);
                   e4.setImageResource(R.drawable.red1);

               }
               if (k1 == 6) {
                    e5 = (ImageView) findViewById(R.id.imageView10);
                   e5.setImageResource(R.drawable.red1);


               }

           if (k1 == 7) {
               e6 = findViewById(R.id.imageView8);
               e6.setImageResource(R.drawable.red1);



           }

           if (k1 == 8) {
               e7 = (ImageView) findViewById(R.id.imageView6);
               e7.setImageResource(R.drawable.red1);


           }

           if (k1 == 9) {
                e8 = (ImageView) findViewById(R.id.imageView4);
               e8.setImageResource(R.drawable.red1);

           }
           if (k1 == 10) {
              e9 = (ImageView) findViewById(R.id.imageView2);
               e9.setImageResource(R.drawable.red1);



           }

               active = 1;
               if(k1==10)
               {

                   c.setText("PLAYER2 WON!");
                   active =2;

               }
           }

       }


       public void play(View iew)
       {
           active=1;
           k=0;
           k1=0;
           c.setText(" ");



           androidx.gridlayout.widget.GridLayout grid = findViewById(R.id.gridLayout);

           for(int i=0;i<grid.getChildCount();i++)
           {
               ((ImageView) grid.getChildAt(i)).setImageResource(0);
           }





       }









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


}


