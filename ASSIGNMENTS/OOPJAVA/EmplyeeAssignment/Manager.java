public class Manager extends Employee {

    protected double hra;

    Manager(String name, int age, String address,
            String gender, double basicSalary,
            double hra) {

        super(name, age, address, gender, basicSalary);
        this.hra = hra;
    }

    public void displayManager() {

        displayDetails();
        System.out.println("House Rent Allowance : " + hra);
    }
}