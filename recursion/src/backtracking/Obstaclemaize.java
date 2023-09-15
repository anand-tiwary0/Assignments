package backtracking;

import substrings.Maize;

public class Obstaclemaize {
    public static void main(String[] args) {
        boolean maize[][] = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        ways("",maize,0,0);

    }
    public static void ways(String p,boolean[][] maize,int r,int c){
        if(r==maize.length-1 && c==maize[0].length-1){
            System.out.println(p);
            return;
        }
        if(r<maize.length-1){
            ways(p+"D",maize,r+1,c);
        }
        if(c<maize[0].length-1){
            ways(p+"R",maize,r,c+1);
        }
    }
}
