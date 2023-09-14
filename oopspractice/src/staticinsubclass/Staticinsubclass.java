package staticinsubclass;

public class Staticinsubclass {
    static class Subclass{
        int a=303;
        double b;
        static int c;
        static double d;

        void greeting(){
            System.out.println("hello there i am from subclass");
        }

        public void greeting2(){
            System.out.println("hello there i am from static greeting in subclass");
        }

        public Subclass(int a, double b) {
            this.a = a;
            this.b = b;
            Subclass.c++;
            Subclass.d++;
        }
    }

    static class Nonstatic {
       Subclass obbbj = new Subclass(23,535);
       //any action taking statements in a class should be inside a method or constructor or static block
        //because a class have only fields that declared properties and function so no action word
        public Nonstatic(Subclass obbbj, int nona, int non) {
            this.obbbj = obbbj;
            this.nona = nona;
            this.non = non;
            obbbj.greeting();
        };
       int nona;
       int non;

       void greeting1(){
            System.out.println("trying to access var in other static subclass " + Subclass.c);
       }

    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(5,6);
    }
}
