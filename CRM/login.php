<?php
include('connection.php');

if(isset($_POST["utilisateur"]) and isset($_POST["motDePasse"])){
    Connection::ConnectDb();
    $bdd=Connection::getBDD();
    $utilisateur =$_POST["utilisateur"];
    $mdp = $_POST["motDePasse"];
    $query = $bdd->prepare("SELECT * FROM User WHERE username=?");
    $query->bindParam(1,$utilisateur);
    $query->execute();
    $data = $query->fetch();
    if($data[1]==(hash('sha512',$mdp))){
        //Token::Log();
        setcookie("try",false);
        setcookie("token",true,time()+60*15);
        $newURL="./listeVIP.php";
        header('Location: '.$newURL);
    }
    else{
        setcookie("try",true,time()+60*15);
        setcookie("token",false);
        $newURL="./index.php";
        header('Location: '.$newURL);
    }
}

