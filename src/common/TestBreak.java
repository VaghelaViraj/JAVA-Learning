package common;

public class TestBreak {
    public static void main(String[] args) {
        int [] numbers = {10, 20,30,40,50};
        int x = 10;
        while (x < 20 ) {
            if (x == 14) {
                break;
            }
            System.out.println("Value of x : " + x);
            x++;
        }
        for (int i = 0;i<10;i++)
        {
            if (i == 4)
            {
                break;
            }
            System.out.println(i);
        }
        for (int index = 0; index < numbers.length; index++)
        {
            if(numbers[index] == 30)
            {
                break;
            }
            System.out.println("Value of item : "+ numbers[index]);
        }
        while(true)
        {
            System.out.println("Value of True: " + x);
            x++;
            if (x == 18) {
                break;
            }

        }

    }
}
