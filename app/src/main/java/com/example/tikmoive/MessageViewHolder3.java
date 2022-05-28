package com.example.tikmoive;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MessageViewHolder3 extends RecyclerView.ViewHolder {
    ImageView poster;
    TextView title;
    public MessageViewHolder3(View item) {
        super(item);
        poster = item.findViewById(R.id.poster1);
        title = item.findViewById(R.id.title1);
    }
}