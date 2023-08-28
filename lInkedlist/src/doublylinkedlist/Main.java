package doublylinkedlist;

public class Main {
    public static void main(String[] args) throws Exception {
        Dll list = new Dll();
        list.insertfirst(3);
        list.insertfirst(2);
        list.insertfirst(1);
        list.insertlast(4);
        list.insertlast(5);
        list.insertlast(6);
        list.display();
        list.insert(0,200);
//        list.insert(13,500);
        list.insert(3,1500);
        System.out.println("list after insertions using indexing");
        list.display();
        System.out.println(list.removefirst());
        System.out.println(list.removelast());
        list.display();
        System.out.println("index removal::");
        System.out.println(list.remove(0));
        list.display();
    }
}
