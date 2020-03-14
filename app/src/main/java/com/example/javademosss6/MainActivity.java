package com.example.javademosss6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            System.out.println("A");
            int num = 99 / 0;
            System.out.println("B");
        } finally {// after try block,finally will be executed but D will not executed because exception is not handled
            System.out.println("C");
        }
        System.out.println("D");
    }
}
//O/p: AC