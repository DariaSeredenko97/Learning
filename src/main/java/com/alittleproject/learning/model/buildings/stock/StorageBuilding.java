package com.alittleproject.learning.model.buildings.stock;

import com.alittleproject.learning.model.buildings.base.Building;

import java.util.ArrayList;
import java.util.List;

public class StorageBuilding implements Building<StorageFloor> {

    public final List<StorageFloor> storageFloor;

    public StorageBuilding(List<StorageFloor> storageFloor) {
        this.storageFloor = storageFloor;
    }

    public StorageBuilding() {
        this(new ArrayList<StorageFloor>());
    }

    public void addFloor(StorageFloor storageFloor){
        this.storageFloor.add(storageFloor);
    }

    public void removeFloor(int number){
        storageFloor.remove(number);
    }

    public void removeFloor(StorageFloor storageFloor){
        this.storageFloor.remove(storageFloor);
    }

    public double getSquare(){
        double square = 0.0;
        for (StorageFloor floor : storageFloor) {
            square += floor.getSquare();
        }
        return square;
    }

    public int getSize(){
        return storageFloor.size();
    }

    public int getQuartersCount(){
        int counter = 0;
        for (StorageFloor floor : storageFloor) {
            counter += floor.getSize();
        }
        return counter;
    }

}
