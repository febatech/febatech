<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored = "false" %>
<%@ page session="false"%>
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
</head>

<body>
    <div class="container-fluid">
    <form:form id="inputForm"  modelAttribute="userForm" method="post" action="updateDelete.html">
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
                            <th colspan="">Daily Status Report - NFT - </th>
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
                            <td><form:input id = "firstRowSeverity" path = "firstRowSeverity" value="1" type="number" readonly="true" class="form-control"/></td>
                            <td><form:input id = "firstRowOpen" path = "firstRowOpen" type="number"  class="form-control"/></td>
                            <td><form:input id = "firstRowClosed" path = "firstRowClosed" type="number" class="form-control"/></td>
                            <td><form:input id = "firstRowRejected" path = "firstRowRejected" type="number" class="form-control"/></td>
                            <td><form:input id = "firstRowDefered" path = "firstRowDefered" type="number" class="form-control"/></td>
                            <td><form:input id = "firstRowReOpned" path = "firstRowReOpned" type="number" class="form-control"/></td>
                        </tr>
                        <tr>
                           <td><form:input id = "secondRowSeverity" path = "secondRowSeverity" type="number" value="2" readonly="true" class="form-control"/></td>
                            <td><form:input id = "secondRowOpen" path = "secondRowOpen" type="number" class="form-control"/></td>
                            <td><form:input id = "secondRowClosed" path = "secondRowClosed" type="number" class="form-control"/></td>
                            <td><form:input id = "secondRowRejected" path = "secondRowRejected" type="number" class="form-control"/></td>
                            <td><form:input id = "secondRowDefered" path = "secondRowDefered" type="number" class="form-control"/></td>
                            <td><form:input id = "secondRowReOpned" path = "secondRowReOpned" type="number" class="form-control"/></td>
                        </tr>
                        <tr>
                           <td><form:input id = "thirdRowSeverity" path = "thirdRowSeverity" type="number" value="3" readonly="true" class="form-control"/></td>
                            <td><form:input id = "thirdRowOpen" path = "thirdRowOpen" type="number" class="form-control"/></td>
                            <td><form:input id = "thirdRowClosed" path = "thirdRowClosed" type="number" class="form-control"/></td>
                            <td><form:input id = "thirdRowRejected" path = "thirdRowRejected" type="number" class="form-control"/></td>
                            <td><form:input id = "thirdRowDefered" path = "thirdRowDefered" type="number" class="form-control"/></td>
                            <td><form:input id = "thirdRowReOpned" path = "thirdRowReOpned" type="number" class="form-control"/></td>
                        </tr>
                        <tr>
                            <td><form:input id = "fourthRowSeverity" path = "fourthRowSeverity" type="number" value="4" readonly="true" class="form-control"/></td>
                            <td><form:input id = "fourthRowOpen" path = "fourthRowOpen" type="number" class="form-control"/></td>
                            <td><form:input id = "fourthRowClosed" path = "fourthRowClosed" type="number" class="form-control"/></td>
                            <td><form:input id = "fourthRowRejected" path = "fourthRowRejected" type="number" class="form-control"/></td>
                            <td><form:input id = "fourthRowDefered" path = "fourthRowDefered" type="number" class="form-control"/></td>
                            <td><form:input id = "fourthRowReOpned" path = "fourthRowReOpned" type="number" class="form-control"/></td>
                        </tr>

                        <tr>
                            <td>Total</td>
                            <td><input type="number" class="form-control"/></td>
                            <td><input type="number" class="form-control"/></td>
                            <td><input type="number" class="form-control"/></td>
                            <td><input type="number" class="form-control"/></td>
                            <td><input type="number" class="form-control"/></td>
                        </tr>

                    </tbody>

                </table>

            </div> 
            
	            <center>
	            	<button class="btn btn-danger submitbtn" type="submit">Update</button>
	             	  <%-- <button class="btn btn-primary" onclick="location.href='/updateDelete.html'">Update</button>--%>
				 	  <button class="btn btn-danger" type="button"
				 	  	onclick="location.href='deleteDailyStatusReport.html?objectId='+document.getElementById('id').value;">Delete</button> 
				 </center>
				 <br/>
				 <br/>
            </c:otherwise>
			</c:choose>
			<form:input id="id" path = "id" type="hidden"/>
        </form:form>
    </div>
</body>
</html>
