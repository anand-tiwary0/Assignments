package substrings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        printpermute(str);
        String str1 = "abcd";
        ArrayList<String> ans = permutereturn("",str1);
        System.out.println(ans);
        System.out.println("number of permutations :: "+permutecount("",str1));
    }
    public static void printpermute(String up){
        printpermute("",up);
    }
    private static void printpermute(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i =0; i<=p.length(); i++){
            //creating substrings
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            printpermute(first+ch+second,up.substring(1));
        }
    }

     public static ArrayList<String> permutereturn(String p,String un){
        if(un.isEmpty()){
            ArrayList<String> processed = new ArrayList<>();
            processed.add(p);
            return processed;
        }
        //if up is not empty
         char ch = un.charAt(0);

         ArrayList<String> ans = new ArrayList<>();

         for(int i=0; i<=p.length();i++){
             String first = p.substring(0,i);
             String second = p.substring(i,p.length());
             ans.addAll(permutereturn(first+ch+second,un.substring(1)));
         }
         return ans;
     }

     public static int permutecount(String p,String un){
        if(un.isEmpty()){
            return 1;
        }
        char ch = un.charAt(0);
        int count = 0;
        for(int i = 0; i<=p.length(); i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            count = count + permutecount(first+ch+second,un.substring(1));
        }
        return count;
     }
}
