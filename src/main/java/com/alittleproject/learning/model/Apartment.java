package com.alittleproject.learning.model;

public class Apartment implements Quarters{

    private static final int DEFAULT_COUNT_ROOM = 2;

    private static final double DEFAULT_SQUARE = 20;

    private static final boolean DEFAULT_REPAIR = false;

    private int countRoom;

    private double square;

    private boolean repair;

    public Apartment(int countRoom, double square, boolean repair){
        this.countRoom = countRoom;
        this.square = square;
        this.repair = repair;
    }

    public Apartment(int countRoom, double square){
        this(countRoom, square, DEFAULT_REPAIR);
    }

    public Apartment(int countRoom){
        this(countRoom, DEFAULT_SQUARE);
    }

    public Apartment(){
        this(DEFAULT_COUNT_ROOM);
    }

    public int getCountRoom() {
        return countRoom;
    }

    public void setCountRoom(int countRoom) {
        this.countRoom = countRoom;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public boolean isRepair() {
        return repair;
    }

    public void setRepair(boolean repair) {
        this.repair = repair;
    }
}
