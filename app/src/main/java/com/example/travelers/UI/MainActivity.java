package com.example.travelers.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.travelers.R;
import com.google.firebase.database.collection.LLRBNode;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button =  findViewById(R.id.requestTravel);
        button.setBackgroundColor(Color.RED);
    }

    public void AddTravel(View view) {
        Intent intent = new Intent (this,AddTravelActivity.class);
        startActivity(intent);
    }
}