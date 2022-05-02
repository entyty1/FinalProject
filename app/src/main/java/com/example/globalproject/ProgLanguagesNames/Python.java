package com.example.globalproject.ProgLanguagesNames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.globalproject.MainActivity;
import com.example.globalproject.ProgLanguagesNames.Lessons.LessonsPy;
import com.example.globalproject.R;

public class Python extends AppCompatActivity {
    private Button Py1;
    private Button Py2;
    private Button Py3;
    private Button Py4;
    private Button Py5;
    private Button Py6;
    private Button Py7;
    private Button Py8;
    private Button Py9;
    private Button Py10;
    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);

        Py1 = findViewById(R.id.PY1);
        Py1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPy1();
            }
        });
        Py2 = findViewById(R.id.PY2);
        Py2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPy2();
            }
        });
        Py3 = findViewById(R.id.PY3);
        Py3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPy3();
            }
        });
        Py4 = findViewById(R.id.lessonPy4);
        Py4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPy4();
            }
        });
        Py5 = findViewById(R.id.lessonPy5);
        Py5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPy5();
            }
        });
        Py6 = findViewById(R.id.lessonPy6);
        Py6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPy6();
            }
        });
        Py7 = findViewById(R.id.lessonPy7);
        Py7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPy7();
            }
        });
        Py8 = findViewById(R.id.lessonPy8);
        Py8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPy8();
            }
        });
        Py9 = findViewById(R.id.lessonPy9);
        Py9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPy9();
            }
        });
        exit = findViewById(R.id.exitPy);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exittomain();
            }
        });
    }
    public void exittomain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openPy1(){
        Intent intent = new Intent(this, LessonsPy.class);
        intent.putExtra("A", "lessonpy1");
        startActivity(intent);
    }
    public void openPy2(){
        Intent intent = new Intent(this, LessonsPy.class);
        intent.putExtra("mySpecialTag", "lessonPy_2");
        startActivity(intent);
    }
    public void openPy3(){
        Intent intent = new Intent(this, LessonsPy.class);
        intent.putExtra("mySpecialTag", "lessonPy_3");
        startActivity(intent);
    }
    public void openPy4(){
        Intent intent = new Intent(this, LessonsPy.class);
        intent.putExtra("mySpecialTag", "lessonPy_4");
        startActivity(intent);
    }
    public void openPy5(){
        Intent intent = new Intent(this, LessonsPy.class);
        intent.putExtra("mySpecialTag", "lessonPy_5");
        startActivity(intent);
    }public void openPy6(){
        Intent intent = new Intent(this, LessonsPy.class);
        intent.putExtra("mySpecialTag", "lessonPy_6");
        startActivity(intent);
    }
    public void openPy7(){
        Intent intent = new Intent(this, LessonsPy.class);
        intent.putExtra("mySpecialTag", "lessonPy_7");
        startActivity(intent);
    }
    public void openPy8(){
        Intent intent = new Intent(this, LessonsPy.class);
        intent.putExtra("mySpecialTag", "lessonPy_8");
        startActivity(intent);
    }public void openPy9(){
        Intent intent = new Intent(this, LessonsPy.class);
        intent.putExtra("mySpecialTag", "lessonPy_9");
        startActivity(intent);
    }



}