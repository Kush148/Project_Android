package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {
    Button example1,example2;
    TextView txt_intro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        txt_intro=findViewById(R.id.txtIntro);
       txt_intro.setSelected(true);
        example1=findViewById(R.id.example1);
        example2=findViewById(R.id.example2);

        Toast.makeText(HomePage.this,"Welcome "+getIntent().getStringExtra("userName"),Toast.LENGTH_LONG).show();

        example1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this,RecyclerListHorizontal.class);
                startActivity(i);
            }
        });

        example2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomePage.this,RecyclerGrid.class);
                startActivity(i);
            }
        });
    }
}
