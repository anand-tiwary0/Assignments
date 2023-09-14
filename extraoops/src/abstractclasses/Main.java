package abstractclasses;

public class Main {
    public static void main(String[] args) {
        Abstractclass.vari = 5;
        Abstractclass.staticmethod();

        Abstractclass obj = new Extension(34,456.33f,435);
        //this is abstract method that was defined in Extension class and
        //declared but not implemented in Abstractclass
        obj.greeting();
        //this is just static function inside abstract class
        //unlike interfaces abstract classes allow defined functions and fields
        obj.greeting("Ramsita");
    }
}
