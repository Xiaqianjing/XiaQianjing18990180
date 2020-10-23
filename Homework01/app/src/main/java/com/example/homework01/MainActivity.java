package com.example.homework01;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import com.example.homework01.Util;
import com.example.homework01.DisplayUtil;

public class MainActivity extends AppCompatActivity{
    private TextView text_screen;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_screen = findViewById(R.id.text_screen);

        int dip_10 = Util.dip2px(this,10L);
        text_screen.setPadding(dip_10,dip_10,dip_10,dip_10);
        text_screen.setBackgroundColor(0xffff00ff);
        text_screen.setTextColor(0xff333333);
        text_screen.setTextColor(0xff333333);
        showScreenInfo();
    }

    private void showScreenInfo(){
        int width=DisplayUtil.getScreenWidth(this);
        int heigth=DisplayUtil.getScreenHeigth(this);
        float sensity=DisplayUtil.getScreenDensity(this);
        String info=String.format("当前屏幕宽度是%dpx，高度是%dpx，像素密度是%f",width,heigth,sensity);
        text_screen.setText(info);
    }
}