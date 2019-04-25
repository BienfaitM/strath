package com.example.mystrath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class menu extends AppCompatActivity {
    public TextView mUsername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mUsername = findViewById(R.id.username_textview);

        String user_name = getIntent().getStringExtra("user_info");

        mUsername.setText(user_name);



    }
}
