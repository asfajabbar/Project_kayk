package com.example.project_kayk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class verify_phone extends AppCompatActivity {
    ImageView opt_image;
    Animation topAnim;
    EditText code1,code2,code3,code4,code5,code6;
    TextView resent;
    Button verify;
    Boolean optvalid=true;
    FirebaseAuth firebaseAuth;
    PhoneAuthCredential phoneAuthCredential;
    PhoneAuthProvider.ForceResendingToken token;
    String verificationId;
    String phone;
    PhoneAuthProvider.OnVerificationStateChangedCallbacks callbacks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_phone);
        opt_image= findViewById(R.id.code_image);
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        opt_image.setAnimation(topAnim);
        Intent data = getIntent();
        phone = data.getStringExtra("phone");
        code1= findViewById(R.id.code1);
        code2= findViewById(R.id.code2);
        code3= findViewById(R.id.code3);
        code4= findViewById(R.id.code4);
        code5= findViewById(R.id.code5);
        code6= findViewById(R.id.code6);
        resent = findViewById(R.id.resend_btn);
        verify = findViewById(R.id.verify_btn);
        firebaseAuth = FirebaseAuth.getInstance();
        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateField(code1);
                validateField(code2);
                validateField(code3);
                validateField(code4);
                validateField(code5);
                validateField(code6);

                if(optvalid)
                {
                    String otp = code1.getText().toString() + code2.getText().toString() +
                            code3.getText().toString() + code4.getText().toString() +
                            code5.getText().toString() + code6.getText().toString();
                    PhoneAuthCredential credential = PhoneAuthProvider.getCredential(verificationId,otp);
                    verifyAuthentication(credential);

                }
            }
        });
        callbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
            @Override
            public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                super.onCodeSent(s, forceResendingToken);
                verificationId=s;
                token = forceResendingToken;
                resent.setVisibility(View.GONE);
            }

            @Override
            public void onCodeAutoRetrievalTimeOut(@NonNull String s) {
                super.onCodeAutoRetrievalTimeOut(s);
                resent.setVisibility(View.VISIBLE);
            }

            @Override
            public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                verifyAuthentication(phoneAuthCredential);
                resent.setVisibility(View.GONE);

            }

            @Override
            public void onVerificationFailed(@NonNull FirebaseException e) {
                Toast.makeText(verify_phone.this,"OTP Verification Failed",Toast.LENGTH_SHORT).show();
            }
        };

        sendOTP(phone);

        resent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resendOTP(phone);
            }
        });



    }


    public void validateField(EditText field)
    {
        if(field.getText().toString().isEmpty())
        {
            field.setError("Required");
        }
        else optvalid= true;
    }

    public void verifyAuthentication(PhoneAuthCredential credential) {
        firebaseAuth.getCurrentUser().linkWithCredential(credential).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                Toast.makeText(verify_phone.this,"Account Created and Linked",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void sendOTP(String phoneNumber)
    {
        PhoneAuthProvider.getInstance().verifyPhoneNumber(phoneNumber,60, TimeUnit.SECONDS,this,callbacks);

    }
    public void resendOTP(String phoneNumber)
    {
        PhoneAuthProvider.getInstance().verifyPhoneNumber(phoneNumber,60, TimeUnit.SECONDS,this,callbacks,token);

    }
}