package com.alittleproject.learning.model.buildings.base;

public interface Building<T extends Storey> {

    void addFloor(T t);

    void removeFloor(int number);

    void removeFloor(T t);

    double getSquare();

    int getSize();

    int getQuartersCount();
}
