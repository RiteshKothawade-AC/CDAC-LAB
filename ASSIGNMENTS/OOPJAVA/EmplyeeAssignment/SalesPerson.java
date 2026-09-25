public class SalesPerson extends Employee {

    protected double commission;

    SalesPerson(String name, int age, String address,
                String gender, double basicSalary,
                double commission) {

        super(name, age, address, gender, basicSalary);
        this.commission = commission;
    }

    public void displaySalesPerson() {

        displayDetails();
        System.out.println("Commission : " + commission);
    }
}