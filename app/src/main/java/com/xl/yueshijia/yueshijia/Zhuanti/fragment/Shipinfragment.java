package com.xl.yueshijia.yueshijia.Zhuanti.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.fastjson.JSON;
import com.xl.yueshijia.yueshijia.R;
import com.xl.yueshijia.yueshijia.Zhuanti.ShipinBean;
import com.xl.yueshijia.yueshijia.Zhuanti.adapter.Shipinfragmentadapter;
import com.xl.yueshijia.yueshijia.Zhuanti.util.MyUtil;

import java.util.List;

import me.leefeng.lfrecyclerview.LFRecyclerView;

/**
 * Created by Administrator on 2017/2/27 0027.
 */

public class Shipinfragment extends Fragment {
    LFRecyclerView lfRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.zhuanti_shipin,container,false);
        return view;
    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        lfRecyclerView= (LFRecyclerView) view.findViewById(R.id.lfrecyclerview);
        MyUtil.downloaddata(getActivity(), new MyUtil.OnLoadJson() {
            @Override
            public void getjsondata(String getdata) {
                List<ShipinBean.DatasBean.ArticleListBean> listBeanList=JSON.parseArray(getdata,ShipinBean.DatasBean.ArticleListBean.class);
                Shipinfragmentadapter shipinfragmentadapter=new Shipinfragmentadapter(listBeanList,getContext());
                lfRecyclerView.setLayoutManager(new GridLayoutManager(getContext(),1, LinearLayoutManager.VERTICAL,false));
                lfRecyclerView.setAdapter(shipinfragmentadapter);
            }
        });

      //
    }
}
