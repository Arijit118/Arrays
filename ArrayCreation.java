package Arrays;

import java.util.*;

public class ArrayCreation {
    public static void main(String args[]) {
        int marks[] = new int[50];
        // int numbers[] = {1, 2, 3, 4, 5};
        // String fruits[] = {"Apple", "Mango", "Orange"};
        //Insert element in array
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();//Phy marks
        marks[1] = sc.nextInt();//chem marks
        marks[2] = sc.nextInt();//math marks
        System.out.println("Physics marks: "+marks[0]);
        System.out.println("Chem marks: "+marks[1]);
        System.out.println("Math marks:"+marks[2]);

        //update element
        marks[2] = 97;
        marks[2] = marks[2] + 1;
        System.out.println("Updated math marks: "+marks[2]);

        
        //lenth of array
        System.out.println("Lenth of marks array is: "+marks.length);

    }

}
