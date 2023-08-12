package polymorphism;
class Student{
    int roll;
    float marks;
    String name;
    Student(){
        //this is default constructor it just initializes primitive values with 0 and
        //non-primitive values with null
    }
    Student(Student other){
        this.roll = other.roll;
        this.marks = other.marks;
        this.name = other.name;
    }
    //compile time polymorphism using function overloading
    Student(int roll, float marks,String name){
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }

    void greet(){
        System.out.println("this is from super class");
    }
}

class Polytest extends Student{
    void greet(){
        //when obj of this type is created then this function will be called
        //even if the reference var is of type superclass (here student)
        //this is an example of run time polymorphism
        System.out.println("this is from polytest class");
    }
}

public class Main {
    public static void main(String[] args) {
        //here the fuction which will be called is decided by compiler
        //during compilation based on number of arguments
        Student obj1 = new Student(34,45.5f,"tiwary");

        Student obj2 = new Polytest();
        obj2.greet();  //here greet of Polytest class will be called because
                      //object is of class polytest
    }
}
