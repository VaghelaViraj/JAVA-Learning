import java.net.StandardSocketOptions;

public class CalResult
{
    public static void  main(String[] args)
    {
        Calcuator calc = new Calcuator();
        int i = calc.getSum(10,20);
        System.out.println("The Sum is: "+i);

        System.out.println(calc.getSub(14,10));
        System.out.println(calc.getMul(14,10));
        System.out.println(calc.getDiv(14,10));

        calc.getSum(40,30);
        System.out.println("The New Sume");

    }
}
