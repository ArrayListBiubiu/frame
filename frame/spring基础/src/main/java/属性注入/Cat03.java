package ����ע��;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ����ע��ķ�ʽ������������ע��
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
