package DataAccessInterface;


import java.io.IOException;

public interface DataAccess {
    // save data relative to user to filepath
    void saveToFile(String filepath, Object o) throws IOException;
    // read data relative to user from filepath
     <T> T readFromFile(String filepath) throws IOException, ClassNotFoundException;

}
