package stringStringbuilderandStringbuffer;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String s1 = new String("you can't change me");
        String s2 = new String("you can't change me");
        System.out.println(s1==s2); //false

        String s3 = "you can't change me";
        System.out.println(s1 == s3); //false as s3 points to string constant pool area string

        String s4 = "you can't change me";
        System.out.println(s3 == s4); //True as both are references to the same object in scp area

        String s5 = "you can't " + "change me";  //if both operands are constant then calculation happens at compile time so
        // here at run time "you can't change me " is already available
        System.out.println(s5==s4);  // true;

        String s6 = "you can't ";
        String s7 = s6 + "change me";  //this will happen at run time so at run time a new object is always
        // created only in heap area not in scp area but for both literals two objects in scp area
        System.out.println(s4 == s7);  //false

        final String s8 = "you can't ";
        String s9 = s8 + "change me";  //as s8 is final so for this equation both operands are constants so
        // this operation will be performed at compile time so s9 is complete "you can't change me"
        System.out.println(s4 == s9); //true

        //different String constructors
        StringBuffer sbo = new StringBuffer("durga");
        String stest = new String(sbo);
        System.out.println(stest);

        StringBuilder sbb = new StringBuilder("durga");
        String stest1 = new String(sbb);
        System.out.println(stest1);

        char[] ch = {'a','b','c','d','e','f','g','h'};
        String sbbb = new String(ch);
        System.out.println(sbbb);

        byte[] byts = {97,98,99,100,-127};
        System.out.println(new String(byts));


        //some important method of String class
        System.out.println("String function tests");
        String s = "       ";
        System.out.println(s.isBlank());  //spaces are also counted as blank
        System.out.println(s.isEmpty());
        String s15 = new String("durga");
        System.out.println(s15.length());  //not s.length as .length is only used for array objects
        String test = "abababab";
        System.out.println(test.replace('a','b'));
        String teststring = new String("     you can't change me      ");
        System.out.println(teststring.substring(3));
        System.out.println(teststring.substring(3,9));
        System.out.println(teststring.charAt(4));
        System.out.println(teststring.indexOf("cha"));
        System.out.println(teststring.lastIndexOf('a'));
        System.out.println(teststring.toUpperCase());
        System.out.println(teststring.toLowerCase());
        System.out.println(teststring.toUpperCase().trim());

        Scanner input = new Scanner(System.in);
        System.out.println("enter city name");
        String name = input.nextLine().toLowerCase().trim();
        if(name.equals("hydrabad")){
            System.out.println("hello hydrabadi");
        }
        else if(name.equals("banglore")){
            System.out.println("hello banglore");
        }
        else{
            System.out.println("enter valid city name");
        }


        //careful
        System.out.println("reusing same object no matter where they are i.e. in heap or scp area of heap as after " +
                "version 1.6 scp is part of heap area hence more expandible earlier was in method area with fixed size");
        System.out.println("careful test");
        String testend = new String("durga");  //new object in heap area as well as in scp area
        String testend2 = testend.toUpperCase();  // as it is run time operation only object in heap ares so new object will be created in heap area
        String testend3 = testend.toLowerCase(); //here the object over which the operation begin performed will not change so no new obj will be created
                                                    // so here new refernce varible will point to the same heap area object
        System.out.println(testend == testend2);  //false
        System.out.println(testend3 == testend);  //true

        //2nd example
        String testt = "durga";   //new object only in scp area
        String testt1 = testt.toString();  // no change so will point to same object
        String test2 = testt.toLowerCase();  // no change will pint ot same object
        String test3 = testt.toUpperCase();  // change will create new object in heap area
        System.out.println(testt == testt1);  //true
        System.out.println(testt == test2);  //true
        System.out.println(testt == test3);  //false
    }
}
