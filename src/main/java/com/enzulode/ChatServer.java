package com.enzulode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * This class is a main entry point of the entire application
 */
@SpringBootApplication
public class ChatServer
{
	/**
	 * Application logger
	 */
	public static final Logger LOGGER = LogManager.getLogger(ChatServer.class);

	/**
	 * The main entry point of the entire application
	 *
	 * @param args cli arguments
	 */
	public static void main(String[] args)
	{
		ConfigurableApplicationContext cac = SpringApplication.run(ChatServer.class, args);
		LOGGER.info("Application initialization...");
	}
}
