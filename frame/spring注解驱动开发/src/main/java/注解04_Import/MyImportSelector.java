package ע��04_Import;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;


/**
 * �Զ����߼���Ҫ��������������ʵ�� ImportSelector �ӿ�
 */
public class MyImportSelector implements ImportSelector {

    // ������ AnnotationMetadata ��ʾ����ע�� @Import ���ࣨ����MyConfig�ࣩ���е�ע����Ϣ
    // ����ֵ�� ��Ҫ���������ȫ����
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"ע��04_Import.Pig03", "ע��04_Import.Pig04"};
    }
}
