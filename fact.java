import java.util.*;

public class fact {
    public static int calculateFactorial(int n){
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5){
            count += n / i;
        }
        return count;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = calculateFactorial(n);
        System.out.println(result);
    } 
}