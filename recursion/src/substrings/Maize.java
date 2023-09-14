package substrings;

import java.util.ArrayList;

public class Maize {
    public static void main(String[] args) {
        int[] co_ordinate = {3,4};
        System.out.println("ways to reach {1,1} = "+ways(co_ordinate[0],co_ordinate[1]));
        printpath("",3,3);
        System.out.println(printpath1("",3,3));
    }
    public static int ways(int x,int y){
        //we can also handle invalid cases of co-ordinate using this function as helper function
        if(x==1 || y == 1){
            return 1;
        }
        //we have to make two recursive call each time one decreasing row and other decreasing col
        int left = ways(x-1,y);
        int right = ways(x,y-1);
        return right+left;
    }

    public static void printpath(String pathtillnow,int x,int y){
        if(x==1&&y==1){
            System.out.println(pathtillnow);
            return;
        }
        //now let's make two recursive calls when we decrease row we add D to string otherwise R
        if(!(x==1)) {
            printpath(pathtillnow+"D",x-1,y);
        }
        if(!(y==1)) {
            printpath(pathtillnow+"R",x,y-1);
        }
    }

    public static ArrayList<String> printpath1(String pathtillnow,int x,int y){
        if(x==1 && y==1){
            ArrayList<String> processed = new ArrayList<>();
            processed.add(pathtillnow);
            return processed;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(!(x==1)){
            ans.addAll(printpath1(pathtillnow+"D",x-1,y));
        }
        if(!(y==1)){
            ans.addAll(printpath1(pathtillnow+"R", x,y-1));
        }
        return ans;
    }

}
