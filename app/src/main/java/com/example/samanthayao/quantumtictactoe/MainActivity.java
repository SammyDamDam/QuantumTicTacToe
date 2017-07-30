package com.example.samanthayao.quantumtictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import static android.R.id.list;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView board;

        board = (GridView) findViewById(R.id.gridview);
        board.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item));

    }
}
