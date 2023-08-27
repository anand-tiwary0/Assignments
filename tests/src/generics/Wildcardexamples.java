package generics;

import java.util.List;

public class Wildcardexamples<T extends Number>{
    public static void getnumber(List<? extends Number> list){
        //here we can pass any subclass of Number type and Number class itself
    }
}
