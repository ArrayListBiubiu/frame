package 娉ㄨВ02_ComponentScan.b;


import org.springframework.stereotype.Controller;

/**
 * 鏈嶅姟浜庡埄鐢ˊComponentScan鏂瑰紡瀹炵幇鍖呮壂鎻�
 */
@Controller
public class Person02 {

    private String name;
    private int age;

    public Person02() {
    }

    @Override
    public String toString() {
        return "Person02{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
