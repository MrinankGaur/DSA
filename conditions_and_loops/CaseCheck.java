package conditions_and_loops;
import java.util.*;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char x = sc.next().trim().charAt(0);
        if (x>='a' && x<='z'){
            System.out.println("input is in lowercase");
        }else if(x>='A' && x<='Z'){
            System.out.println("input is in uppercase");
        }



    }
}
