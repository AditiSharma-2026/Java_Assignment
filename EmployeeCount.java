class Employee {
    String name;
    int id;

    // static variable
    static int employeeCount = 0;

    // constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++; // increase count when object is created
    }

    // static method
    static void displayEmployeeCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

public class Main {
    public static void main(String[] args) {
        // creating objects
        Employee e1 = new Employee("Alice", 101);
        Employee e2 = new Employee("Bob", 102);
        Employee e3 = new Employee("Charlie", 103);

        // display total employees
        Employee.displayEmployeeCount();
    }
}
