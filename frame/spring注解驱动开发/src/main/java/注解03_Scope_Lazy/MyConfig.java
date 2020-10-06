package ע��03_Scope_Lazy;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Scope �����ã�
 *      ����������
 *      @Scope("Singleton") ��ʵ����Ҳ��Ĭ��ֵ������������������ʱ���ֱ�ӵ���ע�� Bean �ķ����������󣬷��� IOC �����еȴ����ã����� + ����ʽ
 *      @Scope("prototype") ��ʵ����������������ʱ�򲻻ᴴ�����󣬶����ڻ�ȡ���󣨼������� getBean ������ʱ���ȥ�������󣬵��ü��ξʹ����������󣬶��� + ����ʽ
 */
@Configuration
public class MyConfig {

//    @Lazy // ʹĬ�ϵĶ���ʽ�������ʽ
    @Scope("singleton") // Ĭ��ֵ���ǵ����ģ�����Ϊ��ѧϰ������ʹ�ã�д�����˺��±ߵ���Ϊ�Ա�
    @Bean
    public Bee getBee(){
        System.out.println("��MyConfig��  ������һ��Bee���󣬲��洢��spring�����еȴ����á�����");
        return new Bee();
    }

    @Scope("prototype") // ��ʵ��
    @Bean
    public Bee getBee2(){
        System.out.println("��MyConfig��  ������һ��Bee���󣬲��洢��spring�����еȴ����á�����");
        return new Bee();
    }

}
