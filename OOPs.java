// Class : is collecection of functions and variables. Class is Non-primitive data type. We can use class as a refrence of another class. Classes are collection of attributes and methods.
// Class name should start with capital letter like "Class"
// Class is just a bluePrint It not occupy any space after defining it. When we create Object of that class then It will occupy space in memory. for example: Class is map of home and object is that HOme
// When we write code of class without declaring object of that class then class will occupy only space that is used to store the code we written in HardDisk but when we create object of that class then class and It's attributes and function occupy actual space in RAM after Intatentiation of Object.
// Two objects of same class could not be connected and they are stored at different memory locations.
// Class objects are contegous data types.

// In oops we call variable as a attributes
// functions as a methods

// Packeages are collection of classes. There could be multiple classes in a function of different types or same types. 
// We use OOPs to write the code in small small pieces so that code readability could be easy.  

// In any package there would be only one class that has public keyword and name as same as package name. there is no other class in a package that has same name as package and cotain public keyword else it gives an error.

// ***************     Uses of Oops ****************88888*
// reduce the redunduncy and Modularity of program

/// Objects: are just giving memory to class attributes and methods in RAM. 

// Polymorphism: Is the process or concept of the methods of same name but different parameters. Polymorphism is also called as Method Overloading.
// Two types of polymorphism Compile and RunTime Polymorphism.


//// ******************* this keyword *****************

// this keyword is used to distinguish betwenn the two attriubtes and this keyword also used to refer local attriubtes and local methods also called call to local constructors

// public class OOPs{
//     public static void main(String[] args){
//         Person p1 = new Person();
        
//         System.out.println("my name is "+ p1.name + " my age is "+p1.age);
//     }
// }

// class Person{
//     String name;
//     int age;

//     Person(int myAge, String myName){ 
//         name = myName;
//         age = myAge;
//     }
// }




// Constructor: Are the methods that have same name as class, don't have written type and Objective of these is that Initialize variable.
// we can call the contructor while the time of Intentiation of object.
// Instead of Intializing the attributes again and again in different constructors we can simply chain all constructors together using "this" keyword 

// public class OOPs{
//     public static void main(String[] args){
//         Person p1 = new Person(21);
//         System.out.println("My name is "+p1.name+" and my age is "+p1.age);
//     }
// }

// class Person{
//     String name;
//     int age;
//     Person(int myage){
//         age = myage;
//     }
//     Person(String name, int age){
//         this(age);
//         this.name = name; 
//     }
// }



//***************************************** Static Keyword********************************* */

// Static: keyword is used to define an attribute for all constructor of the same class and we don't have to define the that attribute again and again
// Static keyword can be only Initialized by using Class Name not by Object name
// "Static" keyword is also used to by main method of java class that is used by JVM(java virtual machine) to compile the code and convert the code into byteCode for running. 
// Without "static" keyword JVM cannot call main class of java the our program cannot run. 
// Functions that has static keyword should not have to be create objects of that class to run. If we don't have static keyword in main class then we have to create object of main() class to call it But JVM not creates any object of any class and to call main() class JVM have to create object and that is not possible so because of that we have to use static keyowrd for main class.

// public class OOPs{
//     public static void main(String[] args){
//         Person p1 = new Person(21);

//         Person.school = "MySchool";
//         System.out.println("My name is "+p1.name+" and my age is "+p1.age+" and my school name is "+ Person.school);
//     }
// }

// class Person{
//     String name;
//     int age;
//     static String school;  // "school" attribute can be used by any constructor of Person Class
//     Person(int myage){
//         age = myage;
//     }
//     Person(String name, int age){
//         this(age);
//         this.name = name; 
//     }
// }

//********************************** Inheritence ****************************** */

/// Inheritence: we use Inheritend to Inherit properties, attributes and method of Parent class into a child class.
// Here I am using "super()" keyword that is used to inherit attributes,methods and constructors of Person class constructor into Developer class constructor
// If we call method of child class the same name method also present in Parent class then the method of child class is called These is also called method overridding. child class method overrides over Parent class method



// public class OOPs{
//     public static void main(String[] args){
//         Person p1 = new Person(21);

//         Person.school = "MySchool";
//         System.out.println("My name is "+p1.name+" and my age is "+p1.age+" and my school name is "+ Person.school);

//         Developer d1 = new Developer("santy",21,"School");
//         System.out.println(d1.name+d1.age+d1.position);
//     }
// }

// class Person{
//     String name;
//     int age;
//     static String school;  // "school" attribute can be used by any constructor of Person Class
//     Person(int myage){
//         age = myage;
//     }
//     Person(String name, int age){
//         this(age);
//         this.name = name; 
//     }

//     Dance(){
//         System.out.println()
//     }
// }

// class Developer extends Person{
//     String position;
//     Developer(String name, int age, String position){
//         super(name,age);
//         this.position = position;
//     }

// }


// Compile Time Polymorphism: The methods that are written in same class with same name but different parameters they are showing Compile time polymorphism. Because compiler will know which method of the class is called because the both methods should have different parameters.

// RunTime Polymorphism: The methods that are written in different class but have same name and same no of parameters or no parameters are show RunTime Polymorphism because at the time of running the program when compiler comes on object Intentiaion line then It sees that which class object has been created and which class method I have to call then It is called as RunTime Polymorphism.   


// When I want to call any method of Parent class and the same method with same name is present in child class but I want to call method of parent class through object of parent class then I have to use super() keyword. Like I have used super.dance(); in line 198.

// public class OOPs{
//     public static void main(String[] args){
//         Person p1 = new Person(21);

//         Person.school = "MySchool";
//         System.out.println("My name is "+p1.name+" and my age is "+p1.age+" and my school name is "+ Person.school);

//         Developer d1 = new Developer("santy",21,"School");
//         System.out.println(d1.name+d1.age+d1.position);
//         d1.Dance();
//     }
// }

// class Person{
//     String name;
//     int age;
//     static String school;  // "school" attribute can be used by any constructor of Person Class
//     Person(int myage){
//         age = myage;
//     }
//     Person(String name, int age){
//         this(age);
//         this.name = name; 
//     }
    
//     void Dance(){
        
//         System.out.println("I am Parent Dance");
//     }
// }

// class Developer extends Person{
//     String position;
//     Developer(String name, int age, String position){
//         super(name,age);
//         this.position = position;
//     }

//     void Dance(){
//         super.Dance();
//         System.out.println("I am child Dance");
//     }

// }


//***********************************Why mulitple Inheritence is not possile in java ****************** */

// Mulitple Inheritence: is possile in jave using "Interphases" but not possible using classes. 
// Ans: In there is two parent class and one common child class in that is not possile in jave. but I am assuming that. If I have a function with same name and same parameters in both parent classes and I have called the that method using "super" keyword from child class then java compiler get confused to call which method out of both parent clases In that case It throws an error and because of that we don't have Multiple inheritence in jave using classes.


// ********************************************* Pilers of OOPs ############################3

// 1st piler of OOPs : Polymorphism
// 2nd : Inheritence
// 3rd : Encapsulation
// 4th : Abstraction


// Encapsulation: Is the process of Data hiding and Data protection

// To access classes of one package into another package I have to import that package whch I want to use.


//******************************************* Types of Access Modifiers *************************** */

// Public: We can use methods, attributes anywhere in program which are defined by using public keyword.
// Protected: We can use methods, attributes anywhere in side the package where it is defined and in another ouside package where a child class is inherited from the package where the method or attribute is defined via protected keyword. protected keyowrd accessebilit is insided the package and outside the package in child class only.

// Default: In we don't define any access modifier to any method or attribute It's accessebility will be default by itself. The attributes that are defined using Default access modifier It accessibility would be only inside the package only.

// Private: the accessebilit of Private attributes and methods is only inside the class where it is defined. To access the private attributes we use getters and setters.
// Getters and Setters are the methods that directly Interect with private attributes and methods. and Getters and Setters are public


//************************************ Final Keyword ***************************************** */

/// Final : If a attriute or method is set using Final keyword then It not be overrideen by any method or attribute.
// If a class is set to Final then It can't be extended by any child class. It gives an error.
// If I want that any method or attribute cannot be change or override by anyone then we use "Final" keyword

// using "Final" keyword we cannot extend or modify that class or method or attribute but we can call it.

// public class OOPs{
//     public static void main(String[] args){
//         employee e = new employee();
//         int salary = e.setSalary("Change");
//     }
// }

// class employee{
//     public int salary = 1000;
//     private String pass = "Santosh";

//     public int getSalary(String pass){
//         if(pass == "Santosh"){
//             System.out.println("My Salary "+salary);
//             return salary;
//         }else{
//             return -1;
//         }
//     }

//     public int setSalary(String pass){
//         if(pass== "Change"){
//             salary = 2000;
            
//             System.out.println("my salary "+salary);
//             return salary;
//         }else{
//             return -1;
//         }
//     }
// }


/// Abstraction: A method defined only and not implemented yet Is called as Abstract method. Clasess and methods are can be astract but abstract not variable.
// Abstraction is used by using abstract clases and interfaces. 
// Abstraction is design only like blueprint that is used by other designers and modify that design to get our project done but they have to follow only that design. The design or blueprint is only defined not have any specific task or method to do.

// Abstractors are the methods that are only define we are not passing any parameters in abstract methods any methods in abstract class. 

public class OOPs{
    public static void main(String[] args){

    }
}

abstract class Car{
    abstract void acc(); 
}


// Interfaces: are same as abstract class but we cannot define methods in interfaces class. The methods that are declared in interface class they are defined in child class of interface class.

/// Interfaces are also called as multiple inheritence are achieved in java by using Interfaces. Because while using normal classes in java we have to define methods in those classes but by using Interfaces we are only defining the methods in interfaces not passing any parameters not implementing those methods so because of that we write child interface class for two interface to achieve multiple inheritence we have to define that method in child class but that method with same name is only intialized in both parent classes so because of that multiple inherirtnce can be achived via Interfaces.

interface myCar{
    void Maruti();

    void Swiftz();
}

interface myCar2{
    void Maruti();

    void Swiftz();
}


class all implements myCar{
    
    void Maruti(){
        System.out.pritln("Hii");
    }
    void Swiftz(){
        System.out.println("Hii");
    }
}

// Here interface class myCar and myCar2 both have same methods but only intilized those methods not implemented those methods so because of that we call both methods in class all so because of that multiple inheritence is achieved in these situation.

// we cannot create object of Interface. The object for interface is only create by the class that implements that interface.
// Interface: are only thing that a designer gives to developer that what the functions and methods user needs to implement in that project. The developer only Intiazialiese those interfaceses so that developer can take reference from those interfaces and complete the project according to user needs.