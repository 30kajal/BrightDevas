<?php
$m=$_POST['username'];
$n=$_POST['password'];
$con=mysqli_connect('localhost','root');
mysqli_select_db($con,'db1');
$q="select *from db1 ";
$result=mysqli_query($con,$q);
$num=mysqli_num_rows($result);
for($i=1;$i<=$num;$i++){
    $row=mysqli_fetch_array($result);
    $s=$row['user'];
    $t=$row['password'];
   if($m==$s&&$n==$t)
{  echo"<script>location.href='welcome.html'</script>";
    exit();
}
}
echo"<script>location.href='wrong.html'</script>";

mysqli_close($con);

?>