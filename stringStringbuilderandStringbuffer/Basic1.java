package stringStringbuilderandStringbuffer;

public class Basic1 {
    public static void main(String[] args) {
        String s = new String("durga");
        s.concat("software");
        System.out.println(s.length());
        System.out.println(s); //here original s will be printed as
        //due to any runtime operation performed if any change in string object a new object is created
        //but here after concat reference to that new object is not set
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());
        StringBuffer sb = new StringBuffer("durga");
        sb.append("abcdefghijklmnop");
        sb.append("q");
        System.out.println(sb.capacity());  //capacity tells us number of chars it can accomodate wihtout expanding

        System.out.println(sb);
        //here in case of sb mutability is there so no new object will be created and all changes will be
        //performed over the same object
        StringBuffer sb2 = new StringBuffer(8);
        System.out.println(sb2.capacity());
        sb2.append("abcdefghijklmnop");
        System.out.println(sb2.capacity());//algorithm used to incrase capacity
        // (initital capacity + 1) * 2


        //equals and ==
        String s1= new String("durga");
        String s2 = new String("durga");
        // == is reference comparison
        System.out.println(s1 == s2);   //false
        //.equals method in Object class is implemented as same as == but in case of
        //String class it is overloaded to do content comparison

        System.out.println(s1.equals(s2));  //true

        //but in case of StringBuffer class .equals() is not overloaded so it does reference comparison only
        StringBuffer s11 = new StringBuffer("durga");
        StringBuffer s12 = new StringBuffer("durga");
        System.out.println(s11==s12);  //false
        System.out.println(s11.equals(s12));  //false only reference comparison



    }
}
