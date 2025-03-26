public class CopytoAnother {
    public static void main(String [] args){
        int arr[]={10,20,30,40,50};
        int newarr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newarr[i]=arr[i];

        }
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
        
       
    }
}
