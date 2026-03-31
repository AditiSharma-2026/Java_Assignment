class Employee {
    String name;
    double salary;

    // Constructor using this keyword
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Company {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", 50000);
        Employee e2 = new Employee("Sneha", 60000);

        e1.display();
        System.out.println("----------------");
        e2.display();
    }
}
