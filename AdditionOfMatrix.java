import java.util.Scanner;
public class AdditionOfMatrix{
    public static void printArray(int [][] sum){
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum.length;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void addTwoMatrices(int [][]a ,int r1,int c1,int [][]b,int r2,int c2){
        int [][]sum=new int [r1][c1];
        if(r1!=r2 && c1!=c2){
            System.out.println("Wrong Input!");
            return;
        }

for(int i=0;i<r1;i++){
    for(int j=0;j<c1;j++){
        sum[i][j]=a[i][j]+b[i][j];
    }
}
printArray(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows1:");
        int r1=sc.nextInt();
        System.out.print("Enter no of cols1:");
        int c1=sc.nextInt();
        int [][] a=new int [r1][c1];
        System.out.println("Enter elements:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter no of rows2:");
        int r2=sc.nextInt();
        System.out.println("Enter no of cols2:");
        int c2=sc.nextInt();
        int [][] b=new int [r2][c2];
        System.out.println("Enter elements:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
    } 
    addTwoMatrices(a, r1, c1, b, r2, c2);
}
}