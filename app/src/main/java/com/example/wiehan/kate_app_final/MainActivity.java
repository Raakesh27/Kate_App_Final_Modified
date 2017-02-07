package com.example.wiehan.kate_app_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonScen1 = (Button) findViewById(R.id.buttonScen1) ;
        Button buttonScen2 = (Button) findViewById(R.id.buttonScen2);
        Button buttonScen3 = (Button) findViewById(R.id.buttonScen3) ;
        Button buttonScen4 = (Button) findViewById(R.id.buttonScen4);

        buttonScen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity_Two_ScenOne.class);
                startActivity(intent);
            }
        });

        buttonScen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity_Two_ScenTwo.class);
                startActivity(intent);
            }
        });

        buttonScen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity_Two_ScenThree.class);
                startActivity(intent);
            }
        });

        buttonScen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity_Two_ScenFour.class);
                startActivity(intent);
            }
        });


    }

}

