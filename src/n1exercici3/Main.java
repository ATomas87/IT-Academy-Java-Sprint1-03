package n1exercici3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile("src/n1exercici3/countries.txt");
        HashMap<String,String> paises = readFile.parseFile();
        CountryGuessGame countryGuessGame = new CountryGuessGame(paises);
        countryGuessGame.start();
    }
}
