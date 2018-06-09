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
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery-2.2.4.min.js"></script>
    <script src="js/custom.js"></script>
    <script src="js/Chart.bundle.js"></script>
	<script src="js/utils.js"></script>

	<script>
	var MONTHS = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'];
		var color = Chart.helpers.color;
		var barChartData = {
			labels: [${chartDataX}],
			datasets: [{
				label: '',
				backgroundColor: color(window.chartColors.red).alpha(0.5).rgbString(),
				borderColor: window.chartColors.red,
				borderWidth: 1,
				data: [${chartDataY}],
				backgroundColor: [
									"#f38b4a",
									"#56d798",
									"#ff8397",
									"#6970d5"
								]
			}]

		};
		
		var pieChartData = {
				labels: [${chartDataX}],
				datasets: [{
					label: '',
					backgroundColor: color(window.chartColors.red).alpha(0.5).rgbString(),
					borderColor: window.chartColors.red,
					borderWidth: 1,
					data: [${chartDataY}],
					backgroundColor: [
										"#f38b4a",
										"#56d798",
										"#ff8397",
										"#6970d5"
									]
				}]

			};

		window.onload = function() {
			var ctx = document.getElementById('barChartCanvas').getContext('2d');
			var pieChartDataCtx = document.getElementById('pieChartCanvas').getContext('2d');
			window.myBar = new Chart(ctx, {
				type: 'bar',
				data: barChartData,
				options: {
					responsive: true,
					legend: {
						position: 'bottom',
					},
					title: {
						display: true,
						text: 'Data in Bar Chart'
					}
				}
			});
			
			window.myBar = new Chart(pieChartDataCtx, {
				type: 'pie',
				data: pieChartData,
				options: {
					responsive: true,
					legend: {
						position: 'bottom',
					},
					title: {
						display: true,
						text: 'Data in Pie Chart'
					}
				}
			});

		};

		
	</script>

</head>
<style>
.GREEN
{
	background-color: green;
}
.RED
{
	background-color: red;
}
.AMBER
{
	background-color: orange;
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
.ONHOLD
{
	background-color: blue;
}
.canvas {
		-moz-user-select: none;
		-webkit-user-select: none;
		-ms-user-select: none;
	}

</style>
<body>
<form:form id="reportForm"  modelAttribute="reportForm" method="get" action="dailyStatusReport.html">

	    <div class="container" style="margin-bottom: 15px;">
	        <div class="col-lg-6 form-search ">
	            <h3 style="text-align: center;">Get Report by Date</h3>
	            <br/>
	            <center>
	            <table>
	            	<tr>
	            		<td> <form:input id = "searchDate" path = "searchDate" pattern="MM/dd/yyyy" type="date" class="form-control search-input" 
	            	style = " margin-bottom:1% "/></td>
	            		<td></td>
	            		<td> <button class="btn btn-danger buttons">Search</button></td>
	            		<td></td>
	            	</tr>
	            	<tr>
	            		<td colspan="4" align="center"><a href = "index.html">Back to the Home Page !!!</a></td>
	            	</tr>
	            
	            </table>
	         </center>
	            <c:choose>
			 	<c:when test="${not empty msg}">
					<div class="alert alert-${css} alert-dismissible" role="alert">
						<button type="button" class="close" data-dismiss="alert" 
		                                aria-label="Close">
							<span aria-hidden="true">×</span>
						</button>
					</div>
				</c:when>
			</c:choose>
	        </div>
			<center><strong>${msg}</strong><br/></center>
	    </div>
<c:choose>
	<c:when test="${false == false}">

		    <div class="container-fluid">
		            <div class="col-lg-12">
		               
		                <div class="col-lg-12">
		
		                    <div class="col-lg-4 order " style="">
			                    <div id="container"  style="width: 500px; height:500px;">
			                    	<canvas id="barChartCanvas"></canvas>
			                    </div>								
		                    </div>
		
		                    <div class="col-lg-1 order" style="">
		                    	
		                    </div>
		                    <div class="col-lg-2 order">
		                        <div id="container" style="width: 500px; height:500px;">
		                    		<canvas id="pieChartCanvas"></canvas>
		                    	</div>
		                    </div>
		
		                    <div class="col-lg-3 order">
		                        
		
		                    </div>
		
		
		                </div>
		            </div>
		
		            <div class="col-lg-12">
		                
		
		            </div>
		
		            <br>
		            
		    </div>
		</c:when>
	</c:choose>
</form:form>
</body>

</html>
