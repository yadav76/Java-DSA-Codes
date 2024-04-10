// Answer of Sum of N natural numbers

// import java.util.*;
// import java.io.*;

// public class Answers {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         long ans = 0;
//         for(int i=0;i<=n;i++){
//             ans += i;
//         }
//         System.out.println(ans);
//     }
// }

// another way

// public class Answers {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         long ans = 0;
//         ans = (N*(N+1))/2;
//         System.out.println(ans);
//     }
// }


/// Checking Amrstong number

// public class Answers{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int originalN = N;
//         int sum = 0;

//         while(N>0){
//             int d = N%10;
//             sum += d*d*d;
//             N = N/10;
//         }

//         if(originalN == sum){
//             System.out.println(1);
//         }else{
//             System.out.println(0);
//         }
//     }
// }


// Checking the number is palidrom or not

// public class Answers{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int originalN = N;
//         int p = 0;

//         while (N>0){
//             int d = N%10;
//             p = (p*10)+d;
//             N = N/10;
//         }

//         if (originalN == p){
//             System.out.println(true);
//         }else{
//             System.out.println(false);
//         }
//     }
// }


// import java.util.*;
// public class Answers{
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++)
//         {
//             arr[i] = Math.abs(sc.nextInt());
//         }

//         // for(int i=0;i<arr.length;i++){
//         //     System.out.println(arr[i]);
//         // }

//         int count = 0;
//         for(int i = 0; i < n; i++)
//         {
//             if(arr[i] % 2 == 0)
//                   count++;
//         }
        
//         System.out.println(count);

//     }
// }


// import java.util.*;
// import java.io.*;

// public class Answers{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();

//         char[] ch = s.toCharArray();

//         for(int i=0;i<ch.length;i++){
//             if(ch[i] = "a"){
//                 System.out.print(ch[i]);
//             }
//         }
        
//     }
// }


// import java.util.*;
// import java.io.*;
// public class Answers{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();

//         String ans = "";
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='a' || s.charAt(i) =='e' || s.charAt(i) =='i' || s.charAt(i) =='o' || s.charAt(i) =='u' ){
//                 ans += s.charAt(i);
//             }else{
//                 System.out.println("No Such String");
//             }
//         }
//         System.out.println(ans);
//     }
// }



// import java.util.*;
// import java.io.*;
// public class Answers{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();

//         // String s1 = s.substring(0,s.length());
//         // String s2 = "";

//         // for(int i=0;i<s.length();i++){
//         //     if(s1=="a"){
//         //         s2 += s.charAt(i);
//         //     }
//         // }
//         // System.out.println(s2);

//         // String s1 = "";
//         // s.startsWith("a");

//         // String s2 = "";
//         // s.endsWith("a");

//         // System.out.print(s.substring(s.startsWith("a"), s.endsWith("a")));


//     }
// }

import java.util.*;   
public class Answers{  
   public static void main(String args[])  
   {  
      String original, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  
}  