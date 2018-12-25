package chrikualii.info.catalogmovie.ui;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import chrikualii.info.catalogmovie.Movie;
import chrikualii.info.catalogmovie.R;
import chrikualii.info.catalogmovie.adapter.RecyclerViewAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class NowPlayingFragment extends Fragment {

    RecyclerView recyclerView;

    public NowPlayingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_now_playing, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);


        //add dummy data

        ArrayList<Movie> movies = new ArrayList<>();



        movies.add(new Movie("title 1","overview 1","20 Desember"));
        movies.add(new Movie("title 2","overview 1","20 Desember"));
        movies.add(new Movie("title 3","overview 1","20 Desember"));
        movies.add(new Movie("title 4","overview 1","20 Desember"));
        movies.add(new Movie("title 5","overview 1","20 Desember"));
        movies.add(new Movie("title 6","overview 1","20 Desember"));
        movies.add(new Movie("title 7","overview 1","20 Desember"));
        movies.add(new Movie("title 8","overview 1","20 Desember"));
        movies.add(new Movie("title 9","overview 1","20 Desember"));



        //setReyclcerView
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(movies);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}
