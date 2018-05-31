package com.example.hwamok.mju_classroom_v10;
import android.app.*;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;


public class FloorActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner spinner,spinner2;
    ImageView img;
    TextView text;
    Button btn;
    ArrayAdapter<String> myadapter;
    Integer[] photos={0,R.drawable.floor3,R.drawable.map1,R.drawable.floor3,R.drawable.floor3,R.drawable.floor3,R.drawable.floor3,R.drawable.floor3,R.drawable.floor3,R.drawable.floor3,R.drawable.floor3};
    String[] names={"확인하고자 하는 층을 누르세요.","1층","2층","3층","4층","5층","6층","7층","8층","9층","10층"};
    private Activity activity;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor);
        setTitle("Floor View");
        activity=FloorActivity.this;
        myadapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,names);
        spinner=(Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(myadapter);
        spinner.setOnItemSelectedListener(this);
        img=(ImageView)findViewById(R.id.photo);

        img.setImageResource(photos[1]);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(i>0){
            showBigPhoto(i);
        }
    }

    private void showBigPhoto(int i) {
        setContentView(R.layout.activity_photo);

        spinner2=(Spinner) findViewById(R.id.spinner2);
        spinner2.setAdapter(myadapter);
        spinner2.setOnItemSelectedListener(this);
        img=(ImageView)findViewById(R.id.photo);

        img.setImageResource(photos[i]);
        btn=(Button)findViewById(R.id.btnBack);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), android.app.ListActivity.class);
                startActivity(intent);
            }
        });

    }


    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

