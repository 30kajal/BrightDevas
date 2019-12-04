<?php

$user=$_POST['username'];

$password=$_POST['password'];
$age=$_POST['age'];
$gender=$_POST['gender'];

$con=mysqli_connect('localhost','root');
mysqli_select_db($con,'db1');
$q="insert into db1(user,password,age,gender) values('$user','$password',$age,'$gender')";
mysqli_query($con,$q);

mysqli_close($con);
echo"<script>location.href='succ.html'</script>";
?>