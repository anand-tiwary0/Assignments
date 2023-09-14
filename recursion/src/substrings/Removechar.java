package substrings;

public class Removechar {
    public static void main(String[] args) {
        String arr = "bcaacaba";
        String arr1 = "appleisappgoogappapple";
        removeapple(arr1,"");
        System.out.println(removeapp(arr1));
        removechar1(arr);
        System.out.println(arr);
        System.out.println(remove2(arr));
    }
    public static void removechar1(String given){
        //using this we will print resulting string
        helper1("",given);
    }
    private static void helper1(String p,String u){
        if(u.isEmpty()){
            System.out.println(p);
            return;
        }
        char removed = u.charAt(0);
        if(removed == 'a'){
            helper1(p,u.substring(1));
        }
        else{
            helper1(p+removed,u.substring(1));
        }
    }

    public static String remove2(String u){
        //here we take only unprocesses string as argument
        if(u.isEmpty()){
            return "";
        }
        char r = u.charAt(0);
        if(r=='a'){
            return remove2(u.substring(1));
        }
        else {
            return r + remove2(u.substring(1));
        }
    }

    public static void removeapple(String u,String p){
        if(u.isEmpty()){
            System.out.println(p);
            return;
        }
        if(u.startsWith("apple")){
            removeapple(u.substring(5),p);
        }
        else{
            removeapple(u.substring(1),p + u.charAt(0));
        }
    }


    public static String removeapp(String u){
        if(u.isEmpty()){
            return "";
        }
        if(u.startsWith("app") && !u.startsWith("apple")){
            return removeapp(u.substring(3));
        }
        return u.charAt(0)+removeapp(u.substring(1));
    }
}
