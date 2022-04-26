package com.example.lhs_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class sliderAdapter extends RecyclerView.Adapter<sliderAdapter.SliderViewHolder> {
    private List<imageitem>imageitems;
    private ViewPager2 viewPager2;

     sliderAdapter(List<imageitem> imageitems, ViewPager2 viewPager2) {
        this.imageitems = imageitems;
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SliderViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.slide_item,
                        parent,
                        false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder holder, int position) {
holder.setImage(imageitems.get(position));
if(position== imageitems.size()-2){
    viewPager2.post(runnable);
}
    }

    @Override
    public int getItemCount() {
        return imageitems.size();
    }

    class SliderViewHolder extends RecyclerView.ViewHolder{
        private RoundedImageView iv;

         SliderViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.imageslider);
        }
        void setImage(imageitem sliderItem){

            iv.setImageResource(sliderItem.getImage());
        }
    }
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            imageitems.addAll(imageitems);
            notifyDataSetChanged();
        }
    };
}
