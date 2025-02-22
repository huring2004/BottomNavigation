package com.excerise.bottomnavigation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.excerise.bottomnavigation.R;
import com.excerise.bottomnavigation.model.Message;

import java.util.ArrayList;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder>{


    private final ArrayList<Message> messageArrayList;

    public MessageAdapter(ArrayList<Message> messageArrayList) {
        this.messageArrayList = messageArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.message_adapter,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Message message = messageArrayList.get(position);
        holder.imageView.setImageResource(message.getId_image());
        holder.textView1.setText(message.getName());
        holder.textView2.setText(message.getTitle());
        holder.textView3.setText(message.getHour());
    }

    @Override
    public int getItemCount() {
        return messageArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView1,textView2,textView3;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview);
            textView1 = itemView.findViewById(R.id.tv1);
            textView2 = itemView.findViewById(R.id.tv2);
            textView3 = itemView.findViewById(R.id.tv3);
        }
    }
}
