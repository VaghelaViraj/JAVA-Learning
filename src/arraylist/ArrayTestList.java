package arraylist;

public class ArrayTestList {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda" };
        cars[0] = "Honda";
        System.out.println("CARS lIST:" + cars[3]+ " ," + cars[0]);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Total Nos. of Cars :" + cars.length);
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < cars.length; i++)
        {
            System.out.println(cars[i]);


        }
        for (String j : cars)
        {

           System.out.println("The Value of J For Loop.Loop :" + j);
        }

        int ages[] = {20,21,22,18,35,40,45,46,89,70};

        float avg,sum = 0;
        int length = ages.length;  //Get the length of the array
        int lowestAge = ages[3]; // Create a 'lowest age' variable and assign the first array element of ages to it
        System.out.println("--------------------------------------------------------------");
        System.out.println("The Total Age:" + ages.length); // Print the All Numbers of Age

        for (int age  : ages) // Loop.Loop through the elements of the array
        {

            sum +=age;

            System.out.println("The Age Sum:"+ ( sum +=age));

            avg = sum / length; // Calculate the average by dividing the sum by the length

            System.out.println("The average Age is :" + avg);

            if (lowestAge > age)
            {
                lowestAge = age;
                System.out.println("The Lowest age is in the Array is :" + lowestAge);
            }
        }
    }
}
