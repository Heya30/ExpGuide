package com.example.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication.Fragements.ChemShip;
import com.example.myapplication.Fragements.Eleven;
import com.example.myapplication.Fragements.Fifteen;
import com.example.myapplication.Fragements.Fifth;
import com.example.myapplication.Fragements.Fourteen;
import com.example.myapplication.Fragements.Fourteen2;
import com.example.myapplication.Fragements.FourthStep;
import com.example.myapplication.Fragements.SecondStep;
import com.example.myapplication.Fragements.Seventeen;
import com.example.myapplication.Fragements.Sixth;
import com.example.myapplication.Fragements.Ten;
import com.example.myapplication.Fragements.FirstStep;
import com.example.myapplication.Fragements.Nine;
import com.example.myapplication.Fragements.Third;
import com.example.myapplication.Fragements.Thirteen;
import com.example.myapplication.Fragements.twelve;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import q.rorbin.verticaltablayout.VerticalTabLayout;

public class Experiment extends AppCompatActivity{
    ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.ex_toolbar);
        setSupportActionBar(toolbar);
        viewpager = findViewById(R.id.viewpager);
        initTab();
    }


    private void initTab() {
        final VerticalTabLayout tablayout = (VerticalTabLayout) findViewById(R.id.tablayout);
        viewpager.setAdapter(new ViewAdapter(getSupportFragmentManager()));
        tablayout.setupWithViewPager(viewpager);
        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                viewpager.setCurrentItem(i);

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        tablayout.setupWithViewPager(viewpager);
    }



        //ViewPager的适配器
        public class ViewAdapter extends FragmentPagerAdapter implements Serializable {

            List<Fragment> experimentStep = new ArrayList<>();
            String[] tabs = {"阅读试验过程", "水池/船型选择", "设计缩放比例", "加工和精度检查", "附体安装", "模型称重", "压载水线", "模型拖车安装", "读水温", "破水", "测试", "数据处理(1)", "数据处理（2）", "摩擦阻力补贴系数计算", "提交结果"};

            public ViewAdapter(@NonNull FragmentManager fm) {
                super(fm);
            }


            //初始化碎片集合
            private void initFragment() {


                FirstStep bf1 = new FirstStep();
                SecondStep bf2 = new SecondStep();
                Third bf3 = new Third();
                FourthStep bf4 = new FourthStep();
                Fifth bf5 = new Fifth();
                Sixth bf6 = new Sixth();
                Nine bf9 = new Nine();
                Ten bf10 = new Ten();
                Eleven bf11 = new Eleven();
                twelve bf12 = new twelve();
                Thirteen bf13 = new Thirteen();
                Fourteen bf14 = new Fourteen();
                Fourteen2 bf14_2 = new Fourteen2();
                Fifteen bf15 = new Fifteen();
                Seventeen bf17 = new Seventeen();
                experimentStep.add(bf1);
                experimentStep.add(bf2);
                experimentStep.add(bf3);
                experimentStep.add(bf4);
                experimentStep.add(bf5);
                experimentStep.add(bf6);

                experimentStep.add(bf9);
                experimentStep.add(bf10);
                experimentStep.add(bf11);
                experimentStep.add(bf12);
                experimentStep.add(bf13);
                experimentStep.add(bf14);
                experimentStep.add(bf14_2);
                experimentStep.add(bf15);
                experimentStep.add(bf17);


            }

            @NonNull
            @Override
            public Fragment getItem(int position) {
                initFragment();
                return experimentStep.get(position);
            }

            @Override
            public int getCount() {
                return 15;
            }

            //Tab标题为对应页通过getPageTitle()返回的文本
            @Override
            public CharSequence getPageTitle(int position) {
                return tabs[position];
            }
        }


        protected int dp2px( float dp){
            final float scale = this.getResources().getDisplayMetrics().density;
            return (int) (dp * scale + 0.5f);
        }



}