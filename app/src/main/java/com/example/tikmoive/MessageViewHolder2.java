package com.example.tikmoive;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MessageViewHolder2 extends RecyclerView.ViewHolder {
    ImageView poster;
    TextView title;
    public MessageViewHolder2(View item) {
        super(item);
        poster = (ImageView) item.findViewById(R.id.poster3);
        title = (TextView) item.findViewById(R.id.title3);
    }
}
