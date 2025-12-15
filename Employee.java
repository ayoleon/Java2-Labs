import java.text.DecimalFormat;
import java.util.Scanner;

public class Employee {
    public String IDnum, LastName, jobTitle;
    int wage, hours, salary;
    double exactsalary;
    DecimalFormat df = new DecimalFormat("0.00");

    Employee(String IDnum) {
        this.IDnum = IDnum;
        System.out.println("Employee ID Num: " + IDnum);
    }

    Employee(String IDnum, String LastName) {
        this.IDnum = IDnum;
        this.LastName = LastName;
        System.out.println("Employee ID Num: " + IDnum + "\n" + "Last Name: " + LastName);
    }

    Employee(String IDnum, String LastName, String jobTitle) {
        this.IDnum = IDnum;
        this.LastName = LastName;
        this.jobTitle = jobTitle;
        System.out.println("Employee ID Num: " + IDnum + "\n" + "Last Name: " + LastName);
        System.out.println("Job Title: " + jobTitle);
    }

    void Salary(int wage, int hours) {
        this.salary = wage * hours;
        System.out.println("Salary estimate : $" + wage + " x " + hours + " = $" + salary);
    }

    void Salary(double wage, double hours) {
        this.exactsalary = wage * hours;
        System.out.println("Exact Salary: $" + wage + " x " + hours + " = $" + df.format(exactsalary));
    }

    public static void main(String[] args) {

        Employee EmployeeA = new Employee("000123");
        Employee EmployeeB = new Employee("000222", "Lam");
        Employee EmployeeC = new Employee("000777", "Lam", "Peer Tutor");
        EmployeeA.Salary(20, 40);
        EmployeeA.Salary(20.15, 40.5);
        EmployeeA Employee1 = new EmployeeA();
        EmployeeB Employee2 = new EmployeeB();
        Employee1.computeSalary();
        Employee2.computeSalary();
    }
}
class EmployeeA {
    DecimalFormat df = new DecimalFormat("0.00");
    double salary;

    void computeSalary() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble();
        System.out.print("Enter wage per hour: ");
        double wage = input.nextDouble();
        salary = hours * wage;
        System.out.println("Salary: $" + df.format(salary));
    }
}
    class EmployeeB extends EmployeeA {

        void computeSalary() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter hours worked: ");
            double hours = input.nextDouble();
            System.out.print("Enter wage per hour: ");
            double wage = input.nextDouble();
            System.out.println("Salary: $" + df.format(wage * hours));
        }
}
