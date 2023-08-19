package recursionday0;

public class Reverse {
    public static void main(String[] args) {
        int n = 1824;
        System.out.println(reverse(n,1000));
    }

    public static int reverse(int n,int len){
        if(n%10 == n){
            return n;
        }
        int current = n%10;
        return current*len + reverse(n/10,len/10);
    }
}
