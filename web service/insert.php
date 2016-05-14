<?PHP
if(isset($_POST['txtName']) && isset($_POST['txtTel'])){
	$con=mysqli_connect("localhost","root","","norton2");
	$txtName = $_POST['txtName'];
	$txtTel = $_POST['txtTel'];
	$txtMajor = $_POST['txtMajor'];
	$result=mysqli_query($con,"insert into tbl_student(st_name, st_tel, st_major) values('$txtName', '$txtTel', '$txtMajor')");
	if($result){echo "Data Inserted";}
	else{echo "not Inserted";}
	
}
?>

<html>
<head>
<title>Insert Data</title>
</head>
<body>
<h1>Insert Data</h1>
	<form action="<?PHP $_PHP_SELF ?>" method="post">
		Student Name <input type="text" name="txtName" placeholder="Student Name" /> <br/> <br/>
		Tel <input type="text" name="txtTel" placeholder="Tel" /> <br/> <br/>
		Major <input type="text" name="txtMajor" placeholder="Major" /> <br/> <br/>
		<input type="submit" value="Insert" /> <br/>
	</form>
</body>
</html>	