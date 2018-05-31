package com.example.hwamok.mju_classroom_v10;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText id,password;
    Button login,register,exit,clear;
    CheckBox remember_check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.id= findViewById(R.id.Username);
        this.password=findViewById(R.id.Password);
        this.login =findViewById(R.id.Login);
        this.register=findViewById(R.id.Register);

        this.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                startActivity(intent);
            }
        });

    }


}
