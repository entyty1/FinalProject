package com.example.globalproject.ProgLanguagesNames.Lessons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.example.globalproject.R;

public class LessonJa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_ja);
        TextView textView = (TextView) findViewById(R.id.text);
        TextView t2 = (TextView) findViewById(R.id.linkja1);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        getIntent().getStringExtra("mySpecialTag");
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonJa_2")){
                    textView.setText(getString(R.string.lessonja_2));
                    t2.setText(R.string.lessonjalink2);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonJa_3")){
                    textView.setText(getString(R.string.lessonja_3));
                    t2.setText(R.string.lessonjalink3);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonJa_4")){
                    textView.setText(getString(R.string.lessonJA_4));
                    t2.setText(R.string.lessonjalink4);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonJa_5")){
                    textView.setText(getString(R.string.lessonja_5));
                    t2.setText(R.string.lessonjalink5);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonJa_6")){
                    textView.setText(getString(R.string.lessonja_6));
                    t2.setText(R.string.lessonjalink6);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonJa_7")){
                    textView.setText(getString(R.string.lessonja_7));
                    t2.setText(R.string.lessonjalink7);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonJa_8")){
                    textView.setText(getString(R.string.lessonja_8));
                    t2.setText(R.string.lessonjalink8);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }
        if (getIntent() != null){
            if (getIntent().hasExtra("mySpecialTag")){
                String selectedOption = getIntent().getStringExtra("mySpecialTag");
                if (selectedOption.equals("lessonJa_9")){
                    textView.setText(getString(R.string.lessonja_9));
                    t2.setText(R.string.lessonjalink9);
                    t2.setMovementMethod(LinkMovementMethod.getInstance());

                }
            }
        }
    }
}