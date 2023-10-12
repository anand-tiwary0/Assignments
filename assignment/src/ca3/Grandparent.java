package ca3;
public class Grandparent{
        String name;

        public Grandparent(String name) {
            System.out.println("i am from Grandparent class");
            this.name = name;
        }
        public Grandparent(){}
    }
    class Parent extends Grandparent{
        String parent_name;

        public Parent(String name, String parent_name) {
            super(name);
            System.out.println("i am from Parent class");
            this.parent_name = parent_name;
        }
        public Parent(){};
    }

    class Child extends Parent{
        String child_name;

        public Child(String name, String parent_name, String child_name) {
            super(name, parent_name);
            System.out.println("i am called from Child class");
            this.child_name = child_name;
        }
        public Child(){};
    }


class Mainof{
    public static void main(String[] args) {
        Child first = new Child("Grandparent","parent","child");
    }
}
