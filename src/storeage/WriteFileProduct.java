package storeage;

import model.Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.List;

public class WriteFileProduct {
    public void writeFile(List<Employee> employeeList) {
        File file = new File("phu.doc");
        try {
            OutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOnputStream = new ObjectOutputStream(outputStream);
            objectOnputStream.writeObject(employeeList);
            objectOnputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
