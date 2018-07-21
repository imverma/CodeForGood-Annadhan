<?php

require "init.php";


$con=mysqli_connect($host,$user,$password,$db_name);

if(isset($_POST['No_of_people']))
{
	$No_of_people = $_POST['No_of_people'];

}

if(isset($_POST['When_cooked']))
{
	$When_cooked = $_POST['When_cooked'];

}

if(isset($_POST['Description']))
{
	$Description = $_POST['Description'];

}

if(isset($_POST['Packed_or_not']))
{
	$Packed_or_not = $_POST['Packed_or_not'];

}

if(isset($_POST['Temperature']))
{
	$Temperature = $_POST['Temperature'];

}

if(isset($_POST['Annadhan_id']))
{
	$Annadhan_id = $_POST['Annadhan_id'];
}



if(isset($_POST['Pickup_location']))
{
	$Pickup_location = $_POST['Pickup_location'];
}

if(isset($_POST['Status']))
{
	$Status = $_POST['Status'];
}

//$sql="insert into food_drive_table values('$No_of_people','$When_cooked','$Description','$Packed_or_not','$Temperature','$Annadhan_id','".$Pickup_location."','".$Status."');";

$sql="insert into fdt values('rg','rge','rge','ge','eg','rjhjkg','rg','rg');";

if(mysqli_query($con,$sql)){
    
    echo "insertion sucessful";

}
else{
    echo "Error in insertion";
}
mysqli_close($con);

?>