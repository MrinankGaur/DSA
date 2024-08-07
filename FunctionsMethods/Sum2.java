package FunctionsMethods;
import java.util.*;
public class Sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no 1: ");
        int m = sc.nextInt();
        System.out.print("Enter no 2: ");
        int n = sc.nextInt();

        int x = sum(m,n);

        System.out.println("Sum : "+x);
    }
    static int sum(int a,int b){

        return a + b;

    }
}

