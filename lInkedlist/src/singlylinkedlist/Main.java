package singlylinkedlist;

public class Main {
    public static void main(String[] args) throws Exception {
    Linkedlistnew list = new Linkedlistnew();
    list.insertfirst(3);
    list.insertfirst(2);
    list.insertfirst(1);
    list.insertlast(4);
    list.insertlast(5);
    list.insertlast(6);
    list.insert(2,10);
    list.insert(5,12);

    list.display();
        System.out.println("first deleted :: ");
        System.out.print(list.deletefirst());
        System.out.println();
        System.out.println("last deleted :: ");
        System.out.print(list.deletelast());
        System.out.println();
        System.out.println("last deleted :: ");
        System.out.print(list.deletelast());
        System.out.println();
        list.display();
        System.out.println("inbetween :: ");
        System.out.print(list.delete(2));
        System.out.println();
        list.display();
        list.displayrev();

        list.insertRec(88,2);
        list.insertRec(0,0);
        list.display();
    }

}