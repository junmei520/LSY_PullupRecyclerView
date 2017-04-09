package com.example.pulluprecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 *
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter {

    private final List<WaitMVBean.DataBean.ComingBean> comingslist;
    private final Context mContext;
    private final LayoutInflater mLayoutInflater;


    public MyRecyclerAdapter(Context mContext, List<WaitMVBean.DataBean.ComingBean> comingslist) {
        this.mContext = mContext;
        this.comingslist = comingslist;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(mLayoutInflater.inflate(R.layout.date_item, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myholder = (MyViewHolder) holder;
        myholder.setData(position);
    }

    @Override
    public int getItemCount() {
        return comingslist.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView mv_name;
        private TextView mv_dec;
        private TextView mv_date;
        private ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            mv_name = (TextView) itemView.findViewById(R.id.mv_name);
            mv_dec = (TextView) itemView.findViewById(R.id.mv_dec);
            mv_date = (TextView) itemView.findViewById(R.id.mv_date);
            imageView = (ImageView) itemView.findViewById(R.id.image);
        }

        public void setData(int position) {
            WaitMVBean.DataBean.ComingBean coming = comingslist.get(position);

            String name = coming.getNm();
            mv_name.setText(name);

            String date = coming.getShowInfo();
            mv_date.setText(date);

            String dec = coming.getScm();
            mv_dec.setText(dec);

            //注：当你发下图片无法打开是，做个字符串替换即可
            String imagUrl = coming.getImg();
            String newImagUrl = imagUrl.replaceAll("w.h", "50.80");

            //使用Glide加载图片
            Glide.with(mContext)
                    .load(newImagUrl)
                    .into(imageView);
        }
    }
}
