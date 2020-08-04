package com.mohamedsobhy.movies_mvvm_recyclerview.views.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mohamedsobhy.movies_mvvm_recyclerview.model.MovieModel;

import java.util.ArrayList;


public class MovieViewModel extends ViewModel {

    public MutableLiveData<ArrayList<MovieModel>> movieNameMutableLiveData = new MutableLiveData<>();

    public void getMovieName(){
        movieNameMutableLiveData.setValue(getMovieFromDatabase());
    }

    private ArrayList<MovieModel> getMovieFromDatabase(){

        ArrayList<MovieModel> arrayList = new ArrayList<>();
        arrayList.add(new MovieModel("Movie Name 1" , "1-1-1997" , "desc 1" , 1));
        arrayList.add(new MovieModel("Movie Name 2" , "1-1-1997" , "desc 2" , 2));
        arrayList.add(new MovieModel("Movie Name 3" , "1-1-1997" , "desc 3" , 3));
        arrayList.add(new MovieModel("Movie Name 4" , "1-1-1997" , "desc 4" , 4));
        arrayList.add(new MovieModel("Movie Name 5" , "1-1-1997" , "desc 5" , 5));
        arrayList.add(new MovieModel("Movie Name 6" , "1-1-1997" , "desc 6" , 6));
        arrayList.add(new MovieModel("Movie Name 7" , "1-1-1997" , "desc 7" , 7));
        arrayList.add(new MovieModel("Movie Name 8" , "1-1-1997" , "desc 8" , 8));
        arrayList.add(new MovieModel("Movie Name 9" , "1-1-1997" , "desc 9" , 9));
        arrayList.add(new MovieModel("Movie Name 10" , "1-1-1997" , "desc 10" , 10));

        return arrayList;
    }
}
