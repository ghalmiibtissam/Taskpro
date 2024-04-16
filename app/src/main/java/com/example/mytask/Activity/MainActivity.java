package com.example.mytask.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mytask.R;
import com.example.mytask.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setVariable();

    }
    private void setVariable(){
        binding.loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
if(mAuth.getCurrentUser()!=null){
    startActivity(new Intent(MainActivity.this,MainActivity2.class));
}else{
    startActivity(new Intent(MainActivity.this, LoginActivity.class));
}
            }
        });
        binding.signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SignupActivity.class));
            }
        });
    }
}