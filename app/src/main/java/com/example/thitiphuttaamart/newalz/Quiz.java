package com.example.thitiphuttaamart.newalz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.ArraySet;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;

public class Quiz extends AppCompatActivity {

    private ImageView mImageView;
    private Button mButton;

    int t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mImageView = (ImageView) findViewById(R.id.imageView);
        mButton = (Button) findViewById(R.id.Next);

        showRandomFact();

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRandomFact();
            }
        });
    }

    public void showRandomFact() {
        shuffleFacts();
        for (t = 1 ; t<= 5 ;t++)
        {
            for (int h = 1 ; h<=t ;h++)
            {
                mImageView.setImageResource(FactRND[0].getmImage());
                Intent i = new Intent(Quiz.this, QZ.class);
                startActivity(i);
            }
        }
    }

    RND f01 = new RND(R.drawable.img_0);
    RND f02 = new RND(R.drawable.img_1);
    RND f03 = new RND(R.drawable.img_2);
    RND f04 = new RND(R.drawable.img_3);
    RND f05 = new RND(R.drawable.img_4);

    RND[] FactRND = new RND[]{
            f01, f02, f03, f04, f05
    };

    public void shuffleFacts() {
        Collections.shuffle(Arrays.asList(FactRND));
    }
}
