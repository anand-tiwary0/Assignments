package recursionday0.patternsviarecursion;

public class Pattern1 {
    public static void main(String[] args) {
        printpattern(5,0);
    }

    public static void printpattern(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            printpattern(r,c+1);
        }
        else{
            System.out.println();
            printpattern(r-1,0);
        }
    }
}
