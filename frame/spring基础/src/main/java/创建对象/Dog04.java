package ��������;

import org.springframework.stereotype.Component;

/**
 * spring��������ķ�ʽ�����ģ�����ע��
 *                 1.���û����ʾ��ָ��bean-id��Ĭ��ʹ������������ĸСд  =>  getBean("dog04")��
 *                 2.Ҳ����ͨ��ע��ָ��bean-id��Component("dog0444")  =>  getBean("dog0444")��
 *                 ***���ﻹ���ٴ�ǿ��˵���˵�һ�仰��
 *                 ��ɨ��spring�������ļ���ʱ���Ѿ�����������˲��洢�ڻ���map�У�getBean()����ֻ�Ǵ������аѶ����ó������ѡ�
 *
 */
@Component
public class Dog04 {

    public Dog04() {
        System.out.println("Dog04�޲������췽������������");
    }

}
