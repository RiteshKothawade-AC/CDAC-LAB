#include <iostream>
using namespace std;

class Employee
{
private:
    int empId;
    string name;
    string department;
    char grade;
    double basicSalary;
    bool isActive;

    static int employeeCount;

public:

    Employee()
    {
        employeeCount++;
        empId = 1000 + employeeCount;
        isActive = true;
    }

    void setName(const string &n)
    {
        if(n != "")
        {
            name = n;
        }
    }

    void setDepartment(const string &dept)
    {
        if(dept == "Engineering" ||
           dept == "HR" ||
           dept == "Finance" ||
           dept == "Operations")
        {
            department = dept;
        }
        else
        {
            cout << "ERROR: Invalid department. Value rejected." << endl;
        }
    }

    void setGrade(char g)
    {
        if(g == 'A' || g == 'B' || g == 'C' || g == 'D')
        {
            grade = g;
        }
        else
        {
            cout << "ERROR: Invalid grade '" << g
                 << "'. Accepted values: A, B, C, D." << endl;
        }
    }

    void setBasicSalary(double salary)
    {
        if(salary >= 10000 && salary <= 500000)
        {
            basicSalary = salary;
        }
        else
        {
            cout << "ERROR: Salary must be between Rs.10,000 and Rs.5,00,000. Value rejected." << endl;
        }
    }

    int getEmpId() const
    {
        return empId;
    }

    string getName() const
    {
        return name;
    }

    string getDepartment() const
    {
        return department;
    }

    char getGrade() const
    {
        return grade;
    }

    double getBasicSalary() const
    {
        return basicSalary;
    }

    bool getIsActive() const
    {
        return isActive;
    }

    static int getEmployeeCount()
    {
        return employeeCount;
    }

    void deactivate()
    {
        isActive = false;
    }

    double computeAllowances() const
    {
        if(grade == 'A')
            return basicSalary * 0.40;
        else if(grade == 'B')
            return basicSalary * 0.30;
        else if(grade == 'C')
            return basicSalary * 0.20;
        else
            return basicSalary * 0.10;
    }

    double computeGrossSalary() const
    {
        return basicSalary + computeAllowances();
    }

    double computeTax() const
    {
        double gross = computeGrossSalary();

        if(gross <= 50000)
        {
            return 0;
        }
        else if(gross <= 100000)
        {
            return (gross - 50000) * 0.10;
        }
        else
        {
            return 5000 + (gross - 100000) * 0.20;
        }
    }

    double computeNetSalary() const
    {
        return computeGrossSalary() - computeTax();
    }

    void printPayslip() const
    {
        cout << "\n========================================" << endl;
        cout << "EMPLOYEE PAYSLIP - AUG 2026" << endl;
        cout << "========================================" << endl;

        cout << "Employee ID : " << getEmpId() << endl;
        cout << "Name        : " << getName() << endl;
        cout << "Department  : " << getDepartment() << endl;
        cout << "Grade       : " << getGrade() << endl;
        cout << "Status      : "
             << (getIsActive() ? "Active" : "Inactive")
             << endl;

        cout << "----------------------------------------" << endl;

        cout << "Basic Salary : Rs. " << getBasicSalary() << endl;

        cout << "Allowance : Rs. "<< computeAllowances() << endl;

        cout << "Gross Salary : Rs. " << computeGrossSalary() << endl;

        cout << "Tax Deduction : Rs. " << computeTax() << endl;

        cout << "Net Salary : Rs. "<< computeNetSalary() << endl;

        cout << "========================================" << endl;
    }

    void acceptDetails()
    {
        string n;
        string dept;
        char g;
        double salary;

        cout << "Enter Name: ";
        cin >> n;
        setName(n);

        cout << "Enter Department (Engineering/HR/Finance/Operations): ";
        cin >> dept;
        setDepartment(dept);

        cout << "Enter Grade (A/B/C/D): ";
        cin >> g;
        setGrade(g);

        cout << "Enter Basic Salary: ";
        cin >> salary;
        setBasicSalary(salary);
    }
};

int Employee::employeeCount = 0;

int main()
{
    Employee e1;
    Employee *e2 = new Employee();
    Employee *e3 = new Employee();

    cout << "\nEnter details for Employee 1\n";
    e1.acceptDetails();

    cout << "\nEnter details for Employee 2\n";
    e2->acceptDetails();

    cout << "\nEnter details for Employee 3\n";
    e3->acceptDetails();

    // e1.empId = 999;
    // e1.basicSalary = -1000;

    // Error: empId and basicSalary are private members.
    // Private data cannot be accessed directly outside the class.
    // Values must be accessed through getters and modified through setters.

    e1.printPayslip();
    e2->printPayslip();
    e3->printPayslip();

    e3->deactivate();

    if(!e3->getIsActive())
    {
        cout << e3->getName()<< " is no longer active. Payroll skipped." << endl;
    }

    cout << "\nTotal Employees : "<< Employee::getEmployeeCount()<< endl;

    delete e2;
    delete e3;

    return 0;
}