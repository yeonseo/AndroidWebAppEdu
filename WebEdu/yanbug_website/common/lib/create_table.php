<?php
include $_SERVER['DOCUMENT_ROOT'] . "/yanbug/common/lib/db_connector.php";
include $_SERVER['DOCUMENT_ROOT'] . "/yanbug/common/lib/create_table_base.php";
create_table($con, 'members');
create_table($con, 'message');
create_table($con, 'board');
