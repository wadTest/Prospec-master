package com.example.watsana.prospec.all_land_and_building;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.watsana.prospec.R;

public class BuildingTab6Activity extends AppCompatActivity {

    private Button button1, button3, button6, button9, button10, button11, button12;
    private EditText EditText1, EditText2, EditText4, EditText5, EditText7, EditText8;
    ImageButton imageView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_tab6);

        button1 = (Button) findViewById(R.id.button1);
        button3 = (Button) findViewById(R.id.button3);
        button6 = (Button) findViewById(R.id.button6);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);

        EditText1 = (EditText) findViewById(R.id.EditText1);
        EditText2 = (EditText) findViewById(R.id.EditText2);
        EditText4 = (EditText) findViewById(R.id.EditText4);
        EditText5 = (EditText) findViewById(R.id.EditText5);
        EditText7 = (EditText) findViewById(R.id.EditText7);
        EditText8 = (EditText) findViewById(R.id.EditText8);

        imageView7 = (ImageButton) findViewById(R.id.imageView7);

        //Get Event From Click land
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuildingTab6Activity.this, BuildingsActivity.class));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuildingTab6Activity.this, BuildingsActivity.class));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditText1.getText().toString().equals("") || EditText2.getText().toString().equals("")) {
                    Toast.makeText(BuildingTab6Activity.this, "โปรดใส่รายละเอียด", Toast.LENGTH_SHORT).show();
                } else {
                    EditText1.getText().toString();
                    EditText2.getText().toString();
                    double a1 = Double.valueOf(EditText1.getText().toString());
                    double a2 = Double.valueOf(EditText2.getText().toString());
                    double a3;
                    a3 = a1 * a2;
                    button3.setText(String.valueOf(a3));
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditText4.getText().toString().equals("") || EditText5.getText().toString().equals("")) {
                    Toast.makeText(BuildingTab6Activity.this, "โปรดใส่รายละเอียด", Toast.LENGTH_SHORT).show();
                } else {
                    EditText4.getText().toString();
                    EditText5.getText().toString();
                    double a1 = Double.valueOf(EditText4.getText().toString());
                    double a2 = Double.valueOf(EditText5.getText().toString());
                    double a3;
                    a3 = a1 * a2;
                    button6.setText(String.valueOf(a3));
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditText7.getText().toString().equals("") || EditText8.getText().toString().equals("")) {
                    Toast.makeText(BuildingTab6Activity.this, "โปรดใส่รายละเอียด", Toast.LENGTH_SHORT).show();
                } else {
                    EditText7.getText().toString();
                    EditText8.getText().toString();
                    double a1 = Double.valueOf(EditText7.getText().toString());
                    double a2 = Double.valueOf(EditText8.getText().toString());
                    double a3;
                    a3 = a1 * a2;
                    button9.setText(String.valueOf(a3));
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button3.getText().toString().equals("") || button6.getText().toString().equals("") || button9.getText().toString().equals("")) {
                    Toast.makeText(BuildingTab6Activity.this, "โปรดใส่รายละเอียด", Toast.LENGTH_SHORT).show();
                } else {
                    button3.getText().toString();
                    button6.getText().toString();
                    button9.getText().toString();
                    double a1 = Double.valueOf(button3.getText().toString());
                    double a2 = Double.valueOf(button6.getText().toString());
                    double a3 = Double.valueOf(button9.getText().toString());
                    double a4;
                    a3 = a1 + a2 + a3;
                    button10.setText(String.valueOf(a3));
                }
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button10.getText().toString().equals("") ) {
                    Toast.makeText(BuildingTab6Activity.this, "โปรดใส่รายละเอียด", Toast.LENGTH_SHORT).show();
                } else {
                    button3.getText().toString();
                    button6.getText().toString();
                    button9.getText().toString();
                    double a1 = Double.valueOf(button3.getText().toString());
                    double a2 = Double.valueOf(button6.getText().toString());
                    double a3 = Double.valueOf(button9.getText().toString());
                    double a4;
                    a3 = (a1 + a2 + a3)/10;
                    button11.setText(String.valueOf(a3));
                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button10.getText().toString().equals("") || button11.getText().toString().equals("")) {
                    Toast.makeText(BuildingTab6Activity.this, "โปรดใส่รายละเอียด", Toast.LENGTH_SHORT).show();
                } else {
                    button10.getText().toString();
                    button11.getText().toString();
                    double a1 = Double.valueOf(button10.getText().toString());
                    double a2 = Double.valueOf(button11.getText().toString());
                    double a3;
                    a3 = a1 - a2;
                    button12.setText(String.valueOf(a3));
                }
            }
        });
    }
}


