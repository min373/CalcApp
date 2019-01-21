package jp.techacademy.minami.yamamoto.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Double value = intent.getDoubleExtra("PLUS_VALUE", 0);

        TextView textView = (TextView) findViewById(R.id.answer_textView);
        textView.setText(String.valueOf(value));
    }
}
