package loop;

public class ReturnValues {
    static int myMethod(int x)
    {
        return 5 + x;
    }
    static int secondMethod(int x, int y)
    {
        return x * y;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(5));
        System.out.println(secondMethod(5,5));
    }
}
