package com.example.diwan.complex_merge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomeThing(){

        int i = 9;
        int ii = 100;

        String toString;

        if(i<100){
            toString = Integer.toString(i-10);
        }

    }

}
