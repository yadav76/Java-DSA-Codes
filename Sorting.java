// ********************************************** IMP QUESTIONS **************************************
// Explain Merge Sort:
// Explain Differenc between Selection Sort and Insertion Sort and Bubbble Sort.
// Why we use Sorting algorithms.
// Where these Sorting Used?


// Bubble Sort: moving element from front to back like taking highest element and placing it to last position.
// IMportant for 1st round of interview. Sorting questions are asked in first round of interview compulasory. 
// If length of array or element is "n" then we need "n-1" iterations to sort the array. using bubble sort.
// In bubble sort we have to place "i"th element of array to it's perfect position while comparing it will all elements of array.
// In bubble sort we come from backward like we sort the array from backwords. We start sorting the array elements through last element of the array.


// For Comaparing Two Strings in java we use "Str1.compareTo(Str2)"; method

// Comparison have only O(1) time complexity like "if(arr[i]<arr[j]" It is comparison so It's time complexity will be 1. Else If we swap two Elements Inside for Loop then It's time complexity will be O(n). So Swaping is costly process but Comparison is not Costly process.


import java.util.*;
import java.io.*;

// public class Sorting{
//     public static void main(String[] args){
         
//         int arr[] = {13,29,30,35,10};

//         bubbleSort(arr);

//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]+ " ");
//         }

//     }

//     public static void bubbleSort(int[] arr){
//         int n = arr.length;

//         // for(int i=n-1;i>=0;i--){   // another algorithm to form bubble sort  to run the code comment these two line
//         for(int i=0;i<n;i++){
//             // for(int j=0;j<i;j++){     // another algorithm to form bubble sort these line also
//             for(int j=0;j<n-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }System.out.print(n-i+"th iteration");

//             for(int k=0;k<n;k++){
//                 System.out.print(arr[k]+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// 90 to 95% times we use inbuilt functions for an array sorting like Arrays.sort();
// But for interviews point of view we are learning these differenc types of sorting algorithms.


// public class Sorting{
//     public static void main(String[] args){
//         int arr[] = {5,2,9,7,5};

//         Arrays.sort(arr);    // these is inbuild function used most of the times for sorting the array

//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


// Insertion sort: IN Insertion sort we try to sort the array from front. 
// The main difference between insertion and bubble sort is that Insertion sort try to sort the array from front and Bubble sort try to sort the array from backward direction.

// public class Sorting{
//     public static void main(String[] args){
//         int arr[] = {1,10,45,15,13};
//         int len = arr.length;

//         for(int i=1;i<len;i++){
//             int key = arr[i];
//             int j = i-1;
//             // while(j>=0 && arr[j]>key){    // Here If we write key instead of arr[i] than after each iteration       value of arr[i]  will be changed and we not get desired output. 
//             while(j>=0 && arr[j]>arr[j+1]){      // we can also write arr[j+1] instead of

//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//                 j--;
//             }
//             System.out.println("This is the iteration"+i);
//             for(int a=0;a<len;a++){
//                 System.out.print(arr[a]+ " ");
               
//             }
//             System.out.println();
//         }
//         for(int k=0;k<len;k++){
//             System.out.println(arr[k]);
//         }
//     }
// }


//***************************************** Selection Sort ***************************************


// Selection Sort : maintain a bestIndex that is bestIndex find the element in array which is less than bestIndex and after fiding the value i.e less than bestIndex It change the position with It and now BestIndex becomes next value that is present in array value after that It again finds the value which is less than bestIndex and change position with It.
// we use selection sort when we want to reduce number of swaps in sorting.


// public class Sorting{
//     public static void main(String[] args){
//         int arr[] = {5,3,9,8,4};

//         int n = arr.length;
//         for(int i=0;i<n;i++){
//             int bestIndex = i;
//             for(int j=i+1;j<n;j++){
//                 if(arr[j]<arr[bestIndex]){
//                     bestIndex = j;
//                 }
//             }
//             int temp = arr[bestIndex];
//                 arr[bestIndex] = arr[i];
//                 arr[i] = temp; 

//                 for(int k=0;k<n;k++){
//                     System.out.print(arr[k]+ " ");
//                 }
//                 System.out.println();
//         }
        
//     }
// }


//************************************************* Merge Sort **************************************************
// Merge Sort : Is combination of two approach i.e Divide and Conquer Approach. First we divide the array then we merge It. In Merge Sort Given Two arrays are Always Sorted.

