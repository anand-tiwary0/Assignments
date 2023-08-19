package recursionday0;

public class Nto1 {
    public static void main(String[] args) {
        int n = 10;
        nto1(n);
    }

    public static void nto1(int n){
        if(n==1){
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n + " ");
        nto1(n-1);
    }

}
