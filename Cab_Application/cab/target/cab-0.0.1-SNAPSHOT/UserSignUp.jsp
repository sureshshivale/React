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
<form:form class="form-dashboard"  action="adduser" commandName="userdto">
<br/>
    <div class="col-sm-8 col-md-12 main">	   
	   <div id="page-wrapper">
		<div id="page-inner">
                                        
            <div class="row">
               <div class="col-md-13 col-sm-13">
                    <div class="panel panel-primary"  style="height:400px;width:900px;margin-left:210px">
                        <div class="panel-heading">
                            <center>User Signup</center>
                        </div>
						<br>
						<center>
						<table>
							<tbody>
								<tr>
									<td><b>User ID <font color="red">*</font></b></td>
									<td>&nbsp;</td>
									<td><b>:</b></td>
									<td>&nbsp;&nbsp;</td>
									<td><form:input path="userId"  placeholder="Your Associate Id " class="form-control input" /></td>
									</tr>
									<tr>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
									</tr>
									<tr>
									<td><b>User Name <font color="red">*</font></b></td>
									<td>&nbsp;</td>
									<td><b>:</b></td>
									<td>&nbsp;&nbsp;</td>
									<td><form:input path="userName" placeholder="Your Name" class="form-control input" /></td>
									</tr>
									<tr>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
									</tr>
									<tr>
									<td><b>User Contact Number <font color="red">*</font></b></td>
									<td>&nbsp;</td>
									<td><b>:</b></td>
									<td>&nbsp;&nbsp;</td>
									<td><form:input path="userPhone" placeholder="Your Contact Number " class="form-control input" /></td>
									</tr>
									<tr>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
									</tr>
									<tr>
									<td><b>User Email <font color="red">*</font></b></td>
									<td>&nbsp;</td>
									<td><b>:</b></td>
									<td>&nbsp;&nbsp;</td>
									<td><form:input path="userEmail" placeholder="Your Email " class="form-control input" /></td>
									</tr>
									<tr>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
									</tr>                                                                                                    
							   </tbody>	
				   </table>
				   
			<br/><br/><br>
			<input type="submit" value="Signup" class="btn btn-primary">
			<input type="reset" value="Cancel" class="btn btn-primary">
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
	</body>
</html>