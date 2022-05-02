package com.example.globalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.globalproject.ProgLanguagesNames.C;
import com.example.globalproject.ProgLanguagesNames.Java;
import com.example.globalproject.ProgLanguagesNames.Python;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button butt;
    private Button buttt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butt = (Button) findViewById(R.id.button1);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openjava();
            }
        });
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPython();
            }
        });
        buttt = (Button) findViewById(R.id.button2);
        buttt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openC();
            }
        });
    }
    public void openPython(){
        Intent intent = new Intent(this, Python.class);
        startActivity(intent);
    }
    public void openjava(){
        Intent intent = new Intent(this, Java.class);
        startActivity(intent);
    }
    public void openC(){
        Intent intent = new Intent(this, C.class);
        startActivity(intent);
    }

}