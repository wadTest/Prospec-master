package com.example.watsana.prospec.all_land_and_building;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.watsana.prospec.R;
import com.example.watsana.prospec.utility.MyAlert;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LandTab1Activity extends AppCompatActivity {

    Button button1, button2, button3;
    TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8,
            textView9, textView10, textView11, textView12, textView13, textView14, textView15;
    EditText EditText1, EditText2, EditText3, EditText4, EditText5, EditText6,
            EditText7, EditText8, EditText9, EditText10, EditText11, EditText12;
    Spinner spinner1;
    ImageButton imageView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land_tab1);

        //Permissin Check
        permissinCheck();

        //Initial View
        initialView();

        //Get Event From Click land
        landController();


        //Back Controller
        backController();

        // Next Controller
        nextController();

        //Save Controller
        saveController();
    }//Main Method

    private void saveController() {
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String filename1 = EditText1.getText().toString().trim();
                String filename2 = EditText2.getText().toString().trim();
                String filename3 = EditText3.getText().toString().trim();
                String filename4 = EditText4.getText().toString().trim();
                String filename5 = EditText5.getText().toString().trim();
                String filename6 = EditText6.getText().toString().trim();
                String filename7 = EditText7.getText().toString().trim();
                String filename8 = EditText8.getText().toString().trim();
                String filename9 = EditText9.getText().toString().trim();
                String filename10 = EditText10.getText().toString().trim();
                String filename11 = EditText11.getText().toString().trim();
                String filename12 = EditText12.getText().toString().trim();

                if (filename1.isEmpty() || filename2.isEmpty() || filename3.isEmpty() || filename4.isEmpty() ||
                        filename5.isEmpty() || filename6.isEmpty() || filename7.isEmpty() || filename8.isEmpty()
                        || filename9.isEmpty() || filename10.isEmpty() || filename11.isEmpty() || filename12.isEmpty()) {

                    //Have Space
                    MyAlert myAlert = new MyAlert(LandTab1Activity.this);
                    myAlert.normalDialog("Have Space", "Please Fill All Blank");

                }else {

                    //No Space
                    saveTextAsFile(filename1, filename2, filename3, filename4, filename5, filename6,
                            filename7,  filename8, filename9, filename10, filename11 , filename12);
                }

            }//Onclick
        });
    }

    private void nextController() {
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LandTab1Activity.this, LandTab2Activity.class));
            }
        });
    }

    private void backController() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LandTab1Activity.this, LandsActivity.class));
            }
        });
    }

    private void landController() {
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LandTab1Activity.this, LandsActivity.class));
            }
        });

        spinner1 = (Spinner) findViewById(R.id.spinner1);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(LandTab1Activity.this, parent.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initialView() {
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

        imageView7 = (ImageButton) findViewById(R.id.imageView7);
    }

    private void permissinCheck() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
        }
    }

    private void saveTextAsFile(String filename1, String filename2, String filename3, String filename4, String filename5, String filename6, String filename7, String filename8, String filename9, String filename10, String filename11, String filename12){
        String fileName = filename1 + ".xls";

        //create file
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), fileName);

        //vrite to file

        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(filename1.getBytes());
            fos.write("\t".getBytes());
            fos.write(filename2.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename3.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename4.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename5.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename6.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename7.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename8.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename9.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename10.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename11.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename12.getBytes());
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

