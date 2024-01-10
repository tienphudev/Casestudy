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
    public void writeFile(List<Employee> employeeList){
        File file= new File("D:\\Codegym\\Casestudy\\src\\phu.dat");
        try {
            OutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream o= new ObjectOutputStream(outputStream);
            o.writeObject(employeeList);
            System.out.println("thanh cong");
            o.close();
            outputStream.close();
        }catch(IOException e){
            System.out.println("lỗi");
            e.printStackTrace();
        }

//        }catch(FileNotFoundException e){
//            throw new RuntimeException(e);
//        }catch(IOException e){
//            throw new RuntimeException(e);
//        }
    }
}
