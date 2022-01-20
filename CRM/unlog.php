<?php
setcookie("token",false,time()+60*15);
setcookie("try",false,time()+60*15);
header('Location: index.php');