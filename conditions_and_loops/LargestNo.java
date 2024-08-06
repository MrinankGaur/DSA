package conditions_and_loops;

import java.util.*;
public class LargestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three Numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x>y && x>z){
            System.out.println("Largest no is: "+x);
        } else if(y>x && y>z){
            System.out.println("Largest no is :"+y);
        }else if(z>x && z>y){
            System.out.println("Largest no is :"+z);
        }else{
            System.out.println("All no.s are equal");
        }
    }

}
