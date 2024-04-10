class Pen{
    String color;
    String type; //ballPoint Or gel Pen

    public void write() {
        System.out.println("Writing Something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Non Parameterized Constructor
    Student(){
        System.out.println("constructor called");

    }

    // Parameterized Constructor
    Student(String name, int age){
        this.name = name;
        this. age = age;
    }

    // Copy Constuctor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    // empty constructor for making a copy constructor
    // Student(){

    // }
}

public class OOPs{
    public static void main(String[] args){

        // Copy Constructor
        Student s1 = new Student("Santy",22);
        // s1.name = "Santy";
        // s1.age = 22;

        Student s2 = new Student(s1);  // copying values of s1 object to s2 

        s2.printInfo();

        // making object of Student class
        // Student s1 = new Student();  // for Non-parametrized Constructor

        // for Parameterized Constructor
        // Student s1 = new Student("santy",22);

        // s1.name = "Santosh";
        // s1.age = 22;

        // s1.printInfo();

        // making object of Pen Class
        // Pen pen1 = new Pen();        // Making Non parameteriszed constructor

        // pen1.type = "Gel";
        // pen1.color = "Red";

        // // pen1.write();
        // pen1.printColor();

        // Pen pen2 = new Pen();

        // pen2.color = "Black";
        // pen2.type = "BallPoint";

        // pen2.printColor();
    }
}