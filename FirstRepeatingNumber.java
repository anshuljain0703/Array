import java.util.Scanner;

public class FirstRepeatingNumber {
    public static int firstrepeatingnumber(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                    
                }
            }
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
         int ans=firstrepeatingnumber(arr);
         System.out.println(ans);
     }
   
}
