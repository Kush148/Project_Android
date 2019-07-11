package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerGrid extends AppCompatActivity {

    RecyclerView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_grid);

        gv=findViewById(R.id.recycle_grid);
        gv.setLayoutManager(new GridLayoutManager(this,3));
        AdapterRecylerGrid adapter = new AdapterRecylerGrid(this);
        gv.setItemAnimator(new DefaultItemAnimator());
        gv.setAdapter(adapter);
    }
}
