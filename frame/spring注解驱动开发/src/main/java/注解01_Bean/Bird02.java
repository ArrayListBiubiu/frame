package ע��01_Bean;


/**
 * ���������� @Bean ��ȡ����ʽ�ĵ�ʵ����
 */
public class Bird02 {

    private String name;
    private int age;

    public Bird02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bird02{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
