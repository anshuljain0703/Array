
import java.util.Scanner;
public class queries{
    public static   int [] prefixsum(int [] a){
        int ps[]=new int[a.length];
        ps[0]=a[0];
        for(int i=1;i<a.length;i++){
            ps[i]=ps[i-1]+a[i];

        }
        return ps;
    } 
    

    static int query(int[] a,int l,int r){
       int [] ps=prefixsum(a);
       if (l == 1) {
        return ps[r - 1];
    } else {
        return ps[r - 1] - ps[l - 2];
    }
}



    
    public static void main(String [] args){
        int[] a={2,4,1,3,6,5};
       
        int l=3;
        int r=5;

       int result= query(a,l,r);
       System.out.println(result);
    }
}

