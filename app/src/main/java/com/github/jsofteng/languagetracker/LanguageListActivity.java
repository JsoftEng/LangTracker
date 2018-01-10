package com.github.jsofteng.languagetracker;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LanguageListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initDisplay();
    }

    private void initDisplay() {
        final ListView listLanguages = (ListView) findViewById(R.id.language_list_entry);
        ArrayList<String> initLangList = new ArrayList<>();
        initLangList.add("Java");
        initLangList.add("COBOL");
        initLangList.add("Python");
        initLangList.add("C++");

        ArrayAdapter<String> languageList =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,initLangList);
        listLanguages.setAdapter(languageList);
    }
}
