package n1exercici3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {
    public SaveFile() {
    }

    public static void save(String player, int points) {
        try {
            FileWriter file = new FileWriter(new File(System.getProperty("user.home"), "clasificaciÃ³.txt"));
            file.write(player + "," + points);
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
