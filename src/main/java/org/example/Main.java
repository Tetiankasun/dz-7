package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // Planets currentPlanet = Planets.MERCURY;

       // System.out.println(currentPlanet.getNumberOfPlanet());
        System.out.println(Arrays.toString(Planets.values()));

        Arrays.stream(Planets.values())
                .forEach(System.out::println);


    }
}