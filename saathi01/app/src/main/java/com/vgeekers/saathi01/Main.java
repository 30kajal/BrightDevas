package com.vgeekers.saathi01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.vgeekers.saathi01.Enter;
import com.vgeekers.saathi01.R;

public class Main extends AppCompatActivity {
    public void ent(View view) {
        Intent j = new Intent(Main.this, Enter.class);
        startActivity(j);
    }

    // Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //b1=findViewById(R.id.login);
        //b1.setOnClickListener(new View.OnClickListener() {
           // @Override


    }
}
