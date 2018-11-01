package com.example.watsana.prospec.all_land_and_building;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.watsana.prospec.R;

public class BuildingTab5Activity extends AppCompatActivity {

    Button button1;
    ImageButton imageView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_tab5);

        button1 = (Button) findViewById(R.id.button1);

        imageView7 = (ImageButton) findViewById(R.id.imageView7);

        //Get Event From Click land
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuildingTab5Activity.this, BuildingsActivity.class));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuildingTab5Activity.this, BuildingsActivity.class));
            }
        });
    }
}