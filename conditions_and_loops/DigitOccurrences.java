package conditions_and_loops;
import java.util.Scanner;
public class DigitOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n=999;
        int count = 0;
        while(n>0){
            n = x%10;
            x = x/10;
            if(n==y){count++;}


        }
        System.out.println(count);
    }
}
