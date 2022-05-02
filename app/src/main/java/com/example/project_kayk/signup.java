package com.example.project_kayk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.*;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.core.view.View;

public class signup extends AppCompatActivity {
    Animation topAnim;
    ImageView login_logo;
    TextView dis, hello;
    EditText regName, regEmail, regPassword, regPhone, confirmPass;
    Button regBtn, alreadyaccBtn;
    FirebaseAuth firebaseAuth;
    DatabaseReference reference;
    String User;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        login_logo = findViewById(R.id.login_logo);
        dis = findViewById(R.id.discover);
        hello = findViewById(R.id.welcome);
        regName = findViewById(R.id.user_name);
        regEmail = findViewById(R.id.newemail);
        regPhone = findViewById(R.id.phone);
        regPassword = findViewById(R.id.newpassword);
        regBtn = findViewById(R.id.signup);
        getSupportActionBar().hide();
        confirmPass = findViewById(R.id.confirmpassword);
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        login_logo.setAnimation(topAnim);
        dis.setAnimation(topAnim);
        hello.setAnimation(topAnim);
        alreadyaccBtn = findViewById(R.id.alreadyacc);
        firebaseAuth = FirebaseAuth.getInstance();
        reference= FirebaseDatabase.getInstance().getReference().child("User");
       regBtn.setOnClickListener(new android.view.View.OnClickListener() {
           @Override
           public void onClick(android.view.View view) {
                Intent iii = new Intent(getApplicationContext(), Login.class);
                startActivity(iii);
                User= regName.getText().toString();
                String Email= regEmail.getText().toString();
                String Pass = regPassword.getText().toString();
                String cPass = confirmPass.getText().toString();
                String phone_no= regPhone.getText().toString();
                if (User.isEmpty() && Email.isEmpty() && Pass.isEmpty() && cPass.isEmpty() && phone_no.isEmpty()){
                    Toast.makeText(getApplicationContext(), "All Fields Empty",Toast.LENGTH_SHORT).show();
                }
                else if(User.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Name Field Empty",Toast.LENGTH_SHORT).show();
                }
                else if(Email.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Email Field Empty",Toast.LENGTH_SHORT).show();
                }
                else if (Pass.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Password Field Empty",Toast.LENGTH_SHORT).show();
                }
                else if (cPass.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Confirm Password Field Empty",Toast.LENGTH_SHORT).show();
                }
                else if (phone_no.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Phone Field Empty",Toast.LENGTH_SHORT).show();
                }
                else{
                    firebaseAuth.createUserWithEmailAndPassword(Email,Pass).addOnCompleteListener(signup.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()) {
                                Toast.makeText(signup.this.getApplicationContext(), "Sign Up unsuccessful: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            } else {

                                Log.d("uidf",firebaseAuth.getUid());
                                writeNewUser( firebaseAuth.getUid(),User);
                            }
                        }
                    });

                }
            }

        });
    }

    private void writeNewUser(String userId, String name) {
        Users user = new Users(name);
        reference.child(userId).setValue(name);
        Intent i = new Intent(getApplicationContext(), Login.class);
        startActivity(i);
    }
    }


