package Interface2inject;

import org.springframework.stereotype.Component;

@Component
public class Employee1 implements Company{

	public void project() {
        System.out.println("Employee1 is here");		
	}

}
