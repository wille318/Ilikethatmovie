package org.myapp.ilikethatmovie;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Act_A4 extends AppCompatActivity {

    TextView question;
    Button answer1, answer2, answer3, answer4;
    LinearLayout linearLayout;
    Drawable backImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_a4);

        setTitle("액션 심리테스트");

        question = (TextView) findViewById(R.id.Question);
        answer1 = (Button) findViewById(R.id.Answer1);
        answer2 = (Button) findViewById(R.id.Answer2);
        answer3 = (Button) findViewById(R.id.Answer3);
        answer4 = (Button) findViewById(R.id.Answer4);

        linearLayout = (LinearLayout) findViewById(R.id.layoutBack);
        backImg = getResources().getDrawable(R.drawable.action4);
        backImg.setAlpha(80);
        linearLayout.setBackground(backImg);


        Intent c = getIntent();
        Intent d= new Intent(Act_A4.this, Action5.class);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextSum = c.getExtras().getInt("sum")+1;
                d.putExtra("sum",nextSum);
                startActivity(d);
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextSum = c.getExtras().getInt("sum")+2;
                d.putExtra("sum",nextSum);
                startActivity(d);
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextSum = c.getExtras().getInt("sum")+3;
                d.putExtra("sum",nextSum);
                startActivity(d);
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextSum = c.getExtras().getInt("sum")+4;
                d.putExtra("sum",nextSum);
                startActivity(d);
            }
        });
    }
}
