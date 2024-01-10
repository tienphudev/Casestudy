package storeage;

import model.Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.List;

public class WriteFileEmployee {
    public void writeFile(List<Employee>employeeList){
        File file= new File("phu.txt");
        try{
            OutputStream outputStream= new FileOutputStream(file);
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(employeeList);
            objectOutputStream.close();
            outputStream.close();
        }catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
