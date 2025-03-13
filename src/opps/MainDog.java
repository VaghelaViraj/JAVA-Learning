package opps;
// Creating a Java class
 class Dog {
    // Declaring and initializing the attributes

    String breed;
    int age;
    String color;


    // methods to set breed, age, and color of the dog
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // method to print all three values
    public void printDetails() {
        System.out.println("Dog Details");
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.color);
    }
}
    public class MainDog
    {
        public static void main(String[] args) {
            // Creating an object of the class Dog


            Dog objDog =  new Dog();

            // setting the attributes
            objDog.setBreed("Golden Retriever");
            objDog.setAge(2);
            objDog.setColor("Golden");

            // Printing values
            objDog.printDetails();
        }
    }

