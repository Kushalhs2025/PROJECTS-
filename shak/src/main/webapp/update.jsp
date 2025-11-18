<html>
	<head></head>
	<body> 
		<div style="text-align:center">
			<h1>Crud Operation using JSP and Mysql ( Without API )</h1>
				
			</div>
		<div style="padding-left : 30px">
			<h2>Add Student</h2>
			<form action="updStu">
			Student Id:<input type="text" name="sid" value=${student.sid}><br>
			Student Name:<input type="text" name="sname" value=${student.sname}><br>
			Branch:<input type="text" name="branch" value=${student.branch}><br>
			College:<input type="text" name="college" value=${student.college}><br>
			<input type="submit"/>
			</form>
			
		</div>
	</body>	 
		
	
		
</html>