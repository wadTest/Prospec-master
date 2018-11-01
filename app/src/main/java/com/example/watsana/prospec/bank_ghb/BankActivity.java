package com.example.watsana.prospec.bank_ghb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.watsana.prospec.all_land_and_building.HomeActivity;
import com.example.watsana.prospec.R;

public class BankActivity extends AppCompatActivity {
    ImageView imageView, imageView1;
    private String myNameLoginString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);

        myNameLoginString = "Prospec";

        imageView =  findViewById(R.id.imageView);
        imageView1 =  findViewById(R.id.imageView1);

        //Get Event From Click Menu Land and Building
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BankActivity.this, HomeActivity.class);
                intent.putExtra("Main", myNameLoginString);
                startActivity(intent);
            }
        });

        //Get Event From Click Login
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BankActivity.this, LoginActivity.class);
                intent.putExtra("Login", myNameLoginString);
                startActivity(intent);
            }
        });
    }
}
