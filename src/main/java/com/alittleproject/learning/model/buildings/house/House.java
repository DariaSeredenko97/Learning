package com.alittleproject.learning.model.buildings.house;

import com.alittleproject.learning.model.buildings.base.Building;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class House implements Building<Floor>{

    public final  List<Floor> floors;

    public House(List<Floor> floors){
        this.floors = floors;
    }

    public House(){
        this(new ArrayList<Floor>());
    }

    public void addFloor(Floor floor){
        floors.add(floor);
    }

    public void removeFloor(int number){
        floors.remove(number);
    }

    public void removeFloor(Floor floor){
        floors.remove(floor);
    }

    public double getSquare(){
        double counter = 0;
        for (Floor floor : floors) {
            counter += floor.getSquare();
        }
        return counter;
    }

    public int getSize(){
        return floors.size();
    }

    public int getQuartersCount(){
        int counter = 0;
        for (Floor floor : floors) {
            counter += floor.getSize();
        }
        return counter;
    }

    public boolean isRepaired(){
        for (Floor floor : floors) {
            if(!floor.isRepaired()){
                return false;
            }
        }

        return true;
    }

    public Floor getFloor(int number){
        return floors.get(number);
    }


}
