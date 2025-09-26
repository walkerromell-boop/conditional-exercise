import java.util.*;


public class Conditionals {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //ask user for age
        System.out.println("Enter your age: ");
        int age= scanner.nextInt();

        if(age>= 18){
            System.out.println("You are an adult.");
        }else if (age < 18) {
            System.out.println("You're not an adult.");
//            always add "()" after if statement and then add "{}"

            //ask user for there grade
            System.out.println("Enter your grade (A-F): ");
            String grade= scanner.next();
            
        }

//         TODO: Write an if statement that checks if age is >= 18
//         If true, print "You are an adult."




    }
}
