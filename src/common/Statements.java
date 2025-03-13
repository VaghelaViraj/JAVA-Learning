package common;

public class Statements {
//    if and else if example
public static void main(String[] args) {

    int time = 20;
    String result;
    result = (time < 18) ? "Good day" : "Good evening";
    System.out.println(result);

    int doorCode = 1337;
    if (doorCode == 1337){
        System.out.println("Correct code. The door is now open");
    }
    else {
        System.out.println("Wrong code.The door remains closed");
    }

    int myNum = 5;
    if (myNum > 0)
    {
        System.out.println("The value is a positive number");
    }
    else if(myNum < 0)
    {
        System.out.println("The value is a negative number");
    }
    else {
        System.out.println("The value is 0");
    }

    int myAge = 17;
    int votingAge = 18;

    if (myAge>=votingAge)
    {
        System.out.println("Old enough to vote!");
    }else {
        System.out.println("Not old enough to vote");
    }

    if (myNum % 2 == 0)
    {
        System.out.println(myNum + " is even");
    }
    else {
        System.out.println(myNum + " is odd");
    }

}

}
