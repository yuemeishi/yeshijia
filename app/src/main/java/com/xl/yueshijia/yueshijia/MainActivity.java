package com.xl.yueshijia.yueshijia;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xl.yueshijia.yueshijia.Zhuanti.fragment.Shipinfragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         FragmentTransaction fragmentTransaction=  getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmenLayout,new Shipinfragment());
        fragmentTransaction.commit();
    }
}
