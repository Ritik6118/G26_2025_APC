package G26.Spring_AOP_G26;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class my_Aspect {

	@Before("execution(* G26.Spring_AOP_G26.Service.fun1())")
	public void beforemethod() {
		System.out.println("runninng from aspect beforemethod");
	}
}
