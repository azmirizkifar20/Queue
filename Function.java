public class Function<T> implements Interface<T> {
    private Node rear;
    private Node front;
    private int size;

    public Function() {
        this.rear = null;
        this.front = null;
        this.size = 0;
    }

    public class Node<T> {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    @Override
    public boolean isEmpty() {
        if (front == null & rear == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void enQueue(T element) {
        Node node = new Node(element);
        if (isEmpty()) {
            front = node;
            rear = node;
        } else {
            rear.setNext(node);
            rear = node;
        }
        System.out.println("Berhasil!");
        size++;
    }

    @Override
    public T deQueue() {
        Node temp = front;
        if (isEmpty()) {
            System.out.println("Tidak ada antrian!");
        } else {
            if (front == rear) {
                front = null;
                rear = null;
            } else {
                front = temp.getNext();
                temp.setNext(null);
            }
            System.out.println("Antrian " + ((ADT) temp.getData()).nama + " telah diproses");
            size--;
        }
        return null;
    }

    @Override
    public void first() {
        if (isEmpty()) {
            System.out.println("Tidak ada antrian!");
            System.out.println();
        } else {
            ((ADT) front.getData()).tampil();
        }
    }

    @Override
    public void tampilkan() {
        if (isEmpty()) {
            System.out.println("Tidak ada antrian!");
            System.out.println();
        } else {
            Node temp = front;
            System.out.println("Jumlah antrian : " + size);
            System.out.println();
            while (temp != null) {
                ((ADT) temp.getData()).tampil();
                temp = temp.getNext();
            }
        }
    }
}
