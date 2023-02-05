public class Employee {
    String firstName;

    String lastName;

    double monthlySalary;

    double yearlySalary;


    public Employee(String firstName,String lastName, double monthlySalary) {
        System.out.println("New employee " + firstName + " " + lastName + " has been created");
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
        if (monthlySalary < 0.0) {
            monthlySalary = 0.0;}
        double yearlySalary;
        yearlySalary = monthlySalary*12;
        System.out.println(firstName + " " + lastName + "'s yearly salary is: " + yearlySalary);
        }

        public static void salaryRaiser(double yearlySalary) {
        double raise = yearlySalary / 10;
        double newYearlySalary = yearlySalary + raise;
            System.out.println("The employees salary has been raised by: " + raise + " (10%) and is now: " + newYearlySalary);
        }

    }

