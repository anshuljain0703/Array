import java.util.Scanner;
public class Transpose{
    public static void printArray(int[] []matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }

System.out.println();
        }
    }
    public static void transpose(int [][] matrix,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows:");
        int r=sc.nextInt();
        System.out.print("Enter cols:");
        int c=sc.nextInt();
        System.out.println("Enter elements:");
        int [][] matrix=new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        transpose(matrix, r, c);
printArray(matrix);
    }
}
