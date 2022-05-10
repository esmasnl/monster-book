package com.essel.monsterbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.essel.monsterbook.landing.SliderAdapter;

public class LandingActivity extends AppCompatActivity {
    ViewPager viewPager;
    SliderAdapter sliderAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        viewPager=findViewById(R.id.landing);
        sliderAdapter=new SliderAdapter(this);
        viewPager.setAdapter(sliderAdapter);
    }
}