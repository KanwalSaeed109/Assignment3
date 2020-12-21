package com.codewitkanwal.navigationdrawer;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class QuestionActivity extends AppCompatActivity {

    TextView countdown,quesNum,ques;
    Button ch1,ch2,ch3,ch4,next;
    CountDownTimer tm;
    View v;
    boolean isClicked = false;
    String txt;
    int counter,qIndex;
    Questions q;
    int correct=0,wrong=0;
    ArrayList<Questions> arr=new ArrayList<Questions>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        countdown=findViewById(R.id.timer);
        quesNum=findViewById(R.id.qNum);
        ques=findViewById(R.id.question);
        ch1=findViewById(R.id.ans1);
        ch2=findViewById(R.id.ans2);
        ch3=findViewById(R.id.ans3);
        ch4=findViewById(R.id.ans4);
        next=findViewById(R.id.next);

        arr.add(new Questions("1) Who is the Patron Saint of Spain?","a) St James","b) St John","c) St Benedict","d) None","b) St John"));
        arr.add(new Questions("2) Which of these means a speech in a play where a character talks to themselves rather than to other characters?","a) Interlude","b) Revue","c) Soliloquy","d) None","c) Soliloquy"));
        arr.add(new Questions("3) In the Vicar of Dibley, what was the name of the vicar's clueless friend?","a) Alice","b) Beatrice","c) Charlotte","d) None","a) Alice"));
        arr.add(new Questions("4) Casterly Rock is the ancestral home of which family in Game of Thrones?","a) The Starks","b) The Tully's","c) The Lannisters","d) None","b) The Tully's"));
        arr.add(new Questions( "5) Which breed of dog used to be sacred in China?","a) Cockapoo","b) Pekingese","c) Spaniel","d) All","d) All"));
        arr.add(new Questions("6) Which philosopher coined the term 'I think, therefore I am'?","a) Plato","b) Descartes","c) Socrates","d) None of them","b) Descartes"));
        arr.add(new Questions("7) Who was mayor of London before Boris Johnson?","a) Sadiq Khan","b) John Major","c) Ken Livingston","d) None of them","d) None of them"));
        arr.add(new Questions("8) Which two countries are Europes biggest exporters of beers?","a) Germany and Belgium","b) Germany and Spain","c) Belgium and Spain","d) Europe and Spain","a) Germany and Belgium"));
        arr.add(new Questions("9) Which two calendar months are named after Roman Emperors?","a) July and June","b) December and May","c) July and August","d) January and March","b) December and May"));
        arr.add(new Questions("10) How many novels did the Bronte sisters write in total?","a) Nine","b) Seven","c) Eight","d) Six", "b) Seven"));
        Collections.shuffle(arr);
        counter=0;
        countdown.setText("" +10);
        setData(counter);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isClicked==true)
                {
                    Log.i("bool", "onClick: "+isClicked);
                    ClickNext(view,txt,qIndex);
                }
                else
                {
                    Log.i("bool", "else: "+isClicked);
                    ClickNext(v,"Nothing",0);
                }


            }
        });

        tm= new CountDownTimer(10*1000,1000)
        {
            @Override
            public void onTick(long l) {
                countdown.setText(String.format("%d", l / 1000));
            }

            @Override
            public void onFinish() {
                Toast.makeText(QuestionActivity.this, "Time Over", Toast.LENGTH_SHORT).show();

                ClickNext(v,"Nothing",0);
            }
        };
    }
    public  void setData(final int val)
    {
        final Questions obj=arr.get(val);
        quesNum.setText((val+1)+"/"+arr.size());
        if (tm!=null)
        {
            tm.start();
        }
        ques.setText("#"+(val+1)+" "+obj.getQuestion());
        ch1.setText(obj.getOpt1());
        ch2.setText(obj.getOpt2());
        ch3.setText(obj.getOpt3());
        ch4.setText(obj.getOpt4());
        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isClicked=true;
                txt = ch1.getText().toString();
                qIndex = val;

            }
        });

        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isClicked=true;
                txt=ch2.getText().toString();
                qIndex=val;

            }
        });

        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isClicked=true;
                txt=ch3.getText().toString();
                qIndex=val;
            }
        });

        ch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isClicked=true;
                txt=ch4.getText().toString();
                qIndex=val;
            }
        });

    }
    ////////New Intent/////
    public void newActivity(View view,int val,int total,int wrong)
    {
        Intent intent = new Intent(this,Score.class);
        String result="Your Result is\n  "+"Correct: "+val+"/"+total+"\n"+"Wrong: "+wrong+"/"+total;
        intent.putExtra("Result",result);
        startActivity(intent);

    }
    //////Next Click Activity//////
    public void ClickNext(View view,String clickedButtonText,int questionIndex)
    {
        final Questions q=arr.get(questionIndex);

        if(counter<(arr.size()-1))
        {
            if(txt.equals(q.getAnswer())) {
                correct++;
            }
            else {
                wrong++;
            }

            tm.cancel();
            isClicked=false;
            counter++;
            setData(counter);
            if(counter==(arr.size()-1)){
                next.setText("Finish");
            }
        }

        else
        {

            if(txt.equals(q.getAnswer()))
            {
                correct++;
            }
            else {
                wrong++;
            }
            tm.cancel();

            Toast.makeText(QuestionActivity.this, "Questions are completed", Toast.LENGTH_SHORT).show();
            newActivity(view,correct,arr.size(),wrong);
        }
    }

}



