package ѭ������;

public class B {
    private A a;

    public B() {
        System.out.println("��class B���޲ι��졿");
    }

    public A getA() {
        System.out.println("��class B��getA��");
        return a;
    }

    public void setA(A a) {
        System.out.println("��class B��setA��");
        this.a = a;
    }
}
