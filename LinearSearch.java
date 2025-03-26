import java.util.Scanner;

public class LinearSearch {
    public static boolean linearSearch(int [] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array:");
           int n=sc.nextInt();
         int [] arr=new int[n];
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }
   boolean ans= linearSearch(arr, n);
   if(ans){
    System.out.println("Founded");
   }else{
    System.out.println("Not Founde");
   }
}
}
