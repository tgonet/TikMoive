package com.example.tikmoive;

import Anroidx.cardview.widget.CardView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Favourites extends AppCompatActivity{
    Spinner spinnerLanguages=findViewById(R.id.spinner_languages);

    ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.languages, android.R.layout.simple_spinner_item);

adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button registerButton = findViewById(R.id.button2);

            registerButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Register.class);
                    startActivity(intent);
                }
            });
            spinnerLangauges.setAdapter(adapter);
        }




}




