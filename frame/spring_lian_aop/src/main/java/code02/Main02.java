package code02;


import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;


/**
 * cglib动态代理（不是spring源码）
 */
public class Main02 {
    public static void main(String[] args) {
        // 将动态代理时生成的 “.class” 文件保存到本地磁盘
        System.getProperties().put(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "C:/Users/ArrayList_biubiu/Desktop");
        // 创建 “增强器”
        Enhancer enhancer = new Enhancer();
        // 设置 “需要代理哪个类”
        enhancer.setSuperclass(MyCalculator.class);
        // 设置 “回调对象”
        enhancer.setCallback(new MyCglib());
        // 创建代理对象
        MyCalculator myCalculator = (MyCalculator) enhancer.create();
        // 通过代理对象调用目标方法
        myCalculator.add(2, 4);

        System.out.println(myCalculator.getClass());
    }
}
