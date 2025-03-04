//Jinqing Mei
package academy.javapro;

public class StackAdditionLab {
    public static void main(String[] args) {
        // Test case 1: Basic operations and addition
        System.out.println("=== Test Case 1: Basic Addition ===");
        ArrayStack<Integer> stack = new ArrayStack<>();
        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.push(10);
        stack.push(20);
        System.out.println("Size after pushing two elements: " + stack.size());
        System.out.println(stack.getStats());
        System.out.println(ArrayStack.getGlobalStats());
        stack.addTopTwo();
        Integer result = stack.pop();
        System.out.println("Sum: " + result);

        // Test case 2: Resizing
        System.out.println("\n=== Test Case 2: Array Resizing ===");
        ArrayStack<Integer> resizeStack = new ArrayStack();
        System.out.println("Pushing 15 elements to trigger resize...");
        for(int i = 1; i <= 15; i++) {
            resizeStack.push(i);
        }
        System.out.println("Stack size after pushing 15 elements: " + resizeStack.size());
        System.out.println(resizeStack.getStats());

        // Test case 3: Multiple instances
        System.out.println("\n=== Test Case 3: Multiple Stack Instances ===");
        ArrayStack<Double> floatStack = new ArrayStack<>();
        floatStack.push(1.5);
        floatStack.push(2.5);
        floatStack.push(3.5);
        System.out.println("First stack stats: " + stack.getStats());
        System.out.println("Second stack stats: " + resizeStack.getStats());
        System.out.println("Third stack stats: " + floatStack.getStats());
        System.out.println(ArrayStack.getGlobalStats());
    }
}
