package com.example.dota2championship;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Integer counterOg = 0;
    public Integer counterViciGaming = 0;

    public void onTablo() {
        TextView textView = findViewById(R.id.textView2);
        textView.setText(counterOg+"  -  "+counterViciGaming);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("counterOg")
                && savedInstanceState.containsKey("counterViciGaming")) {
            counterOg = savedInstanceState.getInt("counterOg");
            counterViciGaming = savedInstanceState.getInt("counterViciGaming");
        }
        setContentView(R.layout.activity_main);
        onTablo();
    }

    public void onClickOg(View view) {
        counterOg++;
        onTablo();
    }

    public void onClickViciGaming(View view) {
        counterViciGaming++;
        onTablo();
    }

    public void onClickReset(View view){
        counterOg = 0;
        counterViciGaming = 0;
        onTablo();
    }

    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putInt("counterOg", counterOg);
        outState.putInt("counterViciGaming", counterViciGaming);
    }
}
