package com.example.globalproject.ProgLanguagesNames.Lessons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.widget.TextView;

import com.example.globalproject.R;

public class LessonC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_c);
        TextView textView = (TextView) findViewById(R.id.text);
        TextView t2 = (TextView) findViewById(R.id.linkс1);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        getIntent().getStringExtra("mySpecialTag");
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonC_2")){
                    textView.setText(getString(R.string.lessonc_2));
                    t2.setText(R.string.lessonclink2);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());

                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonC_3")){
                    textView.setText(getString(R.string.lessonc_3));
                    t2.setText(R.string.lessonclink3);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonC_4")){
                    textView.setText(getString(R.string.lessonc_4));
                    t2.setText(R.string.lessonclink4);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonC_5")){
                    textView.setText(getString(R.string.lessonc_5));
                    t2.setText(R.string.lessonclink5);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonC_6")){
                    textView.setText(getString(R.string.lessonc_6));
                    t2.setText(R.string.lessonclink6);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonC_7")){
                    textView.setText(getString(R.string.lessonc_7));
                    t2.setText(R.string.lessonclink7);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonC_8")){
                    textView.setText(getString(R.string.lessonc_8));
                    t2.setText(R.string.lessonclink8);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonC_9")){
                    textView.setText(getString(R.string.lessonc_9));
                    t2.setText(R.string.lessonclink9);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }

    }
}