public class BST {
    private static class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;
        public Node(int value){
            this.value = value;
        }
        private static int getValue(Node node){
            return node.value;
        }
    }
    //constructor for BST
    public BST(){
    }
    public  Node root;

    public static int getHeight(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public  boolean isEmpty(){
        if(root == null) return true;
        return false;
    }

    public void insert(int value){
        root = insert(root,value);
    }

    private  Node insert(Node node,int value){
        if(node == null){
            //create new node and just return this
            Node newnode = new Node(value);
            return newnode;
        }

        if(value <= node.value){
            node.left = insert(node.left, value);
        }
        else if(value>node.value){
            node.right = insert(node.right,value);
        }
        //updating height
        node.height = Math.max(getHeight(node.left),getHeight(node.right)) + 1;
        //now simply return the same node for which function was called if no new
        //node is created
        return node;
    }

    public  void display(){
        display(root,"root node is :: ");
    }

    public  void display(Node node,String infoabouthem){
        if(node == null) return;
        System.out.println(infoabouthem + node.value);
        display(node.left,"left child of node " + node.value + ": ");
        display(node.right,"right child of node "+node.value + ": ");
    }



    public  void populate(int[] arr){
        for(int i =0; i<arr.length; i++){
            insert(arr[i]);
        }
    }

    //three traversal techs
    //pre-order traversal L -> N -> R for each node maintian this order and access it
    public  void populatesorted(int[] arr){
        populatesorted(arr,0,arr.length-1);
    }
    private void populatesorted(int[] arr,int start,int end){
        if(start>end){
            return;
        }
        int mid = start +(end -start)/2;
        this.insert(arr[mid]);   //just insert current mid
        //then again give left part of array to work and progressively insert left part
        populatesorted(arr,0,mid-1);
        //now here comes right part
        populatesorted(arr,mid+1,end);
    }

    public  void displayp(){
        displayp(this.root ,0);
    }
    private void displayp(Node root, int level){
        if(root == null){
            return;
        }
        displayp(root.right,level+1);
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
            System.out.print("|------>"+ root.value);
            System.out.println();
            //now printing part is done
        }
        displayp(root.left,level+1);
    }


    public static void main(String[] args) {
        BST tree = new BST();
        BST tree2 = new BST();
        tree.populatesorted(new int[]{1,2,3,4,5,6,7,8,9});
        tree2.populate(new int[] {12,45,2,12,5,6,12,5,3,6});
        tree2.displayp(tree2.root,0);
    }
}

