// Array is used to store multiple data values at same 
// Array stores every item side by side and is called as ####  contigeous memory Allocation ####//#endregion

// types of creating an array

// int[] arr = new int[5]; // here data type of array is int and it can store 5 itmes
// arr[0] = 2;
// arr[1] = 3;
// arr[2] = 5;
// arr[3] = 9;
// arr[4] = 10;


// int[] arr1 = {1,2,3,4,5};  // here it is short form of array and we can directly add itmes to array

// int[] arr;  // these is initailization of array
// int arr;   // these is Declaration of data type
// arr = {1,2,3,4,5};  // these is another type to create an array  // these is memory allocation of array


// int[] arr = {12,3,39,93,92};
// System.out.println(arr[1]);  // these prints 2nd element of array
// System.out.println(arr.length); // these prints lenght of array


// public class Array{
//     public static void main(String[] args){
//         int[] arr = {12,3,39,93,92};
//         System.out.println(arr[1]);  // these prints 2nd element of array
//         System.out.println(arr.length); // these prints lenght of array
//     }
// }


// printing all elements of array using for loop

// public class Array{
//     public static void main(String[] args){
//         int[] arr = {12,3,39,93,92};
//         for (int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }


// printing all elements of array using forEach loop

// public class Array{
//     public static void main(String[] args){
//         int[] arr = {12,3,39,93,92};
//         for (int x : arr) {   // here x iterate all elements of array 
//             System.out.println(x);
//         }
//     }
// }

// import java.util.*;

// public class Array{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         double positives = 0;
//         double negatives = 0;
//         double zeroes = 0;

//         for(int i= 0;i<n;i++){
//             int data = sc.nextInt();
//             if(data<0){
//                 negatives++;
//             }
//             else if(data>0){
//                 positives++;
//             }
//             else{
//                 zeroes++;
//             }
//             double total = n;

//             System.out.println(positives/total);
//             System.out.println(negatives/total);
//             System.out.println(zeroes/total);
//         }
//     }
// }

import java.util.*;
import java.io.*;

public class Array{
    public static void Main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j] + "\t");
            }
        }

    }
}

