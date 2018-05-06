package com.alittleproject.learning.model.buildings.stock;

import com.alittleproject.learning.model.buildings.base.Storey;

import java.util.Arrays;
import java.util.List;

public class StorageFloor implements Storey<StorageRoom> {

    private final List<StorageRoom> storageRooms;

    public StorageFloor(List<StorageRoom> storageRooms) {
        this.storageRooms = storageRooms;
    }

    public StorageFloor(StorageRoom... storageRooms) {
        this(Arrays.asList(storageRooms));
    }

    public double getSquare() {
        double square = 0.0;
        for (StorageRoom storageRoom : storageRooms) {
            square = square + storageRoom.getSquare();
        }
        return square;
    }

    public int getSize() {
        return storageRooms.size();
    }

    public void addApartment(StorageRoom storageRoom) {
        storageRooms.add(storageRoom);
    }

    public void removeQuarters(int number){
        storageRooms.remove(number);
    }

    public void removeQuarters(StorageRoom storageRoom){
        storageRooms.remove(storageRoom);
    }





}
