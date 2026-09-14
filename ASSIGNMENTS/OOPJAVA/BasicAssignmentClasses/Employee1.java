public class Employee1 {

    double salary;
    int hours;

    public void getInfo(double sal, int hrs) {
        salary = sal;
        hours = hrs;
    }

    public void addSal() {
        if (salary < 500) {
            salary = salary + 10;
        }
    }

    public void addWork() {
        if (hours > 6) {
            salary = salary + 5;
        }
    }

    public static void main(String[] args) {

        Employee1 emp = new Employee1();

        emp.getInfo(450, 8);

        emp.addSal();
        emp.addWork();

        System.out.println("Final Salary = " + emp.salary);
    }
}