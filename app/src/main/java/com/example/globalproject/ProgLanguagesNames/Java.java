package com.example.globalproject.ProgLanguagesNames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.globalproject.MainActivity;
import com.example.globalproject.ProgLanguagesNames.Lessons.LessonJa;
import com.example.globalproject.ProgLanguagesNames.Lessons.LessonsPy;
import com.example.globalproject.R;

public class Java extends AppCompatActivity {
    private Button Ja1;
    private Button Ja2;
    private Button Ja3;
    private Button Ja4;
    private Button Ja5;
    private Button Ja6;
    private Button Ja7;
    private Button Ja8;
    private Button Ja9;
    private Button Ja10;
    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        Ja1 = findViewById(R.id.JA1);
        Ja1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJa1();
            }
        });
        Ja2 = findViewById(R.id.JA2);
        Ja2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJa2();
            }
        });
        Ja3 = findViewById(R.id.JA3);
        Ja3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJa3();
            }
        });
        Ja4 = findViewById(R.id.lessonJa4);
        Ja4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openja4();
            }
        });
        Ja5 = findViewById(R.id.lessonJa5);
        Ja5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJa5();
            }
        });
        Ja6 = findViewById(R.id.lessonJa6);
        Ja6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJa6();
            }
        });
        Ja7 = findViewById(R.id.lessonJa7);
        Ja7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJa7();
            }
        });
        Ja8 = findViewById(R.id.lessonJa8);
        Ja8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJa8();
            }
        });
        Ja9 = findViewById(R.id.lessonJa9);
        Ja9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJa9();
            }
        });
        exit = findViewById(R.id.exitJa);
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
    public void openJa1(){
        Intent intent = new Intent(this, LessonJa.class);
        intent.putExtra("A", "lessonJa_1");
        startActivity(intent);
    }
    public void openJa2(){
        Intent intent = new Intent(this, LessonJa.class);
        intent.putExtra("mySpecialTag", "lessonJa_2");
        startActivity(intent);
    }
    public void openJa3(){
        Intent intent = new Intent(this, LessonJa.class);
        intent.putExtra("mySpecialTag", "lessonJa_3");
        startActivity(intent);
    }
    public void openja4(){
        Intent intent = new Intent(this, LessonJa.class);
        intent.putExtra("mySpecialTag", "lessonJa_4");
        startActivity(intent);
    }
    public void openJa5(){
        Intent intent = new Intent(this, LessonJa.class);
        intent.putExtra("mySpecialTag", "lessonJa_5");
        startActivity(intent);
    }
    public void openJa6(){
        Intent intent = new Intent(this, LessonJa.class);
        intent.putExtra("mySpecialTag", "lessonJa_6");
        startActivity(intent);
    }
    public void openJa7(){
        Intent intent = new Intent(this, LessonJa.class);
        intent.putExtra("mySpecialTag", "lessonJa_7");
        startActivity(intent);
    }
    public void openJa8(){
        Intent intent = new Intent(this, LessonJa.class);
        intent.putExtra("mySpecialTag", "lessonJa_8");
        startActivity(intent);
    }
    public void openJa9(){
        Intent intent = new Intent(this, LessonJa.class);
        intent.putExtra("mySpecialTag", "lessonJa_9");
        startActivity(intent);
    }
}