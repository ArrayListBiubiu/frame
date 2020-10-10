package 创建对象;

/**
 * spring创建对象的四种方式：（三）静态工厂
 */
public class Dog03 {

    private String name;
    private Integer age;

    // 确保当前对象不是通过无参构造方法创建的对象
    public Dog03(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("Dog03的有参数构造方法启动。。。");
    }

    public static Dog03 getDog03() {
        return new Dog03("Dog03", 4);
    }


}
