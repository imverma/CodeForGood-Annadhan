<?php

require "init.php";


$con=mysqli_connect($host,$user,$password,$db_name);

  
/*$sql="SELECT count(*) FROM verified_drives INNER JOIN active_drive_table ON verified_drives.Drive_id=active_drive_table.Drive_id;";

$result=mysql_query($sql);*/

//$fetchDrivers=mysql_query("SELECT count(*) FROM verified_drives INNER JOIN active_drive_table ON verified_drives.Drive_id=active_drive_table.Drive_id;");
$sql=mysqli_query($con,"SELECT * FROM verified_drives INNER JOIN active_drive_table ON verified_drives.Drive_id=active_drive_table.Drive_id;") or die("Problem with the query");


$countDrivers=mysqli_fetch_array($sql);
//$countDrivers = ($fetchDrivers);
echo $sql->num_rows;

//echo "my result <a href='data/" . $countDrivers['classtype'] . ".php'>My account</a>";


//mysqli_error($con);



if (mysqli_connect_errno())
  {
  echo "Failed to connect to MySQL: " . mysqli_connect_error();
  }

mysqli_close($con);

?>