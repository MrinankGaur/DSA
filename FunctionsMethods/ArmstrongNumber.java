package FunctionsMethods;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        checkArmstrong(x);

    }
    static void checkArmstrong(int a ){
        int x = a;
        int z = 0;
        while(x>0){
            int y = (x%10);
            z+=(y*y*y);
            x=x/10;
        }
        if(z==a){
            System.out.println("It is an Armstrong Number");
        }
    }
}
