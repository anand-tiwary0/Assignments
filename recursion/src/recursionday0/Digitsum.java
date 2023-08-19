package recursionday0;

public class Digitsum {
    public static void main(String[] args) {
        int n = 1032;
        System.out.println(digitsum(n));
    }

    public static int digitsum(int n){
        if(n==0){
            return 0;
        }
        int lastdigit = n%10;
        int sum = digitsum(n/10) + lastdigit;
        return sum;
    }
}
