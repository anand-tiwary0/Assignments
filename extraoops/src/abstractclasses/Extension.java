package abstractclasses;

public class Extension extends Abstractclass{

    int b;
    @Override
    public void greeting() {
        System.out.println("this is me speaking from extension of abstract classes");
    }

    public Extension(int a, float varl,int b) {
        super(a, varl);
        this.b = b;
    }
}
