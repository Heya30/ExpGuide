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

import com.example.myapplication.Fragements.BlankFragment3;
import com.example.myapplication.Fragements.FirstStep;
import com.example.myapplication.Fragements.Nine;

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
        String[] tabs = {"阅读试验过程","虚拟水池选择","设计船模缩尺比","附体安装","模型称重","压载水线"
        ,"模型拖车安装","读水温","破水","测试","数据处理","提交结果","sd","sdf","sd","we"};
        public ViewAdapter(@NonNull FragmentManager fm){
            super(fm);
        }


        //初始化碎片集合
        private void initFragment(){


            FirstStep bf = new FirstStep();
            Nine bf2 = new Nine();
            BlankFragment3 bf3 = new BlankFragment3();
            bookShelfFragmentList.add(bf);
            bookShelfFragmentList.add(bf2);
            bookShelfFragmentList.add(bf3);
//            bookShelfFragmentList.add(bf3);
//            bookShelfFragmentList.add(bf3);
//            bookShelfFragmentList.add(bf3);
//            bookShelfFragmentList.add(bf3);
//            bookShelfFragmentList.add(bf3);
//            bookShelfFragmentList.add(bf3);
//            bookShelfFragmentList.add(bf3);
//            bookShelfFragmentList.add(bf3);
//            bookShelfFragmentList.add(bf3);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            initFragment();
            return bookShelfFragmentList.get(position);
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


    protected int dp2px(float dp) {
        final float scale = this.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }



}