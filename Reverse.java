import java.util.Scanner;

public class Reverse {
    public static void Swapping(int [] arr,int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
   }
    public static void reverse(int [] arr){
        
            int i=0;
            int j=arr.length-1;
            
            while(i<j){
                Swapping(arr,i,j);
                i++;
                j--;

            }
           
        }
       

    
    
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array:");
           int n=sc.nextInt();
         int [] arr=new int[n];
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }
         reverse(arr);
         System.out.println("Reversed Array:");
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

         }
         System.out.println();
        }
}
