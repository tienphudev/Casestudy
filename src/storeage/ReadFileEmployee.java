package storeage;

import model.Employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadFileEmployee {
    List<Employee> readfile() {
        File file = new File("D:\\Codegym\\phu.txt");
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            List<Employee> employeeList = null;
            employeeList = (List<Employee>) objectInputStream.readObject();
            return employeeList;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            return new ArrayList<>();


        }
    }
}
