package com.example.exc0606;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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
        if(x==1)
        {
            image.setImageResource(R.drawable.smurfs);
            btn.setText("1, unlucky to be honest");
        }
        else if (x==2)
        {
            image.setImageResource(R.drawable.miniun);
            btn.setText("2, ez pz lemon squizi");
        }
        else if(x==3)
        {
            image.setImageResource(R.drawable.theflash);
            btn.setText("3, my name is barry allen and i am the fastest man alive!!!!!totototototototo");
        }

    }
}