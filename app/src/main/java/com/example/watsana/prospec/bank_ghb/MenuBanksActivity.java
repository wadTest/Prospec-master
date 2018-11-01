package com.example.watsana.prospec.bank_ghb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.watsana.prospec.R;
import com.example.watsana.prospec.all_land_and_building.BuildingsActivity;
import com.example.watsana.prospec.all_land_and_building.LandsActivity;

public class MenuBanksActivity extends AppCompatActivity {


    // Explicit
    private Button button, button1;
    private String loginNameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_banks);

        loginNameString = getIntent().getStringExtra("MenuBank");

        //Bind Widget
        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button1);

        //Get Event From Click Report
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuBanksActivity.this, BankGHBActivity.class);
                intent.putExtra("Index",0);
                startActivity(intent);
            }
        });

//      Get Event From Click Camera
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuBanksActivity.this, BuildingsActivity.class));
            }
        });

    } // Main Method
} //Main Class