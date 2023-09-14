package substrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursiveSubString {
    public static void main(String[] args) {
        String str = "ab";
        substring1("",str);
        System.out.println("now let's find some substrings of it :: ");
        System.out.println(substring(str));
    }

    public static ArrayList<String> substring(String s){
        return substring("",s);
    }
    private static ArrayList<String> substring(String un, String p){
        if(p.isEmpty()){
            ArrayList<String> processed = new ArrayList<>();
            processed.add(un);
            return processed;
        }
        ArrayList<String> left = substring(un+p.charAt(0),p.substring(1));
        ArrayList<String> right = substring(un,p.substring(1));
        left.addAll(right);
        return left;
    }


    public static void substring1(String p,String u){
        if(u.isEmpty()){
            System.out.println(p);
            return;
        }
        substring1(p+u.charAt(0) ,u.substring(1));
        substring1(p,u.substring(1));
        substring1((p+(int)(u.charAt(0))),u.substring(1));
    }
}
