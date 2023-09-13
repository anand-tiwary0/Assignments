package leetcodeproblems;

import java.util.Stack;

public class Removeefficient extends QueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;
    public Removeefficient(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public int removed(){
        return first.pop();
    }

    //now let's implement insertion operation which will be ineffienct in this case
    @Override
    public void add(int item){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(item);
        while(!second.isEmpty()){
            first.push(second.pop());
        }
    }

}
