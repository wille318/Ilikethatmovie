package org.myapp.ilikethatmovie;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Rom_A1 extends AppCompatActivity {

    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rom_a1);
        setTitle("첫키스만 50번째");


        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        text1=(TextView) findViewById(R.id. textView1);
        imageView.setImageResource(R.drawable.first);
        TextView  text2=(TextView) findViewById(R.id. textView2);
        ImageView imageView2=(ImageView)findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.first_cut);
    }
}