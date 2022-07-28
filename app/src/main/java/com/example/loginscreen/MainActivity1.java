package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity1 extends AppCompatActivity {

    TextInputEditText username;
    TextInputLayout input_username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inputtextlayout);
        username = findViewById(R.id.input_ed_txt);
        input_username=findViewById(R.id.inputlayout);
username.addTextChangedListener(new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        if(username.length()<6){

input_username.setError("Minimum charcter length is 6");
        }else{
            input_username.setError(null);
        }

    }
});
    }

}