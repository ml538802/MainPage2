package com.example.mohammadlaknahour.mainpage;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       final MediaPlayer butt1=MediaPlayer.create(this, R.raw.ButtonClick);

        Button playBtt1=(Button) this.findViewById(R.id.button);


        playBtt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                butt1.start();

            }
        });


    }
}
