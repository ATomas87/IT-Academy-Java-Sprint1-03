package n2exercici1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurants = new HashSet<>();
        restaurants.add(new Restaurant("El mexicano", 5));
        restaurants.add(new Restaurant("El mexicano", 5));
        restaurants.add(new Restaurant("El mexicano", 4));
        restaurants.add(new Restaurant("El mexicano", 3));
        restaurants.add(new Restaurant("El mexicano", 5));
        restaurants.add(new Restaurant("El mexicano", 5));
        restaurants.add(new Restaurant("El mexicano", 5));

        System.out.println(restaurants);
    }
}
