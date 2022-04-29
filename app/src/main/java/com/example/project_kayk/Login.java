

package com.example.project_kayk;

        import androidx.appcompat.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.WindowManager;
        import android.view.animation.Animation;
        import android.view.animation.AnimationUtils;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.TextView;
        import com.google.android.material.textfield.*;

public class Login extends AppCompatActivity {
     Button login_btn;
     ImageView image;
     TextView logoText, sloganText,callSignUp, forgotpassword;
     TextInputLayout username,password;
    Animation topAnim, bottomAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        callSignUp = findViewById(R.id.newuser);
        login_btn = findViewById(R.id.log);
        image = findViewById(R.id.login_logo);
        logoText = findViewById(R.id.logo_lg);
        sloganText = findViewById(R.id.cont);
        forgotpassword=findViewById(R.id.fp);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        image.setAnimation(topAnim);
        logoText.setAnimation(topAnim);
        sloganText.setAnimation(topAnim);
        callSignUp.setOnClickListener((view) ->
        {

            Intent intent = new Intent(Login.this, signup.class);
            startActivity(intent);
        } );
        login_btn.setOnClickListener((view) ->
        {

            Intent intent = new Intent(Login.this, home_screen.class);
            startActivity(intent);
        } );


    }
}
