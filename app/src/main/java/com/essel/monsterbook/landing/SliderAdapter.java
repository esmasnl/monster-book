package com.essel.monsterbook.landing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.essel.monsterbook.R;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    public int[] skip_button = {
            View.VISIBLE,
            View.VISIBLE,
            View.VISIBLE,
            View.VISIBLE,
            View.VISIBLE,
            View.GONE
    };
    public int[] balloon = {
            R.drawable.balloon,
            R.drawable.balloon,
            R.drawable.balloon,
            R.drawable.balloon,
            R.drawable.balloon,
            R.drawable.balloon
    };
    public int[] image = {
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.image,
            R.drawable.image
    };
    public int[] circle = {
            R.drawable.skip,
            R.drawable.skip2,
            R.drawable.skip3,
            R.drawable.skip4,
            R.drawable.skip5,
            R.drawable.skip6
    };
    public int[] start_button = {
            View.GONE,
            View.GONE,
            View.GONE,
            View.GONE,
            View.GONE,
            View.VISIBLE
    };

    @Override
    public int getCount() {
        return skip_button.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (ScrollView) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.landing_fragment, container, false);

        Button skip_btn = view.findViewById(R.id.skip_btn);
        ImageView balloons = view.findViewById(R.id.balloon);
        ImageView main_image = view.findViewById(R.id.logo);
        ImageView circles = view.findViewById(R.id.image_skip);
        Button start_btn = view.findViewById(R.id.start);

        skip_btn.setVisibility(skip_button[position]);
        balloons.setImageResource(balloon[position]);
        main_image.setImageResource(image[position]);
        circles.setImageResource(circle[position]);
        start_btn.setVisibility(start_button[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ScrollView) object);
    }
}
