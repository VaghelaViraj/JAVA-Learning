package methods;

public class Parameters {
    static void myMethod(String fname, int age)
    {
        System.out.println(fname +" " +"is" + " "+age);
    }
    static void checkAge(int age)
    {
        if (age < 18)
        {
            System.out.println("Access denied - You are not old enough!");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(11);

        myMethod("Liam",6);
        myMethod("Jenny",7);
        myMethod("Anja",10);

        checkAge(21);
    }

}
