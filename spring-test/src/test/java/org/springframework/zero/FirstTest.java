package org.springframework.zero;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.zero.model.MyUser;

public class FirstTest {
	@Test
	public void firstTest(){
		System.out.println("xxx");
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("E:\\Spring\\spring-framework-5.1.x\\spring-test\\src\\test\\java\\org\\springframework\\zero\\config\\MyUser.xml"));
		MyUser myUser = (MyUser) bf.getBean("myUser");
		Object myUser1 = bf.getBean("myUser");
		System.out.println("xx");
	}
}
