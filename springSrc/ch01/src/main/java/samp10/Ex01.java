package samp10;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Ex01 {
	public static void main(String[] args) {
		ApplicationContext ac = 
			new ClassPathXmlApplicationContext("/samp10/bean10.xml");
		Vechicle vh = (Vechicle)ac.getBean("vh");
		vh.ride();
	}
}