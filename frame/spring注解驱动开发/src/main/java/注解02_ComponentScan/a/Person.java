package 娉ㄨВ02_ComponentScan.a;


import org.springframework.stereotype.Controller;

/**
 * 鏈嶅姟浜庡埄鐢▁ml浼犵粺鏂瑰紡瀹炵幇鍖呮壂鎻�
 */
@Controller
public class Person {

    private String name;
    private int age;

    public Person() {

    }

    // ???
    // @Controller 涓�瀹氳鏈夋棤鍙傛瀯閫狅紝鍘熷洜鏆傛椂涓嶆槑纭�
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person01{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
