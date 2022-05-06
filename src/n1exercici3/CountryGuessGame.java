package n1exercici3;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class CountryGuessGame {
    private String player;
    private int triesNumber;
    private int points;
    private final HashMap countries;

    public CountryGuessGame(HashMap countries) {
        this.countries = countries;
    }

    public void start(){
        init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        this.player = scanner.nextLine();
        this.points = 0;
        this.triesNumber = 10;
        play();
    }

    private void play() {
        Scanner scanner = new Scanner(System.in);
        String capital;
        for (int i = 0; i < triesNumber; i++){
            String randomCountry = getRandomCountryName();
            System.out.println("Escribe la capital de " + randomCountry);
            capital = scanner.nextLine();
            if (capital.equals(countries.get(randomCountry))){
                points++;
            }
        }
        SaveFile.save(player, points);
    }

    private String getRandomCountryName(){
        Random random = new Random();
        Object[] countriesNames = countries.keySet().toArray();
        return (String) countriesNames[random.nextInt(countriesNames.length)];
    }
}
