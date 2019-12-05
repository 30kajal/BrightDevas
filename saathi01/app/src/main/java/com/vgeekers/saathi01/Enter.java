package com.vgeekers.saathi01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.FirebaseFirestore;

public class Enter extends AppCompatActivity {
    //Button b1;
    public void au(View view)
    {
        Intent i=new Intent(this,Main2Activity.class);
        i.putExtra("str","Ayurveda");
        startActivity(i);
    }
    public void ca(View view)
    {
        Intent i=new Intent(this,Main2Activity.class);
        i.putExtra("str","Cardiac Care");
        startActivity(i);
    }
    public void di(View view)
    {

        Intent i=new Intent(this,Main2Activity.class);
        i.putExtra("str","Diabetic Care");
        startActivity(i);
    }
    public void hy(View view)
    {
        Intent i=new Intent(this,Main2Activity.class);
        i.putExtra("str","Hypertension");
        startActivity(i);
    }
    public void ch(View view)
    {
        Intent i=new Intent(this,Main2Activity.class);
        i.putExtra("str","Child care");
        startActivity(i);
    }
    public void li(View view)
    {
        Intent i=new Intent(this,Main2Activity.class);
        i.putExtra("str","Liver care");
        startActivity(i);
    }
    public void lis(View view) {
        Intent j=new Intent(com.vgeekers.saathi01.Enter.this,List.class);
        startActivity(j);
    }
public static FirebaseFirestore firestore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        firestore=FirebaseFirestore.getInstance();
    }
}