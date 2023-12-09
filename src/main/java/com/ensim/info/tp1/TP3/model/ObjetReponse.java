package com.ensim.info.tp1.TP3.model;

import java.util.ArrayList;
import java.util.List;

public class ObjetReponse{
    public List<Feature> features = new ArrayList<>();

    public String toString(){
        return features.toString();
    }
}