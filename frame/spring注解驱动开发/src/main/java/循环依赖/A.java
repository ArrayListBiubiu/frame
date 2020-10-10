package 循环依赖;

import org.springframework.beans.factory.annotation.Autowired;

public class A {
    @Autowired
    private B b;

    public A() {
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
