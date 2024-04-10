// Recursion : Recursion is the technique of calling function inside a function to get the output easily.
// public class Recursion{
    // public static int factorial(int n){
    
    //     // base class : is the lowest order class that we have to think always.
    //     if(n==0)
    //         return 1;
    
    //     int smallerAns = factorial(n-1);
    
    //     int biggerAns = smallerAns*n;

    //     return biggerAns;
    // }

    // Code of Fionacci Numbers
    // {
    //     public static int Fibo(int n){
    //         // base class for fibonacci
    //         if(n==0)
    //             return 0;

                
    //     }
    // }
    // public static void main(String[] args){ 
    //     int ans = factorial(5);
    //     System.out.println(ans);
    // }
// }


// public class Recursion{
//     public static int Fibo(int n){
//         int fibo = 0;
//         for(int i=0;i<=n;i++){
            
//         }
//     }
//     public static void main(String[] args){
//         int ans = Fibo(5);
//         System.out.println(ans);
//     }
// }


// public class Recursion{
//     public static int sumDigits(int n){
//         if(n==0){
//             return 0;
//         }

//         return (n%10) + sumDigits(n/10);
//     }
//     public static void main(String[] args){
//         int ans = sumDigits(199);
//         System.out.println(ans);
//     }
// }

// import java.util.*;
// import java.io.*;

// // public class Recursion{
// //     public static void main(String[] args){
// //         Scanner sc = new Scanner(System.in);

// //         System.out.println("Enter Two values : ");
// //         int a = sc.nextInt();
// //         int b = sc.nextInt();

// //         System.out.println("Enter operation you want to perform : ");
// //         char opr = sc.next().charAt(0);

// //         switch(opr){
// //             case '+':
// //                 System.out.println(a+b);
// //                 break;
// //             case '-':
// //                 System.out.println(a-b);
// //                 break;
// //             case '*':
// //                 System.out.println(a*b);
// //                 break;
// //             case '/':
// //                 System.out.println(a/b);
// //                 break;
// //         }
// //     }
// // }
// import java.lang.*;

// public class Recursion{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         boolean prime = true;

//         for(int i=2;i<n;i++){
//             if(n%i==0){
//                 prime = false;
//                 break;
//             }
//         }

//         if(prime == true){
//             System.out.println("Prime");
//         }
//         else{
//             System.out.println("Not Prime");
//         }
//     }
// }

// import java.util.*;
// import java.io.*;

// public class Recursion{
//     public static int Fact(int n){
//         if(n==0)
//             return 1;

//         int smallerAns = Fact(n-1);

//         int biggerAns = smallerAns*n;

//         return biggerAns;
//     }
    
//     public static void main(String[] args){
//         int ans = Fact(5);
//         System.out.println(ans);
// //     }   
// // }


// import java.util.*;
// import java.io.*;

// public class Recursion{
//     public static int Fact(int n){
//         if(n==0)
//             return 0;

//         if(n==1)
//             return 1;


//         int smallerAns = Fact(n-1);

//         int smallerAns1 = Fact(n-2);

//         int biggerAns = smallerAns1 + smallerAns;

//         return biggerAns;
//     }
    
//     public static void main(String[] args){
//         int ans = Fact(6);
//         System.out.println(ans);
//     }   
// }


////// *************************************** Creating No of passwords **********************************

import java.io.*;
import java.util.*;

public class Recursion{
    public static void main(String[] args){
        char arr[] = {'a','b','c'};
        int len = arr.length; 
        crack(arr,len);
    }

    static void crack(char[] arr, int len){
        for(int i=1;i<=len;i++){
            generate(arr,i,"",len);
        }
    }

    static void generate(char[] arr, int i, String s, int len){
        if(i==0){
            System.out.println(s);
            return;
        }
        
        for(int j=0;j<len;j++){
            String append = s+arr[j];
            generate(arr,i-1,append,len);
        }
    }
}