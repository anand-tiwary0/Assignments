package tests;

class Solution {
    public static boolean isPalindrome(String s) {
       String j = s.toLowerCase();
        j.length();
//        System.out.println(j + j.length());
        int mid = (j.length()-1)/2;
        int fptr = 0;
        if(j.length() == 0){
            return true;
        }
        boolean toreturn = true;
        int lptr = j.length()-1;
        while(fptr<=lptr){
            //now if the character is alphanumbric then only count otherwise skip
            if((j.charAt(fptr)>='a' && j.charAt(fptr)<='z') || (j.charAt(fptr)>='0' && j.charAt(fptr)<='9')) {
                if ((j.charAt(lptr) >= 'a' && j.charAt(lptr) <= 'z') || j.charAt(lptr) >= '0' && j.charAt(lptr) <= '9') {
                    if (j.charAt(fptr) == j.charAt(lptr)) {
                        //just retain true;
                        fptr++;
                        lptr--;
                    } else {
                        return false;
                    }
                } else {
                    lptr--;
                }
            }
            else {
                fptr++;
            }
        }
        return toreturn;
    }

    public static void main(String[] args) {
//        String  s = "A man, a plan, a canal: Panama";
        String s = "race a car";
        System.out.println(isPalindrome(s));

    }
}