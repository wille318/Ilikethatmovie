package org.myapp.ilikethatmovie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Action1 extends AppCompatActivity {

    TextView question;
    Button answer1, answer2, answer3, answer4;
    int score;
    LinearLayout linearLayout;
    Drawable backImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.action1);

        setTitle("액션 심리테스트");

        question=(TextView)findViewById(R.id.Question);
        answer1=(Button) findViewById(R.id.Answer1);
        answer2=(Button) findViewById(R.id.Answer2);
        answer3=(Button) findViewById(R.id.Answer3);
        answer4=(Button) findViewById(R.id.Answer4);

        linearLayout = (LinearLayout) findViewById(R.id.layoutBack);
        backImg = getResources().getDrawable(R.drawable.action);
        backImg.setAlpha(80);
        linearLayout.setBackground(backImg);

        Intent a= new Intent(Action1.this, Action2.class);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=1;
                a.putExtra("sum", score);
                startActivity(a);
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=2;
                a.putExtra("sum", score);
                startActivity(a);
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=3;
                a.putExtra("sum", score);
                startActivity(a);
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=4;
                a.putExtra("sum", score);
                startActivity(a);
            }
        });
    }
}