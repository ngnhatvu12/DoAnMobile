package com.example.lythuyetmobile.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.lythuyetmobile.Models.Slider;
import com.example.lythuyetmobile.R;

import java.util.ArrayList;

public class SliderAdapter extends PagerAdapter {

    private Context context;
    private ArrayList<Slider> slidersModelsList;

    public SliderAdapter(Context context, ArrayList<Slider> slidersModelsList) {
        this.context = context;
        this.slidersModelsList = slidersModelsList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slider_item, null);
        ImageView sliderImage = view.findViewById(R.id.slider_image);
        TextView sliderTitle = view.findViewById(R.id.slide_title);
        sliderImage.setImageResource(slidersModelsList.get(position).getImage());
        sliderTitle.setText(slidersModelsList.get(position).getSlideName());
        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return slidersModelsList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
