package com.xl.yueshijia.yueshijia.Zhuanti.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.xl.yueshijia.yueshijia.R;
import com.xl.yueshijia.yueshijia.Zhuanti.ShipinBean;

import java.util.List;

/**
 * Created by Administrator on 2017/2/27 0027.
 */

public class Shipinfragmentadapter extends RecyclerView.Adapter<Shipinfragmentadapter.MyViewHolder> {
    List<ShipinBean.DatasBean.ArticleListBean> listBeen;
    Context context;
    LayoutInflater layoutInflater;

    public Shipinfragmentadapter(List<ShipinBean.DatasBean.ArticleListBean> listBeen, Context context) {
        this.listBeen = listBeen;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }
//
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.zhuanti_shipin, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.shipin_video_tv.setText(listBeen.get(position).getTag().get(0));
        holder.shipin_title_tv.setText(listBeen.get(position).getArticle_title());
        holder.shipin_content_tv.setText(listBeen.get(position).getArticle_abstract());
        Glide.with(context).load(listBeen.get(position).getArticle_image()).into(holder.shipin_iv);
    }

    @Override
    public int getItemCount() {
        return listBeen.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView shipin_video_tv, shipin_title_tv, shipin_content_tv;
        ImageView shipin_iv;

        public MyViewHolder(View itemView) {
            super(itemView);
            shipin_video_tv = (TextView) itemView.findViewById(R.id.shipin_video_tv);
            shipin_title_tv = (TextView) itemView.findViewById(R.id.shipin_title_tv);
            shipin_content_tv = (TextView) itemView.findViewById(R.id.shipin_content_tv);
            shipin_iv = (ImageView) itemView.findViewById(R.id.shipin_iv);
        }
    }
}
