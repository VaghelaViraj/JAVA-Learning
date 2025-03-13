package basicope;
//Java Booleans
public class MyBoolean {
    public static void main(String[] args) {
        int x = 50;
        int y = 10;
        System.out.println(x > y); // returns true, because 50 is higher than 10
        System.out.println(x == 50); // returns true, because the value of x is equal to 50
        System.out.println(50 == 15);  // returns false, because 50 is not equal to 15

        boolean isJava = true;
        boolean isJavaNot = false;

        System.out.println("The Value is :"+(isJava));
        System.out.println("The Value is :"+(isJavaNot));

        int myAge = 19;
        int votingAge = 18;
        System.out.println("Print the Ans:"+(myAge>=votingAge));


    }
}
