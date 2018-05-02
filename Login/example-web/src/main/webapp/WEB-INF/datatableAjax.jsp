<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title></title>
<jsp:include page="header.jsp"></jsp:include>
<script src="resources/datatable/js/jquery.dataTables.js"></script>
<link href="resources/datatable/css/jquery.dataTables_themeroller.css"
	rel="stylesheet">
</head>
<body>
	<table>

		<tr>
			<td valign="top"><jsp:include page="menu.jsp"></jsp:include></td>
			<td>
				<table>
					<tr>
						<td><table id="example" class="display" cellspacing="0"
								width="100%">
								<thead>
									<tr>
										<th>ID</th>
										<th>Name</th>
										<th>Age</th>
										<th>Job</th>										
									</tr>
								</thead>
							
							</table> <script>
							$(document).ready(function() {
							    $('#example').dataTable( {
							    	"bJQueryUI": true,
							        "ajax": "TableContentServlet?get=true",
							        
							        "columns": [
							            { "data": "id" },
							            { "data": "name" },
							            { "data": "age" },
							            { "data": "job" }							           
							        ]
							    } );
							} );
							</script></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>


</body>
</html>
