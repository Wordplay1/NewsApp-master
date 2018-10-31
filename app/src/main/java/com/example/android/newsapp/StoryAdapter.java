package com.example.android.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.MyViewHolder> {

    private String[] mDataset;

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView mTextView;
        public MyViewHolder(TextView v){
            super(v);
            mTextView = v;
        }
    }

    public StoryAdapter(String[] myDataset){
        mDataset = myDataset;
    }
    public StoryAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        TextView v = LayoutInflater.from(parent.getContext()).inflate(R.layout., parent,false);
    }

    /*
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.news_list, parent, false);
        }

        TextView artSection = convertView.findViewById(R.id.section_text_view);
        TextView artTitle = convertView.findViewById(R.id.title_text_view);
        TextView artAuthor = convertView.findViewById(R.id.author_text_view);
        TextView artDate = convertView.findViewById(R.id.date_text_view);

        return convertView;

    }
    */
}

