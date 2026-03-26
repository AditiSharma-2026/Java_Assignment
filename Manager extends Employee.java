abstract class Employee {
    String name;
    int id;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    abstract double calculateBonus();
}

// Manager subclass
class Manager extends Employee {
    double salary;

    Manager(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    double calculateBonus() {
        return 0.20 * salary; // 20% of salary
    }
}

// Developer subclass
class Developer extends Employee {
    double salary;
    double projectIncentive;

    Developer(String name, int id, double salary, double projectIncentive) {
        super(name, id);
        this.salary = salary;
        this.projectIncentive = projectIncentive;
    }

    @Override
    double calculateBonus() {
        return (0.10 * salary) + projectIncentive;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Runtime polymorphism
        Employee emp;

        emp = new Manager("Alice", 101, 80000);
        System.out.println("Manager Bonus: " + emp.calculateBonus());

        emp = new Developer("Bob", 102, 60000, 5000);
        System.out.println("Developer Bonus: " + emp.calculateBonus());
    }
}
