package com.example.tikmoive;

import static java.net.Proxy.Type.HTTP;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

public class PotentialMoviesDisplayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potential_movies_display);
        // call api (TO DO)
        ArrayList<Movie> movies = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String apiURL = "https://api.themoviedb.org/3/movie/33" + i + "?api_key=be502e9c057a2e9b0f167960c5c61782";
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            JsonObjectRequest objectRequest = new JsonObjectRequest(
                    Request.Method.GET,
                    apiURL,
                    null,
                    response -> {
                        try {
                            String imageurl = "https://image.tmdb.org/t/p/w500" + response.getString("poster_path");
                            movies.add(new Movie(response.getString("title"),false,imageurl));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    },
                    error -> Log.e("Rest Response",error.toString())
            );
            requestQueue.add(objectRequest);
        }

        RecyclerView rv1 = findViewById(R.id.suggestview);
        MessageAdapter1 adapter1 = new MessageAdapter1(movies,PotentialMoviesDisplayActivity.this);
        LinearLayoutManager layout1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rv1.setAdapter(adapter1);
        rv1.setLayoutManager(layout1);

        RecyclerView rv2 = findViewById(R.id.trendingview);
        MessageAdapter2 adapter2 = new MessageAdapter2(movies,PotentialMoviesDisplayActivity.this);
        LinearLayoutManager layout2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rv2.setAdapter(adapter2);
        rv2.setLayoutManager(layout2);

        RecyclerView rv3 = findViewById(R.id.lastviewedview);
        MessageAdapter3 adapter3 = new MessageAdapter3(movies,PotentialMoviesDisplayActivity.this);
        LinearLayoutManager layout3 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rv3.setAdapter(adapter3);
        rv3.setLayoutManager(layout3);
    }
}