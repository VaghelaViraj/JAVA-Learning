package common;

public class TestWhile {
    //while loop example
    public static void main(String[] args) {
        int x = 10;
        while(x < 20)
        {
            System.out.println("Value of X :" + x);
            x++;
        }

        int [] numbers = {10,20,30,40,50};
        int index = 1;
        while (index < 5)
        {
            System.out.println("Values of item Index :" + numbers[index]);
            index++;
        }



    }
}
