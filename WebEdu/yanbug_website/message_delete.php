<meta charset='utf-8'>

<?php
if (!isset($con)) {
	include $_SERVER['DOCUMENT_ROOT'] . "/yanbug/common/lib/db_connector.php";
}

$num = $_GET["num"];

$mode = $_GET["mode"];


$sql = "delete from message where num=$num";

mysqli_query($con, $sql);

mysqli_close($con);                // DB 연결 끊기

if ($mode == "send") {
	$url = "message_box.php?mode=send";
} else {
	$url = "message_box.php?mode=rv";
}

echo "

	<script>

		location.href = '$url';
	</script>

	";

?>