package com.example.travelers.Repository;

import androidx.lifecycle.LiveData;

import com.example.travelers.Models.Travel;
import com.example.travelers.Models.TravelDataSource;

public class Repository {
private TravelDataSource travelDataSource;
public  Repository(){
    travelDataSource= new TravelDataSource();
}
public LiveData<Boolean> travelUpdate(){
return travelDataSource.getIsSuccess();
}
public void addTravel(Travel travel){
    travelDataSource.addTravel(travel);
}
}
