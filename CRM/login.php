<?php
include('connection.php');
if(isset($_POST["utilisateur"]) and isset($_POST["motDePasse"])){
    Connection::ConnectDb();
    $bdd=Connection::getBDD();
    $utilisateur =$_POST["utilisateur"];
    $mdp = $_POST["motDePasse"];
    $query = $bdd->prepare("SELECT * FROM user WHERE username=?");
    $query->bindParam(1,$utilisateur);
    $query->execute();
    $data = $query->fetch();
    if($data[1]==$mdp){
        echo "authentification réussi";
        $newURL="./listeVIP.php";
        header('Location: '.$newURL);
    }
    else{
        echo "mauvaise authentification";
    }
}