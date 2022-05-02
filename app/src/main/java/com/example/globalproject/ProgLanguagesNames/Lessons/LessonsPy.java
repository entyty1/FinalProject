package com.example.globalproject.ProgLanguagesNames.Lessons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.globalproject.R;

public class LessonsPy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_py);
        TextView textView = (TextView) findViewById(R.id.text);
        TextView t2 = (TextView) findViewById(R.id.linkpy1);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        getIntent().getStringExtra("mySpecialTag");
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonPy_2")){
                    textView.setText(getString(R.string.lesson2_py));
                    t2.setText(R.string.lessonpylink2);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonPy_3")){
                    textView.setText(getString(R.string.lessonpy_3));
                    t2.setText(R.string.lessonpylink3);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonPy_4")){
                    textView.setText(getString(R.string.lessonpy_4));
                    t2.setText(R.string.lessonpylink4);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonPy_5")){
                    textView.setText(getString(R.string.lessonpy_5));
                    t2.setText(R.string.lessonpylink5);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonPy_6")){
                    textView.setText(getString(R.string.lessonpy_6));
                    t2.setText(R.string.lessonpylink6);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonPy_7")){
                    textView.setText(getString(R.string.lessonpy_7));
                    t2.setText(R.string.lessonpylink7);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonPy_8")){
                    textView.setText(getString(R.string.lessonpy_8));
                    t2.setText(R.string.lessonpylink8);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonPy_9")){
                    textView.setText(getString(R.string.lessonpy_9));
                    t2.setText(R.string.lessonpylink9);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
    }
}