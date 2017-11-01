package com.example.nik_ax.androidlab5db;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        List<MyTable> mytable = (List<MyTable>) getIntent().getSerializableExtra("mtl");
        setContentView(R.layout.activity_view);
        ListView list = (ListView) findViewById(android.R.id.list);
        ArrayAdapter<MyTable> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mytable);
        list.setAdapter(adapter);
    }
}
