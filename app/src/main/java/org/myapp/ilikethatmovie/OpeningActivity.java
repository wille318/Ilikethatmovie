package org.myapp.ilikethatmovie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpeningActivity extends AppCompatActivity {

    private Button gen_ac ;
    private Button gen_lo ;
    private Button gen_ho ;
    private Button gen_ani ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);

//  액션
        gen_ac = findViewById(R.id.gen_ac);
        gen_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OpeningActivity.this, NextPage.class);
                startActivity(intent); //액티비티 이동하는 구문
            }
        });
//  로맨스
        gen_lo = findViewById(R.id.gen_lo);
        gen_lo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OpeningActivity.this, NextPage.class);
                startActivity(intent); //액티비티 이동하는 구문
            }
        });
//  호러
        gen_ho = findViewById(R.id.gen_ho);
        gen_ho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OpeningActivity.this,NextPage. class);
                startActivity(intent); //액티비티 이동하는 구문
            }
        });
//  애니메이션
        gen_ani = findViewById(R.id.gen_ani);
        gen_ani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OpeningActivity.this, NextPage. class);
                startActivity(intent); //액티비티 이동하는 구문
            }
        });
    }
}