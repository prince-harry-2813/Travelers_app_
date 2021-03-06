package com.example.travelers.Models;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class TravelDataSource extends AppCompatActivity {



    private MutableLiveData<Boolean> isSuccess= new MutableLiveData<>();
    public LiveData<Boolean> getIsSuccess() {
        return isSuccess;
    }


    public interface changedListener {
        void change();
    }

    private changedListener listener;

    public void setChangedListener(changedListener l) {
        listener = l;
    }


    public List<Travel> getTravelsList() {
        return travelsList;
    }

    List<Travel> travelsList;
    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    DatabaseReference travels = firebaseDatabase.getReference("ExistingTravels");

    public TravelDataSource() {
    }

    private static TravelDataSource instance;

    public static TravelDataSource getInstance() {
        if (instance == null)
            instance = new TravelDataSource();
        return instance;
    }


    public void addTravel(Travel p) {
        String id = travels.push().getKey();
        p.setTravelId(id);
        travels.child(id).setValue(p).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                isSuccess.setValue(true);
                isSuccess.setValue(null);
            }


        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                isSuccess.setValue(false);
                isSuccess.setValue(null);
            }
        });
    }
}
