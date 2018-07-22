
<form method="post" action="updateinfo.php">
  id <input type="text" name="id" >
 no of people  <input type="password" name="password">
     when cooked <input type="text" name="when" >
     desc <input type="text" name="desc" >
     packed<input type="packed" name="pack" >
     temp<input type="text" name="temp" >
     pickup<input type="text" name="pick" >
     status <input type="text" name="status" >
    <input type="submit" name="submit">   
    
    <?php

$id = $_POST["id"];
$pass = $_POST["password"];
    $when = $_POST["when"];
    $desc = $_POST["desc"];
    $pack = $_POST["pack"];
    $temp = $_POST["temp"];
    $pick = $_POST["pick"];
    $status = $_POST["status"];
    

$user="root";
$password="";
$host="localhost";
$db_name="Annadhan";

$sql="insert into contact_info values('".$id."','".$pass."','".$when."','".$desc."','".$pack."','".$temp."','".$pick."','".$status."');";
if(mysqli_query($con,$sql)){
    
    echo "insertion sucessful";

}
else{
    echo "Error in insertion";
}
mysqli_close($con);

?>
</form>