package pl.jaceksysiak.database.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App implements CommandLineRunner {

	public static void main(String[] args) {
		
		//1. sposób
		SpringApplication.run(App.class, args);
		
		//2. sposób
//		ApplicationContext applicationContext = SpringApplication.run(App.class, args);
//		
//		for (String name : applicationContext.getBeanDefinitionNames()) {
//			System.out.println("applicationContext: " + name);
//		}
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
