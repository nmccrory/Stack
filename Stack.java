/**
 * Created by Nick on 3/9/17.
 */
public class Stack {
    private Node last = null;
    private int count = 0;

    private class Node {
        public int data;
        public Node next = null;

        public Node(int data) {
            this.data = data;
        }
    }

    public Stack() {}

    public Stack(int data) {
        push(data);
    }

    public int getCount() {
        return this.count;
    }

    public void push(int data) {
        Node n = new Node(data);
        if (this.last != null) {
            n.next = this.last;
        }
        this.last = n;
        this.count++;
    }

    public int pop() {
        if (this.last == null) {
            return -1;
        }
        int data = this.last.data;
        if (this.last.next != null) {
            this.last = this.last.next;
        }
        this.count--;
        return data;
    }

    public int peek() {
        if (this.last == null) {
            return -1;
        }
        return this.last.data;
    }
}
