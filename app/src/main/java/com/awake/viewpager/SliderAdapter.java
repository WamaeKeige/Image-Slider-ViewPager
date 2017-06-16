package com.awake.viewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 07/06/2017.
 */

public class SliderAdapter extends PagerAdapter {

    private int[] image_resource = {
            R.drawable.bentley,
            R.drawable.benzo,
            R.drawable.bmws,
            R.drawable.rolls,
            R.drawable.jag,
            R.drawable.range
    };
    private Context ctx;
    private LayoutInflater layoutInflater;

    public SliderAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return image_resource.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return (view == (LinearLayout) o);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
     layoutInflater =(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view =layoutInflater.inflate(R.layout.sliderproduct,container,false);
        ImageView imageView=(ImageView)item_view.findViewById(R.id.picview);
        TextView textView=(TextView)item_view.findViewById(R.id.txtimage);
        imageView.setImageResource( image_resource[position]);
        textView.setText("Image :" + position);
        container.addView(item_view);

      return item_view;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((LinearLayout) object);
    }

}
