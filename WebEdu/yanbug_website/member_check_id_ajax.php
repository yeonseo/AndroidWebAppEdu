<?php
if (!isset($con)) {
   include $_SERVER['DOCUMENT_ROOT'] . "/yanbug/common/lib/db_connector.php";
}

$id = $_GET["id"];

//팀원이 만들어서 주고(체크 후,) 팀장이 디비에 이상이 없을지 확인한 후에 합쳐주기
$sql = "select * from members where id='$id'";
$result = mysqli_query($con, $sql);

$num_record = mysqli_num_rows($result);

if ($num_record) {
   echo "ID_overlap";
} else {
   echo "ID_possible";
}

mysqli_close($con);
