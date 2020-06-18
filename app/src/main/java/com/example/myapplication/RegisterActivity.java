package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    //initialise variables
    EditText etroll,etname,etevent,etmobile,etbranch,etsection;
    Button btsubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //assign variables
        etroll = findViewById(R.id.et_username);
        etname = findViewById(R.id.et_entername);
        etevent = findViewById(R.id.et_entereventname);
        etmobile = findViewById(R.id.et_phone);
        etbranch = findViewById(R.id.et_branch);
        etsection = findViewById(R.id.et_section);
        btsubmit = findViewById(R.id.btnSubmit);






    }
}