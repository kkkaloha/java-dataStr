/*
package dataStructure.danlianbiao;

public class OrderSingleLinkedList {
    private Node head = new Node(0,"","");
    public static void main(String[] args) {
        OrderSingleLinkedList l = new OrderSingleLinkedList();
        l.addByOrder(new Node(2, "yupei", "kkk"));
        l.addByOrder(new Node(2, "liqiuchan", "uzi"));
        l.list();
    }

    public void addByOrder(Node node) {
        Node tmp = head;
        if (head.next == null) {
            head.next = node;
            return;
        }
        while (true) {
            if (tmp.next.no == node.no) {
                System.out.println("has exited "+node.no);
                break;
            }
            if (tmp.next.no < node.no) {
                tmp = tmp.next;
                continue;
            }
            node.next = tmp.next;
            tmp.next = node;
        }


        return;
        }

    public void list() {
        if (head.next == null) {
            System.out.println("null");
            return;
        }
        Node tmp = head.next;
        while (tmp.next != null) {
            System.out.println(tmp);
            tmp = tmp.next;
        }
        System.out.println(tmp);

    };

}

class Node {
    int no;
    String name;
    String nickName;
    Node next;

    public Node() {
    }

    public Node(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
*/
