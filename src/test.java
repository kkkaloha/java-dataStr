public class test {
    public static void main(String[] args) {
        A a = new A();
        A b;
        b = a;
        b.modif();
        System.out.println(a.a);
        System.out.println(b.a);
    }
}

class A {
    int a = 0;
    public void modif(){
        this.a = 1;
    }


}
