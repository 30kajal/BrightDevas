package com.vgeekers.saathi01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //Button b1;
    public void ent(View view) {
        EditText l= findViewById(R.id.email);
        String n2 =l.getText().toString();
        Intent j=new Intent(MainActivity.this,Enter.class);
        startActivity(j);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //b1=findViewById(R.id.login);
        //b1.setOnClickListener(new View.OnClickListener() {

    }
}