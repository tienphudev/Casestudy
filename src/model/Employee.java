package model;

import java.io.Serializable;

public  class Employee implements Serializable {
   private String name;
    private int id;
    private int age;
    private String gender;
   private String email;



    public Employee() {
    }

    public Employee(String name,int id, int age, String gender, String email) {
        this.name = name;
        this.id=id;
        this.age = age;
        this.gender = gender;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +

                '}';
    }

}
