package com.mohamedsobhy.movies_mvvm_recyclerview.views.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.mohamedsobhy.movies_mvvm_recyclerview.R;
import com.mohamedsobhy.movies_mvvm_recyclerview.databinding.ActivityMainBinding;
import com.mohamedsobhy.movies_mvvm_recyclerview.model.MovieModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    MovieViewModel movieViewModel;
    MovieListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this , R.layout.activity_main);

        movieViewModel = new ViewModelProvider(this).get(MovieViewModel.class);
        binding.setViewModel(movieViewModel);

        adapter = new MovieListAdapter();
        binding.recyclerview.setAdapter(adapter);
        movieViewModel.movieNameMutableLiveData.observe(this, new Observer<ArrayList<MovieModel>>() {
            @Override
            public void onChanged(ArrayList<MovieModel> movieModels) {
                adapter.setList(movieModels);
            }
        });
        binding.recyclerview.setLayoutManager(new LinearLayoutManager(this));

        binding.setLifecycleOwner(this);
    }
}