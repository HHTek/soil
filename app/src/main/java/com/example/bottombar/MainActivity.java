package com.example.bottombar;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bottombar.fragment.Fragment1;
import com.example.bottombar.fragment.Fragment2;
import com.example.bottombar.fragment.Fragment3;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        BottomBar bottomBar = findViewById(R.id.bottom_bar);
        bottomBar.setContainer(R.id.fl_container)
                .setTitleBeforeAndAfterColor("#999999", "#ff5d5e")
                .addItem(Fragment1.class,
                        "地图",
                        R.drawable.item1_before,
                        R.drawable.item1_after)
                .addItem(Fragment2.class,
                        "数据",
                        R.drawable.item2_before,
                        R.drawable.item2_after)
                .addItem(Fragment3.class,
                        "巡检",
                        R.drawable.item3_before,
                        R.drawable.item3_after)
                .addItem(Fragment3.class,
                        "我的",
                        R.drawable.item3_before,
                        R.drawable.item3_after)
                .build();
    }
}
