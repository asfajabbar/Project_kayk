package com.example.project_kayk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.*;
import android.os.Bundle;
import android.widget.Button;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.core.view.View;

public class signup extends AppCompatActivity {
    TextInputLayout regName, regEmail,regPassword, regPhone;
    Button regBtn, alreadyaccBtn;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        regName = findViewById(R.id.username);
        regEmail = findViewById(R.id.new_email);
        regPhone = findViewById(R.id.phone);
        regPassword = findViewById(R.id.new_password);
        regBtn = findViewById(R.id.signup);
        alreadyaccBtn=findViewById(R.id.alreadyacc);
        regBtn.setOnClickListener((view) ->
        {

            Intent intent = new Intent(signup.this, Login.class);
            startActivity(intent);
        } );

    alreadyaccBtn.setOnClickListener((view) ->
    {

        Intent intent = new Intent(signup.this, Login.class);
        startActivity(intent);
    } );
}

}