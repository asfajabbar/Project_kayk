package com.example.project_kayk.menu_fragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.project_kayk.Login;
import com.example.project_kayk.MainActivity;
import com.example.project_kayk.R;
import com.example.project_kayk.User_feedback;
import com.example.project_kayk.Users;
import com.example.project_kayk.home_screen;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.ktx.Firebase;

import java.util.Timer;
import java.util.TimerTask;

public class feedback_fragment extends AppCompatActivity {
    ImageView closebtn;
    EditText feedback, user;
    Button submit_button;
    FirebaseDatabase database;
    Timer timer;
    User_feedback users;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_fragment);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();
        closebtn = findViewById(R.id.close_btn);
        feedback = findViewById(R.id.feedback);
        user = findViewById(R.id.enter_name);
        submit_button = findViewById(R.id.submitbtn);
        database = FirebaseDatabase.getInstance();
        reference = FirebaseDatabase.getInstance().getReference().child("Feedback");
       User_feedback userFeedback = new User_feedback();
        closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(feedback_fragment.this, home_screen.class);
                startActivity(i);
            }
        });
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String feed = feedback.getText().toString().trim();
                String u = user.getText().toString().trim();
                if (TextUtils.isEmpty(feed) && (TextUtils.isEmpty(u))) {
                    Toast.makeText(feedback_fragment.this, "All Fields Empty", Toast.LENGTH_SHORT).show();
                } else {
                          userFeedback.setFeedback(feed);
                          userFeedback.setUsername(u);
                          reference.push().setValue(userFeedback);
                    Toast.makeText(feedback_fragment.this, "Submitted", Toast.LENGTH_SHORT).show();
                    timer = new Timer();
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Intent intent = new Intent(feedback_fragment.this, home_screen.class);
                            startActivity(intent);
                            finish();
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        }
                    }, 1000);


                }
            }
        });
    }
}
