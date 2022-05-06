package n1exercici3;

import java.io.*;
import java.util.HashMap;

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

    public HashMap<String, String> parseFile() {
        String line;
        HashMap<String, String> countries = new HashMap<>();
        try {
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineSplitted = line.split(",");
                countries.put(lineSplitted[0], lineSplitted[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countries;
    }
}

