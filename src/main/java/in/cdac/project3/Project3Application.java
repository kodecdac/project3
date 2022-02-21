package in.cdac.project3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Project3Application {
	
	@Autowired
	HelloController helloContorller;
	

	public static void main(String[] args) {
		SpringApplication.run(Project3Application.class, args);
	}
	
	
	@EventListener(ApplicationReadyEvent.class)
	public void hello() {
		System.out.println("Project SEtup....");
		 
		helloContorller.sayHello();
	}

}
