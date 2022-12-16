import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // creating 2D array of size 2x2
        int[][] matrix =new int[2][2];
        System.out.println("enter matrix number");
        // loops to move on every row and column
        // this loop to enter the matrix numbers
        for (int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j]=input.nextInt();
            }
        // to print the matrix that the user enter
        System.out.println("the real matrix is");
        // loops to move on every row and column


        for (int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
        // to get the transpose and print it
        System.out.println("the transpose matrix is");
        // loops to move on every row and column
        for (int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++)
            {
               //this swap to get transpose
                System.out.println(matrix[j][i]);
            }

    }
}