package basicope;

//switch Example

public class TestSwitchEx {
    public static void main(String[] args) {
        int day = 0;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }

        int grade = 'A';
        switch (grade){
            case 'A' :
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                 System.out.println("You passed");
                 break;
            case 'F' :
                System.out.println("Better try Again");
                break;
            default:
               System.out.println("Invalid Grade");

        }
        System.out.println("Your Grade is:"+grade);


    }

}
