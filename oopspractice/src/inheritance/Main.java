package inheritance;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Box obj1 = new Box(23,23,22);
        Box box1 = new Box(4.5,3.4,55);

        System.out.println(box1.getT());

        Boxweight box3 = new Boxweight(); //this will call super class by default leading to initialization of super vars
        System.out.println(box3.h + " " + box3.weight);
        Boxweight box4 = new Boxweight(12,23,42,32);


        //now here comes intresting part where the var type which is used to reference to object is different from

        Box box5 = new Boxweight(2,3,4,5);
        //what box5 can access depends upon type of var here box5 var can access l,h,w only not weight because weight is
        //not it's property
        System.out.println(box5);
        Boxweight box6 = new Boxweight();
        box6.overridetest();  //this work find because here no parent is involved

        Box box7 = new Boxweight();
        box7.overridetest();  //we can inherit but we can't override like you can run but you can't hide
    }

}
