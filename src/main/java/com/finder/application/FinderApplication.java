package com.finder.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Configure an starts the application
 * 
 * @version 0.1
 * @author holmer.gaitan
 */
@ComponentScan("com.finder.service")
@SpringBootApplication
public class FinderApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
        SpringApplication.run(FinderApplication.class, args);
    }
}


