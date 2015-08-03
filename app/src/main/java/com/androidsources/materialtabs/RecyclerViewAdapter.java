package com.androidsources.materialtabs;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Gowtham Chandrasekar on 31-07-2015.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<RowData> itemList;
    private Context context;

    public RecyclerViewAdapter(Context context, List<RowData> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("RecyclingTest","onCreateViewHolder method is called");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, null);
        RecyclerViewHolder viewHolder = new RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        Log.d("RecyclingTest","onBindViewHolder method is called");
        holder.userName.setText(itemList.get(position).getName());
        holder.callDetails.setText(itemList.get(position).getCallDetails());
        holder.profileImage.setImageResource(itemList.get(position).getProfilePic());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
