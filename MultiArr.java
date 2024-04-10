import java.util.*;
import java.io.*;

public class MultiArr{
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