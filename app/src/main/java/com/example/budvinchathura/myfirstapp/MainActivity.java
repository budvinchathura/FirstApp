package com.example.budvinchathura.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submitButton  = findViewById(R.id.button);
        final TextView myText = findViewById(R.id.textView);
        SeekBar sBar = findViewById(R.id.seekBar);

        submitButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                myText.setText("new1");
            }

        });


    }

    public void onButtonTap(View v,TextView mt){
//        Toast myToast = Toast.makeText(getApplicationContext(), "Ouch!",Toast.LENGTH_LONG);
//        myToast.show();
        mt.setText("sdsd");
    }



    public void onClick(View v){

    }
}
