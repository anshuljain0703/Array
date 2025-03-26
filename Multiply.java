import java.util.Scanner;
public class Multiply {
    

    public static void printArray(int [][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static void multiply(int [][]a, int r1,int c1,int [][]b,int r2,int c2){
        if(c1!=r2){
            System.out.println("Wrong Input!");
            return;

        }
        int [][] mul=new int [r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                for(int k=0;k<c1;k++){
                    mul[i][j]+=a[i][k]+b[k][j];

                }
               
            }
        }
        printArray(mul);

    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter r1 values:");
        int r1=sc.nextInt();
        System.out.println("Enter c1 values:");
        int c1=sc.nextInt();

        int [][] a=new int [r1][c1];
        System.out.println("Enter values for matrix a:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter r2 values:");
        int r2=sc.nextInt();
        System.out.println("Enter c2 values:");
        int c2=sc.nextInt();
        int [][] b=new int[r2][c2];
        System.out.println("Enter values for matrix b:"); 
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix a:");
        printArray(a);
        System.out.println("Matrix b:");
        printArray(b);
        multiply(a, r1, c1, b, r2, c2);
    }
    
}
