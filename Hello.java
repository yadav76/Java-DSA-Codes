public class Hello
{
    public static void main(String[] args){
        // System.out.println("Hello World");
        int a; //This is Declaration
        a = 5;  // This is Intialization
        System.out.println(a);

        // float b = 9.8; // This is give an error because java intially store a decimal value as "double" data type
        float b = 9.888888f; // we have to put only f at the end of decimal value
        System.out.println(b);

        char c = 'a'; // char is used to store only 1 character at a time
                        // "a" and "ab" give error because char cannot written using double invorted comma and cannot store more than one character
        System.out.println(c);

        boolean d = true;
        System.out.println(d);
    }
}