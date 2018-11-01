package com.example.watsana.prospec.bank_ghb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.watsana.prospec.R;

public class LoginActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//      Bind Widget
        button = (Button) findViewById(R.id.button);

//      Get Event From Click Menu Bank
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, MenuBanksActivity.class));
            }
        });


    } // Main Method
} //Main Class