package basicope;

// Local Variable scope with initialization

public class LocalVar {
 public  void  getAge()
 {
     int age = 0; // age is the local variable
     age = age + 8;
     System.out.println("Age is:" + age);

 }

    public static void main(String[] args) {
        LocalVar localVar = new LocalVar();
        localVar.getAge();
    }

}
