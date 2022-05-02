package com.example.globalproject.ProgLanguagesNames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.globalproject.MainActivity;
import com.example.globalproject.ProgLanguagesNames.Lessons.LessonC;
import com.example.globalproject.ProgLanguagesNames.Lessons.LessonsPy;
import com.example.globalproject.R;

public class C extends AppCompatActivity {
    private Button C1;
    private Button C2;
    private Button C3;
    private Button C4;
    private Button C5;
    private Button C6;
    private Button C7;
    private Button C8;
    private Button C9;
    private Button C10;
    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        C1 = findViewById(R.id.LessonC1);
        C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openC1();
            }
        });
        C2 = findViewById(R.id.LessonC2);
        C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openC2();
            }
        });
        C3 = findViewById(R.id.LessonC3);
        C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openC3();
            }
        });
        C4 = findViewById(R.id.lessonС4);
        C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openC4();
            }
        });
        C5 = findViewById(R.id.lessonС5);
        C5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openC5();
            }
        });
        C6 = findViewById(R.id.lessonС6);
        C6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openC6();
            }
        });
        C7 = findViewById(R.id.lessonС7);
        C7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openC7();
            }
        });
        C8 = findViewById(R.id.lessonС8);
        C8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openC8();
            }
        });
        C9 = findViewById(R.id.lessonС9);
        C9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openC9();
            }
        });
        exit = findViewById(R.id.exitС);
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
    public void openC1(){
        Intent intent = new Intent(this, LessonC.class);
        intent.putExtra("A", "lessonC_1");
        startActivity(intent);
    }
    public void openC2(){
        Intent intent = new Intent(this, LessonC.class);
        intent.putExtra("mySpecialTag", "lessonC_2");
        startActivity(intent);
    }
    public void openC3(){
        Intent intent = new Intent(this, LessonC.class);
        intent.putExtra("mySpecialTag", "lessonC_3");
        startActivity(intent);
    }
    public void openC4(){
        Intent intent = new Intent(this, LessonC.class);
        intent.putExtra("mySpecialTag", "lessonC_4");
        startActivity(intent);
    }
    public void openC5(){
        Intent intent = new Intent(this, LessonC.class);
        intent.putExtra("mySpecialTag", "lessonC_5");
        startActivity(intent);
    }
    public void openC6(){
        Intent intent = new Intent(this, LessonC.class);
        intent.putExtra("mySpecialTag", "lessonC_6");
        startActivity(intent);
    }
    public void openC7(){
        Intent intent = new Intent(this, LessonC.class);
        intent.putExtra("mySpecialTag", "lessonC_7");
        startActivity(intent);
    }
    public void openC8(){
        Intent intent = new Intent(this, LessonC.class);
        intent.putExtra("mySpecialTag", "lessonC_8");
        startActivity(intent);
    }
    public void openC9(){
        Intent intent = new Intent(this, LessonC.class);
        intent.putExtra("mySpecialTag", "lessonC_9");
        startActivity(intent);
    }


}
