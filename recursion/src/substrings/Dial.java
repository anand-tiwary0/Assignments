package substrings;

import java.util.ArrayList;

public class Dial {
    public static void main(String[] args) {
        String str = "12";
        printcomb(str);
        String str2 = "12";
        System.out.println(pritncount("",str2));
        System.out.println(printcomb2("",str2));
        String actual = "72";
        System.out.println(actualdail("",actual));
    }
    public static void printcomb(String up){
        printcomb("",up);
    }
    public static void printcomb(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int ch = up.charAt(0) - '0';
        //at key 1 - abc 2 - def and each of there alphabet is realted to number so
        int start = (ch-1)*3;
        int end = ch*3;  //this will be exclusive like for 1 - a = 0 b = 1 and c = 2
        for(int i=start; i<end; i++){
            //now for each letter call the function
            char toadd = (char)('a' + i);
            printcomb(p+toadd,up.substring(1));
        }
    }
    //now let's return the array which will contain all such permuatations
    public static ArrayList<String> printcomb2(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> processed = new ArrayList<>();
            processed.add(p);
            return processed;
        }
        //now if p is not empty
        ArrayList<String> ans = new ArrayList<>();
        int ch = up.charAt(0)-'0';
        int start = (ch-1)*3;
        int end = ch*3;
        for(int i=start; i<end ; i++){
            char toadd = (char)('a'+i);
            ans.addAll(printcomb2(p+toadd,up.substring(1)));
        }
        return ans;
    }

    public static int pritncount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int ch = up.charAt(0) - '0';
        int start = (ch-1)*3;
        int end = ch*3;
        for(int i = start; i<end ; i++){
            char toadd = (char)('a'+i);
            count = count + pritncount(p+toadd,up.substring(1));
        }
        return count;
    }

//    Key 0: ""
//    Key 1: ""
//    Key 2: "abc"
//    Key 3: "def"
//    Key 4: "ghi"
//    Key 5: "jkl"
//    Key 6: "mno"
//    Key 7: "pqrs"
//    Key 8: "tuv"
//    Key 9: "wxyz"


    //now actual case senerio
    public static ArrayList<String> actualdail(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> processed = new ArrayList<>();
            processed.add(p);
            return processed;
        }

        ArrayList<String> ans = new ArrayList<>();

        int ch = (up.charAt(0)) -'0';
        String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String toworkon = mapping[ch];
        while(!toworkon.isEmpty()){
            char toadd = toworkon.charAt(0);
            ans.addAll(actualdail(p+toadd,up.substring(1)));
            toworkon = toworkon.substring(1);
        }
        return ans;
    }
}
