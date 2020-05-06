package Stacks;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] empStack;
    private int top;

    public ArrayStack(int capacity) {
        this.empStack = new Employee[capacity];
    }

    public void push(Employee employee) {
        if (top == empStack.length) {
            Employee[] newempStack = new Employee[2 * empStack.length];
            System.arraycopy(empStack, 0, newempStack, 0, empStack.length);
            empStack = newempStack;
        }
        empStack[top++] = employee;
    }

    public Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Employee employee = empStack[--top];
        empStack[top] = null;
        return employee;
    }
    public Employee peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return empStack[top-1];
    }
    public int size(){
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack(){
        for(int i=top-1;i>=0;i--){
            System.out.println(empStack[i]);
        }
    }
}
