package princeton.w2_stack;

public interface StackOfStrings {
    //insert a new string onto stack
    void push(String item);

    //remove and return the string most recently added
    String pop();

    //is the stack empty?
    boolean isEmpty();

    //number of strings on the stack
    int size();
}
