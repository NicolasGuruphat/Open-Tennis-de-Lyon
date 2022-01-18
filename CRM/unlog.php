<?php
setcookie("token",false,time()+60*5);
setcookie("try",false,time()+60*5);
header('Location: index.php');