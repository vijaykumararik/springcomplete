package Interface2inject;

import org.springframework.stereotype.Component;

@Component
public class Employee2 implements Company {

	public void project() {
       System.out.println("project of employee2");		
	}

}
