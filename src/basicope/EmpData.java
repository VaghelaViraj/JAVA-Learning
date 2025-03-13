package basicope;

//Instance Variables

public class EmpData {

    public String name;     // this instance variable is visible for any child class
    private double salary; // salary  variable is visible in EmpData class only
    public EmpData (String empName) // The name variable is assigned in the constructor
    {
        name = empName;
    }

    public void setSalary(double empSal) // The Salary variable is assigned a value
    {
        salary = empSal;
    }
    public void PrintEmpData()  // This method prints the employee details.
    {
        System.out.println("name : " + name);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
        EmpData empOne = new EmpData("Nishit");
        empOne.setSalary(45000);
        empOne.PrintEmpData();
    }
}
