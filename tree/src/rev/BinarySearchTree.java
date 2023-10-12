package rev;

public class BinarySearchTree{
    private class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
     private static Node root;
    public int getHeight(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    private void updateHeight(Node node){
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        node.height = Math.max(leftHeight,rightHeight)+1;
    }

    public boolean isEmpty(){
        if(root == null){
            return true;
        }
        return false;
    }

    public void insert(int value){
        root = insert(root,value);
    }
    private Node insert(Node node,int value){
        if(node == null){
            Node newnode = new Node(value);
            return newnode;
        }
        if(value <= node.value){
            node.left = insert(node.left,value);
        }
        else if(value > node.value){
            node.right = insert(node.right,value);
        }
        updateHeight(node);
        return node;
    }

    public void populate(int[] arr){
        for(int i=0; i<arr.length; i++){
            insert(arr[i]);
        }
    }

    public static void displayBetter(){
        displayBetter(root,0);
    }
    public static void displayBetter(Node node, int level){
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

    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }
    private void populateSorted(int[] nums,int start,int end){
        if(start>=end){
            return;
        }
        int mid = start + (end - start)/2;
        this.insert(nums[mid]);
        populateSorted(nums,0,mid);
        populateSorted(nums,mid+1,end);
    }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.populate(new int[]{10,3,5,2,8,20});
        tree.displayBetter();
        tree.inOrder();
    }
}
