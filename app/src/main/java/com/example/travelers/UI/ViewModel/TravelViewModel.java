package com.example.travelers.UI.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.travelers.Models.Travel;

public class TravelViewModel extends AndroidViewModel {
    public TravelViewModel(@NonNull Application application) {
        super(application);
    }
    LiveData<Travel> getItems(){
        return
    }
}
