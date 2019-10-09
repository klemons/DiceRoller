package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();
    MediaPlayer blee =  new MediaPlayer();
    public static final String MY_PREFS_NAME = "integer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
        blee = MediaPlayer.create(this, R.raw.shake);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, StatsActivity.class);
                startActivity(intent);
            }
        });
    }

    private void rollDice() {
        if (blee.isPlaying()) {
            blee.stop();
            blee.release();
        }
        blee = MediaPlayer.create(this, R.raw.shake);
        blee.start();

        SharedPreferences sharedPref = MainActivity.this.getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();


        int rollCount1 = sharedPref.getInt(getString(R.string.roll_1), getResources().getInteger(R.integer.roll_1));
        int rollCount2 = sharedPref.getInt(getString(R.string.roll_2), getResources().getInteger(R.integer.roll_2));
        int rollCount3 = sharedPref.getInt(getString(R.string.roll_3), getResources().getInteger(R.integer.roll_3));
        int rollCount4 = sharedPref.getInt(getString(R.string.roll_4), getResources().getInteger(R.integer.roll_4));
        int rollCount5 = sharedPref.getInt(getString(R.string.roll_5), getResources().getInteger(R.integer.roll_5));
        int rollCount6 = sharedPref.getInt(getString(R.string.roll_6), getResources().getInteger(R.integer.roll_6));
        int rollCount7 = sharedPref.getInt(getString(R.string.roll_7), getResources().getInteger(R.integer.roll_7));
        int rollCount8 = sharedPref.getInt(getString(R.string.roll_8), getResources().getInteger(R.integer.roll_8));
        int rollCount9 = sharedPref.getInt(getString(R.string.roll_9), getResources().getInteger(R.integer.roll_9));
        int rollCount10 = sharedPref.getInt(getString(R.string.roll_10), getResources().getInteger(R.integer.roll_10));
        int rollCount11 = sharedPref.getInt(getString(R.string.roll_11), getResources().getInteger(R.integer.roll_11));
        int rollCount12 = sharedPref.getInt(getString(R.string.roll_12), getResources().getInteger(R.integer.roll_12));
        int rollCount13 = sharedPref.getInt(getString(R.string.roll_13), getResources().getInteger(R.integer.roll_13));
        int rollCount14 = sharedPref.getInt(getString(R.string.roll_14), getResources().getInteger(R.integer.roll_14));
        int rollCount15 = sharedPref.getInt(getString(R.string.roll_15), getResources().getInteger(R.integer.roll_15));
        int rollCount16 = sharedPref.getInt(getString(R.string.roll_16), getResources().getInteger(R.integer.roll_16));
        int rollCount17 = sharedPref.getInt(getString(R.string.roll_17), getResources().getInteger(R.integer.roll_17));
        int rollCount18 = sharedPref.getInt(getString(R.string.roll_18), getResources().getInteger(R.integer.roll_18));
        int rollCount19 = sharedPref.getInt(getString(R.string.roll_19), getResources().getInteger(R.integer.roll_19));
        int rollCount20 = sharedPref.getInt(getString(R.string.roll_20), getResources().getInteger(R.integer.roll_20));

        int newRoll;

        int randomNumber = rng.nextInt(20) + 1;

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                blee = MediaPlayer.create(this, R.raw.fail);
                blee.start();
                newRoll = rollCount1 + 1;
                editor.putInt(getString(R.string.roll_1), newRoll);
                editor.commit();
                editor.clear();
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                newRoll = rollCount2 + 1;
                editor.putInt(getString(R.string.roll_2), newRoll);
                editor.commit();
                editor.clear();
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.d3);
                newRoll = rollCount3 + 1;
                editor.putInt(getString(R.string.roll_3), newRoll);
                editor.commit();
                editor.clear();
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.d4);
                newRoll = rollCount4 + 1;
                editor.putInt(getString(R.string.roll_4), newRoll);
                editor.commit();
                editor.clear();
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.d5);
                newRoll = rollCount5 + 1;
                editor.putInt(getString(R.string.roll_5), newRoll);
                editor.commit();
                editor.clear();
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.d6);
                newRoll = rollCount6 + 1;
                editor.putInt(getString(R.string.roll_6), newRoll);
                editor.commit();
                editor.clear();
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.d7);
                newRoll = rollCount7 + 1;
                editor.putInt(getString(R.string.roll_7), newRoll);
                editor.commit();
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.d8);
                newRoll = rollCount8 + 1;
                editor.putInt(getString(R.string.roll_8), newRoll);
                editor.commit();
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.d9);
                newRoll = rollCount9 + 1;
                editor.putInt(getString(R.string.roll_9), newRoll);
                editor.commit();
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.d10);
                newRoll = rollCount10 + 1;
                editor.putInt(getString(R.string.roll_10), newRoll);
                editor.commit();
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.d11);
                newRoll = rollCount11 + 1;
                editor.putInt(getString(R.string.roll_11), newRoll);
                editor.commit();
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.d12);
                newRoll = rollCount12 + 1;
                editor.putInt(getString(R.string.roll_12), newRoll);
                editor.commit();
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.d13);
                newRoll = rollCount13 + 1;
                editor.putInt(getString(R.string.roll_13), newRoll);
                editor.commit();
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.d14);
                newRoll = rollCount14 + 1;
                editor.putInt(getString(R.string.roll_14), newRoll);
                editor.commit();
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.d15);
                newRoll = rollCount15 + 1;
                editor.putInt(getString(R.string.roll_15), newRoll);
                editor.commit();
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.d16);
                newRoll = rollCount16 + 1;
                editor.putInt(getString(R.string.roll_16), newRoll);
                editor.commit();
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.d17);
                newRoll = rollCount17 + 1;
                editor.putInt(getString(R.string.roll_17), newRoll);
                editor.commit();
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.d18);
                newRoll = rollCount18 + 1;
                editor.putInt(getString(R.string.roll_18), newRoll);
                editor.commit();
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.d19);
                newRoll = rollCount19 + 1;
                editor.putInt(getString(R.string.roll_19), newRoll);
                editor.commit();
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.d20);
                blee = MediaPlayer.create(this, R.raw.crit);
                blee.start();
                newRoll = rollCount20 + 1;
                editor.putInt(getString(R.string.roll_20), newRoll);
                editor.commit();
                break;
        }
    }
}