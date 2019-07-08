package com.lxh.bean_injection_ioc.importSelector;

import com.lxh.bean_injection_ioc.bean.Bean04;
import com.lxh.bean_injection_ioc.bean.Bean05;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;


//自定义逻辑返回需要导入的组件
public class MyImportSelector implements ImportSelector {

	//返回值，就是到导入到容器中的组件全类名
	//AnnotationMetadata:当前标注@Import注解的类的所有注解信息
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// TODO Auto-generated method stub
		//importingClassMetadata
		//方法不要返回null值
		return new String[]{Bean05.class.getName()};
	}

}
