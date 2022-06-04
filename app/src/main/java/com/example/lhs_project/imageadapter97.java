package com.example.lhs_project;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class imageadapter97 extends BaseAdapter {
    private Context mComtex;
    public int[] imagerArray={R.drawable.b97c,R.drawable.b97a};
    public imageadapter97(Context mComtex) { this.mComtex = mComtex;
    }

    @Override
    public int getCount() {
        return imagerArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imagerArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mComtex);
        imageView.setImageResource(imagerArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(220,220));
        return imageView;
    }
}
