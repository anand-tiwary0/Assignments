package day0static;

public class Human {
    int age;
    int salary;
    boolean married;
    String name;
    final int country=34;    //final is used to declare a constant var

    static long population;

    static void message(){
        System.out.println("hello world");
    }


    public Human(int age, String name,int salary,boolean married){
        this.age = age;
        this.name = name;
        this.married=married;
        this.salary = salary;

        Human.population++;
    }
}
