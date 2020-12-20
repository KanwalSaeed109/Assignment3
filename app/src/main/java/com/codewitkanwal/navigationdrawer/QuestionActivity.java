package com.codewitkanwal.navigationdrawer;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class QuestionActivity extends AppCompatActivity {

    Button ans1,ans2,ans3,ans4,finish;
    TextView score,question;
    private Questions ques=new Questions();
    private String answers;
    private int marks=0;
    private int quesLength=ques.questions.length;
    ArrayList<Integer> arr=new ArrayList<Integer>();
    int num=0;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        ans1=findViewById(R.id.ans1);
        ans2=findViewById(R.id.ans2);
        ans3=findViewById(R.id.ans3);
        ans4=findViewById(R.id.ans4);
        score=findViewById(R.id.score);
        question=findViewById(R.id.question);
        finish=findViewById(R.id.finish);

        arr.add(new Integer(1));
        arr.add(new Integer(2));
        arr.add(new Integer(3));
        arr.add(new Integer(4));
        arr.add(new Integer(5));
        arr.add(new Integer(6));
        arr.add(new Integer(7));
        arr.add(new Integer(8));
        arr.add(new Integer(9));
        arr.add(new Integer(10));
        Collections.shuffle(arr);


        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameOver();
            }
        });
        score.setText("Score: "+ marks);

        updateQues();

        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans1.getText()==answers){
                    marks++;
                    score.setText("Score: "+ marks);
                    updateQues();
                }
                else if(ans1.getText()!=answers){
                    score.setText("Score: "+ marks);
                    updateQues();
                }
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans2.getText()==answers){
                    marks++;
                    score.setText("Score: "+ marks);
                    updateQues();
                }
                else if(ans2.getText()!=answers){
                    score.setText("Score: "+ marks);
                    updateQues();
                }

            }
        });
        ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans3.getText()==answers){
                    marks++;
                    score.setText("Score: "+ marks);
                    updateQues();
                }
                else if(ans3.getText()!=answers){
                    score.setText("Score: "+ marks);
                    updateQues();
                }

            }
        });
        ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans4.getText()==answers){
                    marks++;
                    score.setText("Score: "+ marks);
                    updateQues();
                }
                else if(ans4.getText()!=answers){
                    score.setText("Score: "+ marks);
                    updateQues();
                }

            }
        });
    }

    private void gameOver() {
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(QuestionActivity.this);
        alertDialogBuilder.setMessage("Your score is "+ marks + " points.")
        .setCancelable(false)
        .setPositiveButton("New Game",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(),QuestionActivity.class));
                        finish();
                    }
                })
                .setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();
    }

    private void updateQues() {
        if (count < 10){
            int i = arr.get(num);
            question.setText(ques.getQuestion(i));
            ans1.setText(ques.getChoice1(i));
            ans2.setText(ques.getChoice2(i));
            ans3.setText(ques.getChoice3(i));
            ans4.setText(ques.getChoice4(i));

            answers = ques.getAns(i);
            count++;
            num++;
        }
        else{
            gameOver();
        }

    }


}