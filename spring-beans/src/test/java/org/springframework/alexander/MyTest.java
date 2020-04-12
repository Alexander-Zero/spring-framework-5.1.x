package org.springframework.alexander;

import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.springframework.alexander.model.MyBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import javax.annotation.security.RunAs;

/**
 * @author Alex
 * @version 1.0.0
 * @date 2020/3/31
 */
public class MyTest {
	@Test
	public void loadBeanTest() {
		String path = "config/MyBean.xml";
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource(path));
//		ApplicationContext context  = new classpathxm
		MyBean bean = (MyBean) bf.getBean("myBean");
		String beanAge = bean.getBeanAge();
		String beanMember = bean.getBeanMember();
	}
}
