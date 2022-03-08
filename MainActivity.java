package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button btn;
    Random r;

    Integer[] images = {
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
    };

    int pickedImage = 0, lastPicked = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        btn = findViewById(R.id.btn);

        r = new Random();


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                do{
                    pickedImage = r.nextInt(images.length);
                }while(pickedImage == lastPicked);

                lastPicked = pickedImage;

                imageView.setImageResource(images[pickedImage]);

            }
        });
    }
}