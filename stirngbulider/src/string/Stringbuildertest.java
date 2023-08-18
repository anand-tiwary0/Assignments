package string;

public class Stringbuildertest {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder(20);
        String pallindrome = "abcdefedcba";
        char[] arr = new char[1];
        int where = 1;
        buffer.append(arr,where,1);
        System.out.println(ispallindrome(pallindrome));
    }

    public static boolean ispallindrome(String obj){
        if(obj == null || obj.length() == 0){
             return true;
        }

        for(int i=0, k= obj.length(); i<k; i++){
            int start = obj.charAt(i);
            int end = obj.charAt(obj.length() -1 -i);
            if(start != end){
                return false;
            }
        }

        return true;
    }
}
