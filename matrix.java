import java.util.Scanner;
public class matrix
{
    public static void matrixtranspose()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of row");
            int m =s.nextInt();
            System.out.println("enter the value of column");
            int n =s.nextInt();

            int A[][]=new int[m][n];
            

            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++)
                {
                    A[i][j]=s.nextInt();                    
                }
            }

            System.out.println("Original matrix: ");
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++)
                {
                    System.out.print(A[i][j]+ " ");                   
                }
                System.out.println();
            }

            System.out.println("Transposed matrix: ");
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++)
                {
                    System.out.print(A[j][i]+ " ");                   
                }
                System.out.println();
            }
    }




    public static void main(String[] args) {
        matrixtranspose();
    }
}





   