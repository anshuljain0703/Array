import java.util.Scanner;
public class isSorted {
    
    public static boolean Sorted(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }

        }
        return true;

        
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size:");
        int n=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        boolean ans=Sorted(arr);
      if(ans){
        System.out.println("Array is Sorted.");

      }else{
        System.out.println("Array is not Sorted.");
      }
    }
    
}
