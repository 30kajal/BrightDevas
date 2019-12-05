package com.vgeekers.saathi01;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;

import java.util.ArrayList;
import java.util.Map;

public class Main2Activity extends AppCompatActivity {

    public void on(View view)
    {
        Toast.makeText(Main2Activity.this,"Refer our Website",Toast.LENGTH_SHORT).show();
    }
    public void of(View view)
    {
        Toast.makeText(Main2Activity.this,"Thank You",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String s=getIntent().getStringExtra("str");

        final LinearLayout lt=findViewById(R.id.linear);
        lt.removeAllViews();
        Enter.firestore.document("list/"+s).get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    Map map = task.getResult().getData();
                    java.util.ArrayList<String> l = new ArrayList<>(map.values());
                    for (String k : l) {
                        TextView t = new TextView(Main2Activity.this);
                        t.setText(k);
                        t.setAllCaps(true);
                        t.setTextSize(30);

                        t.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                            }
                        });
                        lt.addView(t);

                    }
                }
            }
        });
    }
}
