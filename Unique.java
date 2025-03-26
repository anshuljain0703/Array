import java.util.Scanner;

public class Unique {
    public static int  unique(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=arr[j]=-1;
               
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                return arr[i];
            }
        }
       return -1;
       
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size:");
        int n=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int ans=unique(arr);
        System.out.println(ans);

    }
}
