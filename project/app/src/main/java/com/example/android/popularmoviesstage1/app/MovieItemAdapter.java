package com.example.android.popularmoviesstage1.app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by DELL on 5/6/2016.
 */
public class MovieItemAdapter extends ArrayAdapter<MovieItem> {
    private static final String LOG_TAG = MovieItemAdapter.class.getSimpleName();


    public MovieItemAdapter(Activity context, List<MovieItem> movieItem) {

        super(context, 0, movieItem);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        MovieItem movieItem = getItem(position);


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_item, parent, false);
        }

        ImageView movieView = (ImageView) convertView.findViewById(R.id.item_image);
        movieView.setImageResource(movieItem.image);


        return convertView;
    }
}
