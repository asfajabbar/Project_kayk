package com.example.project_kayk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
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

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
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
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.auth.User;

import java.util.HashMap;
import java.util.Map;

public class signup extends AppCompatActivity {
    Animation topAnim;
    ImageView login_logo;
    TextView dis, hello,alreadyaccBtn,google_btn;
    EditText regName, regEmail, regPassword, regPhone, confirmPass;
    Button regBtn;
    FirebaseAuth firebaseAuth;
    DatabaseReference reference;
    Users User;
    FirebaseFirestore fStore;
    String userID;
    GoogleSignInClient mGoogleSignInClient;
    private static int RC_SIGN_IN=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        //getSupportActionBar().hide();
        login_logo = findViewById(R.id.login_logo);
        dis = findViewById(R.id.discover);
        hello = findViewById(R.id.welcome);
        regName = findViewById(R.id.user_name);
        regEmail = findViewById(R.id.newemail);
        regPhone = findViewById(R.id.phone);
        regPassword = findViewById(R.id.newpassword);
        regBtn = findViewById(R.id.signup);
        google_btn = findViewById(R.id.google_btn);
        confirmPass = findViewById(R.id.confirmpassword);
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        login_logo.setAnimation(topAnim);
        dis.setAnimation(topAnim);
        hello.setAnimation(topAnim);
        alreadyaccBtn = findViewById(R.id.alreadyacc);
        firebaseAuth = FirebaseAuth.getInstance();
        reference = FirebaseDatabase.getInstance().getReference().child("Users");
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
        reference = FirebaseDatabase.getInstance().getReference().child("User");
        google_btn.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              signIn();
                                          }
                                      });
        alreadyaccBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(signup.this,Login.class);
                startActivity(i);
            }
        });
       regBtn.setOnClickListener(new android.view.View.OnClickListener() {
           @Override
           public void onClick(android.view.View view) {

                String ru= regName.getText().toString();
                String Email= regEmail.getText().toString();
                String Pass = regPassword.getText().toString();
                String cPass = confirmPass.getText().toString();
                String phone_no= regPhone.getText().toString();

                if (ru.isEmpty() && Email.isEmpty() && Pass.isEmpty() && cPass.isEmpty() && phone_no.isEmpty()){
                    Toast.makeText(signup.this, "All Fields Empty",Toast.LENGTH_SHORT).show();
                }
                else if(ru.isEmpty()){
                    Toast.makeText(signup.this, "Name Field Empty",Toast.LENGTH_SHORT).show();
                }
                else if(Email.isEmpty()){
                    Toast.makeText(signup.this, "Email Field Empty",Toast.LENGTH_SHORT).show();
                }
                else if (Pass.isEmpty()){
                    Toast.makeText(signup.this, "Password Field Empty",Toast.LENGTH_SHORT).show();
                }
                else if (cPass.isEmpty()){
                    Toast.makeText(signup.this, "Confirm Password Field Empty",Toast.LENGTH_SHORT).show();
                }
                else if (phone_no.isEmpty()){
                    Toast.makeText(signup.this, "Phone Field Empty",Toast.LENGTH_SHORT).show();
                }

                else{
                    firebaseAuth.createUserWithEmailAndPassword(Email,Pass).addOnCompleteListener(signup.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()) {
                                Toast.makeText(signup.this.getApplicationContext(), "Sign Up successfully " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                Users user = new Users(ru,Email,phone_no);
                                FirebaseDatabase.getInstance().getReference("Users")
                                        .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                        .setValue(user);
                                Intent intent = new Intent(signup.this, Login.class);
                                startActivity(intent);



                            } else {


                            }
                        }
                    });

                }
            }

        });
    }



    private void signIn() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
        Intent i  = new Intent(signup.this,home_screen.class);

    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent from GoogleSignInClient.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            // The Task returned from this call is always completed, no need to attach
            // a listener.
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            handleSignInResult(task);
        }
    }
    private void handleSignInResult(Task<GoogleSignInAccount> completedTask) {
        try {
            GoogleSignInAccount account = completedTask.getResult(ApiException.class);
            SharedPreferences.Editor editor = getSharedPreferences("SIGNED_IN", MODE_PRIVATE).edit();
            editor.putBoolean("isSignedIn", true);
            editor.commit();
            editor.apply();
            GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
            if (acct != null) {
                String personName = acct.getDisplayName();
                String personGivenName = acct.getGivenName();
                String personFamilyName = acct.getFamilyName();
                String personEmail = acct.getEmail();
                String personId = acct.getId();
                Uri personPhoto = acct.getPhotoUrl();
                if (personName != null) {
                    Toast.makeText(this, personName + " has signed in successfully.", Toast.LENGTH_SHORT).show();
                    regName.setText(personName);
                    editor.putString("userName", personName);
                } else if (personGivenName != null) {
                    regName.setText(personGivenName);
                    editor.putString("userName", personGivenName);
                    Toast.makeText(this, personGivenName + " has signed in successfully.",
                            Toast.LENGTH_SHORT).show();
                } else if (personEmail != null) {
                    Toast.makeText(this, personEmail + " has signed in successfully.", Toast.LENGTH_SHORT).show();
                }
                if (personEmail != null) {
                    editor.putString("userEmail", personEmail);
                    regEmail.setText(personEmail);
                }

                editor.commit();
                editor.apply();

            // Toast.makeText(this,"user email:"+personEmail,Toast.LENGTH_SHORT).show();
        }
            startActivity(new Intent(signup.this,home_screen.class));


            // Signed in successfully, show authenticated UI.

        } catch (ApiException e) {
            // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.

            Log.i("e",e.getMessage());
        }
    }
    }


