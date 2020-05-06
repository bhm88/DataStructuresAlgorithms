package Queues;

public class QueueArrays {
    private static final int MAZSIZE = 5;
    private Object[] data;
    private int rear;

    public QueueArrays() {
        this.data = new Object[MAZSIZE];
    }

    public boolean isEmpty() {
        return rear == 0;
    }

    public void enque(Object element) throws Exception {
        if (rear == MAZSIZE - 1) {
            System.out.println("queue is full,deque some objects");
        }
        this.data[rear] = element;
        this.rear++;


    }
    public Object deque(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        Object obj=this.data[0];
        for(int i=0;i<this.rear-1;i++){
            data[i]=data[i+1];
        }
        this.rear--;
        return obj;
    }

    public void printElements(){
        System.out.println("elements in array are");
        for(int i=0;i<data.length-1;i++){
            System.out.println(data[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
QueueArrays q = new QueueArrays();
q.enque(1);
q.enque(2);
q.enque(3);
q.enque(4);
q.printElements();
        System.out.println(q.deque());
    }
}
