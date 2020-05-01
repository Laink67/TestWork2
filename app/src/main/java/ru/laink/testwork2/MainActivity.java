package ru.laink.testwork2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] items = getResources().getStringArray(R.array.first);
        String[] itemsSecond = getResources().getStringArray(R.array.second);

        ListView listView = findViewById(R.id.listView);
        ListView listViewSecond = findViewById(R.id.listView2);

        OwnAdapter adapter = new OwnAdapter(this, items);
        SecondOwnAdapter secondAdapter = new SecondOwnAdapter(this, itemsSecond);

        listView.setAdapter(adapter);
        listViewSecond.setAdapter(secondAdapter);
    }
}
