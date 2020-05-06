package Queues;

public class QueueLinkedList {
    Node front, rear;

    public QueueLinkedList() {
        this.front = null;
        this.rear = null;
    }

    void enqueue(int key) {
        Node temp = new Node(key);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }

    Node deque() {
        if (this.front == null) {
            return null;
        }
        Node temp = this.front;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;

        }
        return temp;
    }
    public static void printList(QueueLinkedList list){
        Node currentNode=list.front;
        System.out.println("Linked List elements are");
        while (currentNode !=null){
            System.out.println(currentNode.data + " ");
            currentNode=currentNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
QueueLinkedList q = new QueueLinkedList();
q.enqueue(1);
q.enqueue(2);
q.enqueue(3);
printList(q);
        System.out.println("dequed item is " + q.deque().getData());
        printList(q);
    }
}
