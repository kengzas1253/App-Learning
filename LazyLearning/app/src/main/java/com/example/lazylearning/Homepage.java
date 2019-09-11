package com.example.lazylearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.com.bloder.magic.view.MagicButton;

public class Homepage extends AppCompatActivity {
    MagicButton a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        a= (MagicButton)findViewById(R.id.iBt1);
        a.setMagicButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent B1 = new Intent(Homepage.this,Hanyu.class);
                startActivity(B1);
            }
        });

    }


}
