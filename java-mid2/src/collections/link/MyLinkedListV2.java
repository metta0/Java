package collections.link;

public class MyLinkedListV2 {

    private Node first;
    private int size = 0;


    public void add(Object o) {
        Node newNode = new Node(o);
        if(first == null){
            first = newNode;
        }
        else{
            getLastNode().next = newNode;
        }
        size++;
    }

    public void add(int index, Object o) {
        Node newNode = new Node(o);
        Node prev;
        if (index == 0){
            newNode.next = first;
            first = newNode;
        }
        else{
            Node prevNode = getNode(index-1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        size++;
    }

    public Object set(int index, Object o) {
        Object oldValue = get(index);
        getNode(index).item = o;
        return oldValue;
    }
    public Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }
    public Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public Object get(int index) {
        return getNode(index).item;
    }

    public Object remove(int index) {
        Node removeNode = getNode(index);
        Object removedItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;
        } else {
            Node prevNode = getNode(index - 1);
            prevNode.next = removeNode.next;
        }

        removeNode.next = null;
        removeNode.item = null;
        size--;
        return removedItem;
    }

    public int size() {
        return size;
    }

    public int indexOf(Object o) {
        Node x = first;
        for (int i = 0; i < size; i++) {
            if (x.item.equals(o)) {
                return i;
            }
            x = x.next;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    static class Node{
        Object item;
        Node next;

        public Node(Object item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node x = this;
            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                if(x.next != null)
                    sb.append("->");
                x = x.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
