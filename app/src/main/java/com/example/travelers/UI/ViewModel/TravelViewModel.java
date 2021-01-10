package com.example.travelers.UI.ViewModel;

import android.app.Application;



import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.travelers.Models.Travel;
import com.example.travelers.Repository.Repository;


public class TravelViewModel extends ViewModel {

    private Repository repository ;

    public TravelViewModel(){
        repository = new Repository();
    }

    public LiveData<Boolean> updateTravel(){
        return repository.travelUpdate();
    }

    public void addTravel(Travel travel){
        repository.addTravel(travel);
    }

}
