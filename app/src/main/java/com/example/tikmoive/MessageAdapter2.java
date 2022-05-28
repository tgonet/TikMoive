package com.example.tikmoive;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class MessageAdapter2 extends RecyclerView.Adapter<MessageViewHolder2> {
    ArrayList<Movie> data;
    Context c;

    public MessageAdapter2(ArrayList<Movie> data, Context c) {
        this.data = data;
        this.c = c;
    }

    @NonNull
    @Override
    public MessageViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item;
        item = LayoutInflater.from(parent.getContext()).inflate(R.layout.trending_layout,null,false);
        return new MessageViewHolder2(item);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder2 holder, int position) {
        Movie content = data.get(position);
        holder.title.setText(content.Title);
        try {
            URL newurl = new URL(content.Posterurl);
            Bitmap mIcon_val = BitmapFactory.decodeStream(newurl.openConnection().getInputStream());
            holder.poster.setImageBitmap(mIcon_val);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
