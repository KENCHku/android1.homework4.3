package com.example.android1homework43;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cities_Activity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "button";
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities_);

        Intent intent = getIntent();
        String text = intent.getStringExtra(EXTRA_TEXT);

        editText = findViewById(R.id.editTextText);

        button = findViewById(R.id.button);
        editText.setText(text.trim());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendFirstActivity();
            }
        });

    }


    public void sendFirstActivity() {
        String messageText = editText.getText().toString();
        Intent intent = new Intent();
        intent.putExtra(MainActivity.EXTRA_TEXT1, messageText);
        setResult(RESULT_OK, intent);
        finish();
    }
}