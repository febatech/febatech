/**
 * 
 */
package com.feba.spring.batch.examples.SpringBatchItemDemo;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

/**
 * @author chall
 *
 */
public class SimpleStepExcutionListener implements StepExecutionListener {

	/**
	 * 
	 */
	public SimpleStepExcutionListener() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.springframework.batch.core.StepExecutionListener#beforeStep(org.springframework.batch.core.StepExecution)
	 */
	@Override
	public void beforeStep(StepExecution stepExecution) {
		System.out.println("I am trying to start step Excution"+ stepExecution.getStepName());

	}

	/* (non-Javadoc)
	 * @see org.springframework.batch.core.StepExecutionListener#afterStep(org.springframework.batch.core.StepExecution)
	 */
	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		System.out.println("I am trying to End step Excution"+ stepExecution.getStepName());
		return null;
	}

}
