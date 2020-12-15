package org.myapp.ilikethatmovie;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Hor_A4 extends AppCompatActivity {
    String EditText;

    TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hor_a4);

        Intent intent =getIntent();

        EditText=intent.getStringExtra("String")+"님의 결과는~?'";
        name= (TextView)findViewById(R.id.textView1);
        name.setText(EditText);
        setTitle("해피 데스데이");
        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        TextView text1=(TextView) findViewById(R.id. textView1);
        imageView.setImageResource(R.drawable.happy);
        TextView  text2=(TextView) findViewById(R.id. textView2);
        ImageView imageView2=(ImageView)findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.happy_cut);
    }
}