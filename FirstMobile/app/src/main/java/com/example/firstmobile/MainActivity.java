package com.example.firstmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonSignup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               signupActivity();
            }
        });


    }
    public void signupActivity(){
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);

    }
}
