package com.example.hwamok.mju_classroom_v10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListActivity extends AppCompatActivity {
    Button reservation,c_reservation,c_location,c_rule;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        setTitle("My Page");

        this.reservation=findViewById(R.id.Reservation);
        this.c_reservation=findViewById(R.id.CheckReservation);
        this.c_location=findViewById(R.id.CheckLocation);
        this.c_rule=findViewById(R.id.CheckRule);


        this.c_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),FloorActivity.class);
                startActivity(intent);
            }
        });

        this.c_rule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RuleActivity.class);
                startActivity(intent);
            }
        });

        this.reservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ReservationActivity.class);
                startActivity(intent);
            }
        });

    }
}
