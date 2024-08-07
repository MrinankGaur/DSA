package FucntionsMethods;
import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        isPrime(x);
    }
    static void isPrime(int a){
        if(a<=1){
            System.out.println("Number is not prime");
        }else{
            int c = 2;
            int check = 0;

            while(c<a){
                if(a%c==0){
                    System.out.println("Number is not prime");
                }else{
                    check++;
                }c++;
            }
            if(check==a-2){
                System.out.println("Number is prime");
            }


        }
    }
}
