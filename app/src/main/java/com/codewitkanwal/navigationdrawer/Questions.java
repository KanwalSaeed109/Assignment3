package com.codewitkanwal.navigationdrawer;

import java.util.Collection;

public class Questions {

    public String questions[] = {
            "1) Who is the Patron Saint of Spain?",
            "2) Which of these means a speech in a play where a character talks to themselves rather than to other characters?",
            "3) In the Vicar of Dibley, what was the name of the vicar's clueless friend?",
            "4) Casterly Rock is the ancestral home of which family in Game of Thrones?",
            "5) Which breed of dog used to be sacred in China?",
            "6) Which philosopher coined the term 'I think, therefore I am'?",
            "7) Who was mayor of London before Boris Johnson?",
            "8) Which two countries are Europes biggest exporters of beers?",
            "9) Which two calendar months are named after Roman Emperors?",
            "10) How many novels did the Bronte sisters write in total?"
    };



    private String opt[][] = {
            {"a) St James","b) St John","c) St Benedict","d) None"},
            {"a) Interlude","b) Revue","c) Soliloquy","d) None"},
            {"a) Alice","b) Beatrice","c) Charlotte","d) None"},
            {"a) The Starks","b) The Tully's","c) The Lannisters","d) None"},
            {"a) Cockapoo","b) Pekingese","c) Spaniel","d) All"},
            {"a) Plato","b) Descartes","c) Socrates","d) None of them"},
            {"a) Sadiq Khan","b) John Major","c) Ken Livingston","d) None of them"},
            {"a) Germany and Belgium","b) Germany and Spain","c) Belgium and Spain","d) Europe and Spain"},
            {"a) July and June","b) December and May","c) July and August","d) January and March"},
            {"a) Nine","b) Seven","c) Eight","d) Six"}
    };

    private String answers[] = {"b) St John",
            "c) Soliloquy",
            "a) Alice",
            "b) The Tully's",
            "d) All",
            "b) Descartes",
            "d) None of them",
            "a) Germany and Belgium",
            "b) December and May",
            "b) Seven"};

    public String getQuestion(int a){
        String ques=questions[a];
        return ques;
    }
    public String getChoice1(int a){
        String choice=opt[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice=opt[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice=opt[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice=opt[a][3];
        return choice;
    }
    public String getAns(int a){
        String ans=answers[a];
        return ans;
    }
}
