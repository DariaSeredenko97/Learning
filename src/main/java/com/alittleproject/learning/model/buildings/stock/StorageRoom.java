package com.alittleproject.learning.model.buildings.stock;

import com.alittleproject.learning.model.buildings.base.Quarters;

public class StorageRoom implements Quarters{

    private static final int DEFAULT_COUNT_ROOM = 1;

    private static final double DEFAULT_SQUARE = 60;

    private static final int DEFAULT_MAX_FULLNESS = 100;

    private int countRoom;

    private double square;

    private int fullness;

    public StorageRoom(int countRoom, double square, int fullness) {
        this.square = square;
        this.countRoom = countRoom;
        this.fullness = fullness;
    }

    public StorageRoom(int countRoom, double square) {
        this(countRoom, square, DEFAULT_MAX_FULLNESS);
    }

    public StorageRoom(double square, int fullness) {
        this(DEFAULT_COUNT_ROOM, square, fullness);
    }

    public StorageRoom(int countRoom) {
        this(countRoom, DEFAULT_SQUARE);
    }

    public StorageRoom() {
        this(DEFAULT_COUNT_ROOM);
    }

    public int getCountRoom(){
        return countRoom;
    }

    public void setCountRoom(int countRoom){
        this.countRoom = countRoom;
    }

    public double getSquare(){
        return square;
    }

    public void setSquare(double square){
        this.square = square;
    }

    public int getFullness(){
        return fullness;
    }

    public void setFullness(int fullness){
        this.fullness = fullness;
    }




}
