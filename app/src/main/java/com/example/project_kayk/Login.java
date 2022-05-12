

package com.example.project_kayk;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.text.TextUtils;
        import android.util.Log;
        import android.util.Patterns;
        import android.view.View;
        import android.view.WindowManager;
        import android.view.animation.Animation;
        import android.view.animation.AnimationUtils;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;
        import com.google.android.gms.tasks.OnCompleteListener;
        import com.google.android.material.textfield.*;
        import com.google.firebase.FirebaseApp;
        import com.google.firebase.auth.AuthResult;
        import com.google.firebase.auth.FirebaseAuth;
        import com.google.firebase.database.DataSnapshot;
        import com.google.firebase.database.DatabaseError;
        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;
        import com.google.firebase.database.ValueEventListener;
        import com.google.firebase.database.annotations.NotNull;
        import com.google.android.gms.tasks.OnCompleteListener;
        import com.google.android.gms.tasks.Task;
        import com.google.firebase.auth.AuthResult;
        import com.google.firebase.auth.FirebaseAuth;


public class Login extends AppCompatActivity {
     Button login_btn;
     ImageView image;
     TextView logoText, sloganText,callSignUp, forgotpassword;
     EditText useremail,password;
     Animation topAnim, bottomAnim;
    FirebaseAuth fAuth;
    String Name;
    DatabaseReference firebaseDatabase;
    private FirebaseAuth.AuthStateListener authStateListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        callSignUp = findViewById(R.id.newuser);
        login_btn = findViewById(R.id.log);
        image = findViewById(R.id.login_logo);
        logoText = findViewById(R.id.logo_lg);
        sloganText = findViewById(R.id.cont);
        forgotpassword=findViewById(R.id.fp);
        useremail = findViewById(R.id.userlogin);
        password = findViewById(R.id.passlogin);
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        image.setAnimation(topAnim);
        logoText.setAnimation(topAnim);
        sloganText.setAnimation(topAnim);
        fAuth= FirebaseAuth.getInstance();
        FirebaseApp.initializeApp(this);
        callSignUp.setOnClickListener(view -> {
            Intent i = new Intent(Login.this,signup.class);
            startActivity(i);
            finish();
        });
        forgotpassword.setOnClickListener(view -> {
            Intent i = new Intent(Login.this, ForgotPassword.class);
            startActivity(i);
        });
    login_btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String userEmail = useremail.getText().toString();
        String userPaswd = password.getText().toString();
        if (userEmail.isEmpty())
        {
            useremail.setError("Empty");
            useremail.requestFocus();
        }
        else if (userPaswd.isEmpty())
        {
            password.setError("Enter Password!");
            password.requestFocus();
        } else if (userEmail.isEmpty() && userPaswd.isEmpty())
        {
            Toast.makeText(Login.this, "Fields Empty!", Toast.LENGTH_SHORT).show();
        }
        else if (userPaswd.length() <= 8) {
            password.setError("Password should be greater equal to 8");
            password.requestFocus();
        }
        else if (!(userEmail.isEmpty() && userPaswd.isEmpty()))
        {
            fAuth.signInWithEmailAndPassword(userEmail, userPaswd).addOnCompleteListener(Login.this, new OnCompleteListener()
            {
                @Override
                public void onComplete(@NonNull Task task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(Login.this,"Login Successfully...",Toast.LENGTH_LONG);
                        Intent intent = new Intent(Login.this, home_screen.class);
                        startActivity(intent);
                    }
                    else {
                        //Redirect to login page
                        Toast.makeText(Login.this, "Fail to Login! TRY AGAIN", Toast.LENGTH_LONG).show();

                    }
                }
            });
        } else {
            Toast.makeText(Login.this, "Error", Toast.LENGTH_SHORT).show();
        }




    }

});
    }

}
