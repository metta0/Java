package collections.link;

public class NodeMain1 {
    public static void main(String[] args) {
        Node first = new Node("A");
        Node second = new Node("B");
        Node third = new Node("C");

        first.next = second;
        second.next = third;

        System.out.println("모든 노드 탐색하기");
        Node x = first;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

}
