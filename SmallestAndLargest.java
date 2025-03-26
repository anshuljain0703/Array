import java.util.Scanner;
import java.util.Arrays;
public class SmallestAndLargest {
    public static int [] smallestandlargest(int [] arr){
        Arrays.sort(arr);
        int [] result={arr[0
            ],arr[arr.length-1]};
        return result;
      
        
    }
     public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size:");
        int n=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        

    
     int[] result= smallestandlargest(arr);
      System.out.println(Arrays.toString(result));
    }
}

