package com.example.tikmoive;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MessageViewHolder1 extends RecyclerView.ViewHolder {
    ImageView poster;
    TextView title;
    public MessageViewHolder1(View item) {
        super(item);
        poster = (ImageView) item.findViewById(R.id.poster2);
        title = (TextView) item.findViewById(R.id.title2);
    }
}
