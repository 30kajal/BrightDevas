<?php

$medname=$_POST['username'];

$qua=$_POST['password'];
$mno=$_POST['m'];


$con=mysqli_connect('localhost','root');
mysqli_select_db($con,'db10');
$q="insert into db10(medname,qua,mno) values('$medname',$qua,$mno)";
mysqli_query($con,$q);

mysqli_close($con);
echo"<script>location.href='khatam.html'</script>";
?>