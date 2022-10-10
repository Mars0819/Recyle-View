package com.example.recylerview;

public class ClubModel {
    private String name;
    private String logo;

    public ClubModel(String name, String logo){
        this.name=name;
        this.logo=logo;
    }
    public  String getName(){return this.name;}
    public  String getLogo(){return this.logo;}

}
