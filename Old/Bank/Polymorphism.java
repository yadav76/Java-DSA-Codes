class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name +" "+age);
    }
    
}

public class Polymorphism{
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.age = 22;
        s1.name = "santosh";

        s1.printInfo(s1.name);  // calling printInfo() function which has 1 String Parameter

        s1.printInfo(s1.age);  // calling printInfo() function which has 1 Integer Parameter

        s1.printInfo(s1.name,s1.age);  // calling printInfo() function which has 1 String and 1 Integer Parameter

        // These above three functions calling has same function name but different parameters in pass in it so that's called as polymorphism. 
        // same function with different type of parameters or return type of those functions
    }
}