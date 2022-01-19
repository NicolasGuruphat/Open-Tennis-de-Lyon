<?php
include 'connection.php';
if(isset($_COOKIE["token"])){
    if($_COOKIE["token"]){
        echo "<a href=\"unlog.php\">Déconnexion</a>";
        Connection::ConnectDb();
        $bdd=Connection::getBDD();
        $query = $bdd->prepare('SELECT * from ListeVIP');
        $query->execute();
        while($data=$query->fetch()){
            if($data[1] != null){
                $secondQuery = $bdd->prepare("SELECT nom,prenom,ListeVIP.idFiche from ListeVIP join Joueur where ListeVIP.idFiche=$data[0]");
            }
            else if($data[2] != null){
                $secondQuery = $bdd->prepare("SELECT nom,prenom,ListeVIP.idFiche from ListeVIP join Arbitre where ListeVIP.idFiche=$data[0]");               
            }
            else if($data[3] != null){
                $secondQuery = $bdd->prepare("SELECT nom,prenom,ListeVIP.idFiche from ListeVIP join RamasseurDeBalle where ListeVIP.idFiche=$data[0]");               
            }
            else if ($data[4]!= null){
                $secondQuery = $bdd->prepare("SELECT nom,prenom,ListeVIP.idFiche from ListeVIP join AutreVIP where ListeVIP.idFiche=$data[0]");               
            }
            else{
                echo "problème dans la table FicheVIP";
            }
            $secondQuery->execute();
            $data2=$secondQuery->fetch();
            $nom = $data2[0];
            $prenom= $data2[1];
            $id=$data[0];
            echo "<br><div style=\"background-color:cyan;border: 1px solid black;display:inline-block\">
            <a href=\"./fiche.php?id=$id\">
            $prenom $nom</a></div><br>";
            
        }
    }
    else{
        header('Location:accessDenied.php');
    }
}else{
    header('Location:accessDenied.php');
}

