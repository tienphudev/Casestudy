package controller;

import model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    Scanner scanner= new Scanner(System.in);

    public static class Manager {
       public List<Employee> employeeList= new ArrayList<>();

        public Manager(List<Employee> employeeList) {
            this.employeeList = employeeList;
        }

        public List<Employee> getEmployeeList() {
            return employeeList;
        }

        public void setEmployeeList(List<Employee> employeeList) {
            this.employeeList = employeeList;
        }

        public Manager() {
        }
        public void addEmployee(Employee employee){
            employeeList.add(employee);
        }
        public void removeEmployee(Employee employee){
            employeeList.remove(employee);
        }


    }
}
