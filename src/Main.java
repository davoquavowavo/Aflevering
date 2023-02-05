import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    int a;
    int b;
    int c;

    int x;

    static void getMax(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Max is 'a' which is: " + a);
        } else if (b > a && b > c) {
            System.out.println("Max is 'b' which is: " + b);
        } else if (c > a && c > b) {
            System.out.println("Max is 'c' which is: " + c);
        }
    }

    static void getMin(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println("Min is 'a' which is: " + a);
        } else if (b < a && b < c) {
            System.out.println("Min is 'b' which is: " + b);
        } else if (c < a && c < b) {
            System.out.println("Min is 'c' which is: " + c);
        }
    }

    static void getOddOrEven(int x) {
        if (x % 2 == 0) {
            System.out.println(x + " is even!");
        } else {
            System.out.println(x + " is odd!");
        }
    }

    public static void main(String[] args) {


        //Methods 1
        System.out.println("Please enter your age");
        Scanner sc = new Scanner(System.in);
        int votingAge;
        votingAge = 18;
        int ageInput;
        ageInput = sc.nextInt();


        if (ageInput < votingAge) {
            System.out.println("You are not eligible to vote");
        } else if (ageInput >= votingAge) {
            System.out.println("You are eligible to vote!");
        }

        //Methods 2
        //Metoderne er defineret under "class Main" i toppen, fordi man ikke kan skrive metoder inde i andre metoder :-)
        getMax(1, 18, 8);
        getMin(1, 18, -8);

        //Methods 3
        getOddOrEven(2);
        System.out.println("Please enter a number to check if it's odd or even");
        Scanner scan = new Scanner(System.in);
        int numberInput;
        numberInput = scan.nextInt();

        if (numberInput % 2 == 0) {
            System.out.println(numberInput + " is even!");
        } else {
            System.out.println(numberInput + " is odd!");

        }

        //Methods 4
        System.out.println("Please enter your first and middle name (if you have a middle name)");
        Scanner nameScan = new Scanner(System.in);
        String nameInput;
        nameInput = nameScan.nextLine();
        System.out.println("Please enter your last name");
        Scanner lScan = new Scanner(System.in);
        String lastNameInput;
        lastNameInput = lScan.nextLine();


        for (int i = 0; i < nameInput.length(); i++) {
            if (Character.isUpperCase(nameInput.charAt(i))) {
                System.out.println(nameInput.charAt(i) + ".");
            }

        }
        System.out.println(lastNameInput);


        //Car and driver (classes and objects)
        Car audi = new Car("C8", 600000);
        audi.startCar();
        audi.stopCar();
        audi.moveCar();

        Driver ole = new Driver("Ole", 69);


        //Employee (classes and objects)
        Employee hanne = new Employee("Hanne", "Jensen", 30000);
        Employee paul = new Employee("Paul", "Woop", -10000);

        hanne.salaryRaiser(360000);
        }
    }




