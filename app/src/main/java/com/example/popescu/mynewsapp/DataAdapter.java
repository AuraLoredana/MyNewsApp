package com.example.popescu.mynewsapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by POPESCU on 7/24/2017.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<AndroidPublication> android;

    public DataAdapter(ArrayList<AndroidPublication> android) {
        this.android = android;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.tv_id.setText(android.get(i).getId());
        viewHolder.tv_type.setText(android.get(i).getType());
        viewHolder.tv_sectionName.setText(android.get(i).getSectionName());
    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_id,tv_type,tv_sectionName;
        public ViewHolder(View view) {
            super(view);

            tv_id = (TextView)view.findViewById(R.id.tv_id);
            tv_type = (TextView)view.findViewById(R.id.tv_type);
            tv_sectionName = (TextView)view.findViewById(R.id.tv_sectionName);

        }
    }

}
