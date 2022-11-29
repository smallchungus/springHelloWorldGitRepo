package springHelloWorld;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class test {
	public static void main(String[] args) {
	
	Resource resource = new ClassPathResource("applicationContext.xml");
	BeanFactory factory =new XmlBeanFactory(resource);
	
	
	orders Order = (orders)factory.getBean("studentbean");
	Order.displayInfo();
	}
	
}
