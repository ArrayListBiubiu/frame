package ע��01_Bean;

/**
 * xml��ͳ��ʽ���������ʵ����
 */
public class Bird {

    private String name;
    private int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bird{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
