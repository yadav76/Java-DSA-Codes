package Bank;

abstract class Animal{
    abstract void walk();

    public static void animal(){

    }

    Animal(){
        System.out.println("Constructor of Abstract class");
    }

    
    
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walk on Four Legs");
    }

    Horse(){
        System.out.println("constructor of child class");
    }
}

class chicken extends Animal{

    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}

interface Harbivorous{
    void walk();
    int sum = 2;
}

interface Carnivorous{
    void run();
}

class Dog implements Harbivorous,Carnivorous{
    public void walk(){
        System.out.println("Walk");
        
    }
    public void run(){
        System.out.println("run");
    }
}
public class Account {

    public static void main(String[] ars){
        Horse s = new Horse();

        // s.walk();

        Dog d = new Dog();
        d.walk();
        d.run();
    }

    // printing package
    public static void account(){
        System.out.println("Bank Package");
    }
}
