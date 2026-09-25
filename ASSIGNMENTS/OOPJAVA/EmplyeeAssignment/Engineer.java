public class Engineer extends Employee {

    protected double overtime;

    Engineer(String name, int age, String address,
             String gender, double basicSalary,
             double overtime) {

        super(name, age, address, gender, basicSalary);
        this.overtime = overtime;
    }

    public void displayEngineer() {

        displayDetails();
        System.out.println("Overtime : " + overtime);
    }
}