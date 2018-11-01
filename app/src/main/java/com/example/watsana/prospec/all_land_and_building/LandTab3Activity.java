package com.example.watsana.prospec.all_land_and_building;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
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

public class LandTab3Activity extends AppCompatActivity {

    Button button1, button2, button3;
    TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8,
            textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16;
    EditText EditText1, EditText2, EditText3, EditText4, EditText5, EditText6,
            EditText7, EditText8, EditText9, EditText10, EditText11, EditText12;
    Spinner spinner1, spinner2;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9,
             checkBox10, checkBox11, checkBox12, checkBox13, checkBox14, checkBox15;
    ImageButton imageView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land_tab3);

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

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);

        imageView7 = (ImageButton) findViewById(R.id.imageView7);

        //Get Event From Click land
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LandTab3Activity.this, LandsActivity.class));
            }
        });

        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox) findViewById(R.id.checkBox6);
        checkBox7 = (CheckBox) findViewById(R.id.checkBox7);
        checkBox8 = (CheckBox) findViewById(R.id.checkBox8);
        checkBox9 = (CheckBox) findViewById(R.id.checkBox9);
        checkBox10 = (CheckBox) findViewById(R.id.checkBox10);
        checkBox11 = (CheckBox) findViewById(R.id.checkBox11);
        checkBox12 = (CheckBox) findViewById(R.id.checkBox12);
        checkBox13 = (CheckBox) findViewById(R.id.checkBox13);
        checkBox14 = (CheckBox) findViewById(R.id.checkBox14);
        checkBox15 = (CheckBox) findViewById(R.id.checkBox15);

        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox1.isChecked()) {
                    Toast.makeText(LandTab3Activity.this, "เลือก : กรรมสิทธิ์สมบูรณ์", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LandTab3Activity.this, "ยกเลิกรายการ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox2.isChecked()) {
                    Toast.makeText(LandTab3Activity.this, "เลือก : สิทธิการเช่า (มูลค่าของผู้เเช่า)", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LandTab3Activity.this, "ยกเลิกรายการ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox3.isChecked()) {
                    Toast.makeText(LandTab3Activity.this, "กรรมสิทธิ์สมบูรณ์ภายใต้สัญญาเช่า (มูลค่าของผู้เให้เช่า)", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LandTab3Activity.this, "ยกเลิกรายการ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox4.isChecked()) {
                    Toast.makeText(LandTab3Activity.this, "ไม่ใช่", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LandTab3Activity.this, "ยกเลิกรายการ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox5.isChecked()) {
                    Toast.makeText(LandTab3Activity.this, "ใช่", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LandTab3Activity.this, "ยกเลิกรายการ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox6.isChecked()) {
                    Toast.makeText(LandTab3Activity.this, "ไม่ใช่", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LandTab3Activity.this, "ยกเลิกรายการ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox7.isChecked()) {
                    Toast.makeText(LandTab3Activity.this, "ใช่", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LandTab3Activity.this, "ยกเลิกรายการ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox8.isChecked()) {
                    Toast.makeText(LandTab3Activity.this, "เลือก : ภาระการเช่า", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LandTab3Activity.this, "ยกเลิกรายการ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox9.isChecked()) {
                    Toast.makeText(LandTab3Activity.this, "เลือก : ภาระจำยอม", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LandTab3Activity.this, "ยกเลิกรายการ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox10.isChecked()) {
                    Toast.makeText(LandTab3Activity.this, "เลือก : สิทธิเก็บกิน", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LandTab3Activity.this, "ยกเลิกรายการ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox11.isChecked()) {
                    Toast.makeText(LandTab3Activity.this, "เลือก : สิทธิอาศัย", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LandTab3Activity.this, "ยกเลิกรายการ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox12.isChecked()) {
                    Toast.makeText(LandTab3Activity.this, "เลือก : สิทธิเหนือพื้นดิน", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LandTab3Activity.this, "ยกเลิกรายการ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox13.isChecked()) {
                    Toast.makeText(LandTab3Activity.this, "เลือก : ภาระติดพันในอสังหาริมทรัพย์", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LandTab3Activity.this, "ยกเลิกรายการ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox14.isChecked()) {
                    Toast.makeText(LandTab3Activity.this, "เลือก : ไม่มีอายัด", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LandTab3Activity.this, "ยกเลิกรายการ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        checkBox15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox15.isChecked()) {
                    Toast.makeText(LandTab3Activity.this, "เลือก : มีการอายัด", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LandTab3Activity.this, "ยกเลิกรายการ", Toast.LENGTH_SHORT).show();
                }
            }
        });

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(LandTab3Activity.this, parent.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(LandTab3Activity.this, parent.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //Get Event From Click land
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LandTab3Activity.this, LandsActivity.class));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LandTab3Activity.this, LandTab4Activity.class));
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


                if (!filename1.equals("") && !filename2.equals("") && !filename3.equals("") && !filename4.equals("")
                        && !filename5.equals("") && !filename6.equals("") && !filename7.equals("") && !filename8.equals("")
                        && !filename9.equals("") && !filename10.equals("") && !filename11.equals("") && !filename12.equals("")){

                    saveTextAsFile(filename1, filename2, filename3, filename4 , filename5, filename6,
                            filename7, filename8, filename9, filename10 , filename11, filename12);
                }
            }
        });
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

