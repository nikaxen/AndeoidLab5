package com.example.nik_ax.androidlab5db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class ActivityOut extends AppCompatActivity {

    private GridView gv;
    private Cursor c;
    private MainActivity.DBHelper dbHelper;
    SimpleCursorAdapter scAdapter;
    ListView lvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // получаем курсор
        c = getAllData();
        startManagingCursor(c);

        // формируем столбцы сопоставления
        String[] from = new String[] { "_id","name","email" };
        int[] to = new int[] { R.id.cid, R.id.cname, R.id.cemail };

        // создааем адаптер и настраиваем список
        scAdapter = new SimpleCursorAdapter(this, R.layout.item, c, from, to);
        lvData = (ListView) findViewById(R.id.lvData);
        lvData.setAdapter(scAdapter);
    }
    // получить все данные из таблицы DB_TABLE
    public Cursor getAllData() {
        dbHelper = new MainActivity.DBHelper(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        return db.query("mytable1", new String[] { "_id","name","email" }, null, null, null, null, null);
    }
}
