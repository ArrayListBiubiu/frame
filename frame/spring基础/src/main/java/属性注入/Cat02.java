package ����ע��;


/**
 * ����ע��ķ�ʽ�����������췽��
 */
public class Cat02 {

    private String name;
    private Integer age;

    public Cat02(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("Cat02���вι��췽������������");
    }

    @Override
    public String toString() {
        return "Cat01{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
