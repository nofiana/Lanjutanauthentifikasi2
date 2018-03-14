package com.training.lanjutanauthentifikasi.client;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.training.lanjutanauthentifikasi.R;

/**
 * Created by Blackswan on 7/19/2017.
 */

public class PicassoClient {
public static  void  downloading(Context c, String url, ImageView img){
    if (url!=null&&url.length()>0){
        Picasso.with(c).load(url).placeholder(R.drawable.noimage).into(img);
    }else{
        Picasso.with(c).load(R.drawable.noimage).into(img);
    }
}
}
