package SwitchCase;
import java.util.*;
public class DescribeFruit {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String fruit  = sc.next();
        switch(fruit){
            case "mango":
                System.out.println("king of fruit");
                break;
            case "apple":
                System.out.println("apple juice");
                break;
            default:
                System.out.println("default executed");
        }
    }
}
