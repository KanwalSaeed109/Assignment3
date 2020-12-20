package com.codewitkanwal.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnPlus,btnMinus,btnMul,btnDiv,btnEql,btnMod,btnClear,btnDot;
    EditText ed1;
    Float res1,res2;
    Float ans;
    Boolean add,sub,div,mul,mod;
    void store()
    {
        res1 = Float.parseFloat(ed1.getText()+"");
    }
    void setFalse(){
        add=false;
        div=false;
        mul=false;
        sub=false;
        mod=false;
    }
    void clear(){
        res1=null;
        ed1.setText(null);
        setFalse();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Toast.makeText(getApplicationContext(),"Calculator is Clicked", Toast.LENGTH_LONG).show();

        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnDot=(Button)findViewById(R.id.btnDot);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnPlus=(Button)findViewById(R.id.btnPlus);
        btnMod=(Button)findViewById(R.id.btnMod);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnMinus=(Button)findViewById(R.id.btnMinus);
        btnEql=(Button)findViewById(R.id.btnEql);
        btnClear=(Button)findViewById(R.id.btnClear);

        ed1=(EditText)findViewById(R.id.ed1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"0");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+".");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    store();
                    setFalse();
                    add=true;
                    ed1.setText(null);
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    store();
                    setFalse();
                    sub=true;
                    ed1.setText(null);
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    store();
                    setFalse();
                    mul=true;
                    ed1.setText(null);
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    store();
                    setFalse();
                    div=true;
                    ed1.setText(null);
                }
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    store();
                    setFalse();
                    mod=true;
                    ed1.setText(null);
                }
            }
        });

        btnEql.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(add){
                    ed1.setText(res1+Float.parseFloat(ed1.getText()+"")+"");
                }
                if(sub){
                    ed1.setText(res1-Float.parseFloat(ed1.getText()+"")+"");
                }
                if(mul){
                    ed1.setText(res1*Float.parseFloat(ed1.getText()+"")+"");
                }
                if(div){
                    ed1.setText(res1/Float.parseFloat(ed1.getText()+"")+"");
                }
                if(mod){
                    ed1.setText(res1%Float.parseFloat(ed1.getText()+"")+"");
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
            }
        });



    }


}
