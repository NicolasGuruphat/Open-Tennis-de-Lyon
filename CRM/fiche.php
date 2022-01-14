<?php $title = 'FicheVip';?>

<?php ob_start(); ?>
<?php
include('connection.php');

Connection::ConnectDb();
$bdd=Connection::getBDD();
$id=null;
if(isset($_GET['id']))
{
	$id=$_GET['id'];
	$query = $bdd->prepare("SELECT * FROM fichevip where idFiche = $id");
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
		echo "<p style='color:green'>votre interaction a été ajoutée avec succès</p>";
		$query = $bdd->prepare("INSERT INTO interaction (idFiche,idInteraction, titre, contenu, date) VALUES (?,?,?,?,?)");
		$query->execute(array($id,100,$titre,$description,date("Y-m-d")));		
	}

	$query = $bdd->prepare("SELECT * FROM interaction where idFiche = $id");
	$query->execute();
	
	echo "</br>Interactions :";
	while ($data = $query->fetch())  
		{
			echo "</br>";
			echo "<div style=\"background-color: yellow\">";
			$titre = $data['2'];
			$contenu= $data['3'];
			
			echo $titre;
			echo "</br>";
			echo $contenu;
			echo "</br>";
			echo "</div>";
		}
}	
?>


<?php $content = ob_get_clean(); ?>

<?php require('template.php'); ?>