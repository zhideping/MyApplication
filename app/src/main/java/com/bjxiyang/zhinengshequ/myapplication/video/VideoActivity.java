package com.bjxiyang.zhinengshequ.myapplication.video;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.LinearLayout;

import com.bjxiyang.zhinengshequ.R;

public class VideoActivity extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout ll_video_address;
    private LinearLayout ll_video_guaduan;
    private LinearLayout ll_video_jingyin;
    private LinearLayout ll_video_jieting;
    private LinearLayout ll_video_kaimen;
    private SurfaceView sfv_video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        init();
        initData();
    }



    private void init() {
        ll_video_address = (LinearLayout) findViewById(R.id.ll_video_address);
        ll_video_guaduan = (LinearLayout) findViewById(R.id.ll_video_guaduan);
        ll_video_jingyin = (LinearLayout) findViewById(R.id.ll_video_jingyin);
        ll_video_jieting = (LinearLayout) findViewById(R.id.ll_video_jieting);
        ll_video_kaimen = (LinearLayout) findViewById(R.id.ll_video_kaimen);
        sfv_video = (SurfaceView) findViewById(R.id.sfv_video);
        ll_video_address.setOnClickListener(this);
        ll_video_guaduan.setOnClickListener(this);
        ll_video_jingyin.setOnClickListener(this);
        ll_video_jieting.setOnClickListener(this);
        ll_video_kaimen.setOnClickListener(this);
    }
    private void initData() {
        SurfaceViewDemo sfv = new SurfaceViewDemo(this);
        sfv_video.getHolder().setKeepScreenOn(true);
        sfv_video.getHolder().addCallback(sfv);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ll_video_address:
                break;
            case R.id.ll_video_guaduan:
                break;
            case R.id.ll_video_jingyin:
                break;
            case R.id.ll_video_jieting:
                break;
            case R.id.ll_video_kaimen:
                break;
        }
    }
}
