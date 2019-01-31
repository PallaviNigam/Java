//Difference between array and arraylist
//Array have fixed no of element while arraylist doesnot have it adjusts itselfdynamically

import java.util.ArrayList; 
import java.util.Arrays; 
public class MyClass {
    public static void main(String args[]) {
    int[] arr = new int[4];
    ArrayList<Integer> arrl = new ArrayList<Integer>();
    arr[0] = 1;
    arrl.add(2);
    System.out.println(arrl);
    System.out.println(Arrays.toString(arr));
    
    }
}
