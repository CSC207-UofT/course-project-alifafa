package DataAccess;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public interface DataAccess {

    void saveToFile(String filepath, Object o) throws IOException;
    public <T> T readFromFile(String filepath) throws IOException, ClassNotFoundException;

}
