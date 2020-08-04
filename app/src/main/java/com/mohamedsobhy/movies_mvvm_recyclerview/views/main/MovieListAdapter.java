package com.mohamedsobhy.movies_mvvm_recyclerview.views.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mohamedsobhy.movies_mvvm_recyclerview.R;
import com.mohamedsobhy.movies_mvvm_recyclerview.model.MovieModel;

import java.util.ArrayList;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieViewHolder> {

    private ArrayList<MovieModel>moviesList = new ArrayList<>();

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MovieViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie_list ,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        holder.movieNameTextView.setText(moviesList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public void setList(ArrayList<MovieModel> moviesList){
        this.moviesList = moviesList;
        notifyDataSetChanged();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {

        TextView movieNameTextView;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            movieNameTextView = itemView.findViewById(R.id.movie_name_tv);
        }
    }
}
