package 属性注入;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 属性注入的方式：（三）基于注解
 */
@Component
public class Cat03 {

    @Autowired
    private Cat01 cat01;
    @Autowired
    private Cat02 cat02;

    @Override
    public String toString() {
        return "Cat03{" + "cat01=" + cat01 + ", cat02=" + cat02 + '}';
    }
}
