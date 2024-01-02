package com.example.exc0606;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView image ;
    Button btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        image = findViewById(R.id.image);

    }
    public void ace(View view) {
        Random  rnd = new Random();
        int x = rnd.nextInt(3)+1;
        image.setImageResource(R.drawable.);
    }
}