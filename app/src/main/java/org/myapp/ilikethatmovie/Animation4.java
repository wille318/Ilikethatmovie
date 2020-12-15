package org.myapp.ilikethatmovie;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Animation4 extends AppCompatActivity {

    TextView question;
    Button answer1, answer2, answer3, answer4;
    Drawable backImg;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation4);

        setTitle("애니메이션 심리테스트");

        question = (TextView) findViewById(R.id.Question);
        answer1 = (Button) findViewById(R.id.Answer1);
        answer2 = (Button) findViewById(R.id.Answer2);
        answer3 = (Button) findViewById(R.id.Answer3);
        answer4 = (Button) findViewById(R.id.Answer4);

        linearLayout = (LinearLayout) findViewById(R.id.layoutBack);
        backImg = getResources().getDrawable(R.drawable.animation4);
        backImg.setAlpha(30);
        linearLayout.setBackground(backImg);


        Intent c = getIntent();
        Intent d= new Intent(Animation4.this, Animation5.class);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextSum = c.getExtras().getInt("sum") + 1;
                Log.d("TAG", "onClick: Score is " + nextSum);
                d.putExtra("sum",nextSum);
                startActivity(d);
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextSum = c.getExtras().getInt("sum") + 2;
                Log.d("TAG", "onClick: Score is " + nextSum);
                d.putExtra("sum",nextSum);
                startActivity(d);
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextSum = c.getExtras().getInt("sum") + 3;
                Log.d("TAG", "onClick: Score is " + nextSum);
                d.putExtra("sum",nextSum);
                startActivity(d);
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextSum = c.getExtras().getInt("sum") + 4;
                Log.d("TAG", "onClick: Score is " + nextSum);
                d.putExtra("sum",nextSum);
                startActivity(d);
            }
        });
    }
}
