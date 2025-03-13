package basicope;

public class BooleanDemo {
    public static void main(String[] args) {
        Boolean b1, b2;

        b1 = Boolean.valueOf(true);
        b2 = Boolean.valueOf(false);

        int res;
        res = b1.compareTo(b2);
        String str1 = "Both values are equal";
        String str2 = "Object values is true";
        String str3 = "Argument value is true";
        if(res == 0)
        {
            System.out.println("The Value of Str1"+ str1);
            
        } else if (res > 0) {
            System.out.println("The Value of Str2:" + str2);
            
        } else if (res < 0) {
            System.out.println("The Value of Str3" + str3);

        }

    }
}
