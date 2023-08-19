package recursionday0;

public class Count0 {
    public static int count(int n){
        int sum = 0;
        return helper(n,sum);
    }

    private static int helper(int n ,int sum){
        if(n == 0){
            return sum;
        }
        int rem = n % 10;
        if(rem == 0){
            return helper(n/10,sum+1);
        }
        return helper(n/10,sum);
    }

    public static void main(String[] args) {
        int n = 30204;
        System.out.println(count(n));
    }
}
