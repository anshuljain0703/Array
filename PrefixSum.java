import java.util.Scanner;
public class PrefixSum {
    public static   int [] prefixsum(int [] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];

        }
        return arr;
    } 
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size:");
        int n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        int [] ans=prefixsum(arr);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();

}    
}

