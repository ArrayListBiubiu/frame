package 属性注入;


/**
 * 属性注入的方式：（1）set方法
 */
public class Cat01 {

    private String name;
    private Integer age;

    // 必须存在set方法，可以没有get方法
    public void setName(String name) {
        this.name = name;
        System.out.println("Cat01的setName方法启动。。。");
    }

    public void setAge(Integer age) {
        this.age = age;
        System.out.println("Cat01的setAge方法启动。。。");
    }

    @Override
    public String toString() {
        return "Cat01{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
