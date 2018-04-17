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

    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery-2.2.4.min.js"></script>
    <script src="js/custom.js"></script>

    <!--<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>-->
    <!--<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>-->
</head>

<body>
<form:form id="searchForm"  modelAttribute="searchForm" method="post" action="searchDailyStaturReport.html">
<c:choose>
	<c:when test="${empty dailyStatusReportNFTObject}">
	    <div class="container" style="margin-bottom: 100px;">
	        <div class="col-lg-6 form-search ">
	            <h3 style="text-align: center;">Get Data by Date</h3>
	            <br><br>
	            <form:input id = "searchDate" path = "searchDate" pattern="MM/dd/yyyy" type="date" class="form-control search-input"/>
	            <h2 class="button-h2" style="text-align: center;"> <button class="btn btn-danger buttons col-lg-2 col-md-2 col-sm-2">Search</button>
	                <button class="btn btn-primary buttons  edit col-lg-2 col-md-2 col-sm-2">Edit</button>
	            </h2>
	        </div>
	
	    </div>
	</c:when>
	
	<c:otherwise>

		    <div class="container-fluid">
		        
		
		            <div class="col-lg-12">
		                <table class="table">
		                    <thead>
		                        <tr>
		                            <th colspan="">Daily Status Report - NFT - 03/19/2018</th>
		                        </tr>
		
		                    </thead>
		
		
		                </table>
		
		                <!-- <table class="table col-lg-4">
		                    <thead class="">
		                        <th></th>
		                        <th>Start</th>
		                        <th>End</th>
		                        <th>%</th>
		
		                    </thead>
		                    <tbody>
		
		                    </tbody>
		                </table>-->
		                <div class="col-lg-12">
		
		                    <div class="col-lg-4 order " style="">
		                        <table class="table ">
		                            <thead class="">
		                                <th></th>
		                                <th>Start</th>
		                                <th>End</th>
		                                <th>%</th>
		
		                            </thead>
		                            <tbody>
		                                <tr>
		                                    <th>Planing Phase</th>
		                                    <td>${dailyStatusReportNFTObject.planingPhaseStart}</td>
		                                    <td>${dailyStatusReportNFTObject.planingPhaseEnd}</td>
		                                    <td style="background-color: green;color: #fff;">${dailyStatusReportNFTObject.planingPhasePercentage}</td>
		                                </tr>
		                                <tr>
		                                    <th>Test Design Phase</th>
		                                    <td>${dailyStatusReportNFTObject.testDesignPhaseStart}</td>
		                                    <td>${dailyStatusReportNFTObject.testDesignPhaseEnd}</td>
		                                    <td style="background-color: darkorange;">${dailyStatusReportNFTObject.testDesignPhasePercentage}</td>
		                                </tr>
		                                <tr>
		                                    <th>Execution Phase</th>
		                                    <td>${dailyStatusReportNFTObject.executionPhaseStart}</td>
		                                    <td>${dailyStatusReportNFTObject.executionPhaseEnd}</td>
		                                    <td style="background-color: darkorange;">${dailyStatusReportNFTObject.executionPhasePercentage}</td>
		                                </tr>
		                                <tr>
		                                    <th>Sign Off & Closure Phase</th>
		                                    <td>${dailyStatusReportNFTObject.signOffAndClosurePhaseStart}</td>
		                                    <td>${dailyStatusReportNFTObject.signOffAndClosurePhaseEnd}</td>
		                                    <td style="background-color: darkorange;">${dailyStatusReportNFTObject.signOffAndClosurePhasePercentage}</td>
		                                </tr>
		                                <tr>
		                                    <th>Release Date</th>
		                                    <td colspan="3" style="text-align: center;">${dailyStatusReportNFTObject.releaseDate}</td>
		
		                                </tr>
		                                <tr>
		                                    <th>Overall PT Completion Status</th>
		                                    <td colspan="2" style="text-align: center;background-color: darkorange;">${dailyStatusReportNFTObject.overAllPtCompletionStatus}</td>
		
		                                    <td>${dailyStatusReportNFTObject.overAllPtCompletionStatus}</td>
		                                </tr>
		                            </tbody>
		                        </table>
		
		                    </div>
		
		                    <div class="col-lg-1 order" style="">
		                    </div>
		                    <div class="col-lg-2 order">
		                        <table class="table table-bordered violet">
		                            <thead>
		                                <th class="violet" colspan="2">Track wise Status</th>
		                            </thead>
		                            <tbody>
		                                <tr>
		                                    <td>Track</td>
		                                    <td>${dailyStatusReportNFTObject.trackStatus}</td>
		                                </tr>
		                                <tr>
		                                    <td>City Connect</td>
		                                    <td>${dailyStatusReportNFTObject.cityConnect}</td>
		                                </tr>
		                                <tr>
		                                    <td>CD</td>
		                                    <td>${dailyStatusReportNFTObject.cd}</td>
		                                </tr>
		                                <tr>
		                                    <td>State Street</td>
		                                    <td>${dailyStatusReportNFTObject.stateStreet}</td>
		                                </tr>
		                                <tr>
		                                    <td>Shared Services</td>
		                                    <td>${dailyStatusReportNFTObject.sharedServices}</td>
		                                </tr>
		
		                            </tbody>
		                        </table>
		
		                    </div>
		
		                    <div class="col-lg-3 order">
		                        <table class="table">
		
		                            <tbody>
		                                <tr>
		                                    <th class="blue">Report Date</th>
		                                    <td>${dailyStatusReportNFTObject.reportDate}</td>
		                                </tr>
		                                <tr>
		                                    <th class="blue">Project / Release</th>
		                                    <td>${dailyStatusReportNFTObject.projectRelease}</td>
		                                </tr>
		                                <tr>
		                                    <th>LOB</th>
		                                    <td>${dailyStatusReportNFTObject.loB}</td>
		                                </tr>
		                                <tr>
		                                    <th>App Name</th>
		                                    <td>${dailyStatusReportNFTObject.appName}</td>
		                                </tr>
		                                <tr>
		                                    <th>SDP ID</th>
		                                    <td>${dailyStatusReportNFTObject.sdpId}</td>
		                                </tr>
		                                <tr>
		                                    <th>Code / Build Version in test env</th>
		                                    <td>${dailyStatusReportNFTObject.codeBuildVersionTestEnv}</td>
		                                </tr>
		
		                            </tbody>
		                        </table>
		
		                    </div>
		
		
		                </div>
		            </div>
		
		            <div class="col-lg-12">
		                <table class="table">
		                    <!-- <h4 style="text-align: center;background-color: #3399ff;color: #fff;padding: 13px;">Executive Summary </h4>-->
		                    <thead>
		
		                        <tr>
		                            <th colspan="4">Executive Summary </th>
		                        </tr>
		                    </thead>
		                    <thead>
		
		                        <th>High Level Status or Accomplishments</th>
		                        <th>Key Reasons for Non Green:</th>
		                        <th>Back to Green Plan</th>
		                        <th>Owner</th>
		
		                    </thead>
		                    <tbody>
		                        <tr>
		                            <td>
		                                ${dailyStatusReportNFTObject.highLevelStatusOrAccomplishments}
		                            </td>
		                            <td>
		                                ${dailyStatusReportNFTObject.keyReasonsForNonGreen}
		                            </td>
		                            <td>
		                                ${dailyStatusReportNFTObject.backToGreenPlan}
		                            </td>
		                            <td>
		                               ${dailyStatusReportNFTObject.owner}
		                            </td>
		
		                        </tr>
		
		                    </tbody>
		
		                </table>
		
		            </div>
		
		            <br>
		
		
		
		
		
		
		
		
		            <div class="col-lg-12">
		
		                <table class="table ">
		                    <thead>
		                        <!--<h4 style="text-align: center;background-color: #3399ff;color: #fff;padding: 13px;">RAID LOG(All open items including incidents,defects) </h4>-->
		                        <th colspan="14">RAID LOG(All open items including incidents,defects) </th>
		                    </thead>
		                    <thead>
		                        <th>
		                            Sno.
		                        </th>
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
		                        <th>Edit / Delete</th>
		                    </thead>
		                    <tbody>
		                        <tr>
		                        	<td>1</td>
		                            <td>${dailyStatusReportNFTObject.raidLog.type}</td>
		                            <td>${dailyStatusReportNFTObject.raidLog.impactedApp}</td>
		                            <td>${dailyStatusReportNFTObject.raidLog.description}</td>
		                            <td>${dailyStatusReportNFTObject.raidLog.status}</td>
		                            <td>${dailyStatusReportNFTObject.raidLog.portfolioManager}</td>
		                            <td class="violet">${dailyStatusReportNFTObject.raidLog.radiOwner}</td>
		                            <td>${dailyStatusReportNFTObject.raidLog.rag}</td>
		                            <td>${dailyStatusReportNFTObject.raidLog.dateLogged}</td>
		                            <td>${dailyStatusReportNFTObject.raidLog.targetClosureDate}</td>
		                            <td>${dailyStatusReportNFTObject.raidLog.age}</td>
		                            <td>${dailyStatusReportNFTObject.raidLog.mileStoneImpacted}</td>
		                            <td>${dailyStatusReportNFTObject.raidLog.raidBackToGreenPlan}</td>
		                            
		                            <td>Edit / Delete</td>
		
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
		                    	<c:forEach items="${dailyStatusReportNFTObject.testDesignSummaries}" var="entry">
		                    		<tr>
		                    			<td>${entry.applicationTrackType}</td>
		                    			<td>${entry.total}</td>		                    			
		                    			<td>${entry.inProgress}</td>
		                    			<td>${entry.onHold}</td>
		                    			<td>${entry.completed}</td>
		                    		</tr>
		                    	</c:forEach>
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
		                        <c:forEach items="${dailyStatusReportNFTObject.testExecutionSummaries}" var="entry">
		                    		<tr>
		                    			<td>${entry.applicationTrackType}</td>
		                    			<td>${entry.totatlScenario}</td>		                    			
		                    			<td>${entry.totalTestRun}</td>
		                    			<td>${entry.totalTestPass}</td>
		                    			<td>${entry.totalTestFailed}</td>
		                    		</tr>
		                    	</c:forEach>
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
		                        <c:forEach items="${dailyStatusReportNFTObject.testDefectSummaries}" var="entry">
		                    		<tr>
		                    			<td>${entry.severity}</td>
		                    			<td>${entry.opne}</td>
		                    			<td>${entry.closed}</td>		                    			
		                    			<td>${entry.rejected}</td>
		                    			<td>${entry.defered}</td>
		                    			<td>${entry.reOpened}</td>
		                    		</tr>
		                    	</c:forEach>
		                        <tr>
		                            <td>Total</td>
		                            
		                        </tr>
		                    </tbody>
		                </table>
		            </div>
		    </div>
		</c:otherwise>
	</c:choose>
</form:form>
</body>

</html>
