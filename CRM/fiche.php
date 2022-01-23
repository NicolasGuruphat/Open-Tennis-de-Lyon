<head>
        <meta charset="utf-8" />
        <title>Fiche VIP</title>
        <link href="style.css" rel="stylesheet" /> 
    </head>
        
<body>
	<a href="./index.php">
		<img src="./logo.jpg">
	</a>
	<h1>Open tennis - Fiche VIP</h1>
	
	<?php
	
	include('connection.php');
	if(isset($_COOKIE["token"])){
		if($_COOKIE["token"]){
			Connection::ConnectDb();
			$bdd=Connection::getBDD();
			
			if(isset($_GET['id']))
			{
				$id=$_GET['id'];
				
				$query = $bdd->prepare("SELECT * from ListeVIP where idFiche=$id");
        		$query->execute();
				$data=$query->fetch();
				if($data[1] != null){
					$secondQuery = $bdd->prepare("SELECT nom, prenom, dateNaissance, nationalite from ListeVIP join Joueur where Joueur.idJoueur=$id");
				}
				else if($data[2] != null){
					$secondQuery = $bdd->prepare("SELECT nom, prenom, dateNaissance, nationalite from ListeVIP join Arbitre where Arbitre.idArbitre=$id");  
				}
				else if($data[4] != null){
					$secondQuery = $bdd->prepare("SELECT nom, prenom, dateNaissance, nationalite from ListeVIP join RamasseurDeBalle where RamasseurDeBalle.idRamasseur=$id");           
				}
				else if ($data[5]!= null){
					$secondQuery = $bdd->prepare("SELECT nom, prenom, dateNaissance, nationalite from ListeVIP join AutreVIP where AutreVIP.idAutreVIP=$id");           
				}
				else{
					$secondQuery = $bdd->prepare("SELECT * from Joueur");
					echo "problème dans la table FicheVIP";
				}
				$secondQuery->execute();
				$data2=$secondQuery->fetch();
				echo "<div id=\"info\">";
				echo "Identifiant : ".$id;
				echo "</br>";
				echo "Nom : ".$data2['0'];
				echo "</br>";
				echo "Prénom : ".$data2['1'];
				echo "</br>";
				echo "Date de naissance : ".$data2['2'];	
				echo "</br>";
				echo "Nationalité : ".$data2['3'];
				echo "</div>";
				?>
	<div class='interaction'>
			<h2>Ajouter une interaction</h2>
			
			<form method='post' action="./fiche.php?id=<?=$_GET['id'];?>">
				<label for='titre'>TITRE</label><br>
				<input type='text' id='titre' name='titre' required><br><br>

				<label for='status'>STATUS</label><br>
				<input type='text' id='status' name='status' required><br><br>

				<label for='action'>ACTION</label><br>
				<input type='text' id='action' name='action' required size="100"><br><br>

				<input type='submit' value='Submit'>
			</form>
	</div>
	<div class="fiche">


				<?php
				if(isset($_POST['titre']) and isset($_POST['status']) and isset($_POST['action'])){
					$titre=$_POST['titre'];
					$status=$_POST['status'];
					$action=$_POST['action'];
					$query = $bdd->prepare("INSERT INTO Interaction (idInteraction, titre, date, status, action, idFiche) VALUES (?, ?, ?, ?, ?, ?)");
					//$data=array($id,0,$titre,$description,date("Y-m-d"));	
					$data=array(0,$titre, date("Y-m-d"),$status,$action,$id);
					$query->execute($data);
					$_POST = array();
					echo "<p style='color:green'>votre interaction a été ajoutée avec succès</p>";
				}


				$query = $bdd->prepare("SELECT * FROM Interaction where idFiche = $id");
				$query->execute();
				
				echo "</br><h2 style=\"text-align:center\">Interactions</h2>";
				while ($data = $query->fetch())  
				{
					echo "</br>";
					echo "<div id=\"interactionAjoute\">";
					$titre = $data['1'];
					$status = $data['3'];
					$date= $data['2'];
					$action = $data['4'];
					
					echo "titre : ".$titre;
					echo "</br>";
					echo "status : ".$status;
					echo "</br>";
					echo "date : ".$date;
					echo "</br>";
					echo "action : ".$action;
					echo "</br>";
					echo "</div>";
				}
			}
		}
		else{
				header('Location:accessDenied.php');
			}	
	}
	else{
		header('Location:accessDenied.php');
	}
	?>
	</div>
</body>