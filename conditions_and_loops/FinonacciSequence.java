package conditions_and_loops;
import java.util.*;
public class FinonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth :");
        int n = sc.nextInt();
        int x = 0;
        int y = 1;
        int z = 0;
        for(int i = 1; i < n ; i++){
            z = x + y;
            x = y;
            y = z;
        }
        System.out.println(z);

    }
}
