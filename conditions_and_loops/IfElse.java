package conditions_and_loops;
import java.util.*;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        int x  = sc.nextInt();
        if(x>10000){
            System.out.println("Salary is: "+(x+2000));
        }else{
            System.out.println("Salary is :"+(x+1000));
        }
    }
}
