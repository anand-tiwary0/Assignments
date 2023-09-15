package abstractclasses;

public class Extension extends Abstractclass{
    int b;
    //abstract methods or methods from abstract class must be overridden
    @Override
    public void greeting() {
        System.out.println("this is me speaking from extension of abstract classes");
    }
    public Extension(int a, float varl,int b) {
        super(a, varl);
        this.b = b;
    }
//    @Override
//    public static void testmethod(){
//
//    }   Static methods can't be overridden they can only be inherited

    //also function can't be made more restrictive while overriding it's
    //restriction level must be same or lower only

    @Override
    public void greeting(String name) {
        super.greeting(name);
    }

//    private static void restrictiontest(){
//        System.out.println("this function is defined public in superclass so here it can't be private");
//    }
//    'restrictiontest()' in 'abstractclasses.Extension' clashes with 'restrictiontest()' in 'abstractclasses.Abstractclass'; attempting
//    to assign weaker access privileges ('private'); was 'public'
}
