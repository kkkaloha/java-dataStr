package dataStruct.danlianbiao;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(hero1);
        singleLinkedList.add(hero2);
        singleLinkedList.add(hero3);
        singleLinkedList.add(hero4);

        singleLinkedList.list();
    }

}

//定义一个单链表
class SingleLinkedList {
    //头节点，不保存任何数据
    private HeroNode head = new HeroNode(0, "", "");

    //不考虑插入顺序，插入末尾
    public void add(HeroNode node) {
        HeroNode tmp = head;
//      找到当前链表的最后节点
        while (true) {
            if (tmp.next == null) {
                break;
            }
            tmp = tmp.next;
        }
        tmp.next = node;
    }


//    打印链表元素
    public void list(){
        if (head.next == null) {
            System.out.println("this is an empty SingleLinkedList");
            return;
        }
        HeroNode tmp = head.next;
        while (true) {
            if (tmp.next == null) {
                System.out.println(tmp);
                return;
            }
            System.out.println(tmp);
            tmp = tmp.next;
        }
    }

}

class HeroNode {
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;

    //一个构造方法
    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname+"}"
                ;
    }
}