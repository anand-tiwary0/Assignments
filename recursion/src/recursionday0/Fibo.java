package recursionday0;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nth;
        System.out.println("enter nth ");
        nth = input.nextInt();
        int ans = fibo(nth);
        System.out.println(ans);
    }


    static int fibo(int nth){
        if(nth<2){
            return nth;   //here assumption is made that 0 indexing is used
        }
        return fibo(nth-1) + fibo(nth-2);
    }
}
