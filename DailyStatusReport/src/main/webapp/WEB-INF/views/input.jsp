<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored = "false" %>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
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
</script>

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
</head>

<body>
    <div class="container-fluid">
    <form:form id="inputForm"  modelAttribute="userForm" method="post" action="submitDailyStatusReport.html">
    <c:choose>
	 	<c:when test="${not empty msg}">
			<div class="alert alert-${css} alert-dismissible" role="alert">
				<button type="button" class="close" data-dismiss="alert" 
                                aria-label="Close">
					<span aria-hidden="true">×</span>
				</button>
				<strong>${msg}</strong>
			</div>
		</c:when>
		<c:otherwise>
        <form action="" class="form-group">
            <div class="col-lg-12">
                <table class="table">
                    <thead>
                        <tr>
                            <th colspan="">Daily Status Report - NFT - 03/19/2018</th>
                        </tr>
                    </thead>
                </table>

                <div class="col-lg-12">
                    <div class="col-lg-4 order">
                        <table class="table ">
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
                                    <td style="background-color: green;color: #fff;">
                                    	<form:input id="planingPhasePercentage" path="planingPhasePercentage" type="number" style="width:70px" class="form-control"/>
                                    </td>
                                </tr>
                                <tr>
                                    <th>Test Design Phase</th>
                                    <td><form:input id="testDesignPhaseStart" path="testDesignPhaseStart" type="date" style="width:173px" class="form-control"/></td>
                                    <td><form:input id="testDesignPhaseEnd" path="testDesignPhaseEnd" type="date" style="width:173px" class="form-control"/></td>
                                    <td style="background-color: darkorange;">
                                    	<form:input id="testDesignPhasePercentage" path="testDesignPhasePercentage" type="number" style="width:70px" class="form-control"/>
                                    </td>
                                </tr>
                                <tr>
                                    <th>Execution Phase</th>
                                    <td><form:input id="executionPhaseStart" path="executionPhaseStart" type="date" style="width:173px" class="form-control"/></td>
                                    <td><form:input id="executionPhaseEnd" path="executionPhaseEnd" type="date" style="width:173px" class="form-control"/></td>
                                    <td style="background-color: darkorange;">
                                    	<form:input id="executionPhasePercentage" path="executionPhasePercentage" type="number" style="width:70px" class="form-control"/>
                                    </td>
                                </tr>
                                <tr>
                                    <th>Sign Off & Closure Phase</th>
                                    <td><form:input id="signOffAndClosurePhaseStart" path="signOffAndClosurePhaseStart" type="date" style="width:173px" class="form-control"/></td>
                                    <td><form:input id="signOffAndClosurePhaseEnd" path="signOffAndClosurePhaseEnd" type="date" style="width:173px" class="form-control"/></td>
                                    <td style="background-color: darkorange;">
                                    	<form:input id="signOffAndClosurePhasePercentage" path="signOffAndClosurePhasePercentage" type="number" style="width:70px" class="form-control"/>
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
                                    <td colspan="2" style="text-align: center;background-color: darkorange;">
	                                    
							            <form:select path="overAllPtCompletionStatus" class="form-control">
											<form:option value="NONE" label="--- Select ---" />
											<form:options items="${trackWiseStausDropDownList}" />
										</form:select>
						            </td>
                                    <td><input type="number" class="form-control"/></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="col-lg-2 order">
                    </div>
                    <div class="col-lg-3 order">
                        <table class="table table-bordered violet">
                            <thead>
                                <th class="violet" colspan="2">Track wise Status</th>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>Track</td>
                                    <td>
                                    	<form:select path="trackStatus" class="form-control">
											<form:option value="NONE" label="--- Select ---" />
											<form:options items="${trackWiseStausDropDownList}" />
										</form:select>
            						</td>
                                </tr>
                                <tr>
                                    <td>City Connect</td>
                                    <td>
                                        <form:select path="cityConnect" class="form-control">
											<form:option value="NONE" label="--- Select ---" />
											<form:options items="${trackWiseStausDropDownList}" />
										</form:select>
									</td>
                                </tr>
                                <tr>
                                    <td>CD</td>
                                    <td> 
                                    	<form:select path="cd" class="form-control">
											<form:option value="NONE" label="--- Select ---" />
											<form:options items="${trackWiseStausDropDownList}" />
										</form:select>
									</td>
                                </tr>
                                <tr>
                                    <td>State Street</td>
                                    <td> 
                                    	<form:select path="stateStreet" class="form-control">
											<form:option value="NONE" label="--- Select ---" />
											<form:options items="${trackWiseStausDropDownList}" />
										</form:select>
									</td>
                                </tr>
                                <tr>
                                    <td>Shared Services</td>
                                    <td> 
										<form:select path="sharedServices" class="form-control">
											<form:option value="NONE" label="--- Select ---" />
											<form:options items="${trackWiseStausDropDownList}" />
										</form:select>
									</td>
                                </tr>

                            </tbody>
                        </table>

                    </div>

                    <div class="col-lg-3 order">
                        <table class="table">

                            <tbody>
                                <tr>
                                    <th class="blue">Report Date</th>
                                    <td><form:input id="reportDate" path="reportDate" type="date" class="form-control"/></td>
                                </tr>
                                <tr>
                                    <th class="blue">Project / Release</th>
                                    <td><form:input id="projectRelease" path="projectRelease" type="text" class="form-control"/></td>
                                </tr>
                                <tr>
                                    <th>LOB</th>
                                    <td><form:input id="loB" path="loB" type="text" class="form-control"/></td>
                                </tr>
                                <tr>
                                    <th>App Name</th>
                                    <td><form:input id="appName" path="appName" type="text" class="form-control"/></td>
                                </tr>
                                <tr>
                                    <th>SDP ID</th>
                                    <td><form:input id="sdpId" path="sdpId" type="number" class="form-control"/></td>
                                </tr>
                                <tr>
                                    <th>Code / Build Version in test env</th>
                                    <td><form:input id="codeBuildVersionTestEnv" path="codeBuildVersionTestEnv" type="number" class="form-control"/></td>
                                </tr>

                            </tbody>
                        </table>

                    </div>


                </div>
            </div>
            <br/>
            <div >
                <table class="table">
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

                <table class="table ">
                    <thead>
                        <!--<h4 style="text-align: center;background-color: #3399ff;color: #fff;padding: 13px;">RAID LOG(All open items including incidents,defects) </h4>-->
                        <th colspan="14">RAID LOG(All open items including incidents,defects) </th>
                    </thead>
                    <thead>

                        <th>Type</th>
                        <th>Impacted App</th>
                        <th class="description">Description</th>
                        <th>Status</th>
                        <th class="violet">Portfolio manager</th>
                        <th>Owner</th>
                        <th>RAG</th>
                        <th>Date Logged</th>
                        <th>Target Closure Dt.</th>
                        <th>Age</th>
                        <th>Mile Stone Impacted</th>
                        <th>Back to Green Plan</th>

                    </thead>
                    <tbody>
                        <tr>
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


                        </tr>

                    </tbody>

                </table>
            </div>

            <br>

            <div class="col-lg-12">
                <table class="table">

                    <thead>
                        <tr>
                            <th colspan="6">Test Design Summary</th>
                        </tr>
                        <tr>
                            <th>Application/Track</th>>
                            <th># Total</th>
                            <th># In Progress</th>
                            <th># On Hold</th>
                            <th># Completed</th>
                        </tr>

                    </thead>
                    <tbody>
                        <tr>
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
                        </tr>

                    </tbody>

                </table>

            </div>
            <br>
            <div class="col-lg-12">
                <table class="table">

                    <thead>
                        <tr>
                            <th colspan="6">Test Execution Summary</th>
                        </tr>
                        <tr>
                            <th>Application/Track</th>>
                            <th>Total # Scenario</th>
                            <th>Total # Test Runs</th>
                            <th># Test runs Passes</th>
                            <th># Test runs Failed</th>
                        </tr>

                    </thead>
                    <tbody>
                        <tr>
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
                        </tr>

                    </tbody>

                </table>

            </div>
            <br>

            <div class="col-lg-12">
                <table class="table">

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
        </form:form>
    </div>
</body>
</html>
