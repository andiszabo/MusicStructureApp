package com.example.android.musicstructureapp;

/**
 * {@link Song} represents a single song that the user wants to listen to.
 * It contains the author and the title of the song.
 */
public class Song {

    /** The author of the song. (band, singer... etc.) */
    private String mAuthor;

    /** The title of the song. */
    private String mTitle;

    /**
     * Create a new Song object.
     *
     * @param author is the name of the band, singer... etc. of the song.
     * @param title is the title of the song.
     */
    public Song(String author, String title) {
        mAuthor = author;
        mTitle = title;
    }

    /**
     * Get the author of the song.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Get the title of the song.
     */
    public String getTitle() {
        return mTitle;
    }

}