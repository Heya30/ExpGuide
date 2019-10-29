package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Discussion extends AppCompatActivity {
    private List<Question> list = new ArrayList<>();
    private QuestionAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discussion);
        Toolbar toolbar = (Toolbar)findViewById(R.id.ad_toolbar);
        setSupportActionBar(toolbar);
        list.add(new Question("如何使用该软件？","按流程巴拉巴拉巴拉巴拉的"));
        list.add(new Question("实验的过程是？","adsfdeweq"));
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        GridLayoutManager layoutManager = new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new QuestionAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}
