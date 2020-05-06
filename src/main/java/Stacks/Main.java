package Stacks;

public class Main {
    public static void main(String[] args) {
ArrayStack arrayStack= new ArrayStack(10);
arrayStack.push(new Employee("bharat","hm",32));
arrayStack.push(new Employee("bharat1","hm1",34));
arrayStack.push(new Employee("bharat2","hm2",33));
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.pop());
        arrayStack.printStack();
    }
}
