package day0static;

public class Main {
    public static void main(String[] args) {
        Human obj1 = new Human(12,"kunal",3434,true);
        Human obj2 = new Human(123,"rahul",3243,false);
        Human.population = 6;
        System.out.println(Human.population);


//        Statictest obj = new Statictest(34,45,"kunal");
//        Statictest.a = Statictest.a *5;
//
//        Statictest obj1 = new Statictest(89,45.4, "rahul");
//        System.out.println(Statictest.a);
//        obj1.a = obj1.a +1;
//
//        Statictest obj2 = new Statictest(34,53,"third");
//        //so no matter how many objects we create this static block will only
//        //be executed once only once when first object is created or when
//        //class is loaded
//
//        System.out.println(obj2.a); //we should use class name to access static items
//        obj.setPrivater(23);
//        //only through this setter we can acess
//
//        //override default toStringmethod
//        System.out.println(obj);
//
//        obj.getPrivater();  //even privater is private we can use setters and getters to access it.
//

    }
}
