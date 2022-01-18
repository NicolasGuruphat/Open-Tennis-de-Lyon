<?php
include 'connection.php';
if(isset($_COOKIE["token"])){
    if($_COOKIE["token"]){
        echo "<a href=\"unlog.php\">Déconnexion</a>";
        Connection::ConnectDb();
        $bdd=Connection::getBDD();
        $query = $bdd->prepare('SELECT nom,prenom,idFiche FROM FicheVIP');
        $query->execute();
        while ($data = $query->fetch())  
        {
            $nom = $data['0'];
            $prenom= $data['1'];
            $id= $data['2'];
            echo "<br><div style=\"background-color:cyan;border: 1px solid black;display:inline-block\">
            <a href=\"./fiche.php?id=$id\">
            $prenom $nom</a></div><br>";
            
        }
        echo $data['0'];
    }
    else{
        header('Location:accessDenied.php');
    }
}else{
    header('Location:accessDenied.php');
}

