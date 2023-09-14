package day0static;

public class Statictest {  //the main or parent class can't be static as it does not makes sense as static wrt something
    static int a ;
    //as non static elements depends upon obj in constrast static elements are related to
    int c;
    double d;
    String s;

    //lets test private one to get feel of getters and setters
    private double privater;

    private static double vlog;
    static int b = 10; //static varibles can be accessed outside class without instantion of it's class

    static {
        a = 10;
    }

    public Statictest(int c, double d, String s) {
        this.c = c;
        this.d = d;
        this.s = s;
    }

    //function overriding


    public double getPrivater() {
        return privater;
    }

    public void setPrivater(double privater) {
        this.privater = privater;
    }

    public static void main(String[] args) {
        //inside static method we can't use non static element as it makes no sense
    }

    @Override
    public String toString() {
        return "Statictest{" +
                "c=" + c +
                ", d=" + d +
                ", s='" + s + '\'' +
                ", privater=" + privater +
                '}';
    }
}
