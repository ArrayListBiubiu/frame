package ѭ������;

public class A {

    private B b;

    public A() {
        System.out.println("��class A���޲ι��졿");
    }

    public void setB(B b) {
        System.out.println("��class A��setB��");
        this.b = b;
    }

    public B getB() {
        System.out.println("��class A��getB��");
        return b;
    }
}
