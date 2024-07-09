package com.mastercoding.quadraticequationsolver;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.mastercoding.quadraticequationsolver.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {


    ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainBinding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
        );

        MyEquation equation = new MyEquation(mainBinding);

        mainBinding.setMyequation(equation);


    }
}