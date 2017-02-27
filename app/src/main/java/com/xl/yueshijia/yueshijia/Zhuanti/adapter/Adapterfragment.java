package com.xl.yueshijia.yueshijia.Zhuanti.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.xl.yueshijia.yueshijia.Zhuanti.fragment.Bangdanfragment;
import com.xl.yueshijia.yueshijia.Zhuanti.fragment.Ditufragment;
import com.xl.yueshijia.yueshijia.Zhuanti.fragment.Huodongfragment;
import com.xl.yueshijia.yueshijia.Zhuanti.fragment.Renwenfragment;
import com.xl.yueshijia.yueshijia.Zhuanti.fragment.Shipinfragment;
import com.xl.yueshijia.yueshijia.Zhuanti.fragment.Zhishifragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/27 0027.
 */

public class Adapterfragment extends FragmentStatePagerAdapter{
    String[] titles;
    public Adapterfragment(FragmentManager fm,String[] titles) {
        super(fm);
        this.titles=titles;
    }

    @Override
    public Fragment getItem(int position) {
        List<Fragment> list=new ArrayList<>();
        list.add(new Shipinfragment());
        list.add(new Bangdanfragment());
        list.add(new Zhishifragment());
        list.add(new Renwenfragment());
        list.add(new Ditufragment());
        list.add(new Huodongfragment());
        return list.get(position);
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
