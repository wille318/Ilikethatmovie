// 오프닝 페이지 : 시작하시겠습니까?
package org.myapp.ilikethatmovie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private Button startbtn;
    EditText name;
    String Name = "file";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//  name input
        name = (EditText)findViewById(R.id.name);
        startbtn = (Button)findViewById(R.id.startbtn);

        String str = getPreferences();
        name.setText(str);

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savePreferences();
                String str = getPreferences();
                Intent intent = new Intent(MainActivity.this, OpeningActivity.class);
                intent.putExtra("String", str);
                startActivity(intent);
            }
        });
    }

    //저장했던 이름 불러오기
    public String getPreferences(){
        SharedPreferences sf = getSharedPreferences(Name,0);
        return sf.getString("name","");
    }

    //이름 저장하기
    public void savePreferences() {
        SharedPreferences sf = getSharedPreferences(Name, 0);
        SharedPreferences.Editor editor = sf.edit();
        String str = name.getText().toString();
        editor.putString("name", str);
        editor.putString("xx", "xx");
        editor.commit();
    }

    //앱 종료시
    public void onStop() {
        super.onStop();
        savePreferences();
    }
}

