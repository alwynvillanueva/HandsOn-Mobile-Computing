package com.example.androidstudio.villanuevahandson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.androidstudio.villanuevahandson.R;
import com.example.androidstudio.villanuevahandson.nextView;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn;


        btn = (Button)findViewById(R.id.btn);

        if (btn!=null){
            btn.setOnClickListener(new View.OnClickListener(){
                @Override
                public  void onClick(View v){
                    final EditText emailAdd = (EditText) findViewById(R.id.editText);
                    final EditText passWord = (EditText) findViewById(R.id.editText2);
                    String email = emailAdd.getText().toString();
                    String pass = passWord.getText().toString();
                    if(email.equals("admin")&& pass.equals("test"))  {
                            Intent intent = new Intent(MainActivity.this, nextView.class);
                            startActivity(intent);
                            Toast.makeText(getBaseContext(), "Login successful!", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(getBaseContext(), "Login failed!", Toast.LENGTH_SHORT).show();
                    }


                }
            });
        }

    }
}

