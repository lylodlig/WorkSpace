package spring.springrunorder;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class One implements ApplicationContextAware  {
	public One(String one) {
		System.out.println(one);
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
			System.out.println("setApplicationContext");
	}

	
}
