package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_Sub, btn_Add, btn_Mul, btn_Dot, btn_Equ, btn_Clear, btn_Div;
    EditText ed1;
    float val1, val2;
    boolean mAdd, mSub, mDiv, mMul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0=(Button) findViewById(R.id.btn_);
        btn_1=(Button) findViewById(R.id.btn_);
        btn_2=(Button) findViewById(R.id.btn_);
        btn_3=(Button) findViewById(R.id.btn_);
        btn_4=(Button) findViewById(R.id.btn_);
        btn_5=(Button) findViewById(R.id.btn_);
        btn_6=(Button) findViewById(R.id.btn_);
        btn_7=(Button) findViewById(R.id.btn_);
        btn_8=(Button) findViewById(R.id.btn_);
        btn_9=(Button) findViewById(R.id.btn_);
        btn_Add=(Button) findViewById(R.id.btn_);
        btn_Sub=(Button) findViewById(R.id.btn_);
        btn_Mul=(Button) findViewById(R.id.btn_);
        btn_Div=(Button) findViewById(R.id.btn_);
        btn_Dot=(Button) findViewById(R.id.btn_);
        btn_Clear=(Button) findViewById(R.id.btn_);
        btn_Equ=(Button) findViewById(R.id.btn_);

        btn_0.setOnClickListener(new View.OnClickListener() { @Override     public void onClick(View v) { ed1.setText(ed1.getText() + "0"); }});
        btn_1.setOnClickListener(new View.OnClickListener() { @Override     public void onClick(View v) { ed1.setText(ed1.getText() + "1"); }});
        btn_2.setOnClickListener(new View.OnClickListener() { @Override     public void onClick(View v) { ed1.setText(ed1.getText() + "2"); }});
        btn_3.setOnClickListener(new View.OnClickListener() { @Override     public void onClick(View v) { ed1.setText(ed1.getText() + "3"); }});
        btn_4.setOnClickListener(new View.OnClickListener() { @Override     public void onClick(View v) { ed1.setText(ed1.getText() + "4"); }});
        btn_5.setOnClickListener(new View.OnClickListener() { @Override     public void onClick(View v) { ed1.setText(ed1.getText() + "5"); }});
        btn_6.setOnClickListener(new View.OnClickListener() { @Override     public void onClick(View v) { ed1.setText(ed1.getText() + "6"); }});
        btn_7.setOnClickListener(new View.OnClickListener() { @Override     public void onClick(View v) { ed1.setText(ed1.getText() + "7"); }});
        btn_8.setOnClickListener(new View.OnClickListener() { @Override     public void onClick(View v) { ed1.setText(ed1.getText() + "8"); }});
        btn_9.setOnClickListener(new View.OnClickListener() { @Override     public void onClick(View v) { ed1.setText(ed1.getText() + "9"); }});
        btn_Dot.setOnClickListener(new View.OnClickListener() { @Override     public void onClick(View v) { ed1.setText(ed1.getText() + "."); }});

        btn_Add.setOnClickListener(new View.OnClickListener(){
            @override
            public void onClick(View v) {
                if (ed1 == null) ed1.setText("");
                else {
                    val1 = Float.parseFloat(ed1.getText() + "");
                    mAdd = true;
                    ed1.setText(null);
                    }
                }
            });
    }


}