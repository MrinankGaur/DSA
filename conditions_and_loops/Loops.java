package conditions_and_loops;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 0;i<x;i++){
            System.out.println(i+1);
        }
        int i =0;
        while(i<x){
            System.out.println(i+1);
            i++;
        }
        i=0;
        do{
            System.out.println(i+1);
            i++;
        }while (i<x);
    }
}
