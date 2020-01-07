package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeScope {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans/SpringCore.xml");
	 Employee e=ctx.getBean("emp",Employee.class);
	 Employee e1=ctx.getBean("emp",Employee.class );
	 e1.setEmpno(1243);
	 e1.setEname("Pranavi");
	 
	 System.out.println(e.getEmpno()+" "+e.getEname()+" "+e.getSkills());
	 System.out.println(e1.getEmpno()+" "+e1.getEname()+" "+e1.getSkills());
	 

			
}
}
