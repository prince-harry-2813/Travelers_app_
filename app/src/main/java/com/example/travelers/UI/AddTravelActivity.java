package com.example.travelers.UI;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.app.DatePickerDialog;
import android.location.Location;
import android.os.Bundle;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.example.travelers.Models.Travel;
import com.example.travelers.Models.UserLocation;
import com.example.travelers.R;
import com.example.travelers.UI.ViewModel.TravelViewModel;
import com.example.travelers.UI.ViewModel.*;

import java.util.ArrayList;
import java.util.List;

public class AddTravelActivity extends AppCompatActivity {

    private Travel travel;

    private TravelViewModel travelViewModel;

    UserLocation Destination ,userLocation = new UserLocation();

    private List<EditText> fields = new ArrayList<EditText>(8);

    private List<UserLocation> destination = new ArrayList<UserLocation>();

    DatePickerDialog datePickerDialog;

    EditText DepartDate, ReturnDate;

    Button addAddress, sendRequest;

    boolean Express;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_add_travel);

    travelViewModel= new  ViewModelProvider(this).get(TravelViewModel.class);
    travelViewModel.updateTravel().observe(this, new Observer<Boolean>() {
        @Override
        public void onChanged(Boolean aBoolean) {
            if (aBoolean)
                success();
            else
                failed();
        }
    });
    }

    private void failed() {
    }

    private void success() {
    }
}