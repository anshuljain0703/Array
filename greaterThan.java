import java.util.Scanner;

public class greaterThan {
    public static int GreaterThan(int [] arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
       return count;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size:");
        int n=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("Enter element:");
        int x=sc.nextInt();

      int count= GreaterThan(arr, x);
      System.out.println("No of elements strictly greater than"+" "+x+" "+"is"+" "+count);
    }
}
    
