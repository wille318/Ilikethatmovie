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

public class Animation2 extends AppCompatActivity {

    TextView question;
    Button answer1, answer2, answer3, answer4;
    LinearLayout linearLayout;
    Drawable backImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation2);

        setTitle("애니메이션 심리테스트");

        question=(TextView)findViewById(R.id.Question);
        answer1=(Button) findViewById(R.id.Answer1);
        answer2=(Button) findViewById(R.id.Answer2);
        answer3=(Button) findViewById(R.id.Answer3);
        answer4=(Button) findViewById(R.id.Answer4);

        linearLayout = (LinearLayout) findViewById(R.id.layoutBack);
        backImg = getResources().getDrawable(R.drawable.animation2);
        backImg.setAlpha(80);
        linearLayout.setBackground(backImg);


        Intent a = getIntent();
        Intent b= new Intent(Animation2.this, Animation3.class);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextSum = a.getExtras().getInt("sum") + 1;
                Log.d("TAG", "onClick: Score is " + nextSum);
                b.putExtra("sum",nextSum);
                startActivity(b);
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextSum = a.getExtras().getInt("sum") + 2;
                Log.d("TAG", "onClick: Score is " + nextSum);
                b.putExtra("sum",nextSum);
                startActivity(b);
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextSum = a.getExtras().getInt("sum") + 3;
                Log.d("TAG", "onClick: Score is " + nextSum);
                b.putExtra("sum",nextSum);
                startActivity(b);
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextSum = a.getExtras().getInt("sum") + 4;
                Log.d("TAG", "onClick: Score is " + nextSum);
                b.putExtra("sum",nextSum);
                startActivity(b);
            }
        });


    }

}