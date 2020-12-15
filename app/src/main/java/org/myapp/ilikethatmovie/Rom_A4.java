package org.myapp.ilikethatmovie;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Rom_A4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rom_a4);
        setTitle("나의 소녀시대");
        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        TextView text1=(TextView) findViewById(R.id. textView1);
        imageView.setImageResource(R.drawable.girl);
        TextView  text2=(TextView) findViewById(R.id. textView2);
        ImageView imageView2=(ImageView)findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.girl_cut);
    }
}