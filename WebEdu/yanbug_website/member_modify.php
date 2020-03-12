<?php
if (!isset($con)) {
	include $_SERVER['DOCUMENT_ROOT'] . "/yanbug/common/lib/db_connector.php";
}
$id = $_GET["id"];

$pass = $_POST["pass"];
$name = $_POST["name"];
$email1  = $_POST["email1"];

$email = $email1;

$sql = "update members set pass='$pass', name='$name' , email='$email'";
$sql .= " where id='$id'";

$result = mysqli_query($con, $sql);
$sqlForModifyName = "select * from members where id='$userid'";
$resultForSession = mysqli_query($con, $sqlForModifyName);
$row = mysqli_fetch_array($resultForSession);
session_start();
$_SESSION["userid"] = $row["id"];
$_SESSION["username"] = $row["name"];
$_SESSION["userlevel"] = $row["level"];
$_SESSION["userpoint"] = $row["point"];

mysqli_close($con);

echo "
	      <script>
	          location.href = 'index.php';
	      </script>
	  ";
