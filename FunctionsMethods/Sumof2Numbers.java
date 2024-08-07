package FunctionsMethods;
import java.util.*;
public class Sumof2Numbers {
    public static void main(String[] args) {
      sum();
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no 1: ");
        int x = sc.nextInt();
        System.out.print("Enter no 2: ");
        int y = sc.nextInt();
        System.out.println("Sum of numbers is: "+(x+y));

    }
}

