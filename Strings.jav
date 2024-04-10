// Strings: Strings are object.
//************************************* Most useful functions used in String ******************************* */

// compareTo(), subString()

// Declaring Strings has 3 ways

public class String{
    public static void main(String[] args){
        String str = "Santosh";
        String s1 = new String("Yadav");
        char[] s2 = {"a","b","c","d","e"};

        String s3 = new String(s2);

        System.out.println(str+" "+s1+" "+s3);
    }
}