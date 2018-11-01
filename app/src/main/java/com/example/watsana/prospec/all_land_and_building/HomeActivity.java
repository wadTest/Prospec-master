package com.example.watsana.prospec.all_land_and_building;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.watsana.prospec.R;

public class HomeActivity extends AppCompatActivity {


    // Explicit
    private Button button, button1;
    private String loginNameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        loginNameString = getIntent().getStringExtra("LoginUser");

        //Bind Wiget
        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button1);

        //Get Event From Click land
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, LandsActivity.class));
            }
        });

        //Get Event From Click building
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, BuildingsActivity.class));
            }
        });

    } // Main Method
} //Main Class