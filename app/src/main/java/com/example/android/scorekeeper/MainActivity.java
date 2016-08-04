package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int left_score = 0;
    int left_foul = 0;
    int right_score = 0;
    int right_foul = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method displays the given left_score value on the screen.
     */
    private void display_left_score(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.score_count_left);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given right_score value on the screen.
     */
    private void display_right_score(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.score_count_right);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given left_foul value on the screen.
     */
    private void display_left_foul(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.foul_count_left);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given right_foul value on the screen.
     */
    private void display_right_foul(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.foul_count_right);
        quantityTextView.setText("" + number);
    }


    /**
     * This method increments the left score value on the screen.
     */
    public void increment_left_score(View view) {
        left_score = left_score + 1;
        display_left_score(left_score);
    }

    /**
     * This method decrements the left score value on the screen.
     */
    public void decrement_left_score(View view) {
        left_score = left_score - 1;
        display_left_score(left_score);
    }

    /**
     * This method increments the right score value on the screen.
     */
    public void increment_right_score(View view) {
        right_score = right_score + 1;
        display_right_score(right_score);
    }

    /**
     * This method decrements the right score value on the screen.
     */
    public void decrement_right_score(View view) {
        right_score = right_score - 1;
        display_right_score(right_score);
    }


    /**
     * This method increments the left foul value on the screen.
     */
    public void increment_left_foul(View view) {
        left_foul = left_foul + 1;
        display_left_foul(left_foul);
    }

    /**
     * This method decrements the left score value on the screen.
     */
    public void decrement_left_foul(View view) {
        left_foul = left_foul - 1;
        display_left_foul(left_foul);
    }

    /**
     * This method increments the right score value on the screen.
     */
    public void increment_right_foul(View view) {
        right_foul = right_foul + 1;
        display_right_foul(right_foul);
    }

    /**
     * This method decrements the right score value on the screen.
     */
    public void decrement_right_foul(View view) {
        right_foul = right_foul - 1;
        display_right_foul(right_foul);
    }

    /**
     * This method resets all counters.
     */
    public void reset(View view) {
        left_score = 0;
        right_score = 0;
        left_foul = 0;
        right_foul = 0;
        display_left_score(left_score);
        display_right_score(right_score);
        display_left_foul(left_foul);
        display_right_foul(right_foul);
    }


}
