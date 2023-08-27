package generics.comparing;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lamdafunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0; i<5; i++){
            arr.add(i);
        }
        System.out.println(arr.toString());
        arr.forEach((item) -> System.out.print(item * 2 + " "));
        System.out.println();
        Consumer<Integer> fun = (item) -> System.out.print(2 * item + " ");
        arr.forEach(fun);
    }

    int sum(int a,int b){
        return a+b;
    }
}
