package arraylist;

public class ProblemonArrays {
    public static void main(String[] args) {
        int numbers[] = {23,12,6,7,15,3,2,56};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for (int number : numbers)
        {
            if(number < min)
            {
                min = number;
            }
            if(number > max)
            {
                max = number;
            }
        }
        System.out.println("Minimum is "+min);
        System.out.println("Maximum is "+max);

    }
}
