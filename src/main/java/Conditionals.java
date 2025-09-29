import java.util.*;


public class Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ask user for age
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You're not an adult.");
//            always add "()" after if statement and then add "{}"
//         TODO: Write an if statement that checks if age is >= 18
//         If true, print "You are an adult."
            //ask user for there grade

        }

        System.out.println("Enter your grade (A-F): ");
        String grade = scanner.next();
        if (grade.equals("A")) {
            System.out.println("Excellent");
        } else if (grade.equals("B")) {
            System.out.println("Good Job");
        } else if (grade.equals("C")) {
            System.out.println("You passed.");
        } else if (grade.equals("D")) {
            System.out.println("Barely passed");
        } else if (grade.equals("F")) {
            System.out.println("Failed");
        } else {
            System.out.println("Invalid Grade");
        }
//            A → "Excellent!"
//            B → "Good job!"
//            C → "You passed."
//            D → "Barely passed."
//            F → "Failed."
        // Ask the user for their grade
//            System.out.print("Enter your grade (A-F): ");
//            String grade = scanner.next();
//
//// TODO: Use if-else if statements to print different messages
//// based on the grade entered.


    }
}
