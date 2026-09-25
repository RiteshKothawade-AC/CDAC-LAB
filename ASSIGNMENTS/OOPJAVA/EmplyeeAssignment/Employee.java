import java.io.Serializable;

public abstract class Employee implements Serializable {

    protected String name;
    protected int age;
    protected String address;
    protected String gender;
    protected double basicSalary;

    Employee(String name, int age, String address,
             String gender, double basicSalary) {

        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.basicSalary = basicSalary;
    }

    public void displayDetails() {

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Address : " + address);
        System.out.println("Gender : " + gender);
        System.out.println("Basic Salary : " + basicSalary);
    }
}