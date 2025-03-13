package methods;

public class ExampleMinNumber {
    public static void main(String[] args) {
        int a = 11;
        int b = 6;
        int c = mainFuncation(a, b);
        System.out.println("Minimum Value = " + c);

    }

    private static int mainFuncation(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }

}
