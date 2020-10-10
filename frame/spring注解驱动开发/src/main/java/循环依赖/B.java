package 循环依赖;

public class B {
    private A a;

    public B() {
        System.out.println("【class B：无参构造】");
    }

    public A getA() {
        System.out.println("【class B：getA】");
        return a;
    }

    public void setA(A a) {
        System.out.println("【class B：setA】");
        this.a = a;
    }
}
