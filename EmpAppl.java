package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpAppl {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans/SpringCoreEmp.xml");
	Employee e=(Employee)ctx.getBean("emp");
	e.setEmpno(123);
	e.setEname("pranavi");
	System.out.println(e.getEmpno()+" "+e.getEname());
}
}
