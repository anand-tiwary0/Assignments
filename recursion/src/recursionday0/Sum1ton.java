package recursionday0;

public class Sum1ton {
    public static void main(String[] args) {
        System.out.println("sum = " + to(10));
    }

    public static int to(int n){
        if(n==1){
            return 1;
        }
        int sum = n + to(n-1);
        return sum;
    }
}
