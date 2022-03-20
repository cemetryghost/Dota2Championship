package com.example.dota2championship;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Integer counterOg = 0;
    public Integer counterViciGaming = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("counterOg")
                && savedInstanceState.containsKey("counterViciGaming")) {
            counterOg = savedInstanceState.getInt("counterOg");
            counterViciGaming = savedInstanceState.getInt("counterViciGaming");
        }
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView2);
        textView.setText(counterOg+"  -  "+counterViciGaming);
    }

    public void onClickOg(View view) {
        counterOg++;
        TextView textView = findViewById(R.id.textView2);
        textView.setText(counterOg+"  -  "+counterViciGaming);
    }

    public void onClickViciGaming(View view) {
        counterViciGaming++;
        TextView textView = findViewById(R.id.textView2);
        textView.setText(counterOg+"  -  "+counterViciGaming);
    }

    public void onClickReset(View view){
        counterOg = 0;
        counterViciGaming = 0;
        TextView textView = findViewById(R.id.textView2);
        textView.setText(counterOg+"  -  "+counterViciGaming);
    }

    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putInt("counterOg", counterOg);
        outState.putInt("counterViciGaming", counterViciGaming);
    }
}