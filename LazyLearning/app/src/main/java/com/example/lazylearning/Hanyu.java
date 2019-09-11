package com.example.lazylearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.com.bloder.magic.view.MagicButton;

public class Hanyu extends AppCompatActivity {
    CardView p1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hanyu);
        p1= (CardView) findViewById(R.id.card_pinyin);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent P1 = new Intent(Hanyu.this,Pinyin.class);
                startActivity(P1);
            }
        });
    }
}
