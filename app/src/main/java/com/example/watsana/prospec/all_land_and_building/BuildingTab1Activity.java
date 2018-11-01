package com.example.watsana.prospec.all_land_and_building;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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

public class BuildingTab1Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Button button1, button2, button3;
    TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9,
             textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18,
             textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27;
    EditText EditText1, EditText2, EditText3, EditText4, EditText5, EditText6, EditText7, EditText8, EditText9, EditText10, EditText11, EditText12,
             EditText13, EditText14, EditText15, EditText16, EditText17, EditText18,  EditText19, EditText20, EditText21, EditText22, EditText23;
    Spinner spinner1, spinner2, spinner3, spinner4;
    ImageButton imageView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_tab1);

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
        textView23 = (TextView) findViewById(R.id.textView23);
        textView24 = (TextView) findViewById(R.id.textView24);
        textView25 = (TextView) findViewById(R.id.textView25);
        textView26 = (TextView) findViewById(R.id.textView26);
        textView27 = (TextView) findViewById(R.id.textView27);

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
        EditText15 = (EditText) findViewById(R.id.EditText15);
        EditText16 = (EditText) findViewById(R.id.EditText16);
        EditText17 = (EditText) findViewById(R.id.EditText17);
        EditText18 = (EditText) findViewById(R.id.EditText18);
        EditText19 = (EditText) findViewById(R.id.EditText19);
        EditText20 = (EditText) findViewById(R.id.EditText20);
        EditText21 = (EditText) findViewById(R.id.EditText21);
        EditText22 = (EditText) findViewById(R.id.EditText22);
        EditText23 = (EditText) findViewById(R.id.EditText23);

        spinner1  = (Spinner) findViewById(R.id.spinner1);
        spinner2  = (Spinner) findViewById(R.id.spinner2);
        spinner3  = (Spinner) findViewById(R.id.spinner3);
        spinner4  = (Spinner) findViewById(R.id.spinner4);

        imageView7 = (ImageButton) findViewById(R.id.imageView7);

        //Get Event From Click land
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuildingTab1Activity.this, BuildingsActivity.class));
            }
        });

        //Get Event From Click land
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuildingTab1Activity.this, BuildingsActivity.class));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuildingTab1Activity.this, BuildingTab2Activity.class));
            }
        });

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
                String filename13 = EditText13.getText().toString().trim();
                String filename14 = EditText14.getText().toString().trim();
                String filename15 = EditText15.getText().toString().trim();
                String filename16 = EditText16.getText().toString().trim();
                String filename17 = EditText17.getText().toString().trim();
                String filename18 = EditText18.getText().toString().trim();
                String filename19 = EditText19.getText().toString().trim();
                String filename20 = EditText20.getText().toString().trim();
                String filename21 = EditText21.getText().toString().trim();
                String filename22 = EditText22.getText().toString().trim();
                String filename23 = EditText23.getText().toString().trim();

                if (!filename1.equals("") && !filename2.equals("") && !filename3.equals("") && !filename4.equals("") && !filename5.equals("") && !filename6.equals("")
                        && !filename7.equals("") && !filename8.equals("") && !filename9.equals("") && !filename10.equals("") && !filename11.equals("") && !filename12.equals("")
                        && !filename13.equals("") && !filename14.equals("") && !filename15.equals("") && !filename16.equals("") && !filename17.equals("") && !filename18.equals("")
                        && !filename19.equals("") && !filename20.equals("") && !filename21.equals("") && !filename22.equals("") && !filename23.equals("")){

                    saveTextAsFile(filename1, filename2, filename3, filename4 , filename5, filename6, filename7, filename8, filename9, filename10 , filename11, filename12,
                            filename13, filename14, filename15, filename16 , filename17, filename18, filename19, filename20, filename21, filename22 , filename23);
                }
            }
        });
    }
    private void saveTextAsFile(String filename1, String filename2, String filename3, String filename4, String filename5, String filename6, String filename7, String filename8,
                                String filename9, String filename10, String filename11, String filename12, String filename13, String filename14, String filename15,
                                String filename16, String filename17, String filename18, String filename19, String filename20,String filename21, String filename22, String filename23){
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
            fos.write(filename13.getBytes());
            fos.write("\t".getBytes());
            fos.write(filename14.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename15.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename16.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename17.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename18.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename19.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename20.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename21.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename22.getBytes());
            fos.write("\n".getBytes());
            fos.write(filename23.getBytes());
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
    ArrayAdapter < String > myAdapter = new ArrayAdapter<String>(BuildingTab1Activity.this,
                        android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(myAdapter);

        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
        spinner3.setOnItemSelectedListener(this);
        spinner4.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String sSelected=parent.getItemAtPosition(position).toString();
        Toast.makeText(this,sSelected,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
