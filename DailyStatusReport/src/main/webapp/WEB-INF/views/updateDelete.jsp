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
    <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">-->
    <link rel="stylesheet" href="css/style.css" />

    <!--<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-2.2.4.min.js"></script>-->
    <!--<script src="js/custom.js"></script>-->

    <!--<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>-->

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

function onSubmitRowCount(tableID) {
	
 	 var table = document.getElementById(tableID);
 	 var rowCount = table.rows.length;
 	 var count = rowCount-2;
 	document.getElementById('rowCount').value = (count);
 	document.getElementById('testDesignSummaryRowCount').value = (count);
 	document.getElementById('testExectuionSummaryRowCount').value = (count);
}

function onSubmitRowCountTDS(tableID) {
	
	 var table = document.getElementById(tableID);
	 var rowCount = table.rows.length;
	 var count = rowCount-2;
	document.getElementById('testDesignSummaryRowCount').value = (count);
}

function onSubmitRowCountTED(tableID) {
	
	 var table = document.getElementById(tableID);
	 var rowCount = table.rows.length;
	 var count = rowCount-2;
	document.getElementById('testExectuionSummaryRowCount').value = (count);
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
  	 
  	 var cell4 = row.insertCell(3);  //to insert 4th column
  	 var statusCol = document.createElement("input");
  	 statusCol.type = "text";
  	 statusCol.className = "form-control";
  	 statusCol.name="status"+(rowCount-1);
  	 cell4.appendChild(statusCol);
  	 
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
  	 
  	 /* var cell7 = row.insertCell(6);  //to insert 7th column
  	 var ragCol = document.createElement("input");
  	 ragCol.type = "text";
  	 ragCol.className = "form-control";
  	 ragCol.name="rag"+(rowCount-1);
  	 cell7.appendChild(ragCol); */
  	 
  	 var cell7 = row.insertCell(6);  //to insert 7th column
  	cell7.width = "50%";
	 var ragCol = document.createElement("select");
	 ragCol.width = "50%";
// 	 ragCol.type = "text";
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
//	 raidBackToGreenPlanCol.type = "textarea";
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
  	 	/* document.inputForm.rowindex.value=rowindex;
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
//       	 typeCol.value=(rowCount-1);
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
   	portfolioManagerCol.step=".01";
   	portfolioManagerCol.id="tdsCompletion"+(rowCount-1);
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
//          	 typeCol.value=(rowCount-1);
         	 cell1.appendChild(typeCol);
         	 document.getElementById('testExectuionSummaryRowCount').value = (rowCount-1);
         	 
         	 var cell2 = row.insertCell(1); //to insert second column
         	 var impactedAppCol = document.createElement("input");
         	 impactedAppCol.type = "number";
         	impactedAppCol.value = 0;
         	 impactedAppCol.className = "form-control";
         	 impactedAppCol.name="totalScenario"+(rowCount-1);
         	impactedAppCol.id="totalScenario"+(rowCount-1);
//          	impactedAppCol.setAttribute("onchange", "javascript:completionOfTestExecutionSummary(this.name, this.value,"+(rowCount-1)+", "+rowCount+")");
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
        	 portfolioManagerCol.step=".01";
        	 portfolioManagerCol.readOnly = true;
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
  	//Please enter a valid value
  	function addAsNewRecord()
  	{
  		document.getElementById("addAsANewRecord").value = 'Yes';
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
		alert('2');
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
		alert('1');
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
  	
  	function handler(e)
  	{
  		var baseReportDate = document.getElementById('baseReportDate').value;
		var newReportDate = new Date(e.target.value);
		var todayDate = ""+new Date().getFullYear()+"-"+(new Date().getMonth())+"-"+ new Date().getDate()+"";
		var tempDate = ""+newReportDate.getFullYear()+"-"+(newReportDate.getMonth())+"-"+ newReportDate.getDate()+"";

			
  		if(baseReportDate != newReportDate)
		{
			document.getElementById('updateButton').disabled = true;
		}
  		else
		{
  			document.getElementById('updateButton').disabled = false;
		}
  		
  		if(tempDate == todayDate)
  		{
  			document.getElementById('submitButton').disabled = false;
  		}
  		else
  		{
  			document.getElementById('submitButton').disabled = true;
  		}
  	}
  	
</script>
  <style>
    .error
    {
        color: #ff0000;
        font-weight: bold;
    }
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
</head>

<body onload="calculateDefectSummary()">
    <div class="container-fluid">
    <form:form id="inputForm"  modelAttribute="userForm" method="post" action="updateDelete.html" onsubmit="return disableUpdateButton();">
    <c:choose>
	 	<c:when test="${not empty msg}">
			<div class="alert alert-${css} alert-dismissible" role="alert">
				<button type="button" class="close" data-dismiss="alert" 
                                aria-label="Close">
					<span aria-hidden="true">×</span>
				</button>
				<center><strong>${msg}</strong><br/><a href = "index.html">Back to the Home Page !!!</a></center>
			</div>
		</c:when>
		<c:otherwise>
        <form action="" class="form-group">
            <div class="col-lg-12">
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th colspan="">Daily Status Report - NFT - ${userForm.insertedDate}</th>
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
                                    		 step=".01" onchange="overallPTCompletionStatusInPercentage('planingPhasePercentage', this.value)"/>
                                    </td>
                                </tr>
                                <tr>
                                    <th>Test Design Phase</th>
                                    <td><form:input id="testDesignPhaseStart" path="testDesignPhaseStart" type="date" style="width:173px" class="form-control"/></td>
                                    <td><form:input id="testDesignPhaseEnd" path="testDesignPhaseEnd" type="date" style="width:173px" class="form-control"/></td>
                                    <td>
                                    	<form:input id="testDesignPhasePercentage" path="testDesignPhasePercentage" type="number" style="width:70px" class="form-control" 
                                    		 step=".01" onchange="overallPTCompletionStatusInPercentage('overallPTCompletionStatusInPercentage', this.value)"/>
                                    </td>
                                </tr>
                                <tr>
                                    <th>Execution Phase</th>
                                    <td><form:input id="executionPhaseStart" path="executionPhaseStart" type="date" style="width:173px" class="form-control"/></td>
                                    <td><form:input id="executionPhaseEnd" path="executionPhaseEnd" type="date" style="width:173px" class="form-control"/></td>
                                    <td>
                                    	<form:input id="executionPhasePercentage" path="executionPhasePercentage" type="number" style="width:70px" class="form-control" 
                                    		 step=".01" onchange="overallPTCompletionStatusInPercentage('overallPTCompletionStatusInPercentage', this.value)"/>
                                    </td>
                                </tr>
                                <tr>
                                    <th>Sign Off & Closure Phase</th>
                                    <td><form:input id="signOffAndClosurePhaseStart" path="signOffAndClosurePhaseStart" type="date" style="width:173px" class="form-control"/></td>
                                    <td><form:input id="signOffAndClosurePhaseEnd" path="signOffAndClosurePhaseEnd" type="date" style="width:173px" class="form-control"/></td>
                                    <td>
                                    	<form:input id="signOffAndClosurePhasePercentage" path="signOffAndClosurePhasePercentage" type="number" style="width:70px" class="form-control" 
                                    		 step=".01" onchange="overallPTCompletionStatusInPercentage('signOffAndClosurePhasePercentage', this.value)"/>
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
                                    <td colspan="2" style="text-align: center;">
	                                    
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
                                    <td>
                                    	<%-- <form:select path="trackStatus" class="form-control">
											<form:option value="NONE" label="--- Select ---" />
											<form:options items="${trackWiseStausDropDownList}" />
										</form:select> --%>
										RAG
            						</td>
                                </tr>
                                <tr>
                                    <td>City Connect</td>
                                    <td>
                                        <form:select path="cityConnect" class="form-control">
											<form:option value="NONE" label="--- Select ---" />
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
											<c:forEach items="${trackWiseStausDropDownList}" var="currObj">
										        <form:option class="${currObj.value}" value="${currObj.value}"></form:option>
										    </c:forEach> 
										</form:select>
									</td>
                                </tr>

                            </tbody>
                        </table>

                    </div>

                    <div class="col-lg-3 order">
                        <table class="table table-bordered">

                            <tbody>
                                <tr>
                                    <th class="blue">Report Date</th>
                                    <td><form:input id="reportDate" path="reportDate" 
                                    	onchange="handler(event);" type="date" class="form-control"/><form:errors path="reportDate" cssClass="error" /></td>
                                </tr>
                                <tr>
                                    <th class="blue">Project / Release</th>
                                    <td><form:input id="projectRelease" path="projectRelease"  readonly="true" type="text" class="form-control"/><form:errors path="projectRelease" cssClass="error"/></td>
                                </tr>
                                <tr>
                                    <th>LOB</th>
                                    <td><form:input id="loB" path="loB" type="text"  readonly="true" class="form-control"/><form:errors path="loB" cssClass="error"/></td>
                                </tr>
                                <tr>
                                    <th>App Name</th>
                                    <td><form:input id="appName" path="appName"  readonly="true" type="text" class="form-control"/><form:errors path="appName" cssClass="error"/></td>
                                </tr>
                                <tr>
                                    <th>SDP ID</th>
                                    <td><form:input id="sdpId" path="sdpId" type="number"  readonly="true" class="form-control"/><form:errors path="sdpId" cssClass="error"/></td>
                                </tr>
                                <tr>
                                    <th>Code / Build Version in test env</th>
                                    <td><form:input id="codeBuildVersionTestEnv" path="codeBuildVersionTestEnv"  type="text" class="form-control"/></td>
                                </tr>

                            </tbody>
                        </table>

                    </div>


                </div>
            </div>
            <br/>
            <div >
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

                <table class="table table-bordered"  id="raidLogTable">
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
                        <th width="150px;">Back to Green Plan</th>
						<th>Action</th>
                    </thead>
                    <tbody>
                        <%-- <tr>
                            <td><form:input id="type" path="type" type="text" class="form-control"/></td>
                            <td><form:input id="impactedApp" path="impactedApp" type="text" class="form-control"/></td>
                            <td><form:input id="description" path="description" type="text" class="form-control"/></td>
                            <td><form:input id="status" path="status" type="text" class="form-control"/></td>

                            <td class="violet"><form:input id="portfolioManager" path="portfolioManager" type="text" class="form-control"/></td>
                            <td><form:input id="radiOwner" path="radiOwner" type="text" class="form-control"/></td>
                            <td><form:input id="rag" path="rag" type="text" class="form-control"/></td>
                            <td><form:input id="dateLogged" path="dateLogged" type="date" class="form-control"/></td>
                            <td><form:input id="targetClosureDate" path="targetClosureDate" type="date" class="form-control"/></td>
                            <td><form:input id="age" path="age" type="number" class="form-control"/></td>
                            <td><form:input id="mileStoneImpacted" path="mileStoneImpacted" type="text" class="form-control"/></td>
                            <td><form:input id="raidBackToGreenPlan" path="raidBackToGreenPlan" type="text" class="form-control"/></td>
                        </tr> --%>
                        <c:forEach items="${raidLogsList}" var="entry"  varStatus="i" begin="0"> 
	                   		<tr>
	                   			
	                   			<td><input id="type${i.index+1}" name="type${i.index+1}" value = "${entry.type}" type="text" class="form-control"/></td>
	                   			<td><input id="impactedApp${i.index+1}" name="impactedApp${i.index+1}" value = "${entry.impactedApp}" type="text" class="form-control"/></td>
	                   			<td><input id="description${i.index+1}" name="description${i.index+1}" value = "${entry.description}" type="text" class="form-control"/></td>
	                   			<td>
	                   				<%-- <input id="status${i.index+1}" name="status${i.index+1}" value = "${entry.status}" type="text" class="form-control"/> --%>
	                   				<%-- <form:select path="trackStatus" class="form-control">
										<form:option value="NONE" label="--- Select ---" />
										<form:options items="${raidLogStausDropDownList}" />
									</form:select> --%>
									<select id="status${i.index+1}" name="status${i.index+1}" class="form-control">
	                   					<c:forEach items="${raidLogStausDropDownList}" var="currObj">
									        <option class="${currObj.value}" value="${currObj.value}">${currObj.value}</option>
									    </c:forEach> 
	                   				</select>
	                   			</td>
	                   			<td><input id="portfolioManager${i.index+1}" name="portfolioManager${i.index+1}" value = "${entry.portfolioManager}" type="text" class="form-control"/></td>
	                   			<td><input id="radiOwner${i.index+1}" name="radiOwner${i.index+1}" value = "${entry.radiOwner}" type="text" class="form-control"/></td>
	                   			<td>
	                   				<select id="rag${i.index+1}" name="rag${i.index+1}" class="form-control">
	                   					<c:forEach items="${trackWiseStausDropDownList}" var="currObj">
									        <option class="${currObj.value}" value="${currObj.value}">${currObj.value}</option>
									    </c:forEach> 
	                   				</select>
	                   			</td>
	                   			<td><input id="dateLogged${i.index+1}" name="dateLogged${i.index+1}" value = "${entry.dateLogged}" type="date" class="form-control"/></td>
	                   			<td><input id="targetClosureDate${i.index+1}" name="targetClosureDate${i.index+1}" value = "${entry.targetClosureDate}" type="date" class="form-control"/></td>
	                   			<td><input id="age${i.index+1}" name="age${i.index+1}" value = "${entry.age}" type="text" class="form-control"/></td>
	                   			<td><input id="mileStoneImpacted${i.index+1}" name="mileStoneImpacted${i.index+1}" value = "${entry.mileStoneImpacted}" type="text" class="form-control"/></td>
	                   			<td><input id="raidBackToGreenPlan${i.index+1}" name="raidBackToGreenPlan${i.index+1}" value = "${entry.raidBackToGreenPlan}" type="text" class="form-control"/></td>
	                   			<td><a href="deleteRaidLogById.html?raidLogId=${entry.id}">Delete</a>
	                   			<td><input id="tdsId${i.index+1}" name="tdsId${i.index+1}" value = "${entry.id}" type="hidden" class="form-control"/></td>
	                   		</tr>
	                   	</c:forEach>

                    </tbody>

                </table>
                <input type="button" value="Add Raid Log" onclick="addMoreRaidLogRow('raidLogTable')"/>
            </div>

            <br>

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
                    <tbody>
                        <%-- <tr>
                            <td>CD</td>
                            <td><form:input id="applicationTrackCdTotal" path="applicationTrackCdTotal" type="number" class="form-control"/></td>
                            <td><form:input id="applicationTrackCdInProgress" path="applicationTrackCdInProgress" type="number" class="form-control"/></td>
                            <td><form:input id="applicationTrackCdOnHold" path="applicationTrackCdOnHold" type="number" class="form-control"/></td>
                            <td><form:input id="applicationTrackCdCompleted" path="applicationTrackCdCompleted" type="number" class="form-control"/></td>
                        </tr>
                        <tr>
                            <td>State Street</td>
                            <td><form:input id="applicationTrackStateStreetTotal" path="applicationTrackStateStreetTotal" type="number" class="form-control"/></td>
                            <td><form:input id="applicationTrackStateStreetInProgress" path="applicationTrackStateStreetInProgress" type="number" class="form-control"/></td>
                            <td><form:input id="applicationTrackStateStreetOnHold" path="applicationTrackStateStreetOnHold" type="number" class="form-control"/></td>
                            <td><form:input id="applicationTrackStateStreetCompleted" path="applicationTrackStateStreetCompleted" type="number" class="form-control"/></td>
                        </tr>
                        <tr>
                            <td>Shared Services</td>
                            <td><form:input id="applicationTrackSharedServicesTotal" path="applicationTrackSharedServicesTotal" type="number" class="form-control"/></td>
                            <td><form:input id="applicationTrackSharedServicesInProgress" path="applicationTrackSharedServicesInProgress" type="number" class="form-control"/></td>
                            <td><form:input id="applicationTrackSharedServicesOnHold" path="applicationTrackSharedServicesOnHold" type="number" class="form-control"/></td>
                            <td><form:input id="applicationTrackSharedServicesCompleted" path="applicationTrackSharedServicesCompleted" type="number" class="form-control"/></td>
                        </tr>
                        <tr>
                            <td>CitiConnect</td>
                            <td><form:input id="applicationTrackCitiConnectTotal" path="applicationTrackCitiConnectTotal" type="number" class="form-control"/></td>
                            <td><form:input id="applicationTrackCitiConnectInProgress" path="applicationTrackCitiConnectInProgress" type="number" class="form-control"/></td>
                            <td><form:input id="applicationTrackCitiConnectOnHold" path="applicationTrackCitiConnectOnHold" type="number" class="form-control"/></td>
                            <td><form:input id="applicationTrackCitiConnectCompleted" path="applicationTrackCitiConnectCompleted" type="number" class="form-control"/></td>
                        </tr> --%>
                        
                        
                        <c:forEach items="${testDesignSummary}" var="entry"  varStatus="i" begin="0"> 
	                   		<tr>
	                   			
	                   			<td><input id="applicationTrack${i.index+1}" name="applicationTrack${i.index+1}" value = "${entry.applicationTrackType}" type="text" class="form-control"/></td>
	                   			<td><input id="tdsTotal${i.index+1}" name="tdsTotal${i.index+1}" value = "${entry.total}" type="text" class="form-control" 
	                   						onchange="completionOfTestDesignSummary(this.name, this.value,${i.index+1}, 'testDesignSummaryTable')"/></td>
	                   			<td><input id="tdsInProgress${i.index+1}" name="tdsInProgress${i.index+1}" value = "${entry.inProgress}" type="text" class="form-control"/></td>
	                   			<td><input id="tdsOnHold${i.index+1}" name="tdsOnHold${i.index+1}" value = "${entry.onHold}" type="text" class="form-control"/></td>
	                   			<td><input id="tdsCompleted${i.index+1}" name="tdsCompleted${i.index+1}" value = "${entry.completed}" type="text" class="form-control" 
	                   						onchange="completionOfTestDesignSummary(this.name, this.value,${i.index+1}, 'testDesignSummaryTable')"/></td>
	                   			<td>
	                   				<%-- <input id="tdsCompletion${i.index+1}" name="tdsCompletion${i.index+1}" value = "${entry.completed / entry.total} "  type="text" class="form-control"/> --%>
	                   				<input id="tdsCompletion${i.index+1}" name="tdsCompletion${i.index+1}"class="form-control" readOnly = "true" value = "<fmt:formatNumber value="${entry.completed / entry.total}" minFractionDigits="2" maxFractionDigits="2"/>"/>
	                   			</td>
	                   			
	                   			<td><a href="deleteTestDesignSummaryById.html?tdsId=${entry.id}">Delete</a>
	                   			<td><input id="tdsId${i.index+1}" name="tdsId${i.index+1}" value = "${entry.id}" type="hidden" class="form-control"/></td>
	                   		</tr>
	                   	</c:forEach>

                    </tbody>

                </table>
				<input type="button" value="Add Test Design Summary" onclick="addMoreTestDesignSummaryRow('testDesignSummaryTable')"/>
            </div>
            <br>
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
                    <tbody>
                        <%-- <tr>
                            <td>CD</td>
                            <td><form:input id = "tedsAppTrackCdTotalScenario" path = "tedsAppTrackCdTotalScenario" type="number" class="form-control"/></td>
                            <td><form:input id = "tedsAppTrackCdTotalTestRuns" path = "tedsAppTrackCdTotalTestRuns" type="number" class="form-control"/></td>
                            <td><form:input id = "tedsAppTrackCdTotalRunPass" path = "tedsAppTrackCdTotalRunPass" type="number" class="form-control"/></td>
                            <td><form:input id = "tedsAppTrackCdTotalRunFailed" path = "tedsAppTrackCdTotalRunFailed" type="number" class="form-control"/></td>
                        </tr>
                        <tr>
                            <td>State Street</td>
                            <td><form:input id = "tedsAppTrackStateStreetTotalScenario" path = "tedsAppTrackStateStreetTotalScenario" type="number" class="form-control"/></td>
                            <td><form:input id = "tedsAppTrackStateStreetTotalTestRuns" path = "tedsAppTrackStateStreetTotalTestRuns" type="number" class="form-control"/></td>
                            <td><form:input id = "tedsAppTrackStateStreetTotalRunPass" path = "tedsAppTrackStateStreetTotalRunPass" type="number" class="form-control"/></td>
                            <td><form:input id = "tedsAppTrackStateStreetTotalRunFailed" path = "tedsAppTrackStateStreetTotalRunFailed" type="number" class="form-control"/></td>
                        </tr>
                        <tr>
                            <td>Shared Services</td>
                            <td><form:input id = "tedsAppTrackSharedServicesTotalScenario" path = "tedsAppTrackSharedServicesTotalScenario" type="number" class="form-control"/></td>
                            <td><form:input id = "tedsAppTrackSharedServicesTotalTestRuns" path = "tedsAppTrackSharedServicesTotalTestRuns" type="number" class="form-control"/></td>
                            <td><form:input id = "tedsAppTrackSharedServicesTotalRunPass" path = "tedsAppTrackSharedServicesTotalRunPass" type="number" class="form-control"/></td>
                            <td><form:input id = "tedsAppTrackSharedServicesTotalRunFailed" path = "tedsAppTrackSharedServicesTotalRunFailed" type="number" class="form-control"/></td>
                        </tr>
                        <tr>
                            <td>CitiConnect</td>
                            <td><form:input id = "tedsAppTrackCitiConnectTotalScenario" path = "tedsAppTrackCitiConnectTotalScenario" type="number" class="form-control"/></td>
                            <td><form:input id = "tedsAppTrackCitiConnectTotalTestRuns" path = "tedsAppTrackCitiConnectTotalTestRuns" type="number" class="form-control"/></td>
                            <td><form:input id = "tedsAppTrackCitiConnectTotalRunPass" path = "tedsAppTrackCitiConnectTotalRunPass" type="number" class="form-control"/></td>
                            <td><form:input id = "tedsAppTrackCitiConnectTotalRunFailed" path = "tedsAppTrackCitiConnectTotalRunFailed" type="number" class="form-control"/></td>
                        </tr>
                        <tr>
                            <td>E2E</td>
                            <td><form:input id = "tedsAppTrackE2ETotalScenario" path = "tedsAppTrackE2ETotalScenario" type="number" class="form-control"/></td>
                            <td><form:input id = "tedsAppTrackE2ETotalTestRuns" path = "tedsAppTrackE2ETotalTestRuns" type="number" class="form-control"/></td>
                            <td><form:input id = "tedsAppTrackE2ETotalRunPass" path = "tedsAppTrackE2ETotalRunPass" type="number" class="form-control"/></td>
                            <td><form:input id = "tedsAppTrackE2ETotalRunFailed" path = "tedsAppTrackE2ETotalRunFailed" type="number" class="form-control"/></td>
                        </tr> --%>
                        
                        
                        <c:forEach items="${testExecutionSummary}" var="entry"  varStatus="i" begin="0"> 
	                   		<tr>
	                   			
	                   			<td><input id="tesApplicationTrack${i.index+1}" name="tesApplicationTrack${i.index+1}" value = "${entry.applicationTrackType}" type="text" class="form-control"/></td>
	                   			<td><input id="totalScenario${i.index+1}" name="totalScenario${i.index+1}" value = "${entry.totatlScenario}" type="text" class="form-control"/></td>
	                   			<td><input id="totalTestRun${i.index+1}" name="totalTestRun${i.index+1}" value = "${entry.totalTestRun}" type="text" class="form-control" 
	                   						onchange="completionOfTestExecutionSummary(this.name, this.value,${i.index+1}, 'testExecutionSummaryTable')"/></td>
	                   			<td><input id="totalTestRunPass${i.index+1}" name="totalTestRunPass${i.index+1}" value = "${entry.totalTestPass}" type="text" class="form-control" 
	                   							onchange="completionOfTestExecutionSummary(this.name, this.value,${i.index+1}, 'testExecutionSummaryTable')"/></td>
	                   			<td><input id="totalTestRunFailed${i.index+1}" name="totalTestRunFailed${i.index+1}" value = "${entry.totalTestFailed}" type="text" class="form-control"/></td>
	                   			<td>
	                   				<input id="tesCompletion${i.index+1}" name="tesCompletion${i.index+1}" readOnly = "true" value = "<fmt:formatNumber value="${(entry.totalTestPass / entry.totalTestRun) * 100 }"  minFractionDigits="2" maxFractionDigits="2"/>" type="text" class="form-control"/>
	                   			</td>
	                   			
	                   			<td><a href="deleteTestExecutionSummaryById.html?tedId=${entry.id}">Delete</a>
	                   			<td><input id="tedId${i.index+1}" name="tedId${i.index+1}" value = "${entry.id}" type="hidden" class="form-control"/></td>
	                   		</tr>
	                   	</c:forEach>

                    </tbody>

                </table>
				<input type="button" value="Add Test Execution Summary" onclick="addMoreTestExecutionSummaryRow('testExecutionSummaryTable')"/>
            </div>
             <br>

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
                            <td><input id="openTotal" type="number" class="form-control" 
                            			value = "${userForm.firstRowOpen + userForm.secondRowOpen + userForm.thirdRowOpen+userForm.fourthRowOpen}"/></td>
                            <td><input id="closedTotal"  type="number" class="form-control"
                            			value = "${userForm.firstRowClosed + userForm.secondRowClosed + userForm.thirdRowClosed+userForm.fourthRowClosed}"/></td>
                            <td><input id="rejectedTotal"  type="number" class="form-control"
                            			value = "${userForm.firstRowRejected + userForm.secondRowRejected + userForm.thirdRowRejected + userForm.fourthRowRejected}"/></td>
                            <td><input id="defferedTotal"  type="number" class="form-control"
                            			value = "${userForm.firstRowDefered + userForm.secondRowDefered + userForm.thirdRowDefered + userForm.fourthRowDefered}"/></td>
                            <td><input id="reopenedTotal"  type="number" class="form-control"
                            			value = "${userForm.firstRowReOpned + userForm.secondRowReOpned + userForm.thirdRowReOpned + userForm.fourthRowReOpned}"/></td>
                        </tr>

                    </tbody>

                </table>

            </div> 
            
	            	<button id = "updateButton" name = "updateButton" class="btn btn-danger submitbtn" type="submit" 
	            		onclick="onSubmitRowCount('raidLogTable'); onSubmitRowCountTDS('testDesignSummaryTable'); onSubmitRowCountTED('testExecutionSummaryTable')">Update existing DSR</button>
				 	  <button class="btn btn-danger" type="button"
				 	  	onclick="location.href='deleteDailyStatusReport.html?objectId='+document.getElementById('id').value;">Delete</button> 
				 	 <button id = "submitButton" disabled = "true" class="btn btn-danger" type="submit"
				 	  	onclick="addAsNewRecord(); onSubmitRowCount('raidLogTable'); onSubmitRowCountTDS('testDesignSummaryTable'); onSubmitRowCountTED('testExecutionSummaryTable')">Submit today's DSR</button>
				 <br/>
				 <br/>
            </c:otherwise>
			</c:choose>
			<form:input id="id" path = "id" type="hidden"/>
			<form:input id="applicationTrackCdId" path = "applicationTrackCdId" type="hidden"/>
			<form:input id="applicationTrackStateStreetId" path = "applicationTrackStateStreetId" type="hidden"/>
			<form:input id="applicationTrackSharedServicesId" path = "applicationTrackSharedServicesId" type="hidden"/>
			<form:input id="applicationTrackCitiConnectId" path = "applicationTrackCitiConnectId" type="hidden"/>
			<form:input id="tedsAppTrackCdId" path = "tedsAppTrackCdId" type="hidden"/>
			<form:input id="tedsAppTrackStateStreetId" path = "tedsAppTrackStateStreetId" type="hidden"/>
			<form:input id="tedsAppTrackSharedServicesId" path = "tedsAppTrackSharedServicesId" type="hidden"/>
			<form:input id="tedsAppTrackCitiConnectId" path = "tedsAppTrackCitiConnectId" type="hidden"/>
			<form:input id="tedsAppTrackE2EId" path = "tedsAppTrackE2EId" type="hidden"/>
			<form:input id="firstRowId" path = "firstRowId" type="hidden"/>
			<form:input id="secondRowId" path = "secondRowId" type="hidden"/>
			<form:input id="thirdRowId" path = "thirdRowId" type="hidden"/>
			<form:input id="fourthRowId" path = "fourthRowId" type="hidden"/>
			<input type="hidden" id = "rowCount" name = "rowCount">
			<input type="hidden" id = "addAsANewRecord" name = "addAsANewRecord">
			
			<input type="hidden" id = "testDesignSummaryRowCount" name = "testDesignSummaryRowCount">
			<input type="hidden" id = "testExectuionSummaryRowCount" name = "testExectuionSummaryRowCount">
			
			
			<form:input id="baseReportDate" path="reportDate" type="hidden"/>
        </form:form>
    </div>
</body>
</html>
