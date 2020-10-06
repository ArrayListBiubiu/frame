package 注解04_Import;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;


/**
 * 自定义逻辑需要导入的组件，必须实现 ImportSelector 接口
 */
public class MyImportSelector implements ImportSelector {

    // 参数： AnnotationMetadata 表示，标注了 @Import 的类（即，MyConfig类）所有的注解信息
    // 返回值： 需要导入组件的全类名
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"注解04_Import.Pig03", "注解04_Import.Pig04"};
    }
}
