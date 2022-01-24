<?php
setcookie("token",false,time()+60*30);
setcookie("try",false,time()+60*30);
header('Location: index.php');