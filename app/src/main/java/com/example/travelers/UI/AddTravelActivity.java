package com.example.travelers.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.travelers.Models.Travel;
import com.example.travelers.R;
import com.example.travelers.UI.ViewModel.TravelViewModel;
import com.example.travelers.UI.ViewModel.*;
public class AddTravelActivity extends AppCompatActivity {

    private TravelViewModel viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_travel);
    }
    viewModel = ViewModelProviders.of(this).get(TravelViewModel);
    final LiveData<Travel> isSuccess = viewModel

}