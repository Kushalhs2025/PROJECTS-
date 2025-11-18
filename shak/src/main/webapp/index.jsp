<html>
	<head></head>
	<body> 
		<div style="text-align:center">
			<h1>Crud Operation using JSP and Mysql ( Without API )</h1>
				
			</div>
		<div style="padding-left : 30px">
			<h2>Add Student</h2>
			<form action="addStu">
			Student Id:<input type="text" name="sid"/><br>
			Student Name:<input type="text" name="sname"/><br>
			Branch:<input type="text" name="branch"/><br>
			College:<input type="text" name="college"/><br>
			<input type="submit"/>
			</form>
			
			<h2>Get Student </h2>
			<form action="getStu">
			Student Id:<input type="text" name="sid"/><br>
			<input type="submit"/>
			</form>
			<h2>Delete Student </h2>
			<form action="delStu">
		    Student Id:<input type="text" name="sid"/><br>
		    <input type="submit"/>
			</form>
			<h2>Update Student </h2>
						<form action="updStu">
					    Student Id:<input type="text" name="sid"/><br>
					    <input type="submit"/>
						</form>
		</div>
	</body>	 
		
	
		
</html>