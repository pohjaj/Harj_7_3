package com.example.harj_7_3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    EditText editText;
    //EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);

    }
    public void sendMessage(View view){
        String message;
        message = editText.getText().toString();
        text.setText(message);
    }
}