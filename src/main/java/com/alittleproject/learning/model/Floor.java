package com.alittleproject.learning.model;

import java.util.Arrays;
import java.util.List;

public class Floor implements Storey{

    private final List<Quarters> apartments;

    public Floor(final List<Quarters> apartments) {
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

    public void addQuarters(Quarters quarters) {
        apartments.add(quarters);
    }

    public void removeQuarters(int number) {
        apartments.remove(number);
    }

    public void removeQuarters(Quarters quarters) {
        apartments.remove(quarters);
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
