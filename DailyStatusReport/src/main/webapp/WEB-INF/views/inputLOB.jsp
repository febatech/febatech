<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored = "false" %>
<%@ page session="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>

<head>
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <link href="css/animate.min.css" />
    <link rel="stylesheet" href="css/style.css" />
    <script src="js/jquery-2.2.4.min.js"></script>
	<script src="js/dynamic_list_helper2.js" type="text/javascript"></script>
</head>

<script type="text/javascript">
	function openTotalFunction(name, data)
	{
		var result = 0;
		var openTotal = document.getElementById('openTotal').value;
		var firstRowOpen = document.getElementById('firstRowOpen').value;
		var secondRowOpen = document.getElementById('secondRowOpen').value;
		var thirdRowOpen = document.getElementById('thirdRowOpen').value;
		var fourthRowOpen = document.getElementById('fourthRowOpen').value;
		if(name == 'firstRowOpen')
		{
			result = parseInt(secondRowOpen) + parseInt(thirdRowOpen) + parseInt(fourthRowOpen) + parseInt(data);
		}
		if(name == 'secondRowOpen')
		{
			result = parseInt(firstRowOpen) + parseInt(thirdRowOpen) + parseInt(fourthRowOpen) + parseInt(data);
		}
		if(name == 'thirdRowOpen')
		{
			result = parseInt(firstRowOpen) + parseInt(secondRowOpen) + parseInt(fourthRowOpen) + parseInt(data);
		}
		if(name == 'fourthRowOpen')
		{
			result = parseInt(firstRowOpen) + parseInt(secondRowOpen) + parseInt(thirdRowOpen) + parseInt(data) ;
		}
	    if (!isNaN(result)) {
	        document.getElementById('openTotal').value = result;
	    }
	}
	
	function closedTotalFunction(name, data)
	{
		var result = 0;
		var ClosedTotal = document.getElementById('closedTotal').value;
		var firstRowClosed = document.getElementById('firstRowClosed').value;
		var secondRowClosed = document.getElementById('secondRowClosed').value;
		var thirdRowClosed = document.getElementById('thirdRowClosed').value;
		var fourthRowClosed = document.getElementById('fourthRowClosed').value;
		if(name == 'firstRowClosed')
		{
			result = parseInt(secondRowClosed) + parseInt(thirdRowClosed) + parseInt(fourthRowClosed) + parseInt(data);
		}
		if(name == 'secondRowClosed')
		{
			result = parseInt(firstRowClosed) + parseInt(thirdRowClosed) + parseInt(fourthRowClosed) + parseInt(data);
		}
		if(name == 'thirdRowClosed')
		{
			result = parseInt(firstRowClosed) + parseInt(secondRowClosed) + parseInt(fourthRowClosed) + parseInt(data);
		}
		if(name == 'fourthRowClosed')
		{
			result = parseInt(firstRowClosed) + parseInt(secondRowClosed) + parseInt(thirdRowClosed) + parseInt(data) ;
		}
	    if (!isNaN(result)) {
	        document.getElementById('closedTotal').value = result;
	    }
	}
	
	function rejectedTotalFunction(name, data)
	{
		var result = 0;
		var RejectedTotal = document.getElementById('rejectedTotal').value;
		var firstRowRejected = document.getElementById('firstRowRejected').value;
		var secondRowRejected = document.getElementById('secondRowRejected').value;
		var thirdRowRejected = document.getElementById('thirdRowRejected').value;
		var fourthRowRejected = document.getElementById('fourthRowRejected').value;
		if(name == 'firstRowRejected')
		{
			result = parseInt(secondRowRejected) + parseInt(thirdRowRejected) + parseInt(fourthRowRejected) + parseInt(data);
		}
		if(name == 'secondRowRejected')
		{
			result = parseInt(firstRowRejected) + parseInt(thirdRowRejected) + parseInt(fourthRowRejected) + parseInt(data);
		}
		if(name == 'thirdRowRejected')
		{
			result = parseInt(firstRowRejected) + parseInt(secondRowRejected) + parseInt(fourthRowRejected) + parseInt(data);
		}
		if(name == 'fourthRowRejected')
		{
			result = parseInt(firstRowRejected) + parseInt(secondRowRejected) + parseInt(thirdRowRejected) + parseInt(data) ;
		}
	    if (!isNaN(result)) {
	        document.getElementById('rejectedTotal').value = result;
	    }
	}
	
	function deferedTotalFunction(name, data)
	{
		var result = 0;
		var DeferedTotal = document.getElementById('defferedTotal').value;
		var firstRowDefered = document.getElementById('firstRowDefered').value;
		var secondRowDefered = document.getElementById('secondRowDefered').value;
		var thirdRowDefered = document.getElementById('thirdRowDefered').value;
		var fourthRowDefered = document.getElementById('fourthRowDefered').value;
		if(name == 'firstRowDefered')
		{
			result = parseInt(secondRowDefered) + parseInt(thirdRowDefered) + parseInt(fourthRowDefered) + parseInt(data);
		}
		if(name == 'secondRowDefered')
		{
			result = parseInt(firstRowDefered) + parseInt(thirdRowDefered) + parseInt(fourthRowDefered) + parseInt(data);
		}
		if(name == 'thirdRowDefered')
		{
			result = parseInt(firstRowDefered) + parseInt(secondRowDefered) + parseInt(fourthRowDefered) + parseInt(data);
		}
		if(name == 'fourthRowDefered')
		{
			result = parseInt(firstRowDefered) + parseInt(secondRowDefered) + parseInt(thirdRowDefered) + parseInt(data) ;
		}
	    if (!isNaN(result)) {
	        document.getElementById('defferedTotal').value = result;
	    }
	}
	
	function reOpnedTotalFunction(name, data)
	{
		var result = 0;
		var ReOpnedTotal = document.getElementById('reopenedTotal').value;
		var firstRowReOpned = document.getElementById('firstRowReOpned').value;
		var secondRowReOpned = document.getElementById('secondRowReOpned').value;
		var thirdRowReOpned = document.getElementById('thirdRowReOpned').value;
		var fourthRowReOpned = document.getElementById('fourthRowReOpned').value;
		if(name == 'firstRowReOpned')
		{
			result = parseInt(secondRowReOpned) + parseInt(thirdRowReOpned) + parseInt(fourthRowReOpned) + parseInt(data);
		}
		if(name == 'secondRowReOpned')
		{
			result = parseInt(firstRowReOpned) + parseInt(thirdRowReOpned) + parseInt(fourthRowReOpned) + parseInt(data);
		}
		if(name == 'thirdRowReOpned')
		{
			result = parseInt(firstRowReOpned) + parseInt(secondRowReOpned) + parseInt(fourthRowReOpned) + parseInt(data);
		}
		if(name == 'fourthRowReOpned')
		{
			result = parseInt(firstRowReOpned) + parseInt(secondRowReOpned) + parseInt(thirdRowReOpned) + parseInt(data) ;
		}
	    if (!isNaN(result)) {
	        document.getElementById('reopenedTotal').value = result;
	    }
	}   
    
    
    function addMoreRaidLogRow(tableID) {
    	 var table = document.getElementById(tableID);
    	 var rowCount = table.rows.length;
    	 var row = table.insertRow(rowCount); //to insert blank row
    	 
    	 var cell1 = row.insertCell(0);   //to insert first column
    	 var typeCol = document.createElement("input");
    	 typeCol.type = "text";
    	 typeCol.className = "form-control";
    	 typeCol.name="type"+(rowCount-1);
    	 typeCol.value=(rowCount-1);
    	 cell1.appendChild(typeCol);
    	 document.getElementById('rowCount').value = (rowCount-1);
    	 
    	 var cell2 = row.insertCell(1); //to insert second column
    	 var impactedAppCol = document.createElement("input");
    	 impactedAppCol.type = "text";
    	 impactedAppCol.className = "form-control";
    	 impactedAppCol.name="impactedApp"+(rowCount-1);
    	 cell2.appendChild(impactedAppCol);
    	 
    	var cell3 = row.insertCell(2); // to insert 3rd column
    	 var descriptionCol = document.createElement("input");
    	 descriptionCol.type = "text";
    	 descriptionCol.className = "form-control";
    	 descriptionCol.name="description"+(rowCount-1);
    	 cell3.appendChild(descriptionCol);
    	 
    	
    	 
    	 //Open, In Progress, Fixed, Reset, Rejected, Reopen and Close
    	 var cell4 = row.insertCell(3);
    	 var ragStatusCol = document.createElement("select");
    	 ragStatusCol.width = "20%";
//     	 ragCol.type = "text";
		 ragStatusCol.options[0]=new Option("---Select---","NONE");
		 ragStatusCol.options[1]=new Option("Open","OPEN");
		 ragStatusCol.options[2]=new Option("In Progress","INPROGRESS");
		 ragStatusCol.options[3]=new Option("Fixed","FIXED");
		 ragStatusCol.options[4]=new Option("Rejected","REJECTED");
		 ragStatusCol.options[5]=new Option("Reopen","REOPEN");
		 ragStatusCol.options[6]=new Option("Close","CLOSE");
		 ragStatusCol.className = "form-control";
		 ragStatusCol.name="status"+(rowCount-1);
    	 cell4.appendChild(ragStatusCol);
    	 
    	 var cell5 = row.insertCell(4);  //to insert 5th column
    	 var portfolioManagerCol = document.createElement("input");
    	 portfolioManagerCol.type = "text";
    	 portfolioManagerCol.className = "form-control";
    	 portfolioManagerCol.name="portfolioManager"+(rowCount-1);
    	 cell5.appendChild(portfolioManagerCol);
    	 
    	 var cell6 = row.insertCell(5);  //to insert 6th column
    	 var radiOwnerCol = document.createElement("input");
    	 radiOwnerCol.type = "text";
    	 radiOwnerCol.className = "form-control";
    	 radiOwnerCol.name="radiOwner"+(rowCount-1);
    	 cell6.appendChild(radiOwnerCol);
    	 
    	 var cell7 = row.insertCell(6);  //to insert 7th column
    	 
    	 var ragCol = document.createElement("select");
    	 ragCol.width = "20%";
//     	 ragCol.type = "text";
		 ragCol.options[0]=new Option("---Select---","NONE");
		 ragCol.options[1]=new Option("Amber","AMBER");
		 ragCol.options[2]=new Option("Red","RED");
		 ragCol.options[3]=new Option("Green","GREEN");
		 ragCol.options[4]=new Option("OnHold","ONHOLD");
    	 ragCol.className = "form-control";
    	 ragCol.name="rag"+(rowCount-1);
    	 cell7.appendChild(ragCol);
    	 
    	 var cell8 = row.insertCell(7);  //to insert 8th column
    	 var dateLoggedCol = document.createElement("input");
    	 dateLoggedCol.type = "date";
    	 dateLoggedCol.className = "form-control";
    	 dateLoggedCol.name="dateLogged"+(rowCount-1);
    	 dateLoggedCol.setAttribute("onchange", "javascript:dateDiff(event, "+(rowCount-1)+")");
    	 cell8.appendChild(dateLoggedCol);
    	 
    	 var cell9 = row.insertCell(8);  //to insert 9th column
    	 var targetClosureDateCol = document.createElement("input");
    	 targetClosureDateCol.type = "date";
    	 targetClosureDateCol.className = "form-control";
    	 targetClosureDateCol.name="targetClosureDate"+(rowCount-1);
    	 cell9.appendChild(targetClosureDateCol);
    	 
    	 var cell10 = row.insertCell(9);  //to insert 10th column
    	 var ageCol = document.createElement("input");
    	 ageCol.type = "text";
    	 ageCol.className = "form-control";
    	 ageCol.id="age"+(rowCount-1);
    	 ageCol.name="age"+(rowCount-1);
    	 cell10.appendChild(ageCol);
    	 
    	 var cell11 = row.insertCell(10);  //to insert 11th column
    	 var mileStoneImpactedCol = document.createElement("input");
    	 mileStoneImpactedCol.type = "text";
    	 mileStoneImpactedCol.className = "form-control";
    	 mileStoneImpactedCol.name="mileStoneImpacted"+(rowCount-1);
    	 cell11.appendChild(mileStoneImpactedCol);
    	 
    	 var cell12 = row.insertCell(11);  //to insert 12th column
    	 var raidBackToGreenPlanCol = document.createElement("textarea");
//     	 raidBackToGreenPlanCol.type = "textarea";
    	 raidBackToGreenPlanCol.className = "form-control";
    	 raidBackToGreenPlanCol.style = "width:150px; height:100px;";
    	 raidBackToGreenPlanCol.name="raidBackToGreenPlan"+(rowCount-1);
    	 cell12.appendChild(raidBackToGreenPlanCol);
    	 
    	 var cell13 = row.insertCell(12);   // to insert 10th column
    	 var rowRemoveCol = document.createElement("a");
    	 var text = document.createTextNode("Delete");
    	 rowRemoveCol.appendChild(text);
    	 rowRemoveCol.setAttribute("href","javascript:goSubmit("+(rowCount-1)+")");
    	 rowRemoveCol.name="reqlink[]";
    	 cell13.appendChild(rowRemoveCol);
    	 
    	 return false;
    	 
    	}
    	 
    	function goSubmit(rowindex)
    	{
    		/* alert('Row Index : '+rowindex);
    	 document.inputForm.rowindex.value=rowindex;
    	 document.inputForm.action="delete";
    	 document.inputForm.submit(); */
    		document.getElementById("raidLogTable").deleteRow(rowindex+1);
    	 
    	 }
    	
    	
    	function addMoreTestDesignSummaryRow(tableID) {
         	 var table = document.getElementById(tableID);
         	 var rowCount = table.rows.length;
         	 var row = table.insertRow(rowCount); //to insert blank row
         	 
         	 var cell1 = row.insertCell(0);   //to insert first column
         	 var typeCol = document.createElement("input");
         	 typeCol.type = "text";
         	 typeCol.className = "form-control";
         	 typeCol.name="applicationTrack"+(rowCount-1);
//          	 typeCol.value=(rowCount-1);
         	 cell1.appendChild(typeCol);
         	 document.getElementById('testDesignSummaryRowCount').value = (rowCount-1);
         	 
         	 var cell2 = row.insertCell(1); //to insert second column
         	 var impactedAppCol = document.createElement("input");
         	 impactedAppCol.type = "number";
         	 impactedAppCol.value = 0;
         	 impactedAppCol.className = "form-control";
         	 impactedAppCol.name="tdsTotal"+(rowCount-1);
         	impactedAppCol.id="tdsTotal"+(rowCount-1);
         	 impactedAppCol.setAttribute("onchange", "javascript:completionOfTestDesignSummary(this.name, this.value,"+(rowCount-1)+", 'testDesignSummaryTable')");//'fourthRowReOpned', this.value
         	 cell2.appendChild(impactedAppCol);
         	
         	 
         	var cell3 = row.insertCell(2); // to insert 3rd column
         	 var descriptionCol = document.createElement("input");
         	 descriptionCol.type = "number";
         	descriptionCol.value = 0;
         	 descriptionCol.className = "form-control";
         	 descriptionCol.name="tdsInProgress"+(rowCount-1);
         	 cell3.appendChild(descriptionCol);
         	 
         	 var cell4 = row.insertCell(3);  //to insert 4th column
         	 var statusCol = document.createElement("input");
         	 statusCol.type = "number";
         	statusCol.value = 0;
         	 statusCol.className = "form-control";
         	 statusCol.name="tdsOnHold"+(rowCount-1);
         	 cell4.appendChild(statusCol);
         	 
         	 var cell5 = row.insertCell(4);  //to insert 5th column
         	 var portfolioManagerCol = document.createElement("input");
         	 portfolioManagerCol.type = "number";
         	portfolioManagerCol.value = 0;
         	 portfolioManagerCol.className = "form-control";
         	 portfolioManagerCol.name="tdsCompleted"+(rowCount-1);
         	portfolioManagerCol.id="tdsCompleted"+(rowCount-1);
         	portfolioManagerCol.setAttribute("onchange", "javascript:completionOfTestDesignSummary(this.name, this.value,"+(rowCount-1)+", 'testDesignSummaryTable')");
         	 cell5.appendChild(portfolioManagerCol);
         	 
         	var cell6 = row.insertCell(5);  //to insert 5th column
      	 var portfolioManagerCol = document.createElement("input");
      	 portfolioManagerCol.type = "number";
      	portfolioManagerCol.value = 0;
      	 portfolioManagerCol.className = "form-control";
      	 portfolioManagerCol.name="tdsCompletion"+(rowCount-1);
      	portfolioManagerCol.id="tdsCompletion"+(rowCount-1);
      	portfolioManagerCol.step=".01";
      	portfolioManagerCol.readOnly = true;
      	 cell6.appendChild(portfolioManagerCol);
         	 
         	 
         	 var cell7 = row.insertCell(6);   // to insert 10th column
         	 var rowRemoveCol = document.createElement("a");
         	 var text = document.createTextNode("Delete");
         	 rowRemoveCol.appendChild(text);
         	 rowRemoveCol.setAttribute("href","javascript:removeTestDesignSummaryRow("+(rowCount-1)+")");
         	 rowRemoveCol.name="reqlink[]";
         	 cell7.appendChild(rowRemoveCol);
         	
         	 return false;
         	 
         	}
         	 
         	function removeTestDesignSummaryRow(rowindex)
         	{
         		/* alert('Row Index : '+rowindex);
         	 document.inputForm.rowindex.value=rowindex;
         	 document.inputForm.action="delete";
         	 document.inputForm.submit(); */
         		document.getElementById("testDesignSummaryTable").deleteRow(rowindex+1);
         	 
         	 }
         	
         	function addMoreTestExecutionSummaryRow(tableID) {
            	 var table = document.getElementById(tableID);
            	 var rowCount = table.rows.length;
            	 var row = table.insertRow(rowCount); //to insert blank row
            	 
            	 var cell1 = row.insertCell(0);   //to insert first column
            	 var typeCol = document.createElement("input");
            	 typeCol.type = "text";
            	 typeCol.className = "form-control";
            	 typeCol.name="tesApplicationTrack"+(rowCount-1);
//             	 typeCol.value=(rowCount-1);
            	 cell1.appendChild(typeCol);
            	 document.getElementById('testExectuionSummaryRowCount').value = (rowCount-1);
            	 
            	 var cell2 = row.insertCell(1); //to insert second column
            	 var impactedAppCol = document.createElement("input");
            	 impactedAppCol.type = "number";
            	impactedAppCol.value = 0;
            	 impactedAppCol.className = "form-control";
            	 impactedAppCol.name="totalScenario"+(rowCount-1);
            	impactedAppCol.id="totalScenario"+(rowCount-1);
//             	impactedAppCol.setAttribute("onchange", "javascript:completionOfTestExecutionSummary(this.name, this.value,"+(rowCount-1)+", 'testExecutionSummaryTable')");
            	 cell2.appendChild(impactedAppCol);
            	 
            	var cell3 = row.insertCell(2); // to insert 3rd column
            	 var descriptionCol = document.createElement("input");
            	 descriptionCol.type = "number";
            	descriptionCol.value = 0;
            	 descriptionCol.className = "form-control";
            	 descriptionCol.name="totalTestRun"+(rowCount-1);
            	descriptionCol.id="totalTestRun"+(rowCount-1);
            	descriptionCol.setAttribute("onchange", "javascript:completionOfTestExecutionSummary(this.name, this.value,"+(rowCount-1)+", 'testExecutionSummaryTable')");
            	 cell3.appendChild(descriptionCol);
            	 
            	 var cell4 = row.insertCell(3);  //to insert 4th column
            	 var statusCol = document.createElement("input");
            	 statusCol.type = "number";
            	statusCol.value = 0;
            	 statusCol.className = "form-control";
            	 statusCol.name="totalTestRunPass"+(rowCount-1);
            	 statusCol.id="totalTestRunPass"+(rowCount-1);
            	statusCol.setAttribute("onchange", "javascript:completionOfTestExecutionSummary(this.name, this.value,"+(rowCount-1)+", 'testExecutionSummaryTable')");
            	 cell4.appendChild(statusCol);
            	 
            	 var cell5 = row.insertCell(4);  //to insert 5th column
            	 var portfolioManagerCol = document.createElement("input");
            	 portfolioManagerCol.type = "number";
            	portfolioManagerCol.value = 0;
            	 portfolioManagerCol.className = "form-control";
            	 portfolioManagerCol.name="totalTestRunFailed"+(rowCount-1);
            	portfolioManagerCol.id="totalTestRunFailed"+(rowCount-1);
            	 cell5.appendChild(portfolioManagerCol);
            	 
            	var cell6 = row.insertCell(5);  //to insert 5th column
           	 var portfolioManagerCol = document.createElement("input");
           	 portfolioManagerCol.type = "number";
           	 portfolioManagerCol.value = 0;
           	 portfolioManagerCol.className = "form-control";
           	 portfolioManagerCol.name="tesCompletion"+(rowCount-1);
           	 portfolioManagerCol.id="tesCompletion"+(rowCount-1);
           	portfolioManagerCol.readOnly = true;
           	portfolioManagerCol.step=".01";
           	 cell6.appendChild(portfolioManagerCol);
            	 
            	 
            	 var cell7 = row.insertCell(6);   // to insert 10th column
            	 var rowRemoveCol = document.createElement("a");
            	 var text = document.createTextNode("Delete");
            	 rowRemoveCol.appendChild(text);
            	 rowRemoveCol.setAttribute("href","javascript:removeTestExecutionSummaryRow("+(rowCount-1)+")");
            	 rowRemoveCol.name="reqlink[]";
            	 cell7.appendChild(rowRemoveCol);
            	 
            	 return false;
            	 
            	}
            	 
            	function removeTestExecutionSummaryRow(rowindex)
            	{
            		document.getElementById("testExecutionSummaryTable").deleteRow(rowindex+1);
            	 
            	 }
    	
          	function overallPTCompletionStatusInPercentage(name, data)
        	{
        		var result = 0.0;
        		var planingPhasePercentage = document.getElementById('planingPhasePercentage').value;
        		var testDesignPhasePercentage = document.getElementById('testDesignPhasePercentage').value;
        		var executionPhasePercentage = document.getElementById('executionPhasePercentage').value;
        		var signOffAndClosurePhasePercentage = document.getElementById('signOffAndClosurePhasePercentage').value;
        			result = parseFloat(((parseInt(planingPhasePercentage) + parseInt(testDesignPhasePercentage) + parseInt(executionPhasePercentage) + parseInt(signOffAndClosurePhasePercentage))/4));
        	    if (!isNaN(result)) 
        	    {
        	    	var roundedNumber = Math.round(result * 10) / 10;
        	        document.getElementById('overAllPtCompletionStatusPercentage').value = roundedNumber;
        	    }
        	}
        	
        	function completionOfTestDesignSummary(name, data, completionId, tableId)
        	{
        		var result = 0.0;
        		var tdsCompletion = document.getElementById('tdsCompleted'+completionId).value;
        		var tdsTotal = document.getElementById('tdsTotal'+completionId).value;
        		var table = document.getElementById(tableId);
           	 	var rowCount = (table.rows.length)-2;
        		
        		if(name == 'tdsCompleted'+completionId)
        		{
        			result = parseInt(data) / parseInt(tdsTotal);
        		}
        		if(name == 'tdsTotal'+completionId)
        		{
        			result = parseInt(tdsCompletion) / parseInt(data);
        		}
        	    if (!isNaN(result)) 
        	    {
        	    	var truncated = 0.0;
        	    	truncated = parseFloat((result)*100);
        	    	var roundedNumber = Math.round(truncated * 10) / 10;
        	        document.getElementById('tdsCompletion'+completionId).value = roundedNumber;
        	        console.log("Row Count : "+rowCount);
        	        var num1 = 0.0;
        	        var i;
        	        for (i = 1; i <= rowCount; i++) 
        	        { 
        	        	num1 += (parseFloat(document.getElementById('tdsCompletion'+i).value));
        	        }
        	        var roundNumber = Math.round(((parseFloat(num1))/(parseInt(rowCount))) * 10) / 10;        	        
        	        document.getElementById('testDesignPhasePercentage').value = roundNumber;
        	    }
        	    overallPTCompletionStatusInPercentage(null, null);
        	}
        	
        	function completionOfTestExecutionSummary(name, data, completionId, tableId)
        	{
        		var result = 0.0;
        		var totalScenario = document.getElementById('totalScenario'+completionId).value;
        		var totalTestRun = document.getElementById('totalTestRun'+completionId).value;
        		var totalTestRunPass = document.getElementById('totalTestRunPass'+completionId).value;
        		var table = document.getElementById(tableId);
           	 	var rowCount = (table.rows.length)-2;
        		
        		if(name == 'totalTestRun'+completionId)
        		{
        			result = parseFloat(parseInt(totalTestRunPass) / parseInt(data));
        		}
        		if(name == 'totalTestRunPass'+completionId)
        		{
        			result = parseFloat(parseInt(data) / parseInt(totalTestRun));
        		}
        	    if (!isNaN(result)) {
        	    	var truncated = parseFloat((result) * 100);
        	    	var roundedNumber = Math.round(truncated * 10) / 10;
        	        document.getElementById('tesCompletion'+completionId).value = roundedNumber;
        	        var num1 = 0.0;
        	        var i;
        	        for (i = 1; i <= rowCount; i++) 
        	        { 
        	        	num1 += (parseFloat(document.getElementById('tesCompletion'+i).value));
        	        }
        	        var roundNumber = Math.round(((parseFloat(num1))/(parseInt(rowCount))) * 10) / 10;
        	        document.getElementById('executionPhasePercentage').value = roundNumber;
        	    }
        	    overallPTCompletionStatusInPercentage(null, null);
        	}
        	
        	function dateDiff(e, rowId)
          	{
        		var newReportDate = e.target.value;
        		//console.log("Logged Date : "+newReportDate);
        		var reportDate = new Date(newReportDate);
        		var todayDate = new Date(new Date().getFullYear(), (new Date().getMonth()), new Date().getDate());
        		
        		console.log("Report Date : "+reportDate);
        		console.log("Today Date : "+todayDate);
        		
        		 //Get 1 day in milliseconds
        		  var one_day=1000*60*60*24;

        		  // Convert both dates to milliseconds
        		  var date1_ms = reportDate.getTime();
        		  var date2_ms = todayDate.getTime();

        		  // Calculate the difference in milliseconds
        		  var difference_ms = date2_ms - date1_ms;
        		    
        		  // Convert back to days and return
        		  document.getElementById('age'+rowId).value = (Math.round(difference_ms/one_day));
        		  
        	
          	}

</script>
<style>
.Green
{
	background-color: green;
}
.Red
{
	background-color: red;
}
.Amber
{
	background-color: orange;
}
.OnHold
{
	background-color: blue;
}

</style>
<body>
    <div class="container-fluid">
    <form:form id="inputForm" name="inputForm"  modelAttribute="userForm" method="post" action="submitDailyStatusReport.html">
    <c:choose>
	 	<c:when test="${not empty msg}">
			<div class="alert alert-${css} alert-dismissible" role="alert">
				<button type="button" class="close" data-dismiss="alert" 
                                aria-label="Close">
					<span aria-hidden="true">�</span>
				</button>
				<center><strong>${msg}</strong><br/><a href = "index.html">Back to the Home Page !!!</a></center>
			</div>
		</c:when>
		<c:otherwise>
            <div class="col-lg-12">
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th colspan=""><font size="5">LOB Daily Status Report - NFT - ${todayDate}</font></th>
                        </tr>
                    </thead>
                </table>

                <div class="col-lg-12">
                    <div class="col-lg-4 order">
                        <table class="table table-bordered">
                            <thead>
                                <th></th>
                                <th>Start</th>
                                <th>End</th>
                                <th>%</th>
                            </thead>
                            <tbody>
                                <tr>
                                    <th>Planing Phase</th>
                                    <td> <form:input id="planingPhaseStart" path="planingPhaseStart" type="date" style="width:173px" class="form-control"/> </td>
                                    <td><form:input id="planingPhaseEnd" path="planingPhaseEnd" type="date" style="width:173px" class="form-control"/>
                                    </td>
                                    <td>
                                    	<form:input id="planingPhasePercentage" path="planingPhasePercentage" type="number" style="width:70px" class="form-control" 
                                    		 step=".01" value = "0" onchange="overallPTCompletionStatusInPercentage('planingPhasePercentage', this.value)"/>
                                    </td>
                                </tr>
                                <tr>
                                    <th>Test Design Phase</th>
                                    <td><form:input id="testDesignPhaseStart" path="testDesignPhaseStart" type="date" style="width:173px" class="form-control"/></td>
                                    <td><form:input id="testDesignPhaseEnd" path="testDesignPhaseEnd" type="date" style="width:173px" class="form-control"/></td>
                                    <td>
                                    	<form:input id="testDesignPhasePercentage" path="testDesignPhasePercentage" type="number" style="width:70px" class="form-control" 
                                    		 step=".01" value = "0" onchange="overallPTCompletionStatusInPercentage('testDesignPhasePercentage', this.value)"/>
                                    </td>
                                </tr>
                                <tr>
                                    <th>Execution Phase</th>
                                    <td><form:input id="executionPhaseStart" path="executionPhaseStart" type="date" style="width:173px" class="form-control"/></td>
                                    <td><form:input id="executionPhaseEnd" path="executionPhaseEnd" type="date" style="width:173px" class="form-control"/></td>
                                    <td>
                                    	<form:input id="executionPhasePercentage" path="executionPhasePercentage" type="number" style="width:70px" class="form-control" 
                                    		 step=".01" value = "0" onchange="overallPTCompletionStatusInPercentage('executionPhasePercentage', this.value)"/>
                                    </td>
                                </tr>
                                <tr>
                                    <th>Sign Off & Closure Phase</th>
                                    <td><form:input id="signOffAndClosurePhaseStart" path="signOffAndClosurePhaseStart" type="date" style="width:173px" class="form-control"/></td>
                                    <td><form:input id="signOffAndClosurePhaseEnd" path="signOffAndClosurePhaseEnd" type="date" style="width:173px" class="form-control"/></td>
                                    <td>
                                    	<form:input id="signOffAndClosurePhasePercentage" path="signOffAndClosurePhasePercentage" type="number" style="width:70px" class="form-control"
                                    		 step=".01" value = "0" onchange="overallPTCompletionStatusInPercentage('signOffAndClosurePhasePercentage', this.value)"/>
                                    </td>
                                </tr>
                                <tr>
                                    <th>Release Date</th>
                                    <td colspan="3" style="text-align: center;">
                                    	<form:input id="releaseDate" path="releaseDate" type="date" class="form-control"/>
                                    </td>
                                </tr>
                                <tr>
                                    <th>Overall PT Completion Status</th>
                                    <td colspan="2" style="text-align: center; orange;">
							            <form:select path="overAllPtCompletionStatus" class="form-control">
											<form:option value="NONE" label="--- Select ---" />
											<c:forEach items="${trackWiseStausDropDownList}" var="currObj">
										        <form:option class="${currObj.value}" value="${currObj.value}"></form:option>
										    </c:forEach> 
										</form:select>
										<form:errors path="overAllPtCompletionStatus" cssClass="error"/>
						            </td>
                                    <td><form:input id = "overAllPtCompletionStatusPercentage" path = "overAllPtCompletionStatusPercentage" type="number" step=".01" class="form-control"/></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="col-lg-2 order">
                    </div>
                    <div class="col-lg-3 order">
                        <table class="table table-bordered">
                            <thead>
                                <th colspan="2">Track wise Status</th>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>Track</td>
                                    <td>RAG</td>
                                </tr>
                                <tr>
                                    <td>City Connect</td>
                                    <td>
                                        <form:select path="cityConnect" class="form-control">
											<form:option value="NONE" label="--- Select ---" />
											<%-- <form:options items="${trackWiseStausDropDownList}" /> --%>
											<c:forEach items="${trackWiseStausDropDownList}" var="currObj">
										        <form:option class="${currObj.value}" value="${currObj.value}"></form:option>
										    </c:forEach>
										</form:select>
									</td>
                                </tr>
                                <tr>
                                    <td>CD</td>
                                    <td> 
                                    	<form:select path="cd" class="form-control">
											<form:option value="NONE" label="--- Select ---" />
											<%-- <form:options items="${trackWiseStausDropDownList}" /> --%>
											<c:forEach items="${trackWiseStausDropDownList}" var="currObj">
										        <form:option class="${currObj.value}" value="${currObj.value}"></form:option>
										    </c:forEach>
										</form:select>
									</td>
                                </tr>
                                <tr>
                                    <td>State Street</td>
                                    <td> 
                                    	<form:select path="stateStreet" class="form-control">
											<form:option value="NONE" label="--- Select ---" />
											<%-- <form:options items="${trackWiseStausDropDownList}" /> --%>
											<c:forEach items="${trackWiseStausDropDownList}" var="currObj">
										        <form:option class="${currObj.value}" value="${currObj.value}"></form:option>
										    </c:forEach>
										</form:select>
									</td>
                                </tr>
                                <tr>
                                    <td>Shared Services</td>
                                    <td> 
										<form:select path="sharedServices" class="form-control">
											<form:option value="NONE" label="--- Select ---" />
											<%-- <form:options items="${trackWiseStausDropDownList}" /> --%>
											<c:forEach items="${trackWiseStausDropDownList}" var="currObj">
										        <form:option class="${currObj.value}" value="${currObj.value}"></form:option>
										    </c:forEach>
										</form:select>
									</td>
                                </tr>

                            </tbody>
                        </table>

                    </div>
  <style>
    .error
    {
        color: #ff0000;
        font-weight: bold;
    }
    </style>
                    <div class="col-lg-3 order">
                        <table class="table table-bordered">

                            <tbody>
                                <tr>
                                    <th class="blue">Report Date</th>
                                    <td><form:input id="reportDate" path="reportDate" type="date" readonly="true" class="form-control"/>
                                    <form:errors path="reportDate" cssClass="error"/></td>
                                </tr>
                                <tr>
                                    <th class="blue">Project / Release</th>
                                    <td><form:input id="projectRelease" path="projectRelease" type="text" class="form-control"/>
                                    <form:errors path="projectRelease" cssClass="error"/></td>
                                </tr>
                                <tr>
                                    <th>LOB</th>
                                    <td><form:input id="loB" path="loB" type="text" class="form-control"/>
                                    <form:errors path="loB" cssClass="error"/></td>
                                </tr>
                                <tr>
                                    <th>App Name</th>
                                    <td><form:input id="appName" path="appName" type="text" class="form-control"/>
                                    <form:errors path="appName" cssClass="error"/></td>
                                </tr>
                                <tr>
                                    <th>SDP ID</th>
                                    <td><form:input id="sdpId" path="sdpId" type="number" class="form-control"/>
                                    <form:errors path="sdpId" cssClass="error"/></td>
                                </tr>
                                <tr>
                                    <th>Code / Build Version in test env</th>
                                    <td><form:input id="codeBuildVersionTestEnv" path="codeBuildVersionTestEnv" type="text" class="form-control"/></td>
                                </tr>

                            </tbody>
                        </table>

                    </div>


                </div>
            </div>
            <br/>
            <div>
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th colspan="4">Executive Summary </th>
                        </tr>
                    </thead>
                    <thead>

                        <tr><th>High Level Status or Accomplishments</th>
                        <th>Key Reasons for Non Green:</th>
                        <th>Back to Green Plan</th>
                        <th>Owner</th>

                    </tr></thead>
                    <tbody>
                        <tr>
                            <td>
                                <form:textarea id="highLevelStatusOrAccomplishments" path="highLevelStatusOrAccomplishments" class="form-control" rows="5"></form:textarea>
                            </td>
                            <td>
                                <form:textarea id="keyReasonsForNonGreen" path="keyReasonsForNonGreen" class="form-control" rows="5"></form:textarea>
                            </td>
                            <td>
                                <form:textarea id="backToGreenPlan" path="backToGreenPlan" class="form-control" rows="5"></form:textarea>
                            </td>
                            <td>
                                <form:textarea id="Owner" path="Owner" class="form-control" rows="5"></form:textarea>
                            </td>

                        </tr>

                    </tbody>

                </table>

            </div>
            <br/>
            <div class="col-lg-12">

                <table class="table table-bordered" id="raidLogTable">
                    <thead>
                        <!--<h4 style="text-align: center;background-color: #3399ff;color: #fff;padding: 13px;">RAID LOG(All open items including incidents,defects) </h4>-->
                        <th colspan="14">RAID LOG(All open items including incidents,defects) </th>
                    </thead>
                    <thead>

                        <th>Type</th>
                        <th>Impacted App</th>
                        <th class="description">Description</th>
                        <th>Status</th>
                        <th>Portfolio manager</th>
                        <th>Owner</th>
                        <th>RAG</th>
                        <th>Date Logged</th>
                        <th width="150px;">Target Closure Dt.</th>
                        <th>Age</th>
                        <th width="150px;">Mile Stone Impacted</th>
                        <th width="250px;">Back to Green Plan</th>
						<th>Action</th>
                    </thead>
                    <tbody id="raidLogListContainer">
                        
                    </tbody>

                </table>
                <input type="button" value="Add Raid Log" onclick="addMoreRaidLogRow('raidLogTable')"/>
            </div>

            <br/>

            <div class="col-lg-12">
                <table class="table table-bordered"  id="testDesignSummaryTable">

                    <thead>
                        <tr>
                            <th colspan="7">Test Design Summary</th>
                        </tr>
                        <tr>
                            <th>Application/Track</th>>
                            <th># Total</th>
                            <th># In Progress</th>
                            <th># On Hold</th>
                            <th># Completed</th>
                             <th>% Completion</th>
                            <th>Action</th>
                        </tr>

                    </thead>
                    <tbody id = "testDesignSummaryListContainer">
                       
                    </tbody>

                </table>
				<input type="button" value="Add Test Design Summary" onclick="addMoreTestDesignSummaryRow('testDesignSummaryTable')"/>
            </div>
            <br/>
            <div class="col-lg-12">
                <table class="table table-bordered"  id="testExecutionSummaryTable">

                    <thead>
                        <tr>
                            <th colspan="7">Test Execution Summary</th>
                        </tr>
                        <tr>
                            <th>Application/Track</th>>
                            <th>Total # Scenario</th>
                            <th>Total # Test Runs</th>
                            <th># Test runs Passes</th>
                            <th># Test runs Failed</th>
                            <th>% Completion</th>
                            <th>Action</th>
                        </tr>

                    </thead>
                    <tbody id = "testExecutionSummaryListContainer">
                       

                    </tbody>

                </table>
				<input type="button" value="Add Test Execution Summary" onclick="addMoreTestExecutionSummaryRow('testExecutionSummaryTable')"/>
            </div>
            <br/>

            <div class="col-lg-12">
                <table class="table table-bordered">

                    <thead>
                        <tr>
                            <th colspan="6">Test Defect Summary</th>
                        </tr>
                        <tr>
                            <th>SEV</th>>
                            <th>Open</th>
                            <th>CLosed</th>
                            <th>Rejected</th>
                            <th>Deferred</th>
                            <th>Re-Open</th>
                        </tr>

                    </thead>
                    <tbody>
                        <tr>
                            <td><form:input id = "firstRowSeverity" path = "firstRowSeverity" value="1" type="number" readonly="true" class="form-control" /></td>
                            <td><form:input id = "firstRowOpen" path = "firstRowOpen" type="number"  class="form-control" onchange="openTotalFunction('firstRowOpen', this.value)"/></td>
                            <td><form:input id = "firstRowClosed" path = "firstRowClosed" type="number" class="form-control" onchange="closedTotalFunction('firstRowClosed', this.value)"/></td>
                            <td><form:input id = "firstRowRejected" path = "firstRowRejected" type="number" class="form-control" onchange="rejectedTotalFunction('firstRowRejected', this.value)"/></td>
                            <td><form:input id = "firstRowDefered" path = "firstRowDefered" type="number" class="form-control" onchange="deferedTotalFunction('firstRowDefered', this.value)"/></td>
                            <td><form:input id = "firstRowReOpned" path = "firstRowReOpned" type="number" class="form-control" onchange="reOpnedTotalFunction('firstRowReOpned', this.value)"/></td>
                        </tr>
                        <tr>
                           <td><form:input id = "secondRowSeverity" path = "secondRowSeverity" type="number" value="2" readonly="true" class="form-control"/></td>
                            <td><form:input id = "secondRowOpen" path = "secondRowOpen" type="number" class="form-control" onchange="openTotalFunction('secondRowOpen',this.value)"/></td>
                            <td><form:input id = "secondRowClosed" path = "secondRowClosed" type="number" class="form-control" onchange="closedTotalFunction('secondRowClosed', this.value)"/></td>
                            <td><form:input id = "secondRowRejected" path = "secondRowRejected" type="number" class="form-control" onchange="rejectedTotalFunction('secondRowRejected', this.value)"/></td>
                            <td><form:input id = "secondRowDefered" path = "secondRowDefered" type="number" class="form-control" onchange="deferedTotalFunction('secondRowDefered', this.value)"/></td>
                            <td><form:input id = "secondRowReOpned" path = "secondRowReOpned" type="number" class="form-control" onchange="reOpnedTotalFunction('secondRowReOpned', this.value)"/></td>
                        </tr>
                        <tr>
                           <td><form:input id = "thirdRowSeverity" path = "thirdRowSeverity" type="number" value="3" readonly="true" class="form-control"/></td>
                            <td><form:input id = "thirdRowOpen" path = "thirdRowOpen" type="number" class="form-control" onchange="openTotalFunction('thirdRowOpen',this.value)"/></td>
                            <td><form:input id = "thirdRowClosed" path = "thirdRowClosed" type="number" class="form-control" onchange="closedTotalFunction('thirdRowClosed', this.value)"/></td>
                            <td><form:input id = "thirdRowRejected" path = "thirdRowRejected" type="number" class="form-control" onchange="rejectedTotalFunction('thirdRowRejected', this.value)"/></td>
                            <td><form:input id = "thirdRowDefered" path = "thirdRowDefered" type="number" class="form-control" onchange="deferedTotalFunction('thirdRowDefered', this.value)"/></td>
                            <td><form:input id = "thirdRowReOpned" path = "thirdRowReOpned" type="number" class="form-control" onchange="reOpnedTotalFunction('thirdRowReOpned', this.value)"/></td>
                        </tr>
                        <tr>
                            <td><form:input id = "fourthRowSeverity" path = "fourthRowSeverity" type="number" value="4" readonly="true" class="form-control"/></td>
                            <td><form:input id = "fourthRowOpen" path = "fourthRowOpen" type="number" class="form-control" onchange="openTotalFunction('fourthRowOpen',this.value)"/></td>
                            <td><form:input id = "fourthRowClosed" path = "fourthRowClosed" type="number" class="form-control" onchange="closedTotalFunction('fourthRowClosed', this.value)"/></td>
                            <td><form:input id = "fourthRowRejected" path = "fourthRowRejected" type="number" class="form-control" onchange="rejectedTotalFunction('fourthRowRejected', this.value)"/></td>
                            <td><form:input id = "fourthRowDefered" path = "fourthRowDefered" type="number" class="form-control" onchange="deferedTotalFunction('fourthRowDefered', this.value)"/></td>
                            <td><form:input id = "fourthRowReOpned" path = "fourthRowReOpned" type="number" class="form-control" onchange="reOpnedTotalFunction('fourthRowReOpned', this.value)"/></td>
                        </tr>

                        <tr>
                            <td>Total</td>
                            <td><input id="openTotal" type="number" class="form-control"/></td>
                            <td><input id="closedTotal"  type="number" class="form-control"/></td>
                            <td><input id="rejectedTotal"  type="number" class="form-control"/></td>
                            <td><input id="defferedTotal"  type="number" class="form-control"/></td>
                            <td><input id="reopenedTotal"  type="number" class="form-control"/></td>
                        </tr>

                    </tbody>

                </table>

            </div>
            <button class="btn btn-danger submitbtn" type="submit">Submit</button>
            </c:otherwise>
			</c:choose>
			<input type="hidden" id = "rowCount" name = "rowCount">
			<input type="hidden" id = "testDesignSummaryRowCount" name = "testDesignSummaryRowCount">
			<input type="hidden" id = "testExectuionSummaryRowCount" name = "testExectuionSummaryRowCount">
        </form:form>
    </div>
</body>
</html>
