package com.example.diceroller;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StatsActivity extends MainActivity {
    private TextView rollText;
    public int rolledInfo;
    public static final String MY_PREFS_NAME = "integer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        Button button = findViewById(R.id.fetchButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPref = StatsActivity.this.getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE);


                for (int i = 1; i < 21; i++) {
                    switch (i) {
                        case 1:
                            rolledInfo = sharedPref.getInt(getString(R.string.roll_1), 0);
                            rollText = findViewById(R.id.textView1);
                            rollText.setText("1 Rolls: " + String.valueOf(rolledInfo));
                        case 2:
                            rolledInfo = sharedPref.getInt(getString(R.string.roll_2), 0);
                            rollText = findViewById(R.id.textView2);
                            rollText.setText("2 Rolls: " + String.valueOf(rolledInfo));
                        case 3:
                            rolledInfo = sharedPref.getInt(getString(R.string.roll_3), 0);
                            rollText = findViewById(R.id.textView3);
                            rollText.setText("3 Rolls: " + String.valueOf(rolledInfo));
                        case 4:
                            rolledInfo = sharedPref.getInt(getString(R.string.roll_4), 0);
                            rollText = findViewById(R.id.textView4);
                            rollText.setText("4 Rolls: " + String.valueOf(rolledInfo));
                        case 5:
                            rolledInfo = sharedPref.getInt(getString(R.string.roll_5), 0);
                            rollText = findViewById(R.id.textView5);
                            rollText.setText("5 Rolls: " + String.valueOf(rolledInfo));
                        case 6:
                            rolledInfo = sharedPref.getInt(getString(R.string.roll_6), 0);
                            rollText = findViewById(R.id.textView6);
                            rollText.setText("6 Rolls: " + String.valueOf(rolledInfo));
                        case 7:
                            rolledInfo = sharedPref.getInt(getString(R.string.roll_7), 0);
                            rollText = findViewById(R.id.textView7);
                            rollText.setText("7 Rolls: " + String.valueOf(rolledInfo));
                        case 8:
                            rolledInfo = sharedPref.getInt(getString(R.string.roll_8), 0);
                            rollText = findViewById(R.id.textView8);
                            rollText.setText("8 Rolls: " + String.valueOf(rolledInfo));
                        case 9:
                            rolledInfo = sharedPref.getInt(getString(R.string.roll_9), 0);
                            rollText = findViewById(R.id.textView9);
                            rollText.setText("9 Rolls: " + String.valueOf(rolledInfo));
                        case 10:
                            rolledInfo = sharedPref.getInt(getString(R.string.roll_10), 0);
                            rollText = findViewById(R.id.textView10);
                            rollText.setText("10 Rolls: " + String.valueOf(rolledInfo));
                        case 11:
                            rolledInfo = sharedPref.getInt(getString(R.string.roll_11), 0);
                            rollText = findViewById(R.id.textView11);
                            rollText.setText("11 Rolls: " + String.valueOf(rolledInfo));
                        case 12:
                            rolledInfo = sharedPref.getInt(getString(R.string.roll_12), 0);
                            rollText = findViewById(R.id.textView12);
                            rollText.setText("12 Rolls: " + String.valueOf(rolledInfo));
                        case 13:
                            rolledInfo = sharedPref.getInt(getString(R.string.roll_13), 0);
                            rollText = findViewById(R.id.textView13);
                            rollText.setText("13 Rolls: " + String.valueOf(rolledInfo));
                        case 14:
                            rolledInfo = sharedPref.getInt(getString(R.string.roll_14), 0);
                            rollText = findViewById(R.id.textView14);
                            rollText.setText("14 Rolls: " + String.valueOf(rolledInfo));
                        case 15:
                            rolledInfo = sharedPref.getInt(getString(R.string.roll_15), 0);
                            rollText = findViewById(R.id.textView15);
                            rollText.setText("15 Rolls: " + String.valueOf(rolledInfo));
                        case 16:
                            rolledInfo = sharedPref.getInt(getString(R.string.roll_16), 0);
                            rollText = findViewById(R.id.textView16);
                            rollText.setText("16 Rolls: " + String.valueOf(rolledInfo));
                        case 17:
                            rolledInfo = sharedPref.getInt(getString(R.string.roll_17), 0);
                            rollText = findViewById(R.id.textView17);
                            rollText.setText("17 Rolls: " + String.valueOf(rolledInfo));
                        case 18:
                            rolledInfo = sharedPref.getInt(getString(R.string.roll_18), 0);
                            rollText = findViewById(R.id.textView18);
                            rollText.setText("18 Rolls: " + String.valueOf(rolledInfo));
                        case 19:
                            rolledInfo = sharedPref.getInt(getString(R.string.roll_19), 0);
                            rollText = findViewById(R.id.textView19);
                            rollText.setText("19 Rolls: " + String.valueOf(rolledInfo));
                        case 20:
                            rolledInfo = sharedPref.getInt(getString(R.string.roll_20), 0);
                            rollText = findViewById(R.id.textView20);
                            rollText.setText("20 Rolls: " + String.valueOf(rolledInfo));
                    }
                }
            }
        });

    }
}
