package com.example.mytask.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mytask.R;
import com.example.mytask.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}