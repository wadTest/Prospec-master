package com.example.watsana.prospec.bank_ghb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.watsana.prospec.R;

public class BankGHBActivity extends AppCompatActivity {

//  Explicit
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9,
    button10, button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_ghb);

//          Bind Widget
            button1 = (Button) findViewById(R.id.button1);
            button2 = (Button) findViewById(R.id.button2);
            button3 = (Button) findViewById(R.id.button3);
            button4 = (Button) findViewById(R.id.button4);
            button5 = (Button) findViewById(R.id.button5);
            button6 = (Button) findViewById(R.id.button6);
            button7 = (Button) findViewById(R.id.button7);
            button8 = (Button) findViewById(R.id.button8);
            button9 = (Button) findViewById(R.id.button9);
            button10 = (Button) findViewById(R.id.button10);
            button11 = (Button) findViewById(R.id.button11);

//      Get Event From Click Bank Tab1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BankGHBActivity.this, BankGHB1Fragment.class);
                intent.putExtra("Index",0);
                startActivity(intent);

            }
        });

//      Get Event From Click Bank Tab2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BankGHBActivity.this, BankGHB1Fragment.class);
                intent.putExtra("Index",1);
                startActivity(intent);
            }
        });

//      Get Event From Click Bank Tab3
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BankGHBActivity.this, BankGHB03Activity.class);
                intent.putExtra("Index",2);
                startActivity(intent);
            }
        });

//      Get Event From Click Bank Tab4
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BankGHBActivity.this, BankGHB04Activity.class);
                intent.putExtra("Index",3);
                startActivity(intent);
            }
        });

//      Get Event From Click Bank Tab5
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BankGHBActivity.this, BankGHB05Activity.class);
                intent.putExtra("Index",4);
                startActivity(intent);
            }
        });

//      Get Event From Click Bank Tab6
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BankGHBActivity.this, BankGHB06Activity.class);
                intent.putExtra("Index",5);
                startActivity(intent);
            }
        });

//      Get Event From Click Bank Tab7
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BankGHBActivity.this, BankGHB07Activity.class);
                intent.putExtra("Index",6);
                startActivity(intent);
            }
        });

//      Get Event From Click Bank Tab8
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BankGHBActivity.this, BankGHB08Activity.class);
                intent.putExtra("Index",7);
                startActivity(intent);
            }
        });

//      Get Event From Click Bank Tab9
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BankGHBActivity.this, BankGHB09Activity.class);
                intent.putExtra("Index",8);
                startActivity(intent);
            }
        });

        //Get Event From Click Bank Tab10
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BankGHBActivity.this, BankGHB09Activity.class);
                intent.putExtra("Index",9);
                startActivity(intent);
            }
        });

//      Get Event From Click Bank Tab11
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BankGHBActivity.this, BankGHB09Activity.class);
                intent.putExtra("Index",10);
                startActivity(intent);
            }
        });


    } // Main Method
} //Main Class