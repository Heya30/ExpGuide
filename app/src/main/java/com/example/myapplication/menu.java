package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends Activity implements View.OnClickListener {

    private Button exp;
    private Button equ;
    private Button report;
    private Button notice;
    private Button discussion;
    private Button myInfro;
    private Button startExp;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        //brief introduction
        exp = findViewById(R.id.menu1);
        exp.setOnClickListener(this);
        //equipment
        equ = findViewById(R.id.menu2);
        equ.setOnClickListener(this);
        //notification
        notice = findViewById(R.id.menu3);
        notice.setOnClickListener(this);

        discussion = findViewById(R.id.discussion);
        discussion.setOnClickListener(this);
        myInfro = findViewById(R.id.myInformation);
        myInfro.setOnClickListener(this);
        startExp = findViewById(R.id.startExp);
        startExp.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.discussion:
                Intent intent = new Intent(menu.this, Discussion.class);
                startActivity(intent);
                break;
            case R.id.myInformation:
                Intent intent2 = new Intent(menu.this, Informaition.class);
                startActivity(intent2);
                break;
            case R.id.startExp:
                Intent intent3 = new Intent(menu.this, Experiment.class);
                startActivity(intent3);
                break;
            case R.id.menu1:
                Intent intent4 = new Intent(menu.this, introExp.class);
                startActivity(intent4);
                break;
            case R.id.menu2:
                Intent intent5 = new Intent(menu.this, introEqu.class);
                startActivity(intent5);
                break;
            case R.id.menu3:
                Intent intent6 = new Intent(menu.this, introNoti.class);
                startActivity(intent6);
                break;
            default:
                break;


        }
    }
}
