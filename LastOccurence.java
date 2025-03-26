import java.util.Scanner;
public class LastOccurence {
    public static int lastOccurence(int [] arr,int x){
        int lastIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastIndex=i;
            }
            
        }
        return lastIndex;
        
  
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

      int idx= lastOccurence(arr, x);
      System.out.println("Last Occurence of"+" "+x+" "+"is"+" "+idx);
    }
}
