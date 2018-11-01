package com.example.watsana.prospec.all_land_and_building;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.watsana.prospec.FormLandActivity;
import com.example.watsana.prospec.R;

public class LandsActivity extends AppCompatActivity {

    // Explicit
    private Button button1, button6, button7, button8, button9, button10, button11, button12, button13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lands);


            //Bind Wiget
            button1 = (Button) findViewById(R.id.button1);
            button6 = (Button) findViewById(R.id.button6);
            button7 = (Button) findViewById(R.id.button7);
            button8 = (Button) findViewById(R.id.button8);
            button9 = (Button) findViewById(R.id.button9);
            button10 = (Button) findViewById(R.id.button10);
            button11 = (Button) findViewById(R.id.button11);
            button12 = (Button) findViewById(R.id.button12);
            button13 = (Button) findViewById(R.id.button13);

            //Get Event From Click land
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   Intent intent = new Intent(LandsActivity.this, FormLandActivity.class);
                   intent.putExtra("Index",0);
                   startActivity(intent);

                }
            });

            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   // startActivity(new Intent(LandsActivity.this, LandTab2Activity.class));
                    Intent intent = new Intent(LandsActivity.this, LandTab2Activity.class);
                    intent.putExtra("Index",1);
                    startActivity(intent);
                }
            });

            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //startActivity(new Intent(LandsActivity.this, LandTab3Activity.class));
                    Intent intent = new Intent(LandsActivity.this, LandTab3Activity.class);
                    intent.putExtra("Index",2);
                    startActivity(intent);
                }
            });

            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //startActivity(new Intent(LandsActivity.this, LandTab4Activity.class));
                    Intent intent = new Intent(LandsActivity.this, LandTab4Activity.class);
                    intent.putExtra("Index",3);
                    startActivity(intent);
                }
            });

            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //startActivity(new Intent(LandsActivity.this, LandTab5Activity.class));
                    Intent intent = new Intent(LandsActivity.this, LandTab5Activity.class);
                    intent.putExtra("Index",4);
                    startActivity(intent);
                }
            });

            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //startActivity(new Intent(LandsActivity.this, LandTab6Activity.class));
                    Intent intent = new Intent(LandsActivity.this, LandTab6Activity.class);
                    intent.putExtra("Index",5);
                    startActivity(intent);
                }
            });

            button11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   // startActivity(new Intent(LandsActivity.this, LandTab7Activity.class));
                    Intent intent = new Intent(LandsActivity.this, LandTab7Activity.class);
                    intent.putExtra("Index",6);
                    startActivity(intent);
                }
            });

            button12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   // startActivity(new Intent(LandsActivity.this, LandTab8Activity.class));
                    Intent intent = new Intent(LandsActivity.this, LandTab8Activity.class);
                    intent.putExtra("Index",7);
                    startActivity(intent);
                }
            });

            button13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   // startActivity(new Intent(LandsActivity.this, LandTab9Activity.class));
                    Intent intent = new Intent(LandsActivity.this, LandTab9Activity.class);
                    intent.putExtra("Index",8);
                    startActivity(intent);
                }
            });
        } // Main Method
    } //Main Class