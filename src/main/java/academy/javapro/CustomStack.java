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