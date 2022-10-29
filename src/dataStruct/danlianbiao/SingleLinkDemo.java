package dataStruct.danlianbiao;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Stack;

public class SingleLinkDemo {
    //头节点
    private Node head = new Node(0, "");

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

        //System.out.println(l.length());
        //l.delete(new Node(3,"rose"));
        //l.update(new Node(3,"rose princess"));
        //System.out.println(l.length());

        l.list();
        //l.reverse();
        //l.list();

        l.reversePrint();

        //System.out.println(l.findLastIndexNode(3));;


    }

    //无序添加
    public void add(Node node) {
        //注意，java对象引用
        Node tmp = head;
        if (head.next == null) {
            head.next = node;
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
        Node tmp = head;
        if (head.next == null) {
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
                System.out.println("have exit the same no" + node.no);
                System.out.println("fail to add"+node);
                break;
            }
            tmp = tmp.next;


        }
        return;

    }

    //修改
    public void update(Node node) {
        Node tmp = head.next;
        if (head.next == null) {
            System.out.println("this is an empty link");
            return;
        }
        while (true) {
            if (tmp.no == node.no) {
                tmp.no = node.no;
                tmp.name = node.name;
                break;
            }
            if (tmp.next == null) {
                System.out.println("didn't find this no:"+node.no);
                break;
            }
            tmp = tmp.next;
        }
    }

    //删除
    public void delete(Node node) {
        if (head.next == null) {
            System.out.println("this is an empty linked");
            return;
        }
        Node tmp = head;
        while (true) {
            if (tmp.next == null) {
                if (tmp.no != node.no) {
                    System.out.println("this link doesn't the no");
                    break;
                }
                break;
            }
            if (tmp.next.no == node.no) {
                tmp.next = tmp.next.next;
                break;
            }
            tmp = tmp.next;

        }
    }

    //打印
    public void list() {
        Node tmp = head.next;
        if (head.next == null) {
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

    //输出有效节点
    public int length() {
        if (head.next == null) {
            return 0;
        }
        Node tmp = head.next;
        int cnt = 1;
        while (tmp.next != null) {
            cnt++;
            tmp = tmp.next;
        }
        return cnt;

    }

    //打印倒数第k个节点
    public Node findLastIndexNode(int index) {
        int size = length();
        if (size == 0) {
            System.out.println("empty");
            return null;
        }
        if (index <= 0 || index > size) {
            return null;
        }
        Node tmp = head.next;

        //自己写的：
/*        for (int i = 0; i < size; i++) {
            if (i + index == size) {
                return tmp;
            }
            tmp = tmp.next;
        }
        return tmp;*/

        //优化
        for (int i = 0; i < size - index; i++) {
            tmp = tmp.next;
        }
        return tmp;

    }

    //反转链表
    //思路：重新定义一个新的头，可从原来的
    public void reverse() {
        if (head.next == null) {
            System.out.println("empty");
            return;
        }
        Node reHead = new Node(0, "");
        Node tmp = head.next;
        Node next = null;

        while (true) {
            if (tmp == null) {
                break;
            }
            next = tmp.next;
            tmp.next = reHead.next;
            reHead.next = tmp;
            tmp = next;
        }
        head = reHead;



    }

    //利用栈反向输出链表
    public void reversePrint() {
        if (head.next == null) {
            System.out.println("empty");
            return;
        }
        Node tmp = head.next;
        Stack<Node> stack = new Stack<>();
        while (tmp != null) {
            stack.push(tmp);
            tmp = tmp.next;
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
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

