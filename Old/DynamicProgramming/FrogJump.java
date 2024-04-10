package DynamicProgramming;

public class FrogJump {
    public static void main(String[] args) {
        int[] arr = {30,10,60,10,60,50};

        int n = arr.length;
        int[] dp = new int[n];
        
        System.out.println(recursion(arr, n-1));
        System.out.println(memo(arr,n-1,dp));
        System.out.println(tab(arr,n-1,dp));
        System.out.println(optimised(arr, n-1));
    }

    public static int optimised(int[] arr, int n) {
        int prev = 0, prev2 = 0;

        for (int i=1; i<=n; i++) {
            int left = prev + Math.abs(arr[i]-arr[i-1]);

            int right = Integer.MAX_VALUE;
            if (i > 1) right = prev2 + Math.abs(arr[i]-arr[i-2]);

            int curr = Math.min(left,right);
            prev2 = prev;
            prev = curr;
            
        }
        return prev;
    }

    public static int recursion(int[] arr, int n) {
        if (n==0) return 0;

        int left = recursion(arr, n-1) + Math.abs(arr[n]-arr[n-1]);

        int right = Integer.MAX_VALUE;
        if (n>1) right = recursion(arr, n-2) + Math.abs(arr[n]-arr[n-2]);

        return Math.min(left,right);
    }

    public static int memo(int[] arr, int n, int[] dp) {
        if (n==0) return 0;
        if (dp[n] != 0) return dp[n];

        int left = recursion(arr, n-1) + Math.abs(arr[n]-arr[n-1]);

        int right = Integer.MAX_VALUE;
        if (n>1) right = recursion(arr, n-2) + Math.abs(arr[n]-arr[n-2]);

        return dp[n] = Math.min(left,right);
    }

    public static int tab(int[] arr, int n , int[] dp) {
        dp[0] = 0;

        for (int i=1; i<=n; i++) {
            int left = dp[i-1] + Math.abs(arr[i]-arr[i-1]);

            int right = Integer.MAX_VALUE;
            if (i>1) right = dp[i-2] + Math.abs(arr[i]-arr[i-2]);

            dp[i] = Math.min(left,right);
        }

        return dp[n];
    }
}
