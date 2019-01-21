package jp.techacademy.minami.yamamoto.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    EditText EditText1;
    EditText EditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //加算処理
        Button plus_button = (Button) findViewById(R.id.button1);
        plus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //空白判定
                if( EditText1.getText().toString().equals("") || EditText2.getText().toString().equals("") ){
                    Toast.makeText(MainActivity.this,"please enter number!", Toast.LENGTH_SHORT).show();
                    Log.d("hello", "hello1");
                } else {
                    Log.d("hello", "hello2");
                    //EditText1の数値の取得
                    EditText1 = (EditText) findViewById(R.id.editText1);
                    Double double_EditText1 = Double.parseDouble(EditText1.getText().toString());
                    //EditText2の数値の取得
                    EditText2 = (EditText) findViewById(R.id.editText2);
                    Double double_EditText2 = Double.parseDouble(EditText2.getText().toString());
                    //加算結果の取得
                    Double PLUS_VALUE = double_EditText1 + double_EditText2;

                    Intent plus_intent = new Intent(MainActivity.this, SecondActivity.class);
                    plus_intent.putExtra("PLUS_VALUE", PLUS_VALUE);
                    startActivity(plus_intent);
                }
            }
        });

        //減算処理
        Button minus_button = (Button) findViewById(R.id.button2);
        minus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //乗算処理
        Button multiplication_button = (Button) findViewById(R.id.button3);
        multiplication_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //除算処理
        Button division_button = (Button) findViewById(R.id.button4);
        division_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
