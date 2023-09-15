package backtracking;

import java.util.Arrays;

public class PrintPathmatrix {
    public static void main(String[] args) {
        boolean[][] maize = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] patharray = new int[maize.length][maize[0].length];
        ways("", maize, 0, 0,patharray,1);
    }
    public static void ways(String p,boolean[][] maize,int r,int c,int[][] patharray,int size){
        if(r == maize.length-1 && c == maize[0].length-1){
            //print the array
            //also add last value
            patharray[r][c] = size;
            for(int i = 0; i<patharray.length; i++){
                System.out.println(Arrays.toString(patharray[i]));
            }
            System.out.println(p);
            System.out.println();
            patharray[r][c] = 0;
            return;
        }
        if(!maize[r][c]){
            return;
        }
        maize[r][c] = false;
        patharray[r][c] = size;

        //let's move down
        if(r<maize.length-1){
            ways(p+"D",maize,r+1,c,patharray,size+1);
        }
        if(c<maize[0].length-1){
            ways(p+"R",maize,r,c+1,patharray,size+1);
        }
        if(c>0){
            ways(p+"L",maize,r,c-1,patharray,size+1);
        }
        if(r>0){
            ways(p+"U",maize,r-1,c,patharray,size+1);
        }

        //now resetting all changes made due to this recursion step or fuction call
        maize[r][c] = true;
        patharray[r][c] = 0;
    }
}
