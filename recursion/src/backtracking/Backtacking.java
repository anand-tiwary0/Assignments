package backtracking;

import java.util.SplittableRandom;

public class Backtacking {
    public static void main(String[] args) {
        boolean[][] maize = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        ways("",maize,0,0);
    }
    public static void ways(String p,boolean[][] maize,int r,int c){
        if(r == maize.length-1 && c == maize[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maize[r][c]){
            return;
        }
        //setting current cell to false so as to include this cell in out path till now
        maize[r][c] = false;
        //let's move down
        if(r<maize.length-1){
            ways(p+"D",maize,r+1,c);
        }
        //let's move right
        if(c<maize[0].length-1){
            ways(p+"R",maize,r,c+1);
        }
        //let's move up
        if(r>0){
            ways(p+"U",maize,r-1,c);
        }
        //let's move left
        if(c>0){
            ways(p+"L",maize,r,c-1);
        }

        //now this function is about to end so we will set the cell to it's original value this is called
        //backtracking as we are not leaving trace of this path so that other possibles paths are not affected
        maize[r][c] = true;
    }
}
