package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity1 extends AppCompatActivity {

TextInputEditText username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inputtextlayout);
        username=findViewById(R.id.input_ed_txt);


    }
    public boolean validate(){
       boolean valid=false;
        String name=username.getText().toString();
        if (username.length()<6){
            valid= true;
           username.setError(null);

        }else{
            valid= false;
            username.setError("Enter atleast 6 characters");

        }
        return validate();
    }
}