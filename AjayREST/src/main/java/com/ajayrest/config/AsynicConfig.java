package com.ajayrest.config;

import java.util.concurrent.Executor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.ajayrest.service.ProductService;

@Configuration
@EnableAsync
public class AsynicConfig {
	
	@Autowired
	private ProductService productser;
		
	
	@Bean(name = "taskExecotor")
	public Executor taskExecutor() {
		
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		
		executor.setCorePoolSize(2);
		executor.setMaxPoolSize(2);
		executor.setQueueCapacity(100);
		executor.setThreadNamePrefix("userThread-");
		executor.initialize();
		
		return executor;
		
		
		
	}
	
	@Async
	public void someAsyncMethod() throws Exception
	{
		try {
			
			productser.startbuy();
			System.out.println("thread started");
			 Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	@Async
	public void endAsyncMethod(int theId) throws Exception
	{
		try
		{
			productser.endbyId(theId);	
			System.out.println("thread end");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();

		}
	}
	
	

}
