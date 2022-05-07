package com.example.project_kayk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.annotations.NotNull;

public class ForgotPassword extends AppCompatActivity {
  EditText editemail;
  Button resetPassword;
  FirebaseAuth fAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_forgot_password);
        getSupportActionBar().hide();
        editemail = findViewById(R.id.fp_email);
        resetPassword= findViewById(R.id.nextbtn);
        fAuth= FirebaseAuth.getInstance();

    resetPassword.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String edemail = editemail.getText().toString().trim();

            if (TextUtils.isEmpty(edemail)) {
                editemail.setError("Enter Email");
                editemail.requestFocus();
                return;
            } else if (!Patterns.EMAIL_ADDRESS.matcher(edemail).matches()) {
                editemail.setError("Enter Valid Email");
                editemail.requestFocus();
                return;
            }
            fAuth.sendPasswordResetEmail(edemail).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull @NotNull Task<Void> task) {
                    if (task.isSuccessful())
                    {
                        Toast.makeText(ForgotPassword.this,"Code has been sent.",Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        Toast.makeText(ForgotPassword.this,"Try Again!.",Toast.LENGTH_LONG).show();
                    }
                }
            });


            Toast.makeText(ForgotPassword.this,"Check Email",Toast.LENGTH_LONG).show();
        }
    });


    }
}