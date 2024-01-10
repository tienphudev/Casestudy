import model.Employee;
import model.Product;

import storeage.WriteFileEmployee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee>employeeList= new ArrayList<>();
        Employee nv1 = new Employee("Phu",7,18,"Nam","phuqtp@gmail.com");
        Employee nv2 = new Employee("Phu",7,18,"Nam","phuqtp@gmail.com");
        Product coffee= new Product("Black cofffee",9,15000);

        employeeList.add(nv1);
        employeeList.add(nv2);

       WriteFileEmployee writeFileEmployee= new WriteFileEmployee();
       writeFileEmployee.writeFile(employeeList);
}}




