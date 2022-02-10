package edu.temple.signupform

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val saveBtn = findViewById<Button>(R.id.saveBtn);
        saveBtn.setOnClickListener {
            val fullname = findViewById<EditText>(R.id.fullname);
            val email = findViewById<EditText>(R.id.email);
            val password = findViewById<EditText>(R.id.password);
            val passwordTwo = findViewById<EditText>(R.id.passwordTwo);

            if (fullname.text.isEmpty() || email.text.isEmpty() || password.text.isEmpty() || passwordTwo.text.isEmpty()) {
                if (fullname.text.isEmpty()){
                    fullname.error = "Cannot be blank";
                }
                if (email.text.isEmpty()){
                    email.error = "Cannot be blank";
                }
                if (password.text.isEmpty()){
                    password.error = "Cannot be blank";
                }
                if (passwordTwo.text.isEmpty()){
                    passwordTwo.error = "Cannot be blank";
                }
            }
            if (!password.text.toString().equals(passwordTwo.text.toString())){
                password.error = "Passwords do not match";
                passwordTwo.error = "Passwords do not match";
            }
            else {
                Toast.makeText(
                    getApplicationContext(),
                    "Hi " + fullname.text + "! Welcome to the app.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}