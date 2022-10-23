package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edittext1 = findViewById(R.id.edittext1);
EditText edittext2 = findViewById(R.id.edittext2);
Button button1 = findViewById(R.id.button1);
TextView textview2 = findViewById(R.id.textview2);

button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String a = edittext1.getText().toString();
        String b = edittext2.getText().toString();
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
int z = x + y;
textview2.setText(z + "Result");

    }
});
    }
}