package com.example.android.musicstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the new releases category
        ImageView release = (ImageView) findViewById(R.id.new_release);
        // Set a click listener on that View
        release.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the new releases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent releaseIntent = new Intent(MainActivity.this, ReleaseActivity.class);
                startActivity(releaseIntent);
            }
        });

        // Find the View that shows the recommended category
        ImageView recommend = (ImageView) findViewById(R.id.recommended);
        // Set a click listener on that View
        recommend.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the recommended View is clicked on.
            @Override
            public void onClick(View view) {
                Intent recommendIntent = new Intent(MainActivity.this, RecommendActivity.class);
                startActivity(recommendIntent);
            }
        });

        // Find the View that shows the popular category
        ImageView popular = (ImageView) findViewById(R.id.popular);
        // Set a click listener on that View
        popular.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the popular View is clicked on.
            @Override
            public void onClick(View view) {
                Intent popularIntent = new Intent(MainActivity.this, PopularActivity.class);
                startActivity(popularIntent);
            }
        });

        // Find the View that shows the greatest hits category
        ImageView greatest = (ImageView) findViewById(R.id.greatest);
        // Set a click listener on that View
        greatest.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the greatest hits View is clicked on.
            @Override
            public void onClick(View view) {
                Intent greatestIntent = new Intent(MainActivity.this, GreatestActivity.class);
                startActivity(greatestIntent);
            }
        });
    }
}
