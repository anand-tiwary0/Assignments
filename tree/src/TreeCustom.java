import java.util.Scanner;

public class TreeCustom {
    private static class Node{
        private int value;
        private Node left;
        private Node right;
        public Node(int value){
            this.value = value;
        }
    }

    public static Node root;

    public TreeCustom() {
    }

    public static void populate(){
        Scanner scanner = new Scanner(System.in);
        populate(scanner);
    }

    private static void populate(Scanner scanner){
        System.out.println("Enter root node for this tree :: ");
        int value = scanner.nextInt();
        TreeCustom.root = new Node(value);
        populate(scanner,root);
    }


    private static void populate(Scanner scanner,Node node){
        System.out.printf("do you want to insert node on left of %d :: (true/false) :: ",node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            //here user want to insert in left of the current node;
            System.out.printf("enter the value to add to left of node (%d) :: ",node.value);
            int value = scanner.nextInt();
            Node newnode = new Node(value);
            node.left = newnode;
            //now again ask if user countinue to want to insert on left side or not
            populate(scanner,node.left);
        }

        //now suppose user don't want to insert at left but inserted on right
        System.out.printf("do you want ot insert node on right of %d :: (true/false) :: ",node.value);
        boolean right = scanner.nextBoolean();
        if(right) {
            System.out.printf("enter the value to add to right of node(%d) ::",node.value);
            int value = scanner.nextInt();
            Node newnode = new Node(value);
            node.right = newnode;
            //now again ask the user if he want to populate
            populate(scanner,node.right);
        }
    }

    public static void display(){
        display(TreeCustom.root ,0);
    }
    private static void display(Node root,int level){
        if(root == null){
            return;
        }
        display(root.right,level+1);
        if(level == 0){
            System.out.println(root.value);
        }
        //now printing part
        else{
            for(int i=1; i<level; i++){
            //here blank part will be printed
            //this will print indentations based on level
            System.out.print("|\t\t");
            }
            //this will print the value in current line
            System.out.print("|--------->"+ root.value);
            System.out.println();
            //now printing part is done
        }
        display(root.left,level+1);
    }

    public static void main(String[] args) {
        TreeCustom tree = new TreeCustom();
        tree.populate();
        tree.display();
    }
}
