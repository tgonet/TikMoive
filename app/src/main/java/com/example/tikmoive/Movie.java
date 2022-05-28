package com.example.tikmoive;

import android.widget.ImageView;

public class Movie {
    String Title;
    Boolean Favourite;
    String Posterurl;

    public Movie (String title, Boolean favourite, String poster) {
        this.Title = title;
        this.Favourite = favourite;
        this.Posterurl = poster;
    }
}
