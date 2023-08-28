package defaultll;

import java.util.Arrays;
import java.util.LinkedList;

public class LInkedlistgiven {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<Integer>();
        list.add(23);
        list.add(1,4343);
        list.addLast(45);
        list.removeLast();
        System.out.println(Arrays.toString(list.toArray()));
    }
}
