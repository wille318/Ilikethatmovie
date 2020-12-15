package org.myapp.ilikethatmovie;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ani_A2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ani_a2);
        setTitle("레드슈즈");
        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        TextView text1=(TextView) findViewById(R.id. textView1);
        imageView.setImageResource(R.drawable.red);
        TextView  text2=(TextView) findViewById(R.id. textView2);
        ImageView imageView2=(ImageView)findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.red_cut);
    }
}