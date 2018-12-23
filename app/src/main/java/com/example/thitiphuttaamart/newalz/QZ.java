package com.example.thitiphuttaamart.newalz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QZ extends AppCompatActivity {

    private ImageView nImageView;
    private Button nButton;
    private TextView Countlable;
    private RadioButton btn;
    private RadioButton btn1;
    private RadioButton btn2;
    private RadioButton btn3;

    private String rightAnser;
    private int rightAnswerCount = 0;
    private int quizCount = 1;

    ArrayList<ArrayList<String>> quizarray = new ArrayList<>();
    String QuizData [] [] = {
            {"ม้า", "แมว", "กระต่าย", "หนู"},
            {"เคย", "ไม่เคย"},
            {"ฟ้า", "เขียว","แดง","เหลือง"},
            {"เคย","ไม่เคย"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qz);

        nImageView = (ImageView) findViewById(R.id.imageView2);
        nButton = (Button) findViewById(R.id.Next);

        showRandomFact();

        nButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRandomFact();
            }
        });
    }

    public void showRandomFact(){
        shuffleFacts();
        nImageView.setImageResource(FactRND[0].getmImage());
    }

    RND f01 = new RND(R.drawable.pic_1);
    RND f02 = new RND(R.drawable.pic_2);
    RND f03 = new RND(R.drawable.pic_3);
    RND f04 = new RND(R.drawable.pic_5);

    RND [] FactRND = new RND[]{
            f01,f02,f03,f04
    };

    public void shuffleFacts(){
        Collections.shuffle(Arrays.asList(FactRND));
    }
}
