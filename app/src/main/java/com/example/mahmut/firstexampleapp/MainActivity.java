package com.example.mahmut.firstexampleapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1=(Button)findViewById(R.id.button1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This is the toast message..",Toast.LENGTH_LONG).show();
            }
        });



        btn2=(Button)findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //We create ImageView.
                ImageView image=new ImageView(getApplicationContext());
                //We take picture from file.
                image.setImageResource(R.drawable.image);
                //Making toast message.
                Toast toast=new Toast(getApplicationContext());
                //Showing image.
                toast.setView(image);
                //And we decide toast time.
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();

            }
        });



        btn3=(Button)findViewById(R.id.button3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                TextView textview =new TextView(getApplicationContext());
                textview.setText("This is the special toast message..");
                textview.setBackgroundColor(Color.parseColor("#FFFA1909"));
                textview.setTextColor(Color.BLACK);

                Toast toast=new Toast(getApplicationContext());
                toast.setView(textview);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();

            }
        });
    }
}
