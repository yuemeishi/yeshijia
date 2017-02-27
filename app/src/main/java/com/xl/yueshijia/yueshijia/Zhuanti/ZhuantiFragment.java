package com.xl.yueshijia.yueshijia.Zhuanti;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xl.yueshijia.yueshijia.R;
import com.xl.yueshijia.yueshijia.Zhuanti.adapter.Adapterfragment;

import me.leefeng.lfrecyclerview.LFRecyclerView;

/**
 * Created by Administrator on 2017/2/27 0027.
 */

public class ZhuantiFragment extends Fragment {
    String[] titles={"视频","旁单","知识","人文","地图","活动"};
  TabLayout tabLayout;
    ViewPager viewPager;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View view=inflater.inflate(R.layout.zhuantifragment,container,false);
         return view;
    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        tabLayout= (TabLayout) view.findViewById(R.id.tablayout);
        viewPager= (ViewPager) view.findViewById(R.id.viewpager);
        Adapterfragment zhuantiFragmentadapter=new Adapterfragment(getChildFragmentManager(),titles);
       viewPager.setAdapter(zhuantiFragmentadapter);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setOverScrollMode(View.SCROLL_AXIS_HORIZONTAL);


    }
}
