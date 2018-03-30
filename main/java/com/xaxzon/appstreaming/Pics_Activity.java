package com.xaxzon.appstreaming;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Pics_Activity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pics_);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new CustomPagerAdapter(this));

    }

    public void button8_onClick(View view){
        //return to main menu
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public enum CustomPagerEnum {

        RED(R.string.red, R.layout.view_red),
        BLUE(R.string.blue, R.layout.view_blue),
        ORANGE(R.string.orange, R.layout.view_orange),
        GREEN(R.string.green, R.layout.view_green),
        PINK(R.string.pink, R.layout.view_pink);

        private int mTitleResId;
        private int mLayoutResId;

        CustomPagerEnum(int titleResId, int layoutResId) {
            mTitleResId = titleResId;
            mLayoutResId = layoutResId;
        }

        public int getTitleResId() {
            return mTitleResId;
        }

        public int getLayoutResId() {
            return mLayoutResId;
        }

    }
}
