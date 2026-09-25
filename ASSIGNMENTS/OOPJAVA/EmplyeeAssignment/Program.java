import java.io.*;

public class Program {

    public static void main(String[] args) {

        Employee[] employeeArr = new Employee[100];

        File path = new File("Employee.txt");

        int choice;
        int count = 0;

        final int ADD_MANAGER = 1;
        final int ADD_ENGINEER = 2;
        final int ADD_SALESPERSON = 3;

        do {

            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");

            System.out.println("1. Add");
            System.out.println("2. Save");
            System.out.println("3. Display");
            System.out.println("4. Delete");
            System.out.println("5. Sort");
            System.out.println("6. Load");
            System.out.println("7. Exit");

            System.out.print("Enter Choice : ");
            choice = ConsoleInput.getInt();

            switch (choice) {

            case 1:

                int addChoice;

                do {

                    System.out.println("\n1. Add Manager");
                    System.out.println("2. Add Engineer");
                    System.out.println("3. Add SalesPerson");
                    System.out.println("4. Exit");

                    System.out.print("Enter Choice : ");
                    addChoice = ConsoleInput.getInt();

                    if (addChoice == ADD_MANAGER) {

                        System.out.print("Enter Name : ");
                        String name = ConsoleInput.getString();

                        System.out.print("Enter Age : ");
                        int age = ConsoleInput.getInt();

                        System.out.print("Enter Address : ");
                        String address = ConsoleInput.getString();

                        System.out.print("Enter Gender : ");
                        String gender = ConsoleInput.getString();

                        System.out.print("Enter Basic Salary : ");
                        double basicSalary = ConsoleInput.getdouble();

                        System.out.print("Enter HRA : ");
                        double hra = ConsoleInput.getdouble();

                        employeeArr[count++] =
                                new Manager(name, age,
                                        address, gender,
                                        basicSalary, hra);

                        System.out.println("Manager Added Successfully");
                    }

                    else if (addChoice == ADD_ENGINEER) {

                        System.out.print("Enter Name : ");
                        String name = ConsoleInput.getString();

                        System.out.print("Enter Age : ");
                        int age = ConsoleInput.getInt();

                        System.out.print("Enter Address : ");
                        String address = ConsoleInput.getString();

                        System.out.print("Enter Gender : ");
                        String gender = ConsoleInput.getString();

                        System.out.print("Enter Basic Salary : ");
                        double basicSalary = ConsoleInput.getdouble();

                        System.out.print("Enter Overtime : ");
                        double overtime = ConsoleInput.getdouble();

                        employeeArr[count++] =
                                new Engineer(name, age,
                                        address, gender,
                                        basicSalary, overtime);

                        System.out.println("Engineer Added Successfully");
                    }

                    else if (addChoice == ADD_SALESPERSON) {

                        System.out.print("Enter Name : ");
                        String name = ConsoleInput.getString();

                        System.out.print("Enter Age : ");
                        int age = ConsoleInput.getInt();

                        System.out.print("Enter Address : ");
                        String address = ConsoleInput.getString();

                        System.out.print("Enter Gender : ");
                        String gender = ConsoleInput.getString();

                        System.out.print("Enter Basic Salary : ");
                        double basicSalary = ConsoleInput.getdouble();

                        System.out.print("Enter Commission : ");
                        double commission = ConsoleInput.getdouble();

                        employeeArr[count++] =
                                new SalesPerson(name, age,
                                        address, gender,
                                        basicSalary, commission);

                        System.out.println("SalesPerson Added Successfully");
                    }

                } while (addChoice != 4);

                break;

            case 2:

                FileOutputStream fileOutput = null;
                ObjectOutputStream objectOutput = null;

                try {

                    fileOutput = new FileOutputStream(path);
                    objectOutput =
                            new ObjectOutputStream(fileOutput);

                    for (Employee emp : employeeArr) {

                        if (emp != null) {

                            objectOutput.writeObject(emp);
                        }
                    }

                    System.out.println("Data Saved Successfully");
                }

                catch (Exception e) {

                    e.printStackTrace();
                }

                finally {

                    try {

                        if (objectOutput != null)
                            objectOutput.close();

                        if (fileOutput != null)
                            fileOutput.close();

                    } catch (Exception e) {

                        e.printStackTrace();
                    }
                }

                break;

            case 3:

                if (count == 0) {

                    System.out.println("No Employee Data Found");
                }

                else {

                    for (int i = 0; i < count; i++) {

                        if (employeeArr[i] instanceof Manager) {

                            ((Manager) employeeArr[i])
                                    .displayManager();
                        }

                        else if (employeeArr[i]
                                instanceof Engineer) {

                            ((Engineer) employeeArr[i])
                                    .displayEngineer();
                        }

                        else if (employeeArr[i]
                                instanceof SalesPerson) {

                            ((SalesPerson) employeeArr[i])
                                    .displaySalesPerson();
                        }

                        System.out.println(
                                "---------------------");
                    }
                }

                break;

            case 4:

                System.out.println(
                        "Delete Feature Not Implemented");

                break;

            case 5:

                for (int i = 0; i < count - 1; i++) {

                    for (int j = i + 1; j < count; j++) {

                        if (employeeArr[i].name.compareTo(
                                employeeArr[j].name) > 0) {

                            Employee temp = employeeArr[i];

                            employeeArr[i] = employeeArr[j];

                            employeeArr[j] = temp;
                        }
                    }
                }

                System.out.println(
                        "Employees Sorted Successfully");

                break;

            case 6:

                FileInputStream fileInput = null;
                ObjectInputStream objectInput = null;

                try {

                    fileInput = new FileInputStream(path);

                    objectInput =
                            new ObjectInputStream(fileInput);

                    int index = 0;

                    try {

                        while (true) {

                            Employee emp =
                                    (Employee) objectInput
                                            .readObject();

                            employeeArr[index++] = emp;
                        }

                    }

                    catch (EOFException e) {

                        count = index;

                        System.out.println(
                                "Data Loaded Successfully");
                    }
                }

                catch (Exception e) {

                    e.printStackTrace();
                }

                finally {

                    try {

                        if (objectInput != null)
                            objectInput.close();

                        if (fileInput != null)
                            fileInput.close();

                    }

                    catch (Exception e) {

                        e.printStackTrace();
                    }
                }

                break;

            case 7:

                System.out.println("Program Exited");
                break;

            default:

                System.out.println("Invalid Choice");
            }

        } while (choice != 7);
    }
}