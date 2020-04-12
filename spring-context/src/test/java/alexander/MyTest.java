package alexander;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

/**
 * @author Alex
 * @version 1.0.0
 * @date 2020/4/7
 */
public class MyTest {
	public void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanXX.xml");
		context.getBean("xxx");
	}
}
