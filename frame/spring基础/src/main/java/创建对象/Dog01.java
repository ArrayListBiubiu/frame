package ��������;

/**
 * spring������������ַ�ʽ����һ�����췽�������޲ι��죩
 *                                       ���вι��죩
 */
public class Dog01 {

    private String name;
    private Integer age;

    // 1. ��֤�޲������췽�����Ի�ȡ����
    public Dog01() {
        System.out.println("Dog01���޲������췽������������");
    }

    // 2. ��֤�в������췽�����Ի�ȡ����
    public Dog01(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("Dog01���в������췽������������");
    }

    @Override
    public String toString() {
        return "Dog01{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
