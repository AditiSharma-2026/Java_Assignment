class Calculator {

    // Method 1: two integers
    int add(int a, int b) {
        System.out.println("add(int, int) called");
        return a + b;
    }

    // Method 2: three integers
    int add(int a, int b, int c) {
        System.out.println("add(int, int, int) called");
        return a + b + c;
    }

    // Method 3: two doubles
    double add(double a, double b) {
        System.out.println("add(double, double) called");
        return a + b;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Result 1: " + calc.add(5, 10));        // int, int
        System.out.println("Result 2: " + calc.add(1, 2, 3));      // int, int, int
        System.out.println("Result 3: " + calc.add(2.5, 3.5));     // double, double
    }
}
