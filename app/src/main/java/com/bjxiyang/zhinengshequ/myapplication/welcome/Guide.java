package com.bjxiyang.zhinengshequ.myapplication.welcome;



import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bjxiyang.zhinengshequ.R;
import com.bjxiyang.zhinengshequ.myapplication.ui.activity.BeasActivity;
import com.bjxiyang.zhinengshequ.myapplication.ui.activity.SDLoginActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cl on 2016/10/10.
 */
public class Guide extends BeasActivity implements ViewPager.OnPageChangeListener {

    private ViewPager vp;
    private List<View> viewList;
    private ImageView[] ivs;
    private int[] iv_id = {R.id.iv1_guide, R.id.iv2_guide, R.id.iv3_guide};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide);
        init();

        Button btn_guide03 = (Button) viewList.get(2).findViewById(R.id.btn_guide03);
        btn_guide03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sp = getSharedPreferences("my", MODE_PRIVATE);
                SharedPreferences.Editor edit = sp.edit();
                edit.putBoolean("isFirstIn", true);
                edit.commit();
                startActivity(new Intent(Guide.this, SDLoginActivity.class));
                Guide.this.finish();
            }
        });
    }

    private void init() {
        // ----  V
        vp = (ViewPager) findViewById(R.id.viewpager_guide);
        // ----  M
        viewList = new ArrayList<View>();
        LayoutInflater inflater = LayoutInflater.from(this);
        viewList.add(inflater.inflate(R.layout.guide01, null));
        viewList.add(inflater.inflate(R.layout.guide02, null));
        viewList.add(inflater.inflate(R.layout.guide03, null));
        // ---- C
        ViewPagerAdapter vpa = new ViewPagerAdapter(viewList);
        vp.setAdapter(vpa);

        ivs = new ImageView[iv_id.length];
        for (int i = 0; i < ivs.length; i++) {
            ivs[i] = (ImageView) findViewById(iv_id[i]);
        }

        // ��vpע�����
        vp.setOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        for (int i = 0; i < ivs.length; i++) {
            if (position == i) {
                ivs[i].setImageResource(R.drawable.aii);
            } else {
                ivs[i].setImageResource(R.drawable.k_btn_zhong_n);
            }
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
