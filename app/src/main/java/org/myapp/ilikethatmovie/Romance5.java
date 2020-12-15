package org.myapp.ilikethatmovie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Romance5 extends AppCompatActivity {
    TextView textResult;
    TextView result_tv;
    Button answer1;
    int finalSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.romance5);

        setTitle("로멘스 심리테스트");

        answer1 = (Button) findViewById(R.id.Answer1);
        textResult = (TextView) findViewById(R.id.Result);
        result_tv = (TextView) findViewById(R.id.result_tv);


        Intent d = getIntent();
        finalSum = d.getExtras().getInt("sum");

        String finalSumStr = Integer.toString(finalSum);
        textResult.setText("계산 결과 : " + finalSumStr);

        answer1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (finalSum <=7){
//                    result_tv.setText("결과가 4점 ~ 7점인 경우에는 1구간을 추천합니당");
                    Intent intent = new Intent(getApplicationContext(), Act_A1.class);
                    startActivity(intent);
                }
                else if(finalSum <=10) {
//                    result_tv.setText("결과가 8점 ~ 10점인 경우에는 2구간을 추천합니당");
                    Intent intent = new Intent(getApplicationContext(), Act_A2.class);
                    startActivity(intent);
                }
                else if(finalSum <=13){
//                    result_tv.setText("결과가 11점 ~ 13점인 경우에는 3구간을 추천합니당");
                    Intent intent = new Intent(getApplicationContext(), Act_A3.class);
                    startActivity(intent);

                }
                else{
//                    result_tv.setText("결과가 14점~16점인 경우 4구간을 추천합니다ㅏ");
                    Intent intent = new Intent(getApplicationContext(), Act_A4.class);
                    startActivity(intent);
                }


            }
        });
    }
}