package 循环依赖;

import org.springframework.beans.factory.annotation.Autowired;

public class B {
    @Autowired
    private A a;

    public B() {
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}
