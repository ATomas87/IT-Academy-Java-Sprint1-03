package n3exercici1.filehandler;

import n3exercici1.model.Persona;

import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {
    public SaveFile() {
    }

    public static void save(Persona persona, String fileURI) {
        try {
            FileWriter file = new FileWriter(fileURI, true);
            file.write(persona.getName() + "," + persona.getSurname() + "," +persona.getDni() + "\r\n");
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
