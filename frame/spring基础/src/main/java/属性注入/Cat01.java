package ����ע��;


/**
 * ����ע��ķ�ʽ����1��set����
 */
public class Cat01 {

    private String name;
    private Integer age;

    // �������set����������û��get����
    public void setName(String name) {
        this.name = name;
        System.out.println("Cat01��setName��������������");
    }

    public void setAge(Integer age) {
        this.age = age;
        System.out.println("Cat01��setAge��������������");
    }

    @Override
    public String toString() {
        return "Cat01{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
