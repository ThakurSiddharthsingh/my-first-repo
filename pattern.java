public class pattern {

    public static void main(String[] args) {
        // int n =5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
            
        //         if (j==1){
        //             System.out.print(i);
        //         }else if (j==2){
        //             System.out.print(i+4);
        //         }else if (j==3){
        //             System.out.print(i+4+3);
        //         }
        //         else if(j==4) {
        //             System.out.print(i+4+3+2);
        //         }else{
        //             System.out.print(i+4+3+2+1);
        //         }
            
            
        //     }System.out.println("");
    
        // }
        int n=5;
        float sum=0;
        for (int i = 0; i <= n; i++) {
            sum=(float) fact(i)/(i+1)+sum;
            
        }
        System.out.println(sum);
    }    
       static int fact (int n){
            int fact=1;
            for (int i = 0; i<=n; i++) {
                fact=fact*i;
                
            }
            return fact;
        }
    
    
}
