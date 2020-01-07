package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerAppln {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("annotations/SpringAnnotation.xml");
		Customer c=ctx.getBean("cust",Customer.class);
		Customer c1=ctx.getBean("cust",Customer.class);
		System.out.println(c.getCode()+" "+c.getName());
		c1.setCode(345);
		c1.setName("Ryakala");
		System.out.println(c1.getCode()+" "+c1.getName());
}
}