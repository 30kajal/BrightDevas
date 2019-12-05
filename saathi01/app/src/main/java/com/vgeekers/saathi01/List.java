package com.vgeekers.saathi01;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class List extends AppCompatActivity {
    public void on(View view)
    {
     Toast.makeText(List.this,"Type Your Address",Toast.LENGTH_SHORT).show();
    }
    public void of(View view)
    {
        Toast.makeText(List.this,"Thank You",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }
}
