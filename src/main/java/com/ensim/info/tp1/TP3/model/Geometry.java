package com.ensim.info.tp1.TP3.model;

import java.util.ArrayList;

public class Geometry {
    private ArrayList<Float> coordinates=new ArrayList<Float>();

    public String toString(){
        return coordinates.toString();
    }

    public ArrayList<Float> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Float> coordinates) {
        this.coordinates = coordinates;
    }
}
