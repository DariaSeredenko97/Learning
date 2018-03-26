package com.alittleproject.learning.model.buildings.base;

public interface Storey <T extends Quarters> {

    double getSquare();

    int getSize();

    void addApartment(T t);

    void removeQuarters(int number);

    void removeQuarters(T t);


}
