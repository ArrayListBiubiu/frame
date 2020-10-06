package ע��04_Import;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * ͨ�� @Import ʵ�� Bean ��ע�룬���ַ���Ҳ�ǻ���ӷ���һЩ�������� springboot �б��㷺Ӧ��
 *      ��1������ֱ�Ӵ��� Class��
 *      ��2��Ҳ����ͨ��ѡ�������Զ���Ĵ��� Class��
 */
@Import({Pig.class, Pig02.class, MyImportSelector.class})
@Configuration
public class MyConfig {

}
