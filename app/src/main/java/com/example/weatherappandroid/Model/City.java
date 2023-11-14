package com.example.weatherappandroid.Model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class City {
    public int id;
    public String name;
    public Coord coord;
    public String country;

    DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();


}
