package com.example.paulo.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1= (EditText)findViewById(R.id.et1);
    }
    public void Next(View view){
        Intent next = new Intent(this,SecondActivity.class);
        next.putExtra("dato", et1.getText().toString());
        startActivity(next);

    }
}
