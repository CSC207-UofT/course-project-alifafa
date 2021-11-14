package DataAccessInterface;


import java.io.IOException;

public interface DataAccess {

    void saveToFile(String filepath, Object o) throws IOException;
     <T> T readFromFile(String filepath) throws IOException, ClassNotFoundException;

}
