package com.example.watsana.prospec.bank_ghb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.watsana.prospec.R;
import com.kofigyan.stateprogressbar.StateProgressBar;

public class TestActivity extends AppCompatActivity {

    String[] descriptionData = {"10%", "20%", "30%", "40%", "50%"};
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        final StateProgressBar stateProgressBar = (StateProgressBar) findViewById(R.id.your_state_progress_bar_id);
        stateProgressBar.setStateDescriptionData(descriptionData);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                switch (stateProgressBar.getCurrentStateNumber()) {
                    case 1:
                        stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.TWO);
                        break;
                    case 2:
                        stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.THREE);
                        break;
                    case 3:
                        stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.FOUR);
                        break;
                    case 4:
                        stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.FIVE);
                        break;
                    case 5:
                        stateProgressBar.setAllStatesCompleted(true);
                        break;
                }
            }
        });
    }
}
