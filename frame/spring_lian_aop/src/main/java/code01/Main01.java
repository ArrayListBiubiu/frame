package code01;


/**
 * jdk动态代理（不是spring源码）
 */
public class Main01 {
    public static void main(String[] args) {
        // 将动态代理时生成的 “.class” 文件保存到本地磁盘
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        Calculator proxy = CalculatorProxy.getProxy(new MyCalculator());

        int add = proxy.add(1, 2);

        System.out.println(proxy.getClass());
    }
}
