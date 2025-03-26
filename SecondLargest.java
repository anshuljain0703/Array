import java.util.Scanner;
import java.util.Arrays;
public class SecondLargest {
    public static int secondlargest(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            return arr[arr.length-2];
        }
        return -1;
    }
     public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array:");
           int n=sc.nextInt();
         int [] arr=new int[n];
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }
      int ans=  secondlargest(arr);
      System.out.println(ans);
    
        }
    }
