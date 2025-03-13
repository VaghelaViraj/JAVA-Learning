package basicope;

// Local Variable scope without initialization

public class TestLocalVar {
public void getAge()
{
    int age = 0;  //age without initializing (int age)
    age = age + 7;
    System.out.println("Age is:" + age);
}

    public static void main(String[] args) {
        TestLocalVar testLocalVar = new TestLocalVar();
        testLocalVar.getAge();
    }
}

// out display the error message - variable age might not have been initialized