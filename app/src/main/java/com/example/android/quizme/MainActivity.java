package com.example.android.quizme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initQuestions();
    }

    String[][] myStringArray;

    private void initQuestions(){
        myStringArray = new String[][] {
                {getString(R.string.question_text0),getString(R.string.q0_answerA),getString(R.string.q0_answerB),getString(R.string.q0_answerC),getString(R.string.q0_answerD)},
                {getString(R.string.question_text1),getString(R.string.q1_answerA),getString(R.string.q1_answerB),getString(R.string.q1_answerC),getString(R.string.q1_answerD)},
                {getString(R.string.question_text2),getString(R.string.q2_answerA),getString(R.string.q2_answerB),getString(R.string.q2_answerC),getString(R.string.q2_answerD)},
                {getString(R.string.question_text3),getString(R.string.q3_answerA),getString(R.string.q3_answerB),getString(R.string.q3_answerC),getString(R.string.q3_answerD)}
        };
    }

    public void onClick(View view) {
        questionSetup(0,1);
    }

    private void questionSetup(int questionNumber, int type){


        TextView questionView = (TextView) findViewById(R.id.question_view);
        TextView questionTextView = (TextView) findViewById(R.id.question_textview);
        CheckBox answerViewA = (CheckBox) findViewById(R.id.answerA);
        CheckBox answerViewB = (CheckBox) findViewById(R.id.answerB);
        CheckBox answerViewC = (CheckBox) findViewById(R.id.answerC);
        CheckBox answerViewD = (CheckBox) findViewById(R.id.answerD);

        questionView.setText(getString(R.string.question_header) + " " + (questionNumber+1));
        questionTextView.setText(myStringArray[questionNumber][0]);
        answerViewA.setText(myStringArray[questionNumber][1]);
        answerViewB.setText(myStringArray[questionNumber][2]);
        answerViewC.setText(myStringArray[questionNumber][3]);
        answerViewD.setText(myStringArray[questionNumber][4]);

    }



}
