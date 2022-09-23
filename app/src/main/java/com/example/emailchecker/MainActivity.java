package com.example.emailchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void emailing(View view) {
        EditText Email = findViewById(R.id.editTextTextEmailAddress);
        TextView result = findViewById(R.id.textView2);
        if (Email.getText().toString().contains("@"))
            result.setText("VALID");
        else
            result.setText("INVALID");

    }
}
