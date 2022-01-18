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
	<div class='interaction'>
			<h2>Ajouter une interaction</h2>
			
			<form method='post' action="./fiche.php?id=<?=$_GET['id'];?>">
				<label for='fobjet'>Objet :</label><br>
				<input type='text' id='fobjet' name='objet'><br><br>
				<label for='fdescription'>Description :</label><br>
				<input type='text' id='fdescription' name='description'><br><br>
				<input type='submit' value='Submit'>
			</form>
	</div>
	<div class="fiche">

	<?php
	
	include('connection.php');
	if(isset($_COOKIE["token"])){
		if($_COOKIE["token"]){
			Connection::ConnectDb();
			$bdd=Connection::getBDD();
			$id=null;
			if(isset($_GET['id']))
			{
				$id=$_GET['id'];
				$query = $bdd->prepare("SELECT * FROM FicheVIP where idFiche = $id");
				$query->execute();
				$data = $query->fetch();
				echo "Identifiant : ".$data['0'];
				echo "</br>";
				echo "Nom : ".$data['1'];
				echo "</br>";
				echo "Prénom : ".$data['2'];
				echo "</br>";
				echo "Date de naissance : ".$data['3'];	

				if(isset($_POST['objet']) and isset($_POST['description'])){
					$titre=$_POST['objet'];
					$description=$_POST['description'];
					$query = $bdd->prepare("INSERT INTO Interaction (idFiche, idInteraction, titre, contenu, date) VALUES (?, ?, ?, ?, ?)");
					$data=array($id,0,$titre,$description,date("Y-m-d"));	
					$query->execute($data);
					echo "<p style='color:green'>votre interaction a été ajoutée avec succès</p>";
				}

				$query = $bdd->prepare("SELECT * FROM Interaction where idFiche = $id");
				$query->execute();
				
				echo "</br>Interactions :";
				while ($data = $query->fetch())  
				{
					echo "</br>";
					echo "<div style=\"background-color: yellow\">";
					$titre = $data['2'];
					$contenu= $data['3'];
					
					echo "objet : ".$titre;
					echo "</br>";
					echo "contenu : ".$contenu;
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