package com.example.nicestart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;


public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Drawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.girl);
        drawable = ContextCompat.getDrawable(this, R.drawable.girl);
        imageView.setImageDrawable(drawable);
    }
}