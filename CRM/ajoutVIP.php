<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css" />
        <meta charset="utf-8" />
        <title>Ajout VIP</title>
    </head>
    <body>
        <?php
        include 'connection.php';
        
        if(!isset($_COOKIE["token"])){
            header('Location:accessDenied.php');
            if(!$_COOKIE["token"]){
                header('Location:accessDenied.php');
            }
        }
        if(isset($_POST["nom"]) and isset($_POST["prenom"]) and isset($_POST["typeVIP"]) and isset($_POST["evaluation"]) and isset($_POST["description"]) and isset($_POST["dateNaissance"]) and isset($_POST["nationalite"])and isset($_POST["classement"])){
            Connection::ConnectDb();
            $bdd=Connection::getBDD();
            $nom=$_POST['nom'];
			$prenom=$_POST['prenom'];
			$typeVIP=$_POST['typeVIP'];
            $nationalite=$_POST['nationalite'];
            $evaluation=$_POST['evaluation'];
            $description=$_POST['description'];
            $dateNaissance=$_POST['dateNaissance'];
            $classement=$_POST['classement'];
            if($typeVIP == "joueur"){
                
                $query = $bdd->prepare("INSERT INTO Joueur (nom,prenom, dateNaissance, nationalite, ATP) VALUES (?, ?, ?, ?, ?)");
                $data=array($nom,$prenom,$dateNaissance,$nationalite,$classement);
                echo"<p style=\"color:green\">Nouveau joueur ajouté</p>";
            }
            elseif($typeVIP == "autre"){
                $query = $bdd->prepare("INSERT INTO AutreVIP (nom,prenom, dateNaissance, nationalite) VALUES (?, ?, ?, ?)");
                $data=array($nom,$prenom,$dateNaissance,$nationalite);
                echo"<p style=\"color:green\">Nouveau VIP ajouté</p>";
                //requete =
            }
            /*$query = $bdd->prepare("INSERT INTO Interaction (idInteraction, titre, date, status, action, idFiche) VALUES (?, ?, ?, ?, ?, ?)");
            $data=array($id,0,$titre,$description,date("Y-m-d"));	
            $data=array(0,$titre, date("Y-m-d"),$status,$action,$id);*/
            $query->execute($data);
            
        }
    ?>    
        <form method='post' action="./ajoutVIP.php">
            <label for='nom'>Nom</label><br>
            <input type='text' id='nom' name='nom' required><br><br>

            <label for='prenom'>Prenom</label><br>
            <input type='text' id='prenom' name='prenom' required><br><br>

            <label for='dateNaissance'>Date de naissance</label><br>
            <input type='date' id='dateNaissance' name='dateNaissance' required><br><br>

            <label for='nationalite'>Nationalité</label><br>
            <input type='text' id='nationalite' name='nationalite' required><br><br>

            <p>Type de VIP</p>
            <div>
            <input type="radio" id="joueur" name="typeVIP" value="joueur"
                    checked>
            <label for="joueur">Joueur</label>
            </div>

            <div>
            <input type="radio" id="autreVIP" name="typeVIP" value="autre">
            <label for="autreVIP">Autre VIP</label>
            </div>

            <label for='classement'>Classement ATP (remplir si c'est un joueur)</label><br>
            <input type='number' id='classement' name='classement'><br><br>

            <label for='evaluation'>Évaluation (de 0 à 5)</label><br>
            <input type='number' id='evaluation' name='evaluation'><br><br>

            <label for='description'>Description</label><br>
            <input type='text' id='description' name='description'><br><br>
            <input type='submit' value='Valider'>
        </form>
    </body>
</html>


