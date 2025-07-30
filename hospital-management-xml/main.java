package com.example.hospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        HospitalService service = (HospitalService) context.getBean("hospitalService");
        service.manageHospital();

	}

}
