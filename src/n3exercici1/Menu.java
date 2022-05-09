package n3exercici1;

import n3exercici1.comparator.PersonaDniComparator;
import n3exercici1.comparator.PersonaNameComparator;
import n3exercici1.comparator.PersonaSurnameComparator;
import n3exercici1.filehandler.ReadFile;
import n3exercici1.filehandler.SaveFile;
import n3exercici1.model.Persona;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Persona> personas;
    private String fileURI;
    private ReadFile readFile;

    public Menu(String fileURI) {
        this.fileURI = fileURI;
        readFile = new ReadFile(fileURI);
        this.personas = readFile.parseFile();
    }

    public void showMenu(){
        System.out.println("1.- Introducir persona");
        System.out.println("2.- Mostrar las personas ordenadas por nombre (A-Z)");
        System.out.println("3.- Mostrar las personas ordenadas por nombre (Z-A)");
        System.out.println("4.- Mostrar las personas ordenadas por apellidos (Z-A)");
        System.out.println("5.- Mostrar las personas ordenadas por apellidos (Z-A)");
        System.out.println("6.- Mostrar las personas ordenadas por DNI (1-9)");
        System.out.println("7.- Mostrar las personas ordenadas por DNI (9-1)");
        System.out.println("0.- Salir");
    }

    public void enterPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("** Introducir persona **");
        System.out.println("Escribe el nombre:");
        String name = scanner.nextLine();
        System.out.println("Escribe los apellidos:");
        String surnames = scanner.nextLine();
        System.out.println("Escribe el DNI:");
        String dni = scanner.nextLine();
        Persona persona = new Persona(name, surnames, dni);
        this.personas.add(persona);
        SaveFile.save(persona, fileURI);
    }

    public void showPersonsByNameAsc(){
        personas.sort(new PersonaNameComparator());
        System.out.println("__Nombre__   __Apellidos__   __NIF__");
        for (Persona p : personas){
            System.out.printf("%8s%24s%16s%n", p.getName(), p.getSurname(), p.getDni());
        }
    }

    public void showPersonsByNameDesc(){
        personas.sort(new PersonaNameComparator().reversed());
        System.out.println("__Nombre__   __Apellidos__   __NIF__");
        for (Persona p : personas){
            System.out.printf("%8s%24s%16s%n", p.getName(), p.getSurname(), p.getDni());
        }
    }

    public void showPersonsBySurnameAsc(){
        personas.sort(new PersonaSurnameComparator());
        System.out.println("__Nombre__   __Apellidos__   __NIF__");
        for (Persona p : personas){
            System.out.printf("%8s%24s%16s%n", p.getName(), p.getSurname(), p.getDni());
        }
    }

    public void showPersonsBySurnameDesc(){
        personas.sort(new PersonaSurnameComparator().reversed());
        System.out.println("__Nombre__   __Apellidos__   __NIF__");
        for (Persona p : personas){
            System.out.printf("%8s%24s%16s%n", p.getName(), p.getSurname(), p.getDni());
        }
    }

    public void showPersonsByDniAsc(){
        personas.sort(new PersonaDniComparator());
        System.out.println("__Nombre__   __Apellidos__   __NIF__");
        for (Persona p : personas){
            System.out.printf("%8s%24s%16s%n", p.getName(), p.getSurname(), p.getDni());
        }
    }

    public void showPersonsByDniDesc(){
        personas.sort(new PersonaDniComparator().reversed());
        System.out.println("__Nombre__   __Apellidos__   __NIF__");
        for (Persona p : personas){
            System.out.printf("%8s%24s%16s%n", p.getName(), p.getSurname(), p.getDni());
        }
    }
}
