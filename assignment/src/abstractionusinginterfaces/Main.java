package abstractionusinginterfaces;
class Cow implements Sound{
    @Override
    public void sound() {
        System.out.println("this is cow speaking");
    }
}
public class Main {
    public static void main(String[] args) {
        Sound obj1 = new Cow();
        obj1.sound();
    }
}
