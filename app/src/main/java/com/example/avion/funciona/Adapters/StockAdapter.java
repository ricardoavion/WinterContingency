package com.example.avion.funciona.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.avion.funciona.Entities.Item;
import com.example.avion.funciona.R;

import java.util.ArrayList;

public class StockAdapter extends RecyclerView.Adapter<StockViewHolder> {

    ArrayList<Item> stock_list;

    public StockAdapter(ArrayList<Item> stock_list) {
        this.stock_list = stock_list;
    }

    @NonNull
    @Override
    public StockViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View stock_view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_stock,parent,false);
        return new StockViewHolder(stock_view);
    }

    @Override
    public void onBindViewHolder(@NonNull StockViewHolder holder, int position) {
        holder.txt_code.setText(stock_list.get(position).getItem_code());
        holder.txt_name.setText(stock_list.get(position).getItem_name());
        holder.txt_qty.setText(stock_list.get(position).getItem_quntity());
        holder.txt_price.setText(stock_list.get(position).getItem_price());
        holder.txt_cost.setText(stock_list.get(position).getItem_cost());
        holder.img_stock.setImageResource(stock_list.get(position).getItem_image());

    }

    @Override
    public int getItemCount() {
        return stock_list.size();
    }
}
