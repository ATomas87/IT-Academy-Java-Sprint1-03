package n3exercici1;

import n3exercici1.comparator.*;
import n3exercici1.filehandler.ReadFile;
import n3exercici1.model.Persona;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu("src/n3exercici1/contactos.csv");
        Scanner scanner = new Scanner(System.in);
        do {
            menu.showMenu();
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    menu.enterPerson();
                    break;
                case 2:
                    menu.showPersonsByNameAsc();
                    break;
                case 3:
                    menu.showPersonsByNameDesc();
                case 4:
                    menu.showPersonsBySurnameAsc();
                    break;
                case 5:
                    menu.showPersonsBySurnameDesc();
                    break;
                case 6:
                    menu.showPersonsByDniAsc();
                    break;
                case 7:
                    menu.showPersonsByDniDesc();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Introduce una opción válida:");
            }
        } while (true);
    }
}
