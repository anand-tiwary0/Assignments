package abstraction;
//this is an example of abstraction using abstract classes
abstract class Sound {
    abstract void sound();
}

class Cow extends Sound{
    @Override
    public void sound() {
        System.out.println("this cow speaking");
    }
}
class Dog extends Sound{
    @Override
    void sound(){
        System.out.println("this is dog barking");
    }
}
public class Main{
    public static void main(String[] args) {
        Sound obj1 = new Cow();
        obj1.sound();
        Sound obj2 = new Dog();
        obj2.sound();
    }
}