package ��������;

/**
 * spring������������ַ�ʽ����������̬����
 */
public class Dog03 {

    private String name;
    private Integer age;

    // ȷ����ǰ������ͨ���޲ι��췽�������Ķ���
    public Dog03(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("Dog03���в������췽������������");
    }

    public static Dog03 getDog03() {
        return new Dog03("Dog03", 4);
    }


}
