package rev;

public class SegmentTree {
    private class Node{
        Node left, right;
        int startIndex, endIndex;
        int data;
        public Node(int startIndex, int endIndex){
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }
    }
    private Node root;
    public SegmentTree(int[] arr){
        //using this array let's make a segment tree
        this.root = buildTree(arr,0,arr.length-1);
    }
    private Node buildTree(int[] arr,int start, int end){
        //base case when start and end are same i.e. leaf node
        if(start == end){
            Node node = new Node(start,end);
            node.data = arr[start];
            return node;
        }
        Node newnode = new Node(start,end);
        int mid = start + (end - start)/2;
        newnode.left = buildTree(arr,start, mid);
        newnode.right = buildTree(arr,mid+1,end);
        newnode.data = newnode.left.data + newnode.right.data;
        return newnode;
    }

    //query suppose the user want to get sum of numbers in range [2,6] in the array of size [0,7]
    public int query(int start, int end){
        return query(this.root,start,end);
    }
    private int query(Node current , int qsi, int qei){
        //now we have to handel three cases
        //case 1 if the give node interval is inside the interval we are finding;
        if(current.startIndex>=qsi && current.endIndex<=qei){
            return current.data;
        }
        //now case 2 when the given interval in node is outside
        else if(current.endIndex<qsi || current.startIndex>qei){
            //just ignore these values as they should not be in our total sum
            return 0;
        }else {
            //now we will handle the case when node we are in have overlapping interval
            //now go left enquire if that interval also lies in or overlapping or out(return 0)
            //similarly do this for right side then take sum
            int leftData = query(current.left, qsi, qei);
            int rightData = query(current.right, qsi, qei);
            return rightData + leftData;
        }
    }

    //display function
    public void display(){
        display(this.root);
    }

    private void display(Node current){
        //prepare a string for current node
        String str = "";
        if(current.left != null){
            str += "left child :: interval ["+current.left.startIndex + "-" + current.left.endIndex + "] and data is :: " + current.left.data + " --> ";
        }else{
            str += "no left child";
        }

        //now for the current node str
        str += ":: interval [" + current.startIndex + "-" + current.endIndex + "] and data is :: " + current.data + " -- >";

        if(current.right != null){
            str += "right child :: interval [" + current.right.startIndex + "-" + current.right.endIndex + "] and data is :: " + current.right.data + "\n";
        }else{
            str += "no right child";
        }

        //now just print the string constructed
        System.out.println(str);
        //now do this recursively for left and right until null is encountered
        if(current.left != null){
            display(current.left);
        }
        if(current.right != null){
            display(current.right);
        }

    }


    //updating suppose we want to change the index 3 to 14 then we will traverse tree in such a way that we will
    // go till the leaf node that contains that leave update the leaf node when returning get data updated in the
    //path followed
    public void update(int index, int value){
        System.out.println(update(this.root,index,value) + "was added" );
    }
    private int update(Node current,int index, int value){
        if(current.startIndex == current.endIndex){
            current.data = value;
            return value;
        }
        if(index >= current.startIndex && index <= current.endIndex){
            //means child contains that index
            // get sum
            int left = update(current.left,index,value);
            int right = update(current.right,index,value);
            current.data = left + right;
        }else{
            return current.data;
        }
        return current.data;
    }
}

class Main{
    public static void main(String[] args) {
        SegmentTree tree = new SegmentTree(new int[]{3,8,7,6,-2,-8,4,9});
        tree.display();
        System.out.println("sum in range [2,6] = " + tree.query(2,8));
    }
}
