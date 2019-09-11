package com.example.lazylearning;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Pinyin extends AppCompatActivity {
    MediaPlayer p1,p2,p3,p4,p5,p6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinyin);
        p1=MediaPlayer.create(Pinyin.this,R.raw.bo);
        p2=MediaPlayer.create(Pinyin.this,R.raw.po);
        p3=MediaPlayer.create(Pinyin.this,R.raw.mo);
        p4=MediaPlayer.create(Pinyin.this,R.raw.fo);
        p5=MediaPlayer.create(Pinyin.this,R.raw.de);
        p6=MediaPlayer.create(Pinyin.this,R.raw.te);
    }
    public void Play1(View v){
      p1.start();
    }
    public void Play2(View v){
        p2.start();
    }
    public void Play3(View v){
        p3.start();
    }
    public void Play4(View v){
        p4.start();
    }
    public void Play5(View v){
        p5.start();
    }
    public void Play6(View v){
        p6.start();
    }
}
