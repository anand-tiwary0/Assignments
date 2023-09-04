public class StackMain {
    public static void main(String[] args) throws StackException {
//        Customstack stack = new Customstack(5);
        DynamicStack stack = new DynamicStack(5);
        stack.push(12);
        stack.push(535);
        stack.push(56786);
        stack.push(53675);
        stack.push(5435);
        stack.push(5435);
        stack.push(5435);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }
}
