package com.vgeekers.saathi01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Enter extends AppCompatActivity {
  // Button b1;
  public void lis(View view) {
      Intent j=new Intent(com.vgeekers.saathi01.Enter.this,List.class);
      startActivity(j);
  }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);

    }

               // b1=findViewById(R.id.login);
              //  b1.setOnClickListener(new View.OnClickListener() {
                   // @Override

               // });

            }



