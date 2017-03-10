/**
 * Created by Nick on 3/9/17.
 */
public class Stack {
    private Node last = null;
    private int count = 0;

    private class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Stack() {};

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
}
