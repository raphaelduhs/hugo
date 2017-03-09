package com.example.raphaelduhs.hugo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setName (View view ) {
        EditText textField = (EditText) findViewById(R.id.editText);


        textField.setText("HUgo");


    }
}
