package com.shubham;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		String[] springConfig = { "batch-job-hello-world.xml" };

		// Creating the application context object 
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

		// Creating the job launcher 
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		
		 // Creating the job
		Job job = (Job) context.getBean("helloWorldBatchJob");

		try {
			// Executing the JOB 
			JobExecution execution = jobLauncher.run(job, new JobParameters());
			System.out.println("Batch Job status--" + execution.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Batch complete");

	}
}