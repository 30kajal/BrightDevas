package com.vgeekers.saathi01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class List extends AppCompatActivity {
   // Button b1,b2;
   public void on(View view) {
       Intent j=new Intent(List.this,Online.class);
       startActivity(j);
   }
    public void of(View view) {
        Intent k=new Intent(List.this,Ofline.class);
        startActivity(k);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


           // b1=findViewById(R.id.on);
           // b2=findViewById(R.id.off);
           // b1.setOnClickListener(new View.OnClickListener() {
              //  @Override

          //  });
           // b2.setOnClickListener(new View.OnClickListener() {
               // @Override

          //  });
    }
}
