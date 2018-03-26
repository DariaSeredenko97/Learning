package com.alittleproject.learning.model.buildings.house;

import com.alittleproject.learning.model.buildings.base.Storey;

import java.util.Arrays;
import java.util.List;

public class Floor implements Storey<Apartment> {

    private final List<Apartment> apartments;

    public Floor(final List<Apartment> apartments) {
        this.apartments = apartments;
    }

    public Floor(final Apartment... apartments) {
        this(Arrays.asList(apartments));
    }

    public double getSquare() {
        double allSpace = 0;
        for (Apartment apartment : apartments) {
            allSpace += apartment.getSquare();
        }
        return allSpace;
    }

    public int getSize() {
        return apartments.size();
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    public void removeQuarters(int number) {
        apartments.remove(number);
    }

    public void removeQuarters(Apartment apartment) {
        apartments.remove(apartment);
    }

    public int counterRepair() {
        int counter = 0;
        for (Apartment apartment : apartments) {
            if (apartment.isRepair()) {
                counter++;
            }
        }

        return counter;
    }

    public void repairApartment(final int number) {
        apartments.get(number).setRepair(true);
    }

    public boolean isRepaired() {
        for (Apartment apartment : apartments) {
            if (!apartment.isRepair()) {
                return false;
            }
        }

        return true;
    }


}
