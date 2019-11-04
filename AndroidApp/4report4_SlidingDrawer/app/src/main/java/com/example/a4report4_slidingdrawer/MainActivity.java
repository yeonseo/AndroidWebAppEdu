package com.example.a4report4_slidingdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.slice.Slice;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SlidingDrawer;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

public class MainActivity extends AppCompatActivity {
    SlidingDrawer slidingDrawer1;
    Button btnHandle;
    LinearLayout content;
    ImageView ivGif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slidingDrawer1 = findViewById(R.id.slidingDrawer1);
        btnHandle = findViewById(R.id.btnHandle);
        content = findViewById(R.id.content);
        ivGif = findViewById(R.id.ivGif);

        GlideDrawableImageViewTarget imageViewTarget = new GlideDrawableImageViewTarget(ivGif);
        Glide.with(this).load(R.drawable.baby).into(imageViewTarget);
    }
}
