package org.myapp.ilikethatmovie;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Act_A1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_a1);

        setTitle("어브덕션");
        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        TextView text1=(TextView) findViewById(R.id. textView1);
        imageView.setImageResource(R.drawable.abduction);
        TextView  text2=(TextView) findViewById(R.id. textView2);
        ImageView imageView2=(ImageView)findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.abduction_cut);

    }
}