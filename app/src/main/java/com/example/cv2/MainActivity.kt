package com.example.cv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.TextView
import androidx.core.widget.doAfterTextChanged
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val FULLNAME = findViewById<TextInputEditText>(R.id.FullNameInput) as TextInputEditText;
        val AGE = findViewById<TextInputEditText>(R.id.AgeInput) as TextInputEditText;
        val EAMIL = findViewById<TextInputEditText>(R.id.EmailInput) as TextInputEditText;
        val NEXT_Button = findViewById<Button>(R.id.NextButton) as Button;
        val ErrorFullName = findViewById<TextView>(R.id.ErrorFullName) as TextView;
        val ErrorAge = findViewById<TextView>(R.id.ErrorAge) as TextView;
        val ErrorEmail = findViewById<TextView>(R.id.EmailError) as TextView;




        FULLNAME.doAfterTextChanged {
            FULLNAME.setError("Must not be empty !");
            ErrorFullName.setText("Must not be empty !");
        }
        NEXT_Button.setOnClickListener() {
            ErrorFullName.setText("");
            FULLNAME.setError(null);
            ErrorAge.setText("");
            ErrorEmail.setText("");


            if (FULLNAME.text.toString() == "") {
                FULLNAME.setError("Must not be empty !");
                ErrorFullName.setText("Must not be empty !");


            }
            else if (EAMIL.text.toString() == "") {
                EAMIL.setError("Must not be empty !");
                ErrorEmail.setText("Must not be empty !");


            }
            else if (AGE.text.toString() == "") {
                AGE.setError("Must not be empty !");
                ErrorAge.setText("Must not be empty !");


            }
            else {
                var EAMILData = EAMIL.text.toString();
                var FULLNAMEData = FULLNAME.text.toString();
                var AGEData = AGE.text.toString();
                var EMAIL = "EMAIL";
                var FN = "FN";
                var A = "AGE";

                val intent = Intent(this, SecondActivity::class.java).apply {



                }
                startActivity(intent);

            }
        }}
}
