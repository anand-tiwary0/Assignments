package rev;

import java.util.Scanner;

public class BinaryTree {
    private class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    private static Node root;

    public BinaryTree() {

    }

    public void populate(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter root of the tree :: ");
        int rootValue = input.nextInt();
        root = new Node(rootValue);
        //insertion at root is done now let's move onto other node insertion or population
        populate(root,input);
    }
    private void populate(Node node,Scanner input){
        System.out.print("do you want to enter at the left of " + node.value + ":: ");
        boolean leftChoice = input.nextBoolean();
        if(leftChoice){
            System.out.print("enter the number to insert :: ");
            int valueAdd = input.nextInt();
            Node newNode = new Node(valueAdd);
            node.left = newNode;
            //if user want to continue to insert node in left side
            populate(node.left,input);
        }
        //now done with leftward insertion let's move onto right side insertion
        System.out.print("do you want to insert at the right of " + node.value + ":: ");
        boolean rightChoice = input.nextBoolean();
        if(rightChoice){
            System.out.print("enter the value to insert :: ");
            int valueAdd = input.nextInt();
            Node newNode = new Node(valueAdd);
            node.right = newNode;
            //left part is already handlled now again let's user decide if he want to add more to it or not
            populate(node.right,input);
        }
    }

    public void displaySimple(){

    }
    public static void displayBetter(){
        displayBetter(root,0);
    }
    public static void displayBetter(Node node,int level){
        if(node == null){
            return;
        }
        displayBetter(node.right,level+1);
        //printing for right subtree first
        //then print node
        //then print left subtree

        //this is just printing spaces in next line
        for(int i=0; i<level-1; i++){
            //this will print spaces
            System.out.print("|\t\t");
        }
        if(level != 0){
            System.out.print("|------>");
        }
        System.out.println(node.value);
        displayBetter(node.left,level+1);
    }

    //traversals
    public static void preOrder(){
        preOrder(root);
    }
    public static void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(){
        inOrder(root);
    }
    public static void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public static void postOrder(){
        postOrder(root);
    }
    public static void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }


//    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        tree.populate();
//        tree.displayBetter();
//        tree.preOrder();
//        System.out.println();
//        tree.inOrder();
//        System.out.println();
//        tree.postOrder();
//        System.out.println();
//
//    }
}
