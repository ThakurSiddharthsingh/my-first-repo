import java.util.*;
public class multiple
{   public static void multiplication()
    { Scanner s= new Scanner(System.in);
        System.out.println("enter the row");
        int m=s.nextInt();
        System.out.println("enter the row");
        int n=s.nextInt();

        int A[][]=new int[m][n];
        int B[][]=new int[n][m];
        int C[][]=new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j]=s.nextInt();
            }
            
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                B[i][j]=s.nextInt();
            }
            
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j]=A[i][j]*B[i][j];
            }
            
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j]);
            }
            System.out.println(" ");
        }

    }
    public static void main(String[] args)
    {
        multiplication();
    }
}