public class Queuemain {
    public static void main(String[] args) throws Exception {
        Customqueue queue = new Customqueue(5);
        queue.insert(3);
        queue.insert(45);
        queue.insert(45);
        queue.insert(44343);
        queue.insert(454343);

        queue.display();
        System.out.println(queue.remove());
        //here removing elements from queue takes o(N) which is very bad so here comes into picture
        //circular queue
        queue.display();
    }
}
