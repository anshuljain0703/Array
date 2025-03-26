import java.util.Scanner;

public class PairSum {
    public static int pairsum(int [] arr,int target){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }

            }
            
        }
        return ans;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size:");
        int n=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("Enter target:");
        int target=sc.nextInt();

      int ans=pairsum(arr, target);
      System.out.println(" Sum  equal to"+" "+target+" "+"is"+" "+ans);
    }
}

    

