package com.aman.sfgdi;

import com.aman.sfgdi.controllers.ConstructorInjectedController;
import com.aman.sfgdi.controllers.MyController;
import com.aman.sfgdi.controllers.PropertyInjectedController;
import com.aman.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx= SpringApplication.run(SfgDiApplication.class, args);

		MyController controller=(MyController) ctx.getBean("myController");
		System.out.println("___________PrimaryBeang");
		System.out.println(controller.sayHello());
		System.out.println("_______ Property");
		PropertyInjectedController propertyInjectedController=(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println("______________Setter");
		SetterInjectedController setterInjectedController=(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		System.out.println("________Constructor");
		ConstructorInjectedController constructorInjectedController=(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
