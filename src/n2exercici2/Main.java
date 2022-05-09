package n2exercici2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Restaurant> restaurantTreeSet = new TreeSet<>();
        restaurantTreeSet.add(new Restaurant("El mexicano", 4));
        restaurantTreeSet.add(new Restaurant("El mexicano", 5));
        restaurantTreeSet.add(new Restaurant("El mexicano", 3));
        restaurantTreeSet.add(new Restaurant("El mexicano", 5));
        restaurantTreeSet.add(new Restaurant("El mexicano", 5));
        restaurantTreeSet.add(new Restaurant("Aranda", 5));
        restaurantTreeSet.add(new Restaurant("El mexicano", 5));
        restaurantTreeSet.add(new Restaurant("Tagliatella", 5));
        restaurantTreeSet.add(new Restaurant("Tagliatella", 3));
        restaurantTreeSet.add(new Restaurant("Tagliatella", 4));
        restaurantTreeSet.add(new Restaurant("Aranda", 1));

        System.out.println("Restaurantes ordenados y sin duplicados mediante interfaz Comparable y TreeSet:");
        System.out.println(restaurantTreeSet);
        System.out.println();

        HashSet<Restaurant> restaurantHashSet = new HashSet<>();
        restaurantHashSet.add(new Restaurant("El mexicano", 4));
        restaurantHashSet.add(new Restaurant("El mexicano", 5));
        restaurantHashSet.add(new Restaurant("El mexicano", 3));
        restaurantHashSet.add(new Restaurant("El mexicano", 5));
        restaurantHashSet.add(new Restaurant("El mexicano", 5));
        restaurantHashSet.add(new Restaurant("Aranda", 5));
        restaurantHashSet.add(new Restaurant("El mexicano", 5));
        restaurantHashSet.add(new Restaurant("Tagliatella", 5));
        restaurantHashSet.add(new Restaurant("Tagliatella", 3));
        restaurantHashSet.add(new Restaurant("Tagliatella", 4));
        restaurantHashSet.add(new Restaurant("Aranda", 1));

        System.out.println("Restaurantes sin duplicados mediante HashSet:");
        System.out.println(restaurantHashSet);
        System.out.println();

        System.out.println("Restaurantes ordenados mediante interfaz Comparable, HashSet para duplicados y List y Collections.sort()");
        List<Restaurant> restaurantList = new ArrayList<>(restaurantHashSet);
        Collections.sort(restaurantList);
        System.out.println(restaurantList);

    }
}
