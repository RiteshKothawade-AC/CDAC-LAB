public class Employee {

    String name;
    int yearOfJoining;
    String address;

    Employee(String name, int yearOfJoining, String address) {

        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public void display() {

        System.out.println(name + "\t"
                + yearOfJoining + "\t"
                + address);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Robert",1994,"64C-WallsStreat");

        Employee e2 = new Employee("Sam",2000,"68D-WallsStreat");

        Employee e3 = new Employee("John",1999,"26B-WallsStreat");

        System.out.println("Name\tYear\tAddress");

        e1.display();
        e2.display();
        e3.display();
    }
}