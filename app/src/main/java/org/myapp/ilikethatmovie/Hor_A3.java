package org.myapp.ilikethatmovie;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Hor_A3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hor_a3);
        setTitle("알 포인트");
        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        TextView text1=(TextView) findViewById(R.id. textView1);
        imageView.setImageResource(R.drawable.r);
        TextView  text2=(TextView) findViewById(R.id. textView2);
        ImageView imageView2=(ImageView)findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.r_cut);
    }
}
