package 循环依赖;

public class A {

    private B b;

    public A() {
        System.out.println("【class A：无参构造】");
    }

    public void setB(B b) {
        System.out.println("【class A：setB】");
        this.b = b;
    }

    public B getB() {
        System.out.println("【class A：getB】");
        return b;
    }
}
