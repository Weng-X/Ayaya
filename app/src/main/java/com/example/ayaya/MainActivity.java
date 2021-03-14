package com.example.ayaya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import fragment.HomeFragment;

public class MainActivity extends AppCompatActivity {

    private LayoutInflater mInflater;
    private TabHost mTabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

//        mInflater = LayoutInflater.from(this);
//        mTabHost = (TabHost) this.findViewById(android.R.id.tabhost);
//
//        TabHost.TabSpec tabSpec = (TabHost.TabSpec) mTabHost.newTabSpec("home");
//        View view = (View) mInflater.inflate(R.layout.indicator,null);
//        ImageView img = (ImageView) view.findViewById(R.id.icon_tap);
//        TextView text = (TextView) view.findViewById(R.id.txt_indicator);
//
//        img.setBackgroundResource(R.mipmap.index);
//        text.setText("主页");
//
//        tabSpec.setIndicator(view);
//
//        mTabHost.setup();
//        mTabHost.addTab(tabSpec);

    }
}