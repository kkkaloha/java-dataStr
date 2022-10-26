package dataStruct.danlianbiao;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class SingleLinkDemo {
    //头节点
    private Node heed = new Node(0, "");

    public static void main(String[] args) {
        SingleLinkDemo l = new SingleLinkDemo();
        Node p1 = new Node(1, "jisoo");
        Node p2 = new Node(2, "jennie");
        Node p3 = new Node(3, "rose");
        Node p4 = new Node(4, "lisa");

//        l.add(p1);
//        l.add(p2);
//        l.add(p3);
//        l.add(p4);

        l.addByOrder(p1);
        l.addByOrder(p2);
        l.addByOrder(p4);
        l.addByOrder(p3);

        l.list();


    }

    //无序添加
    public void add(Node node) {
        //注意，java对象引用
        Node tmp = heed;
        if (heed.next == null) {
            heed.next = node;
            return;
        }
        while (true) {
            if (tmp.next == null) {
                break;
            }
            tmp = tmp.next;
        }
        tmp.next = node;
    }

    //有序添加
    public void addByOrder(Node node) {
        Node tmp = heed;
        if (heed.next == null) {
            tmp.next = node;
            return;
        }
        while (true) {
            if (tmp.next == null) {
                tmp.next = node;
                break;
            }
            if (tmp.next.no > node.no) {
                node.next = tmp.next;
                tmp.next = node;
                break;
            }
            if (tmp.next.no == node.no) {
                System.out.println("have exit the same no");
                break;
            }
            tmp = tmp.next;


        }
        return;

    }

    //打印
    public void list() {
        Node tmp = heed.next;
        if (heed.next == null) {
            System.out.println("this is an tmpty link");
            return;
        }
        while (true) {
            if (tmp== null) {
                break;
            }
            System.out.println(tmp);
            tmp = tmp.next;
        }
    }
}
class Node{
    int no;
    String name;
    Node next;

    public Node() {
    }

    public Node(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}

