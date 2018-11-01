package com.example.watsana.prospec.all_land_and_building;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.watsana.prospec.R;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LandTab6Activity extends AppCompatActivity {

    Button button1, button2, button3;
    TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11,
            textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22;
    EditText EditText1, EditText2, EditText3, EditText4, EditText5, EditText6, EditText7, EditText8, EditText9, EditText10, EditText11, EditText12, EditText13, EditText14;
    Spinner spinner1, spinner2;
    ImageButton imageView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land_tab6);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView9 = (TextView) findViewById(R.id.textView9);
        textView10 = (TextView) findViewById(R.id.textView10);
        textView11 = (TextView) findViewById(R.id.textView11);
        textView12 = (TextView) findViewById(R.id.textView12);
        textView13 = (TextView) findViewById(R.id.textView13);
        textView14 = (TextView) findViewById(R.id.textView14);
        textView15 = (TextView) findViewById(R.id.textView15);
        textView16 = (TextView) findViewById(R.id.textView16);
        textView17 = (TextView) findViewById(R.id.textView17);
        textView18 = (TextView) findViewById(R.id.textView18);
        textView19 = (TextView) findViewById(R.id.textView19);
        textView20 = (TextView) findViewById(R.id.textView20);
        textView21 = (TextView) findViewById(R.id.textView21);
        textView22 = (TextView) findViewById(R.id.textView22);

        EditText1 = (EditText) findViewById(R.id.EditText1);
        EditText2 = (EditText) findViewById(R.id.EditText2);
        EditText3 = (EditText) findViewById(R.id.EditText3);
        EditText4 = (EditText) findViewById(R.id.EditText4);
        EditText5 = (EditText) findViewById(R.id.EditText5);
        EditText6 = (EditText) findViewById(R.id.EditText6);
        EditText7 = (EditText) findViewById(R.id.EditText7);
        EditText8 = (EditText) findViewById(R.id.EditText8);
        EditText9 = (EditText) findViewById(R.id.EditText9);
        EditText10 = (EditText) findViewById(R.id.EditText10);
        EditText11 = (EditText) findViewById(R.id.EditText11);
        EditText12 = (EditText) findViewById(R.id.EditText12);
        EditText13 = (EditText) findViewById(R.id.EditText13);
        EditText14 = (EditText) findViewById(R.id.EditText14);

        imageView7 = (ImageButton) findViewById(R.id.imageView7);

        //Get Event From Click land
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LandTab6Activity.this, LandsActivity.class));
            }
        });

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);

        //Get Event From Click land
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LandTab6Activity.this, LandTab5Activity.class));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LandTab6Activity.this, LandTab7Activity.class));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String filename13 = EditText1.getText().toString().trim();
                String filename14 = EditText2.getText().toString().trim();
                String filename15 = EditText3.getText().toString().trim();
                String filename16 = EditText4.getText().toString().trim();
                String filename17 = EditText5.getText().toString().trim();
                String filename18 = EditText6.getText().toString().trim();
                String filename19 = EditText7.getText().toString().trim();
                String filename20 = EditText8.getText().toString().trim();
                String filename21 = EditText9.getText().toString().trim();
                String filename22 = EditText10.getText().toString().trim();
                String filename23 = EditText11.getText().toString().trim();
                String filename24 = EditText12.getText().toString().trim();
                String filename25 = EditText13.getText().toString().trim();
                String filename26 = EditText14.getText().toString().trim();

                if (!filename13.equals("") && !filename14.equals("") && !filename15.equals("") && !filename16.equals("")
                        && !filename17.equals("") && !filename18.equals("") && !filename19.equals("") && !filename20.equals("")
                        && !filename21.equals("") && !filename22.equals("") && !filename23.equals("") && !filename24.equals("")
                        && !filename25.equals("") && !filename26.equals("")){

                    saveTextAsFile(filename13, filename14, filename15, filename16 , filename17, filename18,
                            filename19, filename20, filename21, filename22 , filename23, filename24,
                            filename25, filename26);
                }
            }
        });
    }
    private void saveTextAsFile(String filename13, String filename14, String filename15, String filename16, String filename17,
                                String filename18, String filename19, String filename20, String filename21, String filename22,
                                String filename23, String filename24, String filename25, String filename26){
        String fileName = filename13 + ".xls";

        //create file
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), fileName);

        //vrite to file

        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(filename13.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename14.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename15.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename16.getBytes());
            fos.write(filename17.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename18.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename19.getBytes());
            fos.write(filename20.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename21.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename22.getBytes());
            fos.write(filename23.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename24.getBytes());
            fos.write(filename25.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename26.getBytes());
            fos.write("\n".getBytes());
            fos.close();
            Toast.makeText(this,"บันทึก", Toast.LENGTH_SHORT).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Toast.makeText(this,"ไม่พบไฟล์", Toast.LENGTH_SHORT).show();
        } catch (IOException e){
            e.printStackTrace();
            Toast.makeText(this,"เกิดข้อผิดพลาดในการบันทึก", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults){
        switch (requestCode){
            case 1000:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this, "ได้รับอนุญาต", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this, "ไม่ได้รับอนุญาต", Toast.LENGTH_SHORT).show();
                    finish();
                }
        }
    }
}