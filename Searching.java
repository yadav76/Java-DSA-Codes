// ************************************************** Searching ########################################3

// Linear Search: in Linear Search we just use for loop and search linearlly for target element and when target element found we just print index of targest element. Time Complexity is O(n) and Space Complexit is O(1). In Linear Search not necessory to have a sorted array in question or in problem.


// Binary Search: Array must be sorted. TC O(logN) and SC O(1). 





// public class Searching {
//     public static void main(String[] args){
//         int arr[] = {-1,0,3,5,9,12};
//         int start = arr[0], end = arr[arr.length-1];
//         int target = 9;

        

//     }
// }


// class Solution {
//     public int Search(int[] nums,int targe){
//         int n = nums.length;
//         int start = 0;
//         int end = n-1;
        
//         while(start<=end){
//             int mid = (start+end)/2;
            
//             if(nums[mid]==target
//                return mid;
               
//             if(nums[mid]<target){
//                 start = mid+1
//             }else{
//                 end = mid-1;
//             }
//         }
//         return -1;
//     }
// public:
//     int search(vector<int>& nums, int target) {
        
//     }
// };


// public class Searching{
//     public static void main(String[] args){
        
//         String str = "abba";
//         int n = str.length()-1;
//         int s = str.charAt(0); 
//         int e = str.chartAt(n-1);
//         String ans = func(str,s,e);
//         System.out.println(ans);
//     }

//     static void func(String str, int s, int e){
//         if(s>=e){
//             return true;
//         }
//         if(str.charAt(s)!=str.chartAt(e)){
//             return false;
//         } 

        
//     }
// }

public static int search(int a[], int start,int end,int target){



    if(start>end){
        return -1;
    }
    int n = arr.length;

    int mid=(start+end)/2;

    if(a[mid]==target)
        return mid;


    else if(target>a[mid]){
        int ans =  search(a[],mid+1,end,target);
        return ans;
    }
    else
        return search(a[],start,mid-1,target);
}



/// ******************* Two Sum array ************************

import java.util.*;
import java.io.*;
public class Main{
  static int[] sum(int nums[],int target){
    for(int i=0;i<nums.length;i++){
      for(int j=1;j<nums.length;j++){
        if(nums[i]+nums[j]==target){
          return new int [] {i,j};
        }
      }
    }
    int C[] = {};
    return C;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int ans[] = sum(arr,t);
    System.out.println(ans[0]);
    System.out.println(ans[1]);
  }
}