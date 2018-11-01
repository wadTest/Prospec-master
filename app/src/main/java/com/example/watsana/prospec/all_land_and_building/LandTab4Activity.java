package com.example.watsana.prospec.all_land_and_building;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.watsana.prospec.R;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LandTab4Activity extends AppCompatActivity {

    Button button1, button2, button3;
    TextView textView1, textView2;
    EditText EditText1, EditText2, EditText3, EditText4, EditText5, EditText6, EditText7, EditText8;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8;
    ImageButton imageView7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land_tab4);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);

        EditText1 = (EditText) findViewById(R.id.EditText1);
        EditText2 = (EditText) findViewById(R.id.EditText2);
        EditText3 = (EditText) findViewById(R.id.EditText3);
        EditText4 = (EditText) findViewById(R.id.EditText4);
        EditText5 = (EditText) findViewById(R.id.EditText5);
        EditText6 = (EditText) findViewById(R.id.EditText6);
        EditText7 = (EditText) findViewById(R.id.EditText7);
        EditText8 = (EditText) findViewById(R.id.EditText8);

        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox) findViewById(R.id.checkBox6);
        checkBox7 = (CheckBox) findViewById(R.id.checkBox7);
        checkBox8 = (CheckBox) findViewById(R.id.checkBox8);

        imageView7 = (ImageButton) findViewById(R.id.imageView7);

        //Get Event From Click land
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LandTab4Activity.this, LandsActivity.class));
            }
        });


        //Get Event From Click land
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LandTab4Activity.this, LandTab3Activity.class));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LandTab4Activity.this, LandTab5Activity.class));
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

                if (!filename1.equals("") && !filename2.equals("") && !filename3.equals("") && !filename4.equals("")
                        && !filename5.equals("") && !filename6.equals("") && !filename7.equals("") && !filename8.equals("")) {

                    saveTextAsFile(filename1, filename2, filename3, filename4, filename5, filename6,
                            filename7, filename8);
                }
            }
        });
    }

    private void saveTextAsFile(String filename1, String filename2, String filename3, String filename4, String filename5, String filename6, String filename7, String filename8) {
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
            fos.close();
            Toast.makeText(this, "บันทึก", Toast.LENGTH_SHORT).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Toast.makeText(this, "ไม่พบไฟล์", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "เกิดข้อผิดพลาดในการบันทึก", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case 1000:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, "ได้รับอนุญาต", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "ไม่ได้รับอนุญาต", Toast.LENGTH_SHORT).show();
                    finish();
                }
        }
    }
        public void Otro(View view) {
            if (checkBox8.isChecked()== true)
                EditText8.setVisibility(View.VISIBLE);
            else
                EditText8.setVisibility(View.INVISIBLE);}

        public void Otro1(View view) {
            if (checkBox7.isChecked()== true)
                EditText7.setVisibility(View.VISIBLE);
            else
                EditText7.setVisibility(View.INVISIBLE);}

        public void Otro2(View view) {
            if (checkBox6.isChecked()== true)
                EditText6.setVisibility(View.VISIBLE);
            else
                EditText6.setVisibility(View.INVISIBLE);}

        public void Otro3(View view) {
            if (checkBox5.isChecked()== true)
                EditText5.setVisibility(View.VISIBLE);
            else
                EditText5.setVisibility(View.INVISIBLE);}

        public void Otro4(View view) {
            if (checkBox4.isChecked()== true)
                EditText4.setVisibility(View.VISIBLE);
            else
                EditText4.setVisibility(View.INVISIBLE);}

        public void Otro5(View view) {
            if (checkBox3.isChecked()== true)
                EditText3.setVisibility(View.VISIBLE);
            else
                EditText3.setVisibility(View.INVISIBLE);}

        public void Otro6(View view) {
            if (checkBox2.isChecked()== true)
                EditText2.setVisibility(View.VISIBLE);
            else
                EditText2.setVisibility(View.INVISIBLE);}

        public void Otro7(View view) {
            if (checkBox1.isChecked()== true)
                EditText1.setVisibility(View.VISIBLE);
            else
                EditText1.setVisibility(View.INVISIBLE);}

        public void Procesar(View view) {
            int Contar = 0;
            if (checkBox1.isChecked() == true)
                Contar += 1;
            if (checkBox2.isChecked() == true)
                Contar += 2;
            if (checkBox3.isChecked() == true)
                Contar += 3;
            if (checkBox4.isChecked() == true)
                Contar += 4;
            if (checkBox5.isChecked() == true)
                Contar += 5;
            if (checkBox6.isChecked() == true)
                Contar += 6;
            if (checkBox7.isChecked() == true)
                Contar += 7;
            if (checkBox8.isChecked() == true)
                Contar += 8;
            Toast.makeText(LandTab4Activity.this, "เลือก" + Contar + "สิ่งที่เลือก", Toast.LENGTH_SHORT).show();
    }
}