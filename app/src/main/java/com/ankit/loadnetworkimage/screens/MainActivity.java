package com.ankit.loadnetworkimage.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.ankit.loadnetworkimage.R;
import com.ankit.loadnetworkimage.utility.GlideImageLoader;
import com.ankit.loadnetworkimage.utility.Utility;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        progress = findViewById(R.id.progress);

        // success
        new GlideImageLoader(imageView, progress).load("https://wallpaperaccess.com/full/197542.jpg", Utility.getGlideRequestOptions());

        // error
//        new GlideImageLoader(imageView, progress).load("https://wallpaperaccess.com/full/no_image.jpg", Utility.getGlideRequestOptions());

    }
}