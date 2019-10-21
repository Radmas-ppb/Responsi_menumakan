package com.example.menumakan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    ImageView imageView;
    TextView textTitle,textPrice,textDes;
    int image;
    String title,harga,des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        imageView = findViewById(R.id.FeimageView);
        textTitle = findViewById(R.id.FeTittle);
        textPrice = findViewById(R.id.Feprice2);
        textDes = findViewById(R.id.FeDesk);

        title=getIntent().getStringExtra("title");
        des=getIntent().getStringExtra("des");
        harga=getIntent().getStringExtra("harga");
        image=getIntent().getIntExtra("image",0);

        textTitle.setText(title);
        textDes.setText(des);
        textPrice.setText(harga);
        imageView.setImageResource(image);

    }
}
