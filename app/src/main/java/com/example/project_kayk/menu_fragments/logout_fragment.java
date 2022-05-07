package com.example.project_kayk.menu_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.project_kayk.Login;
import com.example.project_kayk.R;
import com.example.project_kayk.signup;
import com.google.firebase.auth.FirebaseAuth;

public class logout_fragment extends AppCompatActivity{
    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        firebaseAuth= FirebaseAuth.getInstance();
        firebaseAuth.signOut();
        signOutUser();
        //setContentView(R.layout.activity_login);
    }

    private void signOutUser() {
        Intent i = new Intent(logout_fragment.this, Login.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(i);
        Toast.makeText(getApplication(), "Logged out successfully ", Toast.LENGTH_SHORT).show();

        finish();

    }
}