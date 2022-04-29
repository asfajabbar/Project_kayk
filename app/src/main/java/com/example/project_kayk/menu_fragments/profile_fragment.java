package com.example.project_kayk.menu_fragments;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.project_kayk.R;
import com.example.project_kayk.home_screen;

public class profile_fragment extends AppCompatActivity {
    EditText etFirstName,  etEmail, etContactNo;
    ImageButton closebtn;
    final int MIN_PASSWORD_LENGTH = 6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_fragment);
        viewInitializations();
        closebtn= findViewById(R.id.close_btn);
        closebtn.setOnClickListener((view) ->
        {

            Intent intent = new Intent(profile_fragment.this, home_screen.class);
            startActivity(intent);
        } );
    }

    void viewInitializations() {
        etFirstName = findViewById(R.id.et_first_name);
        etEmail = findViewById(R.id.et_email);
        etContactNo = findViewById(R.id.et_contact_no);


        // To show back button in actionbar
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    // Checking if the input in form is valid
    boolean validateInput() {
        if (etFirstName.getText().toString().equals("")) {
            etFirstName.setError("Please Enter First Name");
            return false;
        }

        if (etEmail.getText().toString().equals("")) {
            etEmail.setError("Please Enter Email");
            return false;
        }
        if (etContactNo.getText().toString().equals("")) {
            etContactNo.setError("Please Enter Contact No");
            return false;
        }

        // checking the proper email format
        if (!isEmailValid(etEmail.getText().toString())) {
            etEmail.setError("Please Enter Valid Email");
            return false;
        }

        return true;
    }

    boolean isEmailValid(String email) {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    // Hook Click Event

    public void performEditProfile (View v) {
        if (validateInput()) {

            // Input is valid, here send data to your server

            String firstName = etFirstName.getText().toString();
            String email = etEmail.getText().toString();
            String contactNo = etContactNo.getText().toString();
            Toast.makeText(this,"Profile Update Successfully",Toast.LENGTH_SHORT).show();
            // Here you can call you API

        }
    }


}