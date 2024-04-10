// ArrayList : Is used when we don't know how many elements we want to add in array i.e size of the array is not known or not fixed.

// ArrayList<dataType> variable_name = new ArrayList<dataType>;


// public class ArrayList {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();

//     ArrayList<Integer> arr = new ArrayList<Integer>;
//     for(int i=0;i<n;i++){
//         int x = sc.nextInt();
//         arr.add(x);
//     }

//     for(int i=0;i<arr.size();i++){      // Here I have written arr.size(); because size of arrlist is not known In case 
//         System.out.println(arr.get(i)+" ");     
//     }
// }

// Dynamic : The ojects that are not fixed whose values are continously changing are called as Dynamic in nature.
// Static : The objects that have fixed values are called as Static objects.

// When we don't know size of the array and we want to store some values in array but we don't know the size of the array we want then we create arrayList. Because in arrayList we can store as many values we want to store and size of arrayList is not fixed.

// For e.g in below problem we know how many values we want to store in array and by creating new array with amount of length if after storing the values if there is any space is empty than that space is wasteage so in these condition we use arrayList.

// ************************************* Program for storing odd numbers from given array in arrayList ***************


import java.util.*;
import java.io.*;

// public class ArrayList{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n= in.nextInt();

//         ArrayList<Integer> a = new ArrayList<Integer>();
//         for(int i=0;i<a.size();i++){
//             int x = in.nextInt();
//             if(x%2==0){
//                 a.add(x);
//             }
//             System.out.println(a.get(i));
//         }
        
//     }
// }


public class ArrayList{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        While(in.hasNextInt()){
            int x = in.nextInt();
            if(x%2!=0)
            {
                arr.add(x);    // Here arr.add(); function adds element in arrayList
                sum += x;
            }
        }

        System.out.println(sum);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));     // Here arr.get(); prints element from arrayList
        }
    }
}
