package bean;


/**
 * 实体类 Principal（校长）
 */
public class Principal {

    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Principal() {
    }

    public Principal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
