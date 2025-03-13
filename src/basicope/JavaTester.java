package basicope;

//Different Primitive Data Types

public class JavaTester {
    public static void main(String[] args) {
        byte byteValue1 = 2;
        byte byteValue2 = 7;
        byte byteResult = (byte) (byteValue1 + byteValue2);
        System.out.println("Byte Value :" +" " +byteResult);

        short shortValue1 = 4;
        short shortValue2 = 7;
        short shortResult = (short)(shortValue2 + shortValue1 );
        System.out.println("Short Value :" +" "+ shortResult);

        int intValue1 = 71;
        int intValue2 = 41;
        int intValue3 = 40;
        int intResult = intValue1 + intValue2 + intValue3;
        System.out.println("Int Value : "+" "+ intResult);

        long longValue1 = 5L;
        long longValue2 = 5L;
        long longResult = longValue1 + longValue2;
        System.out.println("Long Value:" + " "+ longResult);

        float floatValue1 = 2f;
        float floatValue2 = 6f;
        float floatResult = floatValue1 + floatValue2;
        System.out.println("Float Value:" +" "+floatResult);

        double doubleValue1 = 2.0;
        double doubleValue2 = 3.0;
        double doubleResult = doubleValue1 + doubleValue2;

        System.out.println("Double Value:" +" "+ doubleResult);

        boolean booleanValue = true;

        System.out.println("Boolean: " + booleanValue);

        char charValue = 'V';

        System.out.println("Char: " + charValue);

        

    }
}
