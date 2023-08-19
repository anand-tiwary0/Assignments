package recursionday0;

public class Pallindrome {
    public static boolean ispallindrome(int n){
        return (n == rev(n));
    }

    private static int rev(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits){
        if(n%10 == n){
            return n;
        }
        int lastdigit = n%10;
        return lastdigit * (int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }



    public static void main(String[] args) {
        int n = 12345431;
        System.out.println(ispallindrome(n));
    }
}
