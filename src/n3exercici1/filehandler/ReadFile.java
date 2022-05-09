package n3exercici1.filehandler;

import n3exercici1.model.Persona;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private File file;
    private FileReader fileReader;
    private BufferedReader bufferedReader;


    public ReadFile(String fileURI) {
        try {
            file = new File(fileURI);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Persona> parseFile() {
        String line;
        List<Persona> people = new ArrayList<>();
        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineSplitted = line.split(",");
                people.add(new Persona(lineSplitted[0],lineSplitted[1],lineSplitted[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return people;
    }
}

