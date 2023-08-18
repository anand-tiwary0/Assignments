package string;

//class Solution {






//    public static String restoreString(String s, int[] indices) {
//        StringBuilder buffer = new StringBuilder(indices.length);
//
//
//        Integer a = 23*43;
//        a.toString();
//        System.out.println(a.toString());
//
//        System.out.println(s);;
////        System.out.println(buffer.toString());
////        for (int i = 0; i < indices.length; i++) {
////            char whatchar = s.charAt(i);
////            int whatindex = indices[i];
////            buffer.setCharAt(whatindex, whatchar);
////        }
////        public static String restoreString(String s, int[] indices) {
////            StringBuilder string=new StringBuilder(s);
////            for(int i=0;i<s.length();i++){
////                string.setCharAt(indices[i],s.charAt(i));
////            }
////            return String.valueOf(string);
////        } why
//        return buffer.toString();
//    }
//
//    public static void main(String[] args) {
//        String s = "codeleet";
//        int[] indices = {4,5,6,7,0,2,1,3};
//        System.out.println(restoreString(s,indices));
//
//    }
//}

class Solution {
    public String multiply(String num1, String num2) {
        int first = parse(num1);
        int second = parse(num2);
        Integer obj = first * second;
        return obj.toString();
    }


    public static int parse(String num){
        int a = 0;
        for(int i=0;i<num.length();i++){
            a = num.charAt(i) - '0';
            System.out.println(a);
        }
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        String num1 = "2";
        String num2 = "3";
        Integer a = (Integer) parse(num1)*parse(num2);
//        String muultipyed = parse(num1) * parse(num2);
        System.out.println(a.toString());
    }
}