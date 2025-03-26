import java.util.Scanner;
public class CountOfOccurence {

public static  int countOfOccurence(int [] arr,int x){
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
            count++;
        }

    }
    return count;
}

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array:");
           int n=sc.nextInt();
         int [] arr=new int[n];
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }
        
         System.out.print("Enter element to count its occurence:");
         int x=sc.nextInt();

        int ans= countOfOccurence(arr, x);
        System.out.println("Occurence of"+" " +x+ " "+"is"+" "+ans);

         
    }
    
}
