package org.myapp.ilikethatmovie;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Horror3 extends AppCompatActivity {

    TextView question;
    Button answer1, answer2, answer3, answer4;
    LinearLayout linearLayout;
    Drawable backImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horror3);

        setTitle("공포 심리테스트");

        question = (TextView) findViewById(R.id.Question);
        answer1 = (Button) findViewById(R.id.Answer1);
        answer2 = (Button) findViewById(R.id.Answer2);
        answer3 = (Button) findViewById(R.id.Answer3);
        answer4 = (Button) findViewById(R.id.Answer4);

        linearLayout = (LinearLayout) findViewById(R.id.layoutBack);
        backImg = getResources().getDrawable(R.drawable.horror3);
        backImg.setAlpha(80);
        linearLayout.setBackground(backImg);


        Intent b = getIntent();
        Intent c= new Intent(Horror3.this, Horror4.class);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextSum = b.getExtras().getInt("sum")+1;
                c.putExtra("sum",nextSum);
                startActivity(c);
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextSum = b.getExtras().getInt("sum")+2;
                c.putExtra("sum",nextSum);
                startActivity(c);
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int nextSum = b.getExtras().getInt("sum")+3;
                c.putExtra("sum",nextSum);
                startActivity(c);
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int nextSum = b.getExtras().getInt("sum")+4;
                c.putExtra("sum",nextSum);
                startActivity(c);
            }
        });


    }
}