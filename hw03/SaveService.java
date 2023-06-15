package hw03;

import java.io.FileWriter;
import java.io.IOException;

import hw03.exceptions.SaveException;

public class SaveService {
    private String filename;

    public SaveService(String filename) {
        this.filename = "hw03\\" + filename + ".txt";
    }

    public void save(Contact contact) throws SaveException{
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(contact.toString());
            writer.write("\n");
        } catch (IOException e) {
            throw new SaveException("ошибка записи файла: " + filename);
        }
    }
}
