package com.example.android.musicstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link SongAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Song} objects.
 */
public class SongAdapter extends ArrayAdapter<Song> {

    /**
     * Create a new {@link SongAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Song}s to be displayed.
     */
    public SongAdapter(Context context, ArrayList<Song> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID authors.
        TextView authorTextView = (TextView) listItemView.findViewById(R.id.authors);
        // Get the author from the currentSong object and set this text on
        // the author TextView.
        authorTextView.setText(currentSong.getAuthor());

        // Find the TextView in the list_item.xml layout with the ID song_titles.
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_titles);
        // Get the song title from the currentSong object and set this text on
        // the song TextView.
        songTextView.setText(currentSong.getTitle());

        // Set the theme for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}