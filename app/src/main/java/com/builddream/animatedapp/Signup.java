package com.builddream.animatedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class Signup extends AppCompatActivity {
    TextInputLayout name,username,email,number,password;
    Button callSignIn,SignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        callSignIn = findViewById(R.id.callSignIn);
        callSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Signup.this,Login.class);
                startActivity(intent);
            }
        });
    }
    public void registerUser(View view){
       String rname = name.getEditText().getText().toString();
       String uname = username.getEditText().getText().toString();
       String remail = email.getEditText().getText().toString();
       String rnumber= number.getEditText().getText().toString();
       String rpassword = password.getEditText().getText().toString();
    }
}