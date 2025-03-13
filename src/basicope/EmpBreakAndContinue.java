package basicope;

public class EmpBreakAndContinue {
    public static void main(String[] args) {

        for (int i = 0; i <= 20; i++)
        {
            System.out.println(i);
            if (i>=10)
                break; //
        }

        for (int j = 0; j <= 20 ; j++)
        {
            if (j == 2 || j == 8)
                continue; // Skip
            if(j >= 15)
                break;
            System.out.println("Gave Toffee to :" +j);
        }
    }
}





