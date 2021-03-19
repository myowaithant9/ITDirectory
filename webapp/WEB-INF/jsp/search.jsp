<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Manager Home</title>
       			<!-- Bootstrap Core CSS -->
			    <link href="css/bootstrap.min.css" rel="stylesheet">
			
			    <!-- MetisMenu CSS -->
			    <link href="css/metisMenu.min.css" rel="stylesheet">
			
			    <!-- DataTables CSS -->
			    <link href="css/dataTables.bootstrap.css" rel="stylesheet">
			
			    <!-- DataTables Responsive CSS -->
			    <link href="css/dataTables.responsive.css" rel="stylesheet">
			
			    <!-- Custom CSS -->
			    <link href="css/sb-admin-2.css" rel="stylesheet">
        
    </head>
    <body>
     <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                
                		<a class="navbar-brand" href="list.do"><div id="bigfont">Laptops List</div></a>
            </div>
        </nav>
    	
    	<!-- <div align="center">
	        <h1>Laptops List</h1> -->
	        
	        <form:form action="search.do" modelAttribute="laptops" method="get" >
				 <div class="row">
				        <div class="col-lg-12">
				            <div class="panel panel-default">
				                
				                <!-- /.panel-heading -->
				                <div class="panel-body">
				                    <div class="dataTable_wrapper">
				                    <table>
				                    <tr>
				                      <th width="200">
				                       <select name="brand" class="form-control">
			                       	  	  <option value="Dell">Dell</option>
			                       	  	  <option value="Acer">Acer</option>
			                       	  	  <option value="Apple">Apple</option>
			                       	  	  <option value="ASUS">ASUS</option>
			                       	  	  <option value="HP">HP</option>
			                       	  	  <option value="Lenovo">Lenovo</option>
			                       	  	  <option value="Toshiba">Toshiba</option>
			                       	  	  <option value="HCL">HCL</option>
			                       	  	  <option value="Sony">Sony</option>
			                       	  	  <option value="Samsung">Samsung</option>
				                       </select>
				                     </th>
				                     <th width="200">
				                     	<select name="brandPriority" class="form-control">
				                     		<option value="first">First Priority</option>
			                       	  	  <option value="second">Second Priority</option>
			                       	  	  <option value="third">Third Priority</option>
				                     	</select>
				                     </th>
				                     
				                     <th width = "100"></th>
				                     
				                     <th width="200">
				                       <select name="ram"  class="form-control">
				                           <option value="4GB">4GB</option>
				                       	   <option value="2GB">2GB</option>
				                       	   <option value="3GB">3GB</option>
				                       	   <!-- <option value="4GB">4GB</option> -->
				                       	   <option value="8GB">8GB</option>
				                       </select>
				                     </th>
				                     <th width="200">
				                     	<select name="brandPriority" class="form-control">
				                     		<option value="first">First Priority</option>
			                       	  	  <option value="second">Second Priority</option>
			                       	  	  <option value="third">Third Priority</option>
				                     	</select>
				                     </th>
				                     
				                     <th width = "100"></th>
				                     
				                     <th width="200">
				                       <select name="hdd"  class="form-control">
				                   	       <option value="500GB">500GB</option>
				                       	   <option value="128GB">128GB</option>
				                       	   <option value="512GB">512GB</option>
				                       	   <option value="1TB">1TB</option>
				                       </select>
				                      </th>
				                      <th width="200">
				                     	<select name="brandPriority" class="form-control">
				                     		<option value="first">First Priority</option>
			                       	  	  <option value="second">Second Priority</option>
			                       	  	  <option value="third">Third Priority</option>
				                     	</select>
				                     </th>
				                     
				                      <th width = "100"></th>
				                      
				                      <th>
				                      <button type="submit" class="btn btn-default">Search</button>
				                      </th>
				                      </tr>
				                      </table>
								        <table class="table table-striped table-bordered table-hover" id="dataTables-example">
								        <tr>
								       		<th>No</th>
								        	<th>Brand</th>
								        	<th>Model</th>
								        	<th>Processor</th>
								        	<th>RAM</th>
								        	<th>HDD</th>
								        	<th>Price</th>
								        	<th>Rating</th>
								        	</tr>
										 	<c:forEach var="laptops" items="${laptops.laptopsList}" varStatus="status">
								        	<tr>
								        		<td>${status.index + 1}</td>
												<td>${laptops.brand}</td>
												<td>${laptops.model}</td>
												<td>${laptops.processor}</td>
												<td>${laptops.ram}</td>
												<td>${laptops.hdd}</td>
												<td>${laptops.price}</td>
												<td>${laptops.rating}</td>
												<%-- <td>
													<a href="editContact.do?id=${laptops.id}">Edit</a>
													&nbsp;&nbsp;&nbsp;&nbsp;
													<a href="deleteContact.do?id=${laptops.id}">Delete</a>
												</td> --%>
														
								        	</tr>
											</c:forEach>	         	
										</table>
									  </div>
				                   </div>
				                   <!-- /.panel-body -->
				               </div>
				               <!-- /.panel -->
				           </div>
				           <!-- /.col-lg-12 -->
				       </div>
				</form:form>
    	
		  <!-- search.do?brand=${brand} -->
    	
    </body>
</html>
