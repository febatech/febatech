/**
 * 
 */
package com.feba.spring.batch.examples.SpringBatchItemDemo;

import org.springframework.batch.core.ItemReadListener;

import com.feba.spring.batch.examples.SpringBatchItemDemo.model.Report;


/**
 * @author chall
 *
 */
public class SimpleItemReaderListener implements ItemReadListener<Report> {

	/**
	 * 
	 */
	public SimpleItemReaderListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void beforeRead() {
		System.out.println("trying to read the report before implementing");
		
	}

	@Override
	public void afterRead(Report item) {
		System.out.println("trying to read the report after implementing");
		
	}

	@Override
	public void onReadError(Exception ex) {
		System.out.println("trying to read the report on implementing");
		
	}

}
