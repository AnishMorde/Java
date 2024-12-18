
class File {

    private Node head;
    private Node tail;
    private int size;

    public File() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
           insertFirst(val);
           return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }

        System.out.println("END");

    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

 }

class Main {
    public static void main(String[] args) {
        File list = new File();
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(7);
        list.insertFirst(5);
        list.insertFirst(9);
        list.insertLast(1000);

        list.display();
    }
}
