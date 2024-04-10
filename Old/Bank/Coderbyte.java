import java.util.*;

public class Coderbyte{
    public static void main(String[] args) {
        String s = "onezeropluseighttwo";

        helper(s);
    }

    public static void helper(String s){

        int n = s.length();     // "ninesixsevenplustwozerothree"

        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        HashMap<String,Integer> hm = new HashMap<>();

        // ******* Adding all arr elements to HashMap to add to ans
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],i);
        }

        String temp = "";
        String num = "";

        String op = "";
        int ans = 0;

        // ******* Main Logic of Program ********
        for(int i=0;i<n;i++){

            temp = temp + s.charAt(i);
            // System.out.println(temp);

            if(hm.containsKey(temp)) {
                
                num += ""+hm.get(temp);

                temp = "";
            }else if(temp.equals("plus")){   // if sign is "positive"

                op = "plus";
                ans = Integer.parseInt(num);
                temp = "";
                num = "";
                
            }else if(temp.equals("minus")){  // if sign is "minus"
                op = "minus";
                ans = Integer.parseInt(num);
                temp = "";
                num = "";
            } 
        }
        
        // ******** creating another variable for adding second half of give string number
        int ans2 = 0;

        ans2 = Integer.parseInt(num);

        // ******** adding or substracting both half of given String Number
        if(op.equals("plus")){
            ans = ans + ans2;
        }else{
            ans = ans - ans2;
        }

        // ******** handling Edge case for negative answers *****
        boolean flag = false;

        if(ans < 0){
            flag = true;
            ans = Math.abs(ans);
        }

        // ****** for reversing the number to get right output in while loop
        temp = ""+ans;

        StringBuilder sb = new StringBuilder(temp);

        sb.reverse();

        temp = sb.toString();

        ans = Integer.parseInt(temp);

        String finalAns = "";

        // System.out.print(ans);

        // ****** Converting number back to String ******
        while(ans >0){
            finalAns += arr[ans%10];
            ans = ans/10;
        }

        // ******** adding "negative" in final String if answer is negative
        if(flag){
            finalAns = "negative"+finalAns;
        }

        // printing final output
        System.out.print(finalAns);
    }
}