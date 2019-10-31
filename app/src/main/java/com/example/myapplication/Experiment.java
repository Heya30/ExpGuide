package com.example.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.WindowManager;

import com.example.myapplication.Fragements.Eleven;
import com.example.myapplication.Fragements.Fifteen;
import com.example.myapplication.Fragements.Fourteen;
import com.example.myapplication.Fragements.Seventeen;
import com.example.myapplication.Fragements.Ten;
import com.example.myapplication.Fragements.FirstStep;
import com.example.myapplication.Fragements.Nine;
import com.example.myapplication.Fragements.Thirteen;
import com.example.myapplication.Fragements.twelve;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import q.rorbin.verticaltablayout.VerticalTabLayout;

public class Experiment extends AppCompatActivity {
    ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment);
        Toolbar toolbar = (Toolbar)findViewById(R.id.ex_toolbar);
        setSupportActionBar(toolbar);
        viewpager =  findViewById(R.id.viewpager);
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

        List<Fragment> bookShelfFragmentList=new ArrayList<>();
        String[] tabs = {"阅读试验过程","水池/船型选择","设计缩放比例","加工和精度检查","附体安装","模型称重"
        ,"压载水线","模型拖车安装","读水温","破水","测试","数据处理","摩擦阻力补贴系数计算","提交结果"};
        public ViewAdapter(@NonNull FragmentManager fm){
            super(fm);
        }


        //初始化碎片集合
        private void initFragment(){


            FirstStep bf = new FirstStep();
            FirstStep bf102 = new FirstStep();
            FirstStep bf103 = new FirstStep();
            FirstStep bf104 = new FirstStep();
            FirstStep bf105 = new FirstStep();
            FirstStep bf106 = new FirstStep();

            Nine bf9 = new Nine();
            Ten bf10 = new Ten();
            Eleven bf11 = new Eleven();
            twelve bf12 = new twelve();
            Thirteen bf13 = new Thirteen();
            Fourteen bf14 = new Fourteen();
            Fifteen bf15 = new Fifteen();
            Seventeen bf17 = new Seventeen();
            bookShelfFragmentList.add(bf);
            bookShelfFragmentList.add(bf102);
            bookShelfFragmentList.add(bf103);
            bookShelfFragmentList.add(bf104);
            bookShelfFragmentList.add(bf105);
            bookShelfFragmentList.add(bf106);

            bookShelfFragmentList.add(bf9);
            bookShelfFragmentList.add(bf10);
            bookShelfFragmentList.add(bf11);
            bookShelfFragmentList.add(bf12);
            bookShelfFragmentList.add(bf13);
            bookShelfFragmentList.add(bf14);
            bookShelfFragmentList.add(bf15);
            bookShelfFragmentList.add(bf17);


        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            initFragment();
            return bookShelfFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return 14;
        }

        //Tab标题为对应页通过getPageTitle()返回的文本
        @Override
        public CharSequence getPageTitle(int position) {
            return tabs[position];
        }
    }


    protected int dp2px(float dp) {
        final float scale = this.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }



}