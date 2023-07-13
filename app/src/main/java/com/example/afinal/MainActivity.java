package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //Done by Diego
    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button ansA, ansB, ansC, ansD;
    Button submitBtn;

    int score=0;
    int totalQuestion = Question.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.Ans_a);
        ansB = findViewById(R.id.Ans_b);
        ansC = findViewById(R.id.Ans_c);
        ansD = findViewById(R.id.Ans_d);
        submitBtn = findViewById(R.id.submit_button);

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);

        loadNewQuestion();

    }

    @Override
    public void onClick(View view) {

        ansA.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#434343")));
        ansB.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#434343")));
        ansC.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#434343")));
        ansD.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#434343")));

        Button clickedButton = (Button) view;
        if (clickedButton.getId() == R.id.submit_button) {
            if (selectedAnswer.equals(Question.answers[currentQuestionIndex])) {
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();
        } else {
            selectedAnswer = clickedButton.getText().toString();
            clickedButton.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#878CFF")));
        }

        submitBtn.setEnabled(!selectedAnswer.isEmpty());
        if (currentQuestionIndex == totalQuestion) {
            submitBtn.setEnabled(false);
        }
    }
    void loadNewQuestion() {
        if (currentQuestionIndex == totalQuestion) {
            finishQuiz();
            return;
        }

        questionTextView.setText(Question.question[currentQuestionIndex]);
        ansA.setText(Question.choices[currentQuestionIndex][0]);
        ansB.setText(Question.choices[currentQuestionIndex][1]);
        ansC.setText(Question.choices[currentQuestionIndex][2]);
        ansD.setText(Question.choices[currentQuestionIndex][3]);

        selectedAnswer = "";
        submitBtn.setEnabled(!selectedAnswer.isEmpty());
    }
    void finishQuiz(){
        float resultadoF = ((float) score / 5) * 100;
        Intent intent = new Intent(MainActivity.this, Resultado.class);
        intent.putExtra("resultado", resultadoF);
        startActivity(intent);
    }

    void restartQuiz(){
        score = 0;
        currentQuestionIndex =0;
        loadNewQuestion();
    }

}