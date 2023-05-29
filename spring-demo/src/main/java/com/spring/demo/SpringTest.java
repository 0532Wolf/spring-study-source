package com.spring.demo;

import com.spring.demo.entity.User;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

public class SpringTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(DemoConfig.class);
		User bean = configApplicationContext.getBean(User.class);
		bean.sayHello();
		ClassPathResource res = new ClassPathResource("beans.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader  reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(res);
	}
	@Configuration
	static class DemoConfig{
		@Bean
		public User user(){
			User user = new User();
			user.setName("Tom");
			return user;
		}
	}

}
