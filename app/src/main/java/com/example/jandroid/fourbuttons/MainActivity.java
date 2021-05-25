package com.example.jandroid.fourbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_linear;
    private Button button_relative;
    private Button button_constraint;
    private Button button_frame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_linear= (Button) findViewById(R.id.button_linear);
        button_linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityLinear();

            }

        });
        button_constraint=(Button) findViewById((R.id.button_constraint));
        button_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityConstraint();
            }
        });
        button_relative=(Button) findViewById((R.id.button_relative));
        button_relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityRelative();
            }
        });
        button_frame=(Button) findViewById((R.id.button_frame));
        button_frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityFrame();
            }
        });


    }

    public void openActivityLinear(){
        Intent intentLinear=new Intent(this,ActivityLinear.class);
        startActivity(intentLinear);
    }

    public void openActivityConstraint(){
        Intent intentConstraint=new Intent(this,ActivityConstraint.class);
        startActivity(intentConstraint);
    }
    public void openActivityRelative(){
        Intent intentRelative=new Intent(this,ActivityRelative.class);
        startActivity(intentRelative);
    }
    public void openActivityFrame(){
        Intent intentFrame=new Intent(this,ActivityFrame.class);
        startActivity(intentFrame);
    }
}

