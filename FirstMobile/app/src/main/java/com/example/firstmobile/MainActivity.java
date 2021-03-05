package com.example.firstmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


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
               parameterActivity();
            }
        });


    }
    public void signupActivity(){
        Intent intent = new Intent(MainActivity.this, SignupActivity.class);
        startActivity(intent);

    }

    public void linkActivity(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Y6Yw3wlQIQw&t=1957s"));
        startActivity(intent);
    }

    public void parameterActivity(){
        //Truyen du lieu (Test)
        Intent i = new Intent(this, SignupActivity.class);
        i.putExtra("Value1","this value one for Signup Activity");
        i.putExtra("Value2","this value two for Signup Activity");
        int REQUEST_CODE = 10;
        startActivityForResult(i,REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == 10) {
            if (data.hasExtra("returnKey1")) ;
            Toast.makeText(this, data.getExtras().getString("returnKey1"), Toast.LENGTH_SHORT).show();
        }
    }
}
