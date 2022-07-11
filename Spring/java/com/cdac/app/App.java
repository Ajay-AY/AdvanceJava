package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.CarPart;
import com.cdac.component.CarPartsInventory;

public class App {

	public static void main(String[] args) {
		//Loading Spring/IOC Container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		
//		CarPartsInventory inv = (CarPartsInventory) ctx.getBean("carParts1");
//		
//		//model/entity classes are not instantiated using Spring
//		CarPart cp = new CarPart();
//		cp.setPartName("Steering");
//		cp.setCarModel("Duster");
//		cp.setPrice(700);
//		cp.setQuantity(52);
//		
//		long ms1 = System.currentTimeMillis();
//		inv.addNewPart(cp);
//		long ms2 = System.currentTimeMillis();
//		System.out.println("Total time taken : " + (ms2 - ms1) + " ms approx");
		
		
		CarPartsInventory inv = (CarPartsInventory) ctx.getBean("carParts2");
		
		CarPart cp = new CarPart();
		cp.setPartName("Nut& Bolt");
		cp.setCarModel("Suzuki");
		cp.setPrice(745);
		cp.setQuantity(100);
		
		long ms1 = System.currentTimeMillis();
		inv.addNewPart(cp);
		long ms2 = System.currentTimeMillis();
		System.out.println("Total time taken : " + (ms2 - ms1) + " ms approx");
	}

}
