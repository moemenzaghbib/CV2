package com.example.cv2;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        val NEXT = findViewById<Button>(R.id.Next1Button);


        NEXT.setOnClickListener(){
            val intent = Intent(this, FinalActivity::class.java).apply{

            }
          startActivity(intent);
        }



    }}
