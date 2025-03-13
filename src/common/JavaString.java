package common;

public class JavaString {

//    Java Strings Exp
public static void main(String[] args) {
    String greeting = "common.Hello";
    System.out.println(greeting);

//    String Length
    String txt = "Viraj Vaghela";
    System.out.println("The length of the txt string is: " + txt.length());

//String Method
    System.out.println(txt.toUpperCase());
    System.out.println(txt.toLowerCase());

//    String Concatenation
    String firstName = "Viraj";
    String lastName = "Vaghela";
    System.out.println("Full Name :" + (firstName + " " + lastName));

//    The concat() method to concatenate two strings
    System.out.println("Full Name with Concat Method :"+ (firstName.concat(lastName)));

    String ab = "We are the so-called \"Vikings\" from the north.";
    System.out.println("The String Value :"+ ab);
    String cd = "It\'s alright.";
    System.out.println("The Value :" + cd);
}
}
