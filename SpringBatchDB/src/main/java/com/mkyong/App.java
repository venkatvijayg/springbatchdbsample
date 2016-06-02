package com.mkyong;

import java.util.List;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.model.Report;

public class App {
  public static void main(String[] args) {

	String[] springConfig  = 
		{	"spring/batch/config/database.xml", 
			"spring/batch/config/context.xml",
			"spring/batch/jobs/job-report.xml" 
		};
		
	ApplicationContext context = 
		new ClassPathXmlApplicationContext(springConfig);
		
	ValidateLoadData validate = new ValidateLoadData();
	List<Report> reportData = validate.validateData();
    if (reportData != null){
    	System.out.println("Record count: " + reportData.size());
    }
	
	JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
	Job job = (Job) context.getBean("reportJob");

	try {

		JobExecution execution = jobLauncher.run(job, new JobParameters());
		System.out.println("Exit Status : " + execution.getStatus());

	} catch (Exception e) {
		e.printStackTrace();
	}

	System.out.println("Done");

  }
}
