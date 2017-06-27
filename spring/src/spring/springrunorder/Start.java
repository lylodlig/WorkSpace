package spring.springrunorder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
    		//加载spring
			new ClassPathXmlApplicationContext("spring.xml");
    }
}
