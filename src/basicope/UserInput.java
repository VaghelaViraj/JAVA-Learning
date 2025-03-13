package basicope;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Your Name:");
        String name = scanner.nextLine();

        System.out.print("Enter the Your Age:");
        int age = scanner.nextInt();

        System.out.print("Enter the Salary:");
        double salary = scanner.nextDouble();

        System.out.println("Your Name is:" + name);
        System.out.println("Your Age is:" + age);
        System.out.println("Your Salary is:" + salary);

        scanner.close();

        }

}
