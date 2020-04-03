package main;

import logic.City;
import logic.Country;
import logic.House;

public class Main {
    public static void main(String[] args) {

        Country country = new Country();
        City city = new City();
        House house = new House();

        country.makeTaxesHigher();
        System.out.println();

        city.makeTaxesHigher();
        System.out.println();

        house.makeTaxesHigher();
        System.out.println();

    }
}
