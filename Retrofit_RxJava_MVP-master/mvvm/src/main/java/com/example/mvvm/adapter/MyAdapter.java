package com.example.mvvm.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.mvvm.bean.User;
import com.example.mvvm.databinding.UserItemBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 10172915 on 2016/8/30.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    private List<User> mData = new ArrayList<>();

    public MyAdapter(List<User> mData) {
        this.mData = mData;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return MyHolder.create(LayoutInflater.from(parent.getContext()), parent);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.bindTo(mData.get(position));
    }

    @Override
    public int getItemCount() {
        if (mData == null) {
            return 0;
        }
        return mData.size();
    }

    static class MyHolder extends RecyclerView.ViewHolder {
        private UserItemBinding mBinding;

        static MyHolder create(LayoutInflater inflater, ViewGroup parent) {
            UserItemBinding binding = UserItemBinding.inflate(inflater, parent, false);
            return new MyHolder(binding);
        }

        private MyHolder(UserItemBinding binding) {
            super(binding.getRoot());
            this.mBinding = binding;
        }

        public void bindTo(User user) {
            mBinding.setUser(user);
            mBinding.executePendingBindings();
        }
    }
}
