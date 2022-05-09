package n3exercici1.comparator;

import n3exercici1.model.Persona;

import java.util.Comparator;

public class PersonaNameComparator implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
