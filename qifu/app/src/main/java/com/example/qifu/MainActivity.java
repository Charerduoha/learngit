package com.example.qifu;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static boolean isPlay=true;
    MediaPlayer mediaPlayer;
    Button music_btn;

    private TextView mTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTv=findViewById(R.id.tv);
        mTv.setSelected(true);
        music_btn=findViewById(R.id.btnPlayMusic);
        PlayMusic();
    }
    private void PlayMusic() {
        mediaPlayer=MediaPlayer.create(this,R.raw.zxyx);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }

}
