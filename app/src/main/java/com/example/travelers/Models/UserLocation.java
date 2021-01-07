package com.example.travelers.Models;

import android.location.Location;

public class UserLocation {
    private Double lat;
    private Double lon;

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public UserLocation(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "UserLocation{" +
                "lat=" + lat +
                ", lon=" + lon +
                '}';
    }

    public UserLocation() {
    }





    public UserLocation convertFromLocation(Location location){
        if (location==null)
            return null;
        return new UserLocation(location.getLatitude(),location.getLongitude());
    }
}
