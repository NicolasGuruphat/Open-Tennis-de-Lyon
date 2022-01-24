<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css" />
        <meta charset="utf-8" />
        <title>Liste VIP</title>
    </head>
    <body>
        <?php
        include 'connection.php';
        if(isset($_COOKIE["token"])){
            if($_COOKIE["token"]){
                echo "<a href=\"unlog.php\" id=\"deconnexion\">Déconnexion</a></br>";
                echo "<a href=\"ajoutVIP.php\">Ajouter un VIP à partir de 0</a></br>";
                echo "<a href=\"selectionVIP.php\">Ajouter un VIP à partir d'une personne déjà enregistrée</a>";
                echo "<h3>Système de priorité : 0 à 5 avec 0 le moins prioritaire et 5 le plus prioritaire</h3>";
                Connection::ConnectDb();
                $bdd=Connection::getBDD();
                $query = $bdd->prepare('SELECT * from ListeVIP');
                $query->execute();
                while($data=$query->fetch()){
                    if($data[1] != null){
                        $secondQuery = $bdd->prepare("SELECT nom,prenom,ListeVIP.idFiche, notation from ListeVIP join Joueur where Joueur.idJoueur=$data[1]");
                        $typeVIP= "Joueur";
                    }
                    else if($data[2] != null){
                        $secondQuery = $bdd->prepare("SELECT nom,prenom,ListeVIP.idFiche, notation from ListeVIP join Arbitre where Arbitre.idArbitre=$data[2]");               
                        $typeVIP= "Arbitre";
                    }
                    else if($data[3] != null){
                        $secondQuery = $bdd->prepare("SELECT nom,prenom,ListeVIP.idFiche, notation from ListeVIP join RamasseurDeBalle where RamasseurDeBalle.idRamasseur=$data[3]");               
                        $typeVIP= "Ramasseur de balles";
                    }
                    else if ($data[4]!= null){
                        $secondQuery = $bdd->prepare("SELECT nom,prenom,ListeVIP.idFiche, notation from ListeVIP join AutreVIP where AutreVIP.idAutreVIP=$data[0]");               
                        $typeVIP= "Autre VIP";
                    }
                    else{
                        echo "problème dans la table FicheVIP";
                    }
                    $secondQuery->execute();
                    $data2=$secondQuery->fetch();
                    $nom = $data2[0];
                    $prenom= $data2[1];
                    $id=$data[0];
                    $notation=$data2[3];
                    echo "<br><div style=\"background-color:yellow;border: 1px solid black;display:inline-block\">
                    <a href=\"./fiche.php?id=$id\">
                    $prenom $nom - $typeVIP - $notation/5</a></div><br>";
                    
                }
            }
            else{
                header('Location:accessDenied.php');
            }
        }else{
            header('Location:accessDenied.php');
        }  
    ?>    
    </body>
</html>


