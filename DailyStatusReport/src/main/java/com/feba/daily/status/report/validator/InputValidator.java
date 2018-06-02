package com.feba.daily.status.report.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.feba.daily.status.report.bean.DailyStatusReportBean;


@Component
public class InputValidator implements Validator 
{

	@Autowired
	@Qualifier("emailValidator")
	EmailValidator emailValidator;
	
	@Override
	public boolean supports(Class<?> clazz) 
	{
		return DailyStatusReportBean.class.equals(clazz);
	}

	@Override
	public void validate(Object arg0, Errors errors) 
	{
		DailyStatusReportBean dailyStatusReportBean = (DailyStatusReportBean) arg0;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "reportDate", "NotEmpty.userForm.reportDate");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "projectRelease", "NotEmpty.userForm.projectRelease");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "loB", "NotEmpty.userForm.loB");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "appName", "NotEmpty.userForm.appName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sdpId", "NotEmpty.userForm.sdpId");
//		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "overAllPtCompletionStatus", "NotEmpty.userForm.overAllPtCompletionStatus");
		if("NONE".equals(dailyStatusReportBean.getOverAllPtCompletionStatus()))
		{
			errors.rejectValue("overAllPtCompletionStatus", "NotSeleted.userForm.overAllPtCompletionStatus");
		}
	}
}
