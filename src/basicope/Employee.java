package basicope;

// Class/Static Variables

public class Employee {
    private static double salary;   //salary  variable is a private static variable
    public static final String Department = "Department";

    public static void main(String[] args) {
        salary = 258900;
        System.out.println(Department + " " +"average salary: " + salary);
    }
}
