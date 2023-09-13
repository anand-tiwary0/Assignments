package leetcodeproblems;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }

    public int remove() throws Exception{
        while(!first.isEmpty()){
            int val = first.pop();
            second.push(val);
        }
        int removed = second.pop();
        //now restore first stack
        while(second.isEmpty()){
            first.push(second.pop());
        }

        return removed;
    }

    public int peek() throws Exception{
        //this is just to look at the element which will be removed
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        System.out.println(second.pop());
        second.push(removed);
        while(!second.isEmpty()){
            first.push(second.pop());
        }

//        second.peek(); can also be used for this purpose
        return removed;
    }
    public boolean isEmpty(){
        return this.isEmpty();
    }

    //this is remove efficient stack
    public void addother(int item){
        //f
    }

}
