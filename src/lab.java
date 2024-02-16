import java.util.Stack;

public class lab {

    public static void main(String[] args) {
        // create two stacks, one for numbers and one for strings
        Stack<Integer> numberStack = new Stack<>(); // use generics to specify the type of elements
        Stack<String> stringStack = new Stack<>();

        // push some elements to the number stack
        numberStack.push(10);
        numberStack.push(20);
        numberStack.push(30);

        // push some elements to the string stack
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("Java");

        // print the contents of both stacks in column form
        System.out.println("Number stack: ");
        printStack(numberStack); // call a helper method to print the stack
        System.out.println("String stack: ");
        printStack(stringStack); // call the same method to print the other stack
    }

    // a helper method that prints the stack elements in column form
    public static void printStack(Stack<?> stack) {
        // use a list iterator to traverse the stack from top to bottom
        for (int i = 0; i<=stack.size(); i++ ) {
            System.out.println(i+ " "); // print each element on a new line
        }
    }
}
