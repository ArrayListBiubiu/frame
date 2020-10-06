package ע��06_PostConstructPreDestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Ҳ����ͨ��ע��@PostConstruct��@PreDestroyʵ���������ڵĹ���
 *     ��1��@PostConstruct���ڹ��췽������֮�󣬶�bean���г�ʼ����
 *     ��2��@PreDestroy����bean������֮ǰִ�С�
 *
 * ������һ�㣺
 *      ��1�����췽����ִ�У���2��Ȼ��@Autowire����3��Ȼ��@PostConstruct
 */
public class PostConstructPreDestroyMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = null;
        ac = new AnnotationConfigApplicationContext(MyConfig.class);
        ac.destroy();
    }

}
