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

public class ReadFileProduct {
    public List<Employee> readFileProducr() {

        File file = new File("phu.doc");
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            List<Employee> employeeList = null;
            employeeList = (List<Employee>) objectInputStream.readObject();
            return employeeList;
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            return new ArrayList<>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
