# Lab 05 - Generic Stack Implementation Lab

### Overview

In this lab, you will implement an array-based stack data structure that works with generic numeric types. This exercise
will help you understand how fundamental data structures work, how to use generics in Java, and how to handle dynamic
array resizing. You'll also explore important programming language concepts including names, bindings, and scopes as you
work with variables at different scope levels.

### Learning Outcomes

After completing this lab, you will be able to:

- Implement a generic stack using an array-based approach
- Apply Java generics with type constraints
- Handle dynamic array resizing
- Distinguish between and properly use static, instance, and local variables
- Implement proper error handling for edge cases
- Track statistics across multiple class instances
- Apply object-oriented principles in a practical data structure

### Prerequisites

- Understanding of basic Java syntax and control structures
- Familiarity with arrays in Java
- Basic knowledge of generics and type parameters
- Understanding of object-oriented programming concepts

### Project Setup

- Open the project in your IDE
- Locate the starter code at: `src/main/java/academy/javapro`
    - `ArrayStack.java` (main class)
    - `CustomStack.java` (interface)
    - `StackAdditionLab.java` (test class)
- Do not modify the package structure or class name
- Implement the required functionality in the TODOs provided
- Remember to remove TODO comments after completing the implementation

### Task Description

You will implement the `ArrayStack<T extends Number>` class which implements the `CustomStack<T>` interface. The stack
is designed to work with numeric types only and must track statistics both for individual instances and across all
instances.

The `CustomStack<T>` interface includes these core methods:

```java
package academy.javapro;

/**
 * Interface for a custom stack implementation.
 * @param <T> the type of elements in the stack
 */
interface CustomStack<T> {
    /**
     * Adds an element to the top of the stack.
     * @param element the element to add
     */
    void push(T element);

    /**
     * Removes and returns the top element from the stack.
     * @return the top element, or null if the stack is empty
     */
    T pop();

    /**
     * Returns but does not remove the top element from the stack.
     * @return the top element, or null if the stack is empty
     */
    T peek();

    /**
     * Checks if the stack is empty.
     * @return true if the stack is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of elements in the stack.
     * @return the number of elements
     */
    int size();
}
```

Your implementation should:

- Initialize the stack properly in the constructor
- Implement all core stack operations
- Handle array resizing when it becomes full
- Add specialized numeric operations (`addTopTwo`)

### Requirements

**Functional Requirements**

- **Constructor**:
    - Initialize an array with the default capacity (10)
    - Set the top index to -1 (empty stack)
    - Initialize the operation counter
    - Assign a unique ID to each stack instance
- **Core Stack Operations**:
    - `push(T element)`: Add an element to the top of the stack and handle array resizing
    - `pop()`: Remove and return the top element, handling empty stack cases
    - `peek()`: Return the top element without removing it
    - `isEmpty()`: Check if the stack contains any elements
    - `size()`: Return the current number of elements in the stack
- **Additional Functionality**:
    - `resize()`: Dynamically increase the array size by a growth factor of 1.5
    - `addTopTwo():` Add the top two numeric elements and push the result back onto the stack
    - `getStats()`: Return statistics about this stack instance
    - `getGlobalStats()`: Return statistics across all stack instances
- **Names, Bindings, and Scopes**:
- Your implementation should demonstrate understanding of:
    - Static variables: Variables with class scope (`totalStacks`, `totalElements`)
    - Instance variables: Variables with object scope (`elements`, `top`, `operationCount`, `stackId`)
    - Local variables: Variables with method scope (inside method implementations)

### Starter Code

The provided template includes the class structure, instance variables, and method signatures with TODO comments guiding
you through the implementation. You'll need to complete each TODO while maintaining proper encapsulation and handling
edge cases appropriately.

```java
package academy.javapro;

/**
 * Array-based implementation of the CustomStack interface.
 * @param <T> the type of elements in the stack
 */
public class ArrayStack<T extends Number> implements CustomStack<T> {
    // Constants for stack configuration
    private static final int DEFAULT_CAPACITY = 10;
    private static final double GROWTH_FACTOR = 1.5;

    // Static variables for tracking across all instances
    private static int totalStacks = 0;
    private static int totalElements = 0;

    // Instance variables
    private Object[] elements;  // Using Object[] since generic arrays aren't directly supported
    private int top;  // Index of the top element
    private int operationCount;  // Tracks operations on this stack
    private final int stackId;  // Unique identifier for this stack instance


    /**
     * Creates a new ArrayStack with default capacity.
     */
    public ArrayStack() {
        // TODO: Initialize the elements array with the DEFAULT_CAPACITY

        // TODO: Set top to -1 (indicating an empty stack)

        // TODO: Initialize operationCount to 0

        // TODO: Assign a unique stackId by incrementing totalStacks
    }

    /**
     * Adds an element to the top of the stack.
     * @param element the element to add
     */
    @Override
    public void push(T element) {
        // TODO: Increment operationCount

        // TODO: Check if the array is full (top == elements.length - 1)

        // TODO: Add the element to the top of the stack

        // TODO: Increment totalElements
    }

    /**
     * Removes and returns the top element from the stack.
     * @return the top element, or null if the stack is empty
     */
    @SuppressWarnings("unchecked")
    @Override
    public T pop() {
        // TODO: Increment operationCount

        // TODO: Check if the stack is empty (isEmpty())

        // TODO: Retrieve the top element

        // TODO: Clear the reference in the array to help garbage collection

        // TODO: Decrement totalElements

        // TODO: Return the popped element
        return null; // Placeholder return, replace with actual implementation
    }

    /**
     * Returns but does not remove the top element from the stack.
     * @return the top element, or null if the stack is empty
     */
    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        // TODO: Increment operationCount

        // TODO: Check if the stack is empty (isEmpty())

        // TODO: Return the top element without removing it
        return null; // Placeholder return, replace with actual implementation
    }

    /**
     * Checks if the stack is empty.
     * @return true if the stack is empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        // TODO: Increment operationCount

        // TODO: Return true if the stack is empty (top == -1)
        return false; // Placeholder return, replace with actual implementation
    }

    /**
     * Returns the number of elements in the stack.
     * @return the number of elements
     */
    @Override
    public int size() {
        // TODO: Increment operationCount

        // TODO: Return the number of elements in the stack (top + 1)
        return 0; // Placeholder return, replace with actual implementation
    }

    /**
     * Resizes the array when it becomes full.
     */
    private void resize() {
        // TODO: Calculate the new capacity using GROWTH_FACTOR

        // TODO: Create a new array with the new capacity

        // TODO: Copy elements from the old array to the new array

        // TODO: Update the elements reference to point to the new array
    }

    /**
     * Adds the top two elements and pushes the result back onto the stack.
     * Works only for numeric types.
     */
    public void addTopTwo() {
        // TODO: Check if the stack has at least two elements (size() < 2)

        // TODO: Pop the top two elements

        // TODO: Add the two numbers and determine the appropriate type for the result

        // TODO: If the original elements were Integers, push the result as Integer

        // TODO: Otherwise, treat the result as a Double
    }

    /**
     * Gets statistics for this stack instance.
     */
    public String getStats() {
        return "Stack #" + stackId + ": Size=" + size() + ", Operations=" + operationCount;
    }

    /**
     * Gets statistics across all ArrayStack instances.
     */
    public static String getGlobalStats() {
        return "Total stacks: " + totalStacks + ", Total elements: " + totalElements;
    }
}
```

```java
package academy.javapro;

public class StackAdditionLab {
    public static void main(String[] args) {
        // Test case 1: Basic operations and addition
        System.out.println("=== Test Case 1: Basic Addition ===");
        // TODO: Create an instance of ArrayStack named stack

        // TODO: Verify the stack is empty using the isEmpty method

        // TODO: Push two elements to the stack: 10 and 20

        // TODO: Verify size of the stack using the size method

        // TODO: Print the stack statistics using the getStats method

        // TODO: Print the global statistics using the getGlobalStats method

        // TODO: Add the top two elements using the addTopTwo method

        // TODO: Get the result of the addition using the pop method by assigning it to a variable named result

        // TODO: Print the result of the addition

        // Test case 2: Resizing
        System.out.println("\n=== Test Case 2: Array Resizing ===");

        // TODO: Create an instance of ArrayStack named resizeStack

        // TODO: Push 15 elements to trigger resize (default capacity is 10) using a loop
        System.out.println("Pushing 15 elements to trigger resize...");

        // TODO: Print the stack size after pushing 15 elements

        // TODO: Print the stack statistics using the getStats method

        // Test case 3: Multiple instances
        System.out.println("\n=== Test Case 3: Multiple Stack Instances ===");

        // TODO: Create an instance of ArrayStack named floatStack with Double type

        // TODO: Push three elements to the floatStack: 1.5, 2.5, and 3.5

        // TODO: Print the first stack statistics using the getStats method

        // TODO: Print the statistics for resizeStack and floatStack

        // TODO: Print the global statistics using the getGlobalStats method
    }
}
```

### Testing Your Implementation

To test your implementation, you can run the `StackAdditionLab` class. This class should generate output similar to the
following:

```
=== Test Case 1: Basic Addition ===
Is stack empty? true
Size after pushing two elements: 2
Stack #1: Size=2, Operations=5
Total stacks: 1, Total elements: 2
Sum: 30

=== Test Case 2: Array Resizing ===
Pushing 15 elements to trigger resize...
Stack size after pushing 15 elements: 15
Stack #2: Size=15, Operations=17

=== Test Case 3: Multiple Stack Instances ===
First stack stats: Stack #1: Size=0, Operations=14
Second stack stats: Stack #2: Size=15, Operations=18
Third stack stats: Stack #3: Size=3, Operations=4
Global stats: Total stacks: 3, Total elements: 18
```

### Resources

- [Java Generics](https://www.digitalocean.com/community/tutorials/java-generics-example-method-class-interface)
- [Java Naming Conventions](https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html)
- [What is a Data Structure?](https://www.cs.usfca.edu/~srollins/courses/cs112-f07/web/notes/stacks.html)