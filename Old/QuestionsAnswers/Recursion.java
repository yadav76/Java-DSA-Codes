package QuestionsAnswers;

import java.util.ArrayList;
import java.util.HashSet;

public class Recursion {
    public static void main(String[] args) {
        
        Solution s = new Solution();
        // int[] arr = {1,2,1,20,10,3,4};
        // ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
   
        // s.print(arr,0,new ArrayList<>());
        // s.recur(arr, 0, new ArrayList<>(), 0);

        // s.printFirst(arr, 0, new ArrayList<>(), 0);

        // System.out.println(s.count(arr,0,0));

        Combination c1 = new Combination();
        // c1.combination1(arr, 0, 2, ans, new ArrayList<>());
        // c1.combination2(arr, 0, 3, ans, new ArrayList<>());

        // for (ArrayList<Integer> l : ans) {
        //     for (int i : l) System.out.print(i+" ");
        //     System.out.println();
        // }

        int[] arr = {1,3,2};

        SubSet s1 = new SubSet();

        ArrayList<Integer> ans = new ArrayList<>();

        s1.print(arr, 0, 0, ans);

        for (int i: ans) {
            System.out.print(i+" ");
        }
    }
}

class SubSet{

    public void print(int[] arr,int i, int sum, ArrayList<Integer> ans) {
        if (i >= arr.length) {
            ans.add(sum);
            return;
        } 

        //Pick
        print(arr,i+1,sum+arr[i],ans);

        // Not Pick
        // ans.remove(ans.size()-1);
        print(arr,i+1,sum,ans);

    }

    public void subSet2(int[] arr, int idx, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans) {

        ans.add(new ArrayList<>(list));

        for (int i=idx; i<arr.length; i++) {
            // for removing Duplicate Elements recursion calls
            if (i!=idx && arr[i] == arr[i-1]) continue;

            list.add(arr[i]);
            subSet2(arr,i+1,list,ans);

            // Remove last element from list
            list.remove(list.size()-1);
        }
    }
}

class Combination {

    // Combination Sum 1
    public void combination1(int[] arr, int i, int target, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> list) {
        if (i == arr.length) {
            if (target == 0) ans.add(new ArrayList<>(list));
            return;
        }
        
        if (arr[i] <= target) {
            // the ele we are adding is <= target then add to list or not
            list.add(arr[i]);
            combination1(arr,i,target-arr[i],ans,list);    // Pick 
            list.remove(list.size()-1);           // remove last ele
        }

        // combination1(arr,i+1,target,ans,list);   // Do not Pick

    }

    public void combination2(int[] arr, int idx, int target, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> list) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for (int i=idx; i<arr.length; i++) {
            if (i > idx && arr[i] == arr[i-1]) {
                continue;                    // for ignoring the same elements Recursive Calls
            }
            if (arr[i] > target) break;   // no Further Recursion calls are helpful

            list.add(arr[i]);

            combination2(arr,i+1,target-arr[i],ans, list);

            // backTrack
            list.remove(list.size()-1);

            // TC = O(2^N * N)  SC = O(N)
        }
    }

    public void combination21(int[] arr, int i, int target, HashSet<ArrayList<Integer>> ans, ArrayList<Integer> list) {
        if (i == arr.length) {
            if (target == 0) ans.add(new ArrayList<>(list));
            return;
        }
        
        if (arr[i] <= target) {
            // the ele we are adding is <= target then add to list or not
            list.add(arr[i]);
            combination21(arr,i+1,target-arr[i],ans,list);    // Pick 
            list.remove(list.size()-1);           // remove last ele
        }

        combination21(arr,i+1,target,ans,list);   // Do not Pick

        // TC = O(2^N * N * LogN) SC = O(N) 
        // here LogN for using HashSet and space also unkown
    }
}

class Solution{

    void print(int[] arr, int i, ArrayList<Integer> ans) {
        if (i >= arr.length) {
            for (int j: ans) System.out.print(j);
            System.out.println();
            return;
        }

        // Pick
        ans.add(arr[i]);
        print(arr,i+1,ans);

        // Do not Pick
        ans.remove(ans.size()-1);
        print(arr,i+1,ans);
        
        // TC = O(2^N x N)   SC = O(N)
    }

    // print the subSequences of Specific Sum 
    public void recur(int[] arr, int i, ArrayList<Integer> ans, int sum) {
	    
	    
	    if (i >= arr.length) {
	        if (sum == 2) {
	        for (int j: ans) System.out.print(j+" ");
	        System.out.println();
	        }
	        return;
	    }
	    
	    ans.add(arr[i]);
	    sum += arr[i];
	    recur(arr,i+1,ans,sum);
	    
	    sum -= arr[i];
	    ans.remove(ans.size()-1);
	    
	    
	    recur(arr,i+1,ans,sum);
    }

    // If I want to print only First Subsequence of Array
    public boolean printFirst(int[] arr, int i, ArrayList<Integer> ans, int sum) {
        if (i >= arr.length) {
	        if (sum == 2) {
                for (int j: ans) System.out.print(j+" ");
                System.out.println();
                return true;

                // When I printed First SubSequence then I return True;
	        }
	        return false; // I reached end of the Array but sequence not found equal to sum then return false
	    }
	    
	    ans.add(arr[i]);
	    sum += arr[i];
	    if (printFirst(arr,i+1,ans,sum) == true) return true; // If previous call of the function return true then directly return true without making any function calls
	    
	    sum -= arr[i];
	    ans.remove(ans.size()-1);
	    
        if (printFirst(arr,i+1,ans,sum) == true) return true; // same Here also

        return false; 
        // if subsequence not made
    }

    // If I want to print the count of Subsquences made of equal to sum 
    public int count(int[] arr, int i, int sum) {
        if (i >= arr.length) {
            if (sum == 2) return 1;
            return 0;
        }

        int l = count(arr,i+1,sum+arr[i]);

        int r = count(arr,i+1,sum-arr[i]);

        return l+r;
    }
}
