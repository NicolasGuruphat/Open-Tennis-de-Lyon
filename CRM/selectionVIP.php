<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css" />
        <meta charset="utf-8" />
        <title>Selection VIP</title>
    </head>
    <body>
        <?php
        include 'connection.php';
        if(isset($_COOKIE["token"])){
            if($_COOKIE["token"]){
                if(isset($_POST["VIPListe"])){
                    Connection::ConnectDb();
                    $bdd=Connection::getBDD();
                    $VIPListe = $_POST["VIPListe"];
                    foreach($VIPListe as $VIP){
                        
                        //if arbitre :
                        $query = $bdd->prepare("INSERT INTO ListeVIP (idArbitre) VALUES (?)");
                        $data=array($VIP);
                        $query->execute($data);

                        //Ajouter la query
                    }
                   
                }
                echo "<a href=\"unlog.php\" id=\"deconnexion\">Déconnexion</a></br>
                    <a href=listeVIP.php>Retour liste</a>
                    <form method='post' action=\"./selectionVIP.php\">
                    <input type='submit' value='Valider la sélection'>
                    <h2>ARBITRES</h2></br>";
                
                Connection::ConnectDb();
                $bdd=Connection::getBDD();
                $query = $bdd->prepare('SELECT * from Arbitre where idArbitre not in (select idArbitre from ListeVIP where idArbitre is not null)');
                $query->execute();
                
                while($data=$query->fetch()){
                    echo
                    "<label>
                    
                    <input type=\"checkbox\"  name=\"VIPListe[]\" id=$data[0] value=$data[0]>
                    <span>$data[1] $data[2]</span>
                    </label>
                    </br>
                    ";
                   
                }
                
                echo "</form>";
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


