<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
		<title>Cab Application</title>
		<meta name="generator" content="Bootply" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link href="css/styles.css" rel="stylesheet">
	</head>
	<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container-fluid">
        <div class="navbar-header">
            <p class="navbar-text">Enterprise Project Cab</p>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="Home.jsp">Dashboard</a></li>
			<li><a href="booking.htm">Booking</a></li>
            <li><a href="setting.htm">Settings</a></li>
            <li><a href="#">Help</a></li>
            <li><a href="logout">Logout</a></li>
          </ul>
         </div>
      </div>
</nav>
<form:form class="form-dashboard" commandName="cabroutedto" action="bookcab">
<%
String name="";
String userid="";
if(session.getAttribute("username")!=null){
	name=(String)session.getAttribute("username"); 
if(session.getAttribute("userid")!=null)
	userid=(String)session.getAttribute("userid"); 
%>
<font style="text-align: center;"><%="Welcome "+name%></font>
<%} %>
<br/>
    <div class="col-sm-8 col-md-12 main">	   
	   <div id="page-wrapper">
		<div id="page-inner">
                                        
            <div class="row">
               <div class="col-md-13 col-sm-13">
                    <div class="panel panel-primary"  style="height:450px;width:900px;margin-left:210px">
                        <div class="panel-heading">
                            <center>BOOK CAB</center>
                        </div>
						<br>
						<center>
						<table>
							
							<tbody>
								<tr>
								<td><label for="empid">Cab Direction</label><font color="red">*</font></td>
								<td>&nbsp;</td>
								<td><b>:</b></td>
								<td>&nbsp;&nbsp;</td>
								<td>
								<form:select class="form-control input" id="direction" path="" onchange="fillstates()">
									<form:option value="" label="--select--" />
                      				<form:options items="${directionset}" />
								</form:select>
								</td>
								</tr>
								<tr>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
								<tr>
								<td><label for="empid">Cab Route</label><font color="red">*</font></td>
								<td>&nbsp;</td>
								<td><b>:</b></td>
								<td>&nbsp;&nbsp;</td>
								<td>
								<select class="form-control input" id="route" name="route">
								</select>
								</td>
								</tr>
								<tr>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
								<tr>
										<td><b>CAB Time<font color="red">*</font></b></td>
										<td>&nbsp;</td>
								<td><b>:</b></td>
								<td>&nbsp;&nbsp;</td>
										<td>
										<form:select class="form-control input" path="" name="time">
											
		                      				<form:options items="${timeset}" />
										</form:select>
										</td>
										</tr>  
								<tr>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
								</tr>
								<tr>
								<td><label for="cno">Associate Id</label><font color="red">*</font></td>
									<td>&nbsp;</td>
									<td><b>:</b></td>
									<td>&nbsp;&nbsp;</td>
								<td><input type="text" class="form-control input" disabled="disabled" name="userid" placeholder="Your Associate Id" value=<%=userid %>></td>
								
								</tr>						   
							</tbody>
							
						</table>
				   
			<br/><br/><br>
			<input type="submit" value="Book" class="btn btn-primary">
			<input type="reset" value="Cancel" class="btn btn-primary"onclick="window.location.href='Home.jsp'"><br/><br/>
			 <% 
				String str1="";
				if(session.getAttribute("str")!=null){
					str1=(String)session.getAttribute("str"); 
				%>
				<font color="red"><span><%=str1%></span></font>
				<%}
				session.removeAttribute("str");
				%>   
            </center>    
            
       </div><!-- col-->
                   
          
    </div><!-- row-->
		  
		  
		  </div> <!-- page inner-->
		  
          </div><!-- page wraper-->
	</div><!-- main-->

</form:form>
<hr>
<footer>
  <p class="text-center">©2014 Cognizant Technology Solutions</p>
</footer>
        
	<!-- script references -->
		<script src="js/jquery-1.10.2.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/scripts.js"></script>
		<script type="text/javascript">
		$(document).ready(function(){
			
			$( "" ).prop( "disabled", true );
		});
		   function fillstates() {
		     var val = $('#direction').val();
		     
		     $.ajax({
		       url : 'getroute',
		       method : 'get',
		       ContentType : 'json',
		       data : {
		    	   direction : val
		       },
		       success : function(response) {
		    	   
		         var options = '';
		         if (response != null) {
		           $(response).each(function(index, value) {
		 
		             options = options + '<option>' + value + '</option>';
		             
		           });
		           $('#route').html(options);
		         }
		       }
		     });
		   }
	 </script>
	</body>
</html>