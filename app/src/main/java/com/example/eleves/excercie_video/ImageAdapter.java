package com.example.eleves.excercie_video;

import android.widget.BaseAdapter;
import android.view.View;
import android.view.ViewGroup;
/*import java.lang.Object;*/
import android.content.Context;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context context;
    public Integer[] images = {
            R.drawable.pic_1,R.drawable.pic_2,
            R.drawable.pic_3,R.drawable.pic_4,
            R.drawable.pic_5,R.drawable.pic_6,
            R.drawable.pic_7,R.drawable.pic_8,
            R.drawable.pic_9,R.drawable.pic_10,


    };

    public ImageAdapter(Context c) {
        context = c;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return images[i];

    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams( 204, 240));
        return imageView;
    }


}
