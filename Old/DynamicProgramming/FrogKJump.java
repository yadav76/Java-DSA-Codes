package DynamicProgramming;

// Frog Jump with K Jump
// I can Optimise these Frog Jump with K steps but for that I need K variables and If k == n then I need n variables so there is no need to Optimize this.
// But I can store K variables in an ArraList<Integer> list for Optimisation 
public class FrogKJump {
    public static void main(String[] args) {
        int[] arr = {30,10,60,10,60,50};
        int k=2;
        int n = arr.length;
        int[] dp = new int[n];
        
        System.out.println(recursion(arr, n-1,k));
        // System.out.println(recur(arr,n-1,k,dp));
        // System.out.println(tab(arr,n-1,k,dp));
    }
    public static int tab(int[] arr, int n, int k, int[] dp) {
	    dp[0] = 0;
	    
	    for (int i=1; i<=n; i++) {
	        int minSteps = Integer.MAX_VALUE;
            int jump = Integer.MAX_VALUE;
        
            for (int j=1; j<=k; j++) {
                if ((i-j)>=0) jump = dp[i-j] + Math.abs(arr[i]-arr[i-j]);
                
                minSteps = Math.min(minSteps,jump);
                dp[i] = minSteps;
            }
	    }
	    
	    return dp[n];
	}
    public static int recursion(int[] arr, int n,int k) {
        if (n == 0) return 0;

        int minJump = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;

        for (int i=1; i<=k; i++) {
            if (n-i>=0)
                right = recursion(arr,n-i,k) + Math.abs(arr[n]-arr[n-i]);

            minJump = Math.min(minJump,right);
        }

        return minJump;
    }
    public static int recur(int[] arr, int n,int k,int[] dp) {
        if (n<=0) return 0;
        if (dp[n] != 0) return dp[n];
        
        int minSteps = Integer.MAX_VALUE;
        int jump = Integer.MAX_VALUE;
        
        for (int i=1; i<=k; i++) {
            if ((n-i)>=0)
                jump = recur(arr,n-i,k,dp) + Math.abs(arr[n]-arr[n-i]);
                
                minSteps = Math.min(minSteps,jump);
        }
        
        return dp[n] = minSteps;
        
    }
}
