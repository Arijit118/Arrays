package Arrays;
import java.util.*;
public class PassingArrayAsArgument {
    public static void update(int marks[]) {
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]) {
        int marks[] = {90, 93, 96};
        update(marks);
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        
    }
}
