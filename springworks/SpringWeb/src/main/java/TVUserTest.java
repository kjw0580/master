import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.consinject.TV;

public class TVUserTest {

	public static void main(String[] args) {
		//1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		//2. Spring 컨테이너로 부터 필요한 객체를 구성
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		
		//spring 종료
		factory.close();
	}

}
