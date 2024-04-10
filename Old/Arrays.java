class Arrays{
    public static void main(String[] args) {
        
        int[] arr = new int[5];

        Solution s1 = new Solution();
        int ans = s1.singleNonDuplicate(arr);
        System.out.println(ans);
    }
}


// ******************** Single Element in Sorted Array ******************
// Brute force: using Linear Search OR taking XOR of all elements and return XOR as temp at last.

// Optimised : Using Binary search.
class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        // Approach: if (nums[mid] == nums[mid^1]) then single element lies in right part otherwise single element in left part. If I am standing at 4(even) and then 4^1 == 5 then i go in right half. If I am standing at 3(odd) then 3^1 == 2 then I go in left half. Because of XOR i don't have to write to many if conditions. If single element lies in last index the my start pointer points last element at the last. 


        int n = nums.length;
        int s = 0, e = n-2;

        while (s <= e) {
            int mid = s + (e-s)/2;

            if (nums[mid] == nums[mid^1]){
                s = mid+1;
            }else {
                e = mid-1;
            }
        }
        return nums[s];
    }
}