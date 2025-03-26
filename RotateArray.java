import java.util.Scanner;
public class RotateArray {
    public static void printArray(int[] []matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }

System.out.println();
        }
    }
    public static void reverse(int [] matrix){
    
        int l=0;
        int r=matrix.length-1;
        while(l<r){
            int temp=matrix[l];
            matrix[l]=matrix[r];
            matrix[r]=matrix[l];
l++;
r--;
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
    public static void rotate(int [][]matrix,int r,int c){
        transpose(matrix, r, c);
        for(int i=0;i<r;i++){
            reverse(matrix[i]);
        }
printArray(matrix);
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
        rotate(matrix, r, c);
    }
}

    
