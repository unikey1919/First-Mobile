package com.example.firstmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button button = (Button) findViewById(R.id.button2);

        //Param
        Bundle extras = getIntent().getExtras();

        String data = extras.getString("Value1");


        button.setText(data);


        Toast.makeText(this,data,Toast.LENGTH_SHORT).show();




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //Test

    }

    @Override
    public void finish(){
        Intent data = new Intent();
        data.putExtra("returnKey1","Giá trị trả về thứ nhất");
        data.putExtra("returnKey2","Giá trị trả về thứ hai");
        setResult(RESULT_OK,data);
        super.finish();
    }


}