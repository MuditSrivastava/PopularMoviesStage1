package com.example.android.popularmoviesstage1.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.Arrays;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private MovieItemAdapter MovieAdapter;
    MovieItem[] movieItems = {
            new MovieItem(R.drawable.interstellar),
            new MovieItem(R.drawable.interstellar),
            new MovieItem(R.drawable.interstellar),
            new MovieItem(R.drawable.interstellar),
            new MovieItem(R.drawable.interstellar),
            new MovieItem(R.drawable.interstellar),
            new MovieItem(R.drawable.interstellar),
            new MovieItem(R.drawable.interstellar),
            new MovieItem(R.drawable.interstellar),
            new MovieItem(R.drawable.interstellar),
            new MovieItem(R.drawable.interstellar),
            new MovieItem(R.drawable.interstellar),
    };

    public MainActivityFragment() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        MovieAdapter = new MovieItemAdapter(getActivity(), Arrays.asList(movieItems));


        GridView gridView = (GridView) rootView.findViewById(R.id.items_grid);
        gridView.setAdapter(MovieAdapter);
    return rootView;
    }
}

