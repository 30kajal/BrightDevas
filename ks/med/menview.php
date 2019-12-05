<?php
$m=$_POST['name'];

$con=mysqli_connect('localhost','root');
mysqli_select_db($con,'db9');
$q="select *from db9 ";
$result=mysqli_query($con,$q);
$num=mysqli_num_rows($result);
for($i=1;$i<=$num;$i++){
    $row=mysqli_fetch_array($result);
    $s=$row['med'];
    
   if($m==$s)
{  echo"<script>location.href='welcome.html'</script>";
    exit();
}
}
echo"<script>location.href='wrong.html'</script>";

mysqli_close($con);

?>