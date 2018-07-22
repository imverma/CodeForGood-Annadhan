<?php
<html>
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
$query = mysql_query("update fdt set
id='$id', password='$pass',
temp='$temp' where status='$status'", $connection);
}
$query = mysql_query("select * from fdt", $connection);
while ($row = mysql_fetch_array($query)) {
echo "<b><a href='updatephp.php?update={$row['id']}'>{$row['whene']}</a></b>";
echo "<br />";
}
?>

}
if (isset($_GET['submit'])) {
echo '<div class="form" id="form3"><br><br><br><br><br><br>
<Span>Data Updated Successfuly......!!</span></div>';
}
?>
<div class="clear"></div>
</div>
<div class="clear"></div>
</div>
</div><?php
mysql_close($connection);
?>
</body>
</html>
    
    
