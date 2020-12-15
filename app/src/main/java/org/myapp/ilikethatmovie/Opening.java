package org.myapp.ilikethatmovie;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Opening extends AppCompatActivity {

    private EditText name ;
//    public String Name = "file";
    private Button gen_ac ;
    private Button gen_lo ;
    private Button gen_ho ;
    private Button gen_ani ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opening);

//  액션
        gen_ac = findViewById(R.id.gen_ac);
        gen_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = (EditText)findViewById(R.id.name);
                String name_a = name.getText().toString();
                Toast.makeText(getApplicationContext(), name_a+"님 환영합니다!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), Action1.class);
                startActivity(intent); //액티비티 이동하는 구문

//               Intent secondIntent = new Intent(getApplicationContext());
//                secondIntent.putExtra("name", name_a);
//                startActivity(secondIntent);
            }
        });

//  로맨스
        gen_lo = findViewById(R.id.gen_lo);
        gen_lo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = (EditText)findViewById(R.id.name);
                String name_a = name.getText().toString();
                Toast.makeText(getApplicationContext(), name_a+"님 환영합니다!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), Romance1.class);
                startActivity(intent); //액티비티 이동하는 구문
            }
        });

//  호러
        gen_ho = findViewById(R.id.gen_ho);
        gen_ho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = (EditText)findViewById(R.id.name);
                String name_a = name.getText().toString();
                Toast.makeText(getApplicationContext(), name_a+"님 환영합니다!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), Horror1. class);
                startActivity(intent); //액티비티 이동하는 구문
            }
        });

//  애니메이션
        gen_ani = findViewById(R.id.gen_ani);
        gen_ani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = (EditText)findViewById(R.id.name);
                String name_a = name.getText().toString();
                Toast.makeText(getApplicationContext(), name_a+"님 환영합니다!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), Animation1. class);
                startActivity(intent); //액티비티 이동하는 구문
            }
        });
    }
}
