package abstractclasses;

/*abstract classes are those whose instance can't be created but can be used to expand other class this is like template
that every class must follow */
public abstract class Abstractclass {
    public int a;
    public float varl;
    static int vari;
    Abstractclass(int a,float varl){
        this.a = a;
        this.varl = varl;
    }
    public static void testmethod(){
        System.out.println("this is test method inside Abstarctclass");
    }
    public static void restrictiontest(){
        System.out.println("this function is to test restriction");
    }
    abstract public void greeting();
    public void greeting(String name){
        System.out.println("hello there " + name);
    }
    static void staticmethod(){
        System.out.println("this is from static function inside abstract class");
    }
}
