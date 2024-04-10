// Strings: Strings are object.
//************************************* Most useful functions used in String ******************************* */

// compareTo(), subString()

// Declaring Strings has 3 ways
import java.util.*;
import java.io.*;

public class Strings{
    public static void main(String[] args){
        // String str = "Santosh";
        // String s1 = new String("Yadav");
        // char[] s2 = {'a','b','c','d'};

        // String s3 = new String(s2);

        // System.out.println(str+" "+s1+" "+s3);

        // // Scanner sc = new Scanner(System.in);
        // // String s4 = sc.nextLine();            // to get input from user

        // char[] ch1 = str.toCharArray();   // to convert the String into array
        // System.out.println(ch1);

        // // SubString function in String

        // // String s5 = s1.substring("SartingIndec","lastIndex");
        // String s5 = s1.substring(1,5);
        // System.out.println(s5); 

        // Function for spliting the String  
        String s6 = "Santosh is becoming programmer in new few months";
        String[] arr = s6.split(" ");   // These will make array of Strings by separating " " spaces

        System.out.println(arr[1]);

        // Data types by Order 
        // byte < short < char < int < long < float < double

        // Explicit Type Casting: Converting big data types to smaller data types.
        // for Explicit type casting we have to convert data forcefully by using below function.

        long a = 1010010100;
        int b = (int)a;      // Here "a" is forcefully type casted from long to int      
        
        
        // to convert String into Integer we use Integer.parseInt(); method

        // String s7 = "santy";
        // int a = Integer.parseInt("9");
        // System.out.println(a);

        // To convert Integer to String

        // int a = 20;
        // String b = a.toString();

        


    }
}


/// ***************************** MERGE SORT*********************

// Merge Sort: Is improved sorting algorithm which contains only one loop and also uses Recursion and Time complexity for merge sort is O(n); but the space complexity of merge sort is high as compare to other sorting algorithms.
// but In below example time complexity for while loop is O(n) and for sort function the array is divided into two parts so time complexity for that is n/2 or logn so overall time complexity is O(nlongn).



// *************************************** QUICK SORT #########################33

// QUICK SORT : takes only O(1) space complexity; The time complexity for quick sort is O(nlogn); In quick sort we take a pivot element which is last element of the array and we want that all elements which are smaller than pivote element are left hand side of the array and all elements which are greater than pivot element are right hand side of the array and the left and right side of the array is not necessory to be sorted always it is taken care by recursion. Quick sort is best sorting algorithm as compare in time and space complexity.

class Solution {

    public int maxValue(int index,int n,int[] nums){

        //Base case
        if(index>=n){
            return 0;
        }

        int op1 = nums[index]+maxValue(index+2,n,nums);//selected
        int op2 = maxValue(index+1,n,nums); //not select

        return Math.max(op1,op2);

    }
    public int rob(int[] nums) {

        int n = nums.length;
        return maxValue(0,n,nums);

    }
}


// ******************************* Counting Sort *******************************

// Counting  Sort : Is Sorting algorithm which has time complexity O(n) And It is not widely used. In counting sort we just count the no of times the Number present in array is present and we store count of that no and after counting occrance of all numbers in array we just print them in order of there count just like in array 1 is present 2 times then we first print 1 1 to times and so on. Counting sort Uses frequency array to sort the elements. Space complexity for counting sort is O(maxElement). We cannot declare counting sort for big arrays like 10pow6 because there is larger amount of space is used and that is not optimal. 


// ***************** House Robber Problemclass Solution {

    public static int maxValue(int index,int n,int[] nums){
        if(index>=n){
            return 0;
        }
        
        int op1 = nums[index]+maxValue(index+2,n,nums);
        int op2 = maxValue(index+1,n,nums);
        
        return Math.max(op1,op2);
        
    }
    public int rob(int[] nums){
        int n = nums.length;
        return maxValue(0,n,nums);
    }
    
}


