import java.util.Scanner;


    public class matrixoperation
    {
        public static void addition()
        {
            Scanner s=new Scanner (System.in);
            System.out.println("enter the value of row");
            int m =s.nextInt();
            System.out.println("enter the value of column");
            int n =s.nextInt();
            
            int A[][]=new int[m][n];
            int B[][]=new int[m][n];
            int C[][]=new int[m][n];
            
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    A[i][j]=s.nextInt();
                    B[i][j]=s.nextInt();
                }

            }
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    C[i][j]=A[i][j]+B[i][j];

                    System.out.print(C[i][j]);
                    
                }
                System.out.println(" ");
            }
        }
        
        
        
        
        
        
        public static void main(String[] args) 
        {
           

            addition();

        }
    }