package collections.list;

public class MyLinkedList<E> implements MyList<E> {

    private Node<E> first;
    private int size = 0;

    @Override
    public void add(E o) {
        Node<E> newNode = new Node<>(o);
        if(first == null){
            first = newNode;
        }
        else{
            getLastNode().next = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, E o) {
        Node<E> newNode = new Node<>(o);

        Node<E> prev;
        if (index == 0){
            newNode.next = first;
            first = newNode;
        }
        else{
            Node<E> prevNode = getNode(index-1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }
        size++;
    }

    @Override
    public E set(int index, E o) {
        E oldValue = get(index);
        getNode(index).item = o;
        return oldValue;
    }
    public Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }
    public Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    @Override
    public E get(int index) {
        return (E)getNode(index).item;
    }

    @Override
    public E remove(int index) {
        Node removeNode = getNode(index);
        E removedItem = (E) removeNode.item;
        if (index == 0) {
            first = removeNode.next;
        } else {
            Node<E> prevNode = getNode(index - 1);
            prevNode.next = removeNode.next;
        }

        removeNode.next = null;
        removeNode.item = null;
        size--;
        return removedItem;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(E o) {
        Node<E> x = first;
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

    static class Node<E>{
        Object item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;
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
