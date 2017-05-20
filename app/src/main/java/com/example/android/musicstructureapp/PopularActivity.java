package com.example.android.musicstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Populars activity shows most popular songs in general at the time of viewing.
 */

public class PopularActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Ed Sheeran", "Perfect"));
        songs.add(new Song("Ed Sheeran", "Galway girl"));
        songs.add(new Song("Ed Sheeran", "Shape of you"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // song_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // This sets up a textview to the bottom of the page to explain this musical structure app features
        TextView comment = (TextView) findViewById(R.id.comment);
        comment.setText("In this activity user sees the most popular songs at the time of viewing (titles and authors of songs). With play/pause buttons (this OnClickListener method can be solved with an if/else statement to change button's picture as well) can start/stop playing the song.\nIf we would like to add album cover pictures as well to each song, just needs to extand the arraylists with 3. picture attribute like in miwok app with pictures of words.\nCan add a Favourite button to every list element and make up a new activity with users favourite songs.");
    }
}
