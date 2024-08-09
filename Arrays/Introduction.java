package Arrays;
import java.util.*;
public class Introduction {
    public static void main(String[] args) {

        //store 5 roll no.s

        // syntax
        // datatype[] variable name = new datatype[size];

        int[] arr = new int[5];

        // or

        int[] arr1 = {1,2,3,4,5,6};

        //int[] arr;  --> declaration or array. arr is getting defined in stack
        //arr = new int[5]; ==> initialisation, actually her object is being created in heap memory.
        // --> dynamic memory allocation(assigning memory during runtime)
        // array objects in java MAY! not be continuous (depends on the JVM)
        //      { 1 , 2 , 3 , 4 , 5 ..... n }
        //        ^   ^   ^   ^   ^ ..... ^
        //index:  0   1   2   3   4       n-1
        // default values of an integer array are 0

        //int[] x = new int[4];
        //System.out.println(x[0]);
        //String[] str = new String[4];
        //System.out.println(str[0]);
        //output: null ---> literal that can be assigned to non-primitives
        // e.g. --> String x = null;


    }
}
