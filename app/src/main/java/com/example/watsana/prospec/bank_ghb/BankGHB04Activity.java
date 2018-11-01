package com.example.watsana.prospec.bank_ghb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.example.watsana.prospec.R;


public class BankGHB04Activity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_ghb04);

        final EditText arrayEditText = findViewById(R.id.edtArray);
        final EditText showEditText = findViewById(R.id.edtShow);
        final EditText thbEditText = findViewById(R.id.edtTHB);
        final String[] strings = new String[]{"0", "0"};

        thbEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                strings[1] = thbEditText.getText().toString();
                if (strings[1].isEmpty()) {
                    strings[1] = "0";
                }
                calculate(strings, showEditText);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        arrayEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                strings[0] = arrayEditText.getText().toString();
                if (strings[0].isEmpty()) {
                    strings[0] = "0";
                }
                calculate(strings, showEditText);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });




    }

    private void calculate(String[] strings, EditText showEditText) {
        int arrayInt = Integer.parseInt(strings[0]);
        int thbInt = Integer.parseInt(strings[1]);
        int answerInt = arrayInt + thbInt;
        showEditText.setText(Integer.toString(answerInt));
    }
}
