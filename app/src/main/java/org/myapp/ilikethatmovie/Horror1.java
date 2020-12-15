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

public class Horror1 extends AppCompatActivity {

    TextView question;
    Button answer1, answer2, answer3, answer4;
    LinearLayout linearLayout;
    Drawable backImg;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horror1);

        setTitle("공포 심리테스트");

        question=(TextView)findViewById(R.id.Question);
        answer1=(Button) findViewById(R.id.Answer1);
        answer2=(Button) findViewById(R.id.Answer2);
        answer3=(Button) findViewById(R.id.Answer3);
        answer4=(Button) findViewById(R.id.Answer4);

        linearLayout = (LinearLayout) findViewById(R.id.layoutBack);
        backImg = getResources().getDrawable(R.drawable.horror);
        backImg.setAlpha(80);
        linearLayout.setBackground(backImg);

        Intent a= new Intent(Horror1.this,Horror2.class);
        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=1;
                Log.d("TAG", "onClick: Score is " + score);
                a.putExtra("sum", score);
                startActivity(a);
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=2;
                Log.d("TAG", "onClick: Score is " + score);
                a.putExtra("sum", score);
                startActivity(a);
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=3;
                Log.d("TAG", "onClick: Score is " + score);
                a.putExtra("sum", score);
                startActivity(a);
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=4;
                Log.d("TAG", "onClick: Score is " + score);
                a.putExtra("sum", score);
                startActivity(a);
            }
        });
    }
}
