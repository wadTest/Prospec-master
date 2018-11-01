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

public class LandTab5Activity extends AppCompatActivity {

    Button button, button1, button2, button3, button4, button5, button6, button7;
    TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8,
             textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19;
    EditText EditText1, EditText2, EditText3, EditText4, EditText5, EditText6, EditText7, EditText8, EditText9, EditText10;
    Spinner spinner1, spinner2;
    ImageButton imageView7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land_tab5);

        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);

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

        imageView7 = (ImageButton) findViewById(R.id.imageView7);

        //Get Event From Click land
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LandTab5Activity.this, LandsActivity.class));
            }
        });

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(LandTab5Activity.this, parent.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(LandTab5Activity.this, parent.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        //Get Event From Click land
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LandTab5Activity.this, BuildingsActivity.class));
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LandTab5Activity.this, LandTab4Activity.class));
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LandTab5Activity.this, LandTab6Activity.class));
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditText7.getText().toString().equals("") || EditText9.getText().toString().equals("")) {
                    Toast.makeText(LandTab5Activity.this, "โปรดใส่รายละเอียด", Toast.LENGTH_SHORT).show();
                } else {
                    EditText7.getText().toString();
                    EditText9.getText().toString();
                    double a1 = Double.valueOf(EditText7.getText().toString());
                    double a2 = Double.valueOf(EditText9.getText().toString());
                    double a3;
                    a3 = a1/100 * a2;
                    button2.setText(String.valueOf(a3));
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditText8.getText().toString().equals("") || EditText10.getText().toString().equals("")) {
                    Toast.makeText(LandTab5Activity.this, "โปรดใส่รายละเอียด", Toast.LENGTH_SHORT).show();
                } else {
                    EditText8.getText().toString();
                    EditText10.getText().toString();
                    double a1 = Double.valueOf(EditText8.getText().toString());
                    double a2 = Double.valueOf(EditText10.getText().toString());
                    double a3;
                    a3 = a1/100 * a2;
                    button3.setText(String.valueOf(a3));
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.getText().toString().equals("") || button3.getText().toString().equals("")) {
                    Toast.makeText(LandTab5Activity.this, "โปรดใส่รายละเอียด", Toast.LENGTH_SHORT).show();
                } else {
                    button2.getText().toString();
                    button3.getText().toString();
                    double a1 = Double.valueOf(button2.getText().toString());
                    double a2 = Double.valueOf(button3.getText().toString());
                    double a3;
                    a3 = (a1 + a2);
                    button4.setText(String.valueOf(a3));
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
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

                if (!filename1.equals("") && !filename2.equals("") && !filename3.equals("") && !filename4.equals("") && !filename5.equals("")
                        && !filename6.equals("") && !filename7.equals("") && !filename8.equals("") && !filename9.equals("") && !filename10.equals("")) {

                    saveTextAsFile(filename1, filename2, filename3, filename4, filename5, filename6,
                            filename7, filename8, filename9, filename10);
                }
            }
        });
    }

    private void saveTextAsFile(String filename1, String filename2, String filename3, String filename4, String filename5,
                                String filename6, String filename7, String filename8, String filename9, String filename10) {
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
}